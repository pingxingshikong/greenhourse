$(function () {
    $("#yanzhengForm").validate({
        errorPlacement: function (error, element) {
            // $("#labenl").html(error);
            $("#yanzhengForm").find("span[error='"+element.attr("id")+"']").append(error);

            // error.appendTo(element.parent());
        },
        errorElement:"span",
        rules:{
            username:{
                required:true,
                minlength:2,
                maxlength:10
            },
            password:{
                required:true
            },
            verifycode:{
                required:true,
                remote: {
                    url: getRootPath()+"/verifycodeValidate",
                    type: "post",
                    dataType: "json",//接收的数据类型
                    data: {
                        verifycode: function () {
                            return $("#verifycode").val();
                        }
                    },
                    dataFilter: function (data, type) { //过滤返回结果
                        if (data == "true")
                            return true;  //true代表验证码正确
                        else
                            return false; //false代表验证码错误
                    }
                }
                //异步验证 结束
            }

        },
        messages:{
            username:{
                required:"请输入账号",
                minlength:"账号长度必须大于2",
                maxlength:"账号长度必须小于10"
            },
            password:{
                required:"请输入密码"
            },
            verifycode:{
                required:"请输入验证码",
                remote:"验证码不正确"
            },
            success: function(span) {
                span.html("ok");
            }

        }
    });
});




$(function () {

    $("#denglu").click(function () {
        var vali=$("#yanzhengForm").valid();
        if(vali){
            $.ajax({
                type:'post',
                url:getRootPath()+"/logincheck",
                contentType:'application/json; charset=utf-8',
                dataType:'json',
                cache:false,
                data: $("#yanzhengForm").toJson(),
                success:function(data){//返回json结果
                    if(data.success==1){
                        window.location.href=getRootPath()+"/data/index";
                    }else if(data.success==0){
                        alert(data.msg);
                        $("#yanzhengForm")[0].reset();
                    }
                }
            });
        }

    });
});
