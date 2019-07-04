<%--
  Created by IntelliJ IDEA.
  User: dengp
  Date: 2019/5/6
  Time: 20:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <script>
        $(function(){
            $.ajax({
                type: "post"
                , timeout: 10000
                , // 超时时间 10 秒
                dataType:'json'
                , url: "/sys/role/query"
                , data: {"page":1,"rows":100}
                , success: function(map) {
                    //alert(map.total);
                    var list = map.rows;
                    for(var i = 0 ; i<list.length;i++){
                        var role = list[i];
                        $("#mydiv").append("<input type='checkbox' style='margin: 5px;' name='roleIds' values='"+role.roleId+"'>"+role.roleName+"<br>");
                    }
                }
            });
        })
    </script>
    <div id="mydiv" style="margin: 10px;padding: 20px;">

    </div>
</body>
</html>
