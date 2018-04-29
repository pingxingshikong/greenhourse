       function getRootPath(){
            //获取当前网址，如： http://localhost:80/pxsk/index.jsp
            var curPath=window.document.location.href;
            //获取主机地址之后的目录，如： pxsk/index.jsp
            var pathName=window.document.location.pathname;
            var pos=curPath.indexOf(pathName);
            //获取主机地址，如： http://localhost:80
            var localhostPaht=curPath.substring(0,pos);
            //获取带"/"的项目名，如：/pxsk
            var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1);
//            alert(localhostPaht+projectName);
            //return(localhostPaht+projectName);
            //var path2= localhostPaht+projectName;
            return localhostPaht+projectName;
        }


//转json
          ( function ($){
            $.fn.toJson= function (){
                var queryArray = this.serializeArray();
                var jsonString= '{';
                for (var i = 0; i < queryArray.length; i++) {
                    jsonString+= JSON.stringify(queryArray[i].name) + ':' + JSON.stringify(queryArray[i].value) + ',';
                }
                jsonString= jsonString.substring(0, (jsonString.length - 1));
                jsonString+= '}';
                return jsonString;
                // return JSON.parse(jsonString)
            };
        })(jQuery);


