//废弃
function createEcharts() {
    var dom = document.getElementById("container");
    var myChart = echarts.init(dom);
    var app = {};
    option = null;
    option = {
        title: {
            text: '一天土壤湿度',
            subtext: '大棚1'
        },
        tooltip: {
            trigger: 'axis',
            axisPointer: {
                type: 'cross'
            }
        },
        toolbox: {
            show: true,
            feature: {
                saveAsImage: {}
            }
        },
        xAxis:  {
            type: 'category',
            boundaryGap: false,
            data: newtime //时间
        },
        yAxis: {
            type: 'value',
            axisLabel: {
                formatter: '{value} W'
            },
            axisPointer: {
                snap: true
            }
        },
        visualMap: {
            show: false,
            dimension: 0,
            pieces: [{
                lte: 6,
                color: 'green'
            }, {
                gt: 6,
                lte: 8,
                color: 'red'
            }, {
                gt: 8,
                lte: 14,
                color: 'green'
            }, {
                gt: 14,
                lte: 17,
                color: 'red'
            }, {
                gt: 17,
                color: 'green'
            }]
        },
        series: [
            {
                name:'用电量',
                type:'line',
                smooth: true,
                data: soilhumi1, //土壤湿度
                markArea: {
                    data: [ [
                        {
                            name: '早高峰',
                            xAxis: '07:30'
                        }, {
                            xAxis: '10:00'
                        }], [{
                        name: '晚高峰',
                        xAxis: '17:30'
                    }, {
                        xAxis: '21:15'
                    }] ]
                }
            }
        ]
    };
    if (option && typeof option === "object") {
        myChart.setOption(option, true);
    }

}

var typedata={};
//当前页数
typedata.currentPage=1;
//数据个数
typedata.limit=20;
typedata.totalCounts=100;

var airtemp=[];
var airhumi=[];
var soilhumi1=[];
var soilhumi2=[];
var newtime=[];


var dom;
var myChart;
//空气湿度
var domair;
var myChartair;

//首次加载echarts
function firstloading() {
     dom = document.getElementById("container");
     myChart = echarts.init(dom);
//空气湿度
     domair = document.getElementById("containerair");
     myChartair = echarts.init(domair);
}


function  dateCreate(){

    //大棚类型
    typedata.hoursetype="大棚1";


    myChart.showLoading();
    myChartair.showLoading();


    //数据初始化
    $(function () {
        $.ajax({
            type:'post',
            url: '/getdata',
//                    contentType:'application/json; charset=utf-8',
            dataType:'json',
            cache:false,
            async : true,
            data:typedata,
            success:function(data){//返回json结果
                if(data.success==1){
                    airtemp.splice(0,airtemp.length);
                    airhumi.splice(0,airhumi.length);
                    soilhumi1.splice(0,soilhumi1.length);
                    soilhumi2.splice(0,soilhumi2.length);
                    newtime.splice(0,newtime.length);
                    for(var i=data.wenshis.length-1;i>=0;i--){
                        airtemp.push(data.wenshis[i].airtemp);
                        airhumi.push(data.wenshis[i].airhumi);
                        soilhumi1.push(data.wenshis[i].soilhumi1);
                        soilhumi2.push(data.wenshis[i].soilhumi2);
                        newtime.push(data.wenshis[i].newtime);
                    }

                    typedata.totalCounts=data.totalCounts;

                    myChart.hideLoading();    //隐藏加载动画
                    myChart.setOption({//加载数据图表
                        title: {
                            text: '土壤湿度',
                            subtext: typedata.hoursetype
                        },
                        tooltip: {
                            trigger: 'axis',
                            axisPointer: {
                                type: 'cross'
                            }
                        },
                        toolbox: {
                            show: true,
                            feature: {
                                saveAsImage: {}
                            }
                        },
                        yAxis: {
                            min:0,
                            max:100,
                            type: 'value',
                            axisLabel: {
                                formatter: '{value} %'
                            },
                            axisPointer: {
                                snap: true
                            }
                        },
                        visualMap: {
                            show: false,
                            dimension: 1, //0为x轴分段 1为y轴分段
                            pieces: [{
                                lte: 70,
                                color: 'green'
                            },
                                {
                                    gte: 70, lte: 100, color: 'red'
                                }]
                        },
                        xAxis: {
                            type: 'category',
                            boundaryGap: false,
                            data: newtime //时间
                        },
                        series:  [
                            {
                                name:'土壤湿度',
                                type:'line',
                                smooth: true,
                                data: soilhumi1, //土壤湿度
                                markArea: {
                                    data: [ [
                                        {
                                            name: '早晨',
                                            xAxis: '07:30'
                                        }, {
                                            xAxis: '10:00'
                                        }], [{
                                        name: '晚上',
                                        xAxis: '17:30'
                                    }, {
                                        xAxis: '21:15'
                                    }] ]
                                }
                            }
                        ]
                    });

//                            空气湿度折线图
                    myChartair.hideLoading();    //隐藏加载动画
                    myChartair.setOption({//加载数据图表
                        title: {
                            text: '空气湿度',
                            subtext: typedata.hoursetype
                        },
                        tooltip: {
                            trigger: 'axis',
                            axisPointer: {
                                type: 'cross'
                            }
                        },
                        toolbox: {
                            show: true,
                            feature: {
                                saveAsImage: {}
                            }
                        },
                        yAxis: {
                            min:0,
                            max:100,
                            type: 'value',
                            axisLabel: {
                                formatter: '{value} %'
                            },
                            axisPointer: {
                                snap: true
                            }
                        },
                        visualMap: {
                            show: false,
                            dimension: 1, //0为x轴分段 1为y轴分段
                            pieces: [{
                                lte: 70,
                                color: 'green'
                            },
                                {
                                    gte: 70, lte: 100, color: 'red'
                                }]
                        },
                        xAxis: {
                            type: 'category',
                            boundaryGap: false,
                            data: newtime //时间
                        },
                        series:  [
                            {
                                name:'空气湿度',
                                type:'line',
                                smooth: true,
                                data: airhumi, //空气湿度
                                markArea: {
                                    data: [ [
                                        {
                                            name: '早晨',
                                            xAxis: '07:30'
                                        }, {
                                            xAxis: '10:00'
                                        }], [{
                                        name: '晚上',
                                        xAxis: '17:30'
                                    }, {
                                        xAxis: '21:15'
                                    }] ]
                                }
                            }
                        ]
                    });


                    //分页数据更新
                    $('#pagination').jqPaginator('option', {
                        totalCounts: typedata.totalCounts
                    });


                }else if(data.success==0){
                    alert(data.msg);
                }

            }
        });
    });



    function myechar1() {
        myChart.hideLoading();    //隐藏加载动画
        myChart.setOption({//加载数据图表
            title: {
                text: '土壤湿度',
                subtext: typedata.hoursetype
            },
            tooltip: {
                trigger: 'axis',
                axisPointer: {
                    type: 'cross'
                }
            },
            toolbox: {
                show: true,
                feature: {
                    saveAsImage: {}
                }
            },
            yAxis: {
                min:0,
                max:100,
                type: 'value',
                axisLabel: {
                    formatter: '{value} %'
                },
                axisPointer: {
                    snap: true
                }
            },
            visualMap: {
                show: false,
                dimension: 1, //0为x轴分段 1为y轴分段
                pieces: [{
                    lte: 70,
                    color: 'green'
                },
                    {
                        gte: 70, lte: 100, color: 'red'
                    }]
            },
            xAxis: {
                type: 'category',
                boundaryGap: false,
                data: newtime //时间

            },
            series:  [
                {
                    name:'土壤湿度',
                    type:'line',
                    smooth: true,
                    data: soilhumi1, //土壤湿度
                    markArea: {
                        data: [ [
                            {
                                name: '早晨',
                                xAxis: '07:30'
                            }, {
                                xAxis: '10:00'
                            }], [{
                            name: '晚上',
                            xAxis: '17:30'
                        }, {
                            xAxis: '21:15'
                        }] ]
                    }
                }
            ]
        });


    }


}