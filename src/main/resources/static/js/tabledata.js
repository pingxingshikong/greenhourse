function tableLoading() {
    $("#table").bootstrapTable({ // 对应table标签的id
        url: '/getdata', // 获取表格数据的url
        method: 'get',                      //请求方式（*）
        dataType: "json",
        cache: false, // 设置为 false 禁用 AJAX 数据缓存， 默认为true
        striped: true,  //表格显示条纹，默认为false
        pagination: true, // 在表格底部显示分页组件，默认false
        pageList: [5, 10, 20, 50], // 设置页面可以显示的数据条数
        showRefresh: true,                  //是否显示刷新按钮
        clickToSelect: true,                //是否启用点击选中行
        pageSize: 5, // 页面数据条数
        pageNumber: 1, // 首页页码
        sidePagination: 'server', // 设置为服务器端分页
        queryParams: function (params) { // 请求服务器数据时发送的参数，可以在这里添加额外的查询参数，返回false则终止请求
            return {


                limit:params.limit,
                currentPage:params.offset+1,
                hoursetype: "大棚1"


            }
        },
        sortName: 'pid', // 要排序的字段
        sortOrder: 'desc', // 排序规则
        columns: [
            {
                field: 'pid',
                title: 'pid',
                align: 'center',
                valign: 'middle'
            },{
                field: 'newtime',
                title: '时间',
                align: 'center',
                valign: 'middle'
            },{
                field: 'airtemp',
                title: '空气温度',
                align: 'center',
                valign: 'middle'
            },{
                field: 'airhumi',
                title: '空气湿度',
                align: 'center',
                valign: 'middle'
            },{
                field: 'soilhumi1',
                title: '土壤湿度1',
                align: 'center',
                valign: 'middle'
            },{
                field: 'soilhumi2',
                title: '土壤湿度2',
                align: 'center',
                valign: 'middle'
            }
        ],
        onLoadSuccess: function(){  //加载成功时执行
            console.info("加载成功");
        },
        onLoadError: function(){  //加载失败时执行
            console.info("加载数据失败");
        }

    })

}



function refreshtable() {
    $('#table').bootstrapTable(
        "refresh",
        {
            url:"/getdata"+project_status
        }
    );
}

