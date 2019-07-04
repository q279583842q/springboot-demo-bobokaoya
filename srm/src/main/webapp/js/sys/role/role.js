$(function(){
    $('#dg').datagrid({
        //url:'datagrid-data.json',
        url:'/sys/role/query',
        fit:true,
        striped:true,
        pagination:true,
        rownumbers:true,
        singleSelect:true,
        toolbar: '#tb',
        rowStyler: function(index,row){
            if (row.unitcost>80){
                return 'background-color:#6293BB;color:#fff;'; // return inline style
                // the function can return predefined css class and inline style
                // return {class:'r1', style:{'color:#fff'}};
            }
        },
        columns:[[
            {checkbox:true,field:''},
            {field:'roleId',title:'编号',width:100},
            {field:'roleName',title:'角色',width:100,editor:'textbox'},
            {field:'roleDesc',title:'描述',width:100,editor:'textbox'},
            {field:'createTime',title:'创建时间',width:200
                ,formatter: function(value,row,index){
                    if (row.createTime!= null){
                        var d = new Date(row.createTime);
                        return d.toLocaleString();
                    }
                }}
        ]]
    });



    $('#dg').datagrid({
        onDblClickRow:function(rowIndex, rowData){
            //alert(rowIndex+" "+rowData.username)
            // $("#dg").datagrid("beginEdit",rowIndex);
        }
    });

    // 页面加载完成后关闭窗口
    $("#win").window("close");

});
var index = -1;
// 进入编辑状态
function goUpdate(){
    // 获取选中的行 getSelected
    var row = $("#dg").datagrid("getSelected");
    if(row != null){
        // 将index对应的行关闭编辑状态
        $("#dg").datagrid("endEdit",index);
        // 获取row对应的index
        index = $("#dg").datagrid("getRowIndex",row);
        // 进入编辑状态
        $("#dg").datagrid("beginEdit",index);
    }else{
        $.messager.alert('操作错误','请勾选要修改的行记录');
    }

}
// 保存修改的数据
function saveUpdate(){
    // 获取选中的行 getSelected
    var row = $("#dg").datagrid("getSelected");
    if(row != null){
        // 获取row对应的index
        index = $("#dg").datagrid("getRowIndex",row);
        // 结束编辑状态
        $("#dg").datagrid("endEdit",index);
        // 将修改的数据提交到服务器修改数据库中的数据
        console.log(row);
        $.get("userServlet?task=update"
            ,{"id":row.id
                ,"username":row.username
                ,"password":row.password
                ,"age":row.age
                ,"address":row.address}
            ,function(msg){
                //alert(msg);
                // 刷新页面
                $("#dg").datagrid("reload");
            }
        );
    }else{
        $.messager.alert('操作错误','请勾选要修改的行记录');
    }
}

function deleteUser(){
    // 获取选中的行 getSelected
    var row = $("#dg").datagrid("getSelected");
    if(row != null){
        $.messager.confirm('确认框','你要确定删除这条记录?',function(r){
            if (r){
                $.get("userServlet?task=delete",{"id":row.id},function(msg){
                    // 刷新页面
                    $("#dg").datagrid("reload");
                });
            }
        });

    }else{
        $.messager.alert('操作错误','请勾选要删除的行记录');
    }
}

function openWindow(){
    $("#win").window("open");
}

function submitForm(){
    $('#ff').form('submit', {
        url:"userServlet?task=add",
        success:function(data){
            // 清空表单
            $('#ff').form('clear');
            // 关闭窗口
            $("#win").window("close");
            // 刷新页面
            $("#dg").datagrid("reload");
        }
    });
}
function clearForm(){
    $('#ff').form('clear');
}

function qq(value,name){
    alert(value+":"+name)
}