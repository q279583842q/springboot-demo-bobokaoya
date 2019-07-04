<%--
  Created by IntelliJ IDEA.
  User: dengp
  Date: 2019/5/4
  Time: 23:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>菜单界面</title>
    <link rel="stylesheet" type="text/css" href="/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="/easyui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="/easyui/demo.css">
    <script type="text/javascript" src="/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/easyui/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript">
        $(function(){
            $('#tt').treegrid({
                url:'/sys/menu/getNode',
                idField:'id',
                treeField:'text',
                fit:true,
                loadMsg:'加载中...',
                //pagination:true,
                rownumbers:true,
                fitColumns:false,
                singleSelect:true,
                columns:[[
                    {title:'id',field:'id',width:80},
                     {field:'text',title:'菜单名',width:160,state:'closed'},
                     {field:'url',title:'地址'},
                     {field:'createTime',title:'创建时间',formatter: function(value,row,index){
                        if (row.createTime!= null){
                        var d = new Date(row.createTime);

                        return dateFtt("yyyy-MM-dd hh:mm:ss",d);
                        }
                        }},
                   /* {field:'menuName',title:'菜单名称',width:160},
                    {field:'menuId',title:'菜单编号',width:80},
                    {field:'url',title:'地址'},
                    {field:'parentId',title:'父菜单编号',width:80}*/
                ]],
                onBeforeExpand : function(row) {
                // 此处就是异步加载地所在
                if (row) {
                    $(this).treegrid('options').url = '/sys/menu/getNode?id='+row.id;
                }
                    return true;
                },
                toolbar : [ {
                id : 'addLeafBtn',
                text : '添加菜单',
                iconCls : 'icon-add',
                handler : function() {
                addMenu();
                }
                },'-', {
                id : 'editBtn',
                text : '修改',
                iconCls : 'icon-edit',
                handler : function() {
                $('#btnsave').linkbutton('enable');
                alert('cut')
                }
                }, '-', {
                id : 'deleteBtn',
                text : '删除',
                disabled : true,
                iconCls : 'icon-save',
                handler : function() {
                $('#btnsave').linkbutton('disable');
                alert('save');
                }
                } ]


            });
    });

    /**************************************时间格式化处理************************************/
    function dateFtt(fmt,date)
    {
        var o = {
        "M+" : date.getMonth()+1,                 //月份
        "d+" : date.getDate(),                    //日
        "h+" : date.getHours(),                   //小时
        "m+" : date.getMinutes(),                 //分
        "s+" : date.getSeconds(),                 //秒
        "q+" : Math.floor((date.getMonth()+3)/3), //季度
        "S"  : date.getMilliseconds()             //毫秒
        };
        if(/(y+)/.test(fmt))
        fmt=fmt.replace(RegExp.$1, (date.getFullYear()+"").substr(4 - RegExp.$1.length));
        for(var k in o)
        if(new RegExp("("+ k +")").test(fmt))
        fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));
        return fmt;
    }

    </script>
</head>
<body>
    <table id="tt" style="width:600px;height:400px"></table>
</body>
</html>
