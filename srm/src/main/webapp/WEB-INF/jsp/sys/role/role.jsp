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
	<script type="text/javascript" src="/js/sys/role/role.js"></script>
	<script type="text/javascript" src="/easyui/locale/easyui-lang-zh_CN.js"></script>
	

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
					<input class="easyui-textbox" name="age" 
						style="width:100%" data-options="label:'年龄:'">
				</div>
				<div style="margin-bottom:20px">
					<input class="easyui-textbox" name="address" 
						style="width:100%" data-options="label:'地址:'">
				</div>
			</form>
			<div style="text-align:center;padding:5px 0">
				<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()" style="width:80px">添加用户</a>
				<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()" style="width:80px">清空</a>
			</div>
		</div>
    </div>
</body>
</html>