<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="/easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="/easyui/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="/easyui/demo.css">
	<script type="text/javascript" src="/easyui/jquery.min.js"></script>
	<script type="text/javascript" src="/easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="/easyui/locale/easyui-lang-zh_CN.js"></script>
	
	<script type="text/javascript">
	
	    $(function(){
	    	$('#dg').datagrid({
		        //url:'datagrid-data.json',
		        url:'/sys/user/query',
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
		    		{field:'id',title:'编号',width:100},
		    		{field:'username',title:'账号',width:100,editor:'textbox'},
		    		{field:'nickname',title:'昵称',width:100,editor:'textbox'},
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
			    url:"/sys/user/save",
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
	</script>
</head>
<body style="border: 0px;">
	<div id="tb">
		<a href="javascript:void(0)" class="easyui-linkbutton" onclick="openWindow()"
			data-options="iconCls:'icon-add',plain:true">添加</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" onclick="goUpdate()"
			data-options="iconCls:'icon-edit',plain:true">修改</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" onclick="saveUpdate()"
			data-options="iconCls:'icon-save',plain:true">保存</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" onclick="deleteUser()"
			data-options="iconCls:'icon-remove',plain:true">删除</a>
			
			
		<input id="ss" class="easyui-searchbox" style="width:300px;height: 26px;"
    		data-options="searcher:qq,prompt:'Please Input Value'"></input>
		
	</div>
	<table id="dg"></table>
	
	<div id="win" class="easyui-window" title="添加用户" 
		style="width:450px;height:360px;text-align: center;"
        data-options="iconCls:'icon-save',modal:true,minimizable:false,maximizable:false">
        <div style="width:400px; padding-top: 30px;padding-left: 30px;">
			<form id="ff" method="post">
				<div style="margin-bottom:20px">
					<input class="easyui-textbox" name="username" 
						style="width:100%" data-options="label:'账号:',required:true">
				</div>
				<div style="margin-bottom:20px">
					<input class="easyui-textbox" name="password" 
						style="width:100%" data-options="label:'密码:',required:true">
				</div>
				<div style="margin-bottom:20px">
					<input class="easyui-textbox" name="nickname" 
						style="width:100%" data-options="label:'昵称:'">
				</div>
				<div style="margin-bottom:20px">
					<input class="easyui-combobox" name="roleId"
    		data-options="label:'分配角色:',valueField:'roleId',textField:'roleName',url:'/sys/role/queryAll'" 
    		style="width:100%" >
			</form>
			<div style="text-align:center;padding:5px 0">
				<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()" style="width:80px">添加用户</a>
				<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()" style="width:80px">清空</a>
			</div>
		</div>
    </div>
</body>
</html>