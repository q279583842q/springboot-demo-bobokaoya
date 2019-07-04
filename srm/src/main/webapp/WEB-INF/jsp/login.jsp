<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>尚学堂-百战程序员</title>
<link rel="icon" href="favicon.ico" type="image/x-icon">
<link rel="stylesheet" type="text/css"
	href="/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="/easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="/easyui/demo.css">

<script type="text/javascript" src="/easyui/jquery.min.js"></script>
<script type="text/javascript" src="/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="/easyui/locale/easyui-lang-zh_CN.js"></script>
</head>
<body>
	<div align="center" style="margin-top: 200px;">
		<div class="easyui-panel" title="用户登录"
			style="width: 400px; max-width: 400px; padding: 30px 60px;">
			<form id="ff" method="post">
				<div style="margin-bottom: 20px">
					<input class="easyui-textbox" name="username" style="width: 100%"
						data-options="label:'账号:',required:true">
				</div>
				<div style="margin-bottom: 20px">
					<input class="easyui-textbox" name="password" type="password" style="width: 100%"
						data-options="label:'密码:',required:true">
				</div>
			</form>
			<div style="text-align: center; padding: 5px 0">
				<a href="javascript:void(0)" class="easyui-linkbutton"
					onclick="submitForm()" style="width: 80px">登录</a> <a
					href="javascript:void(0)" class="easyui-linkbutton"
					onclick="clearForm()" style="width: 80px">清空</a>
			</div>
		</div>
	</div>
	<script>
		function submitForm(){
		/* 	$('#ff').form('submit', {
			    url:"login.do",
			    success:function(data){
					if(data.status==200){
						// 表示登录成功,跳转到home页面
						location.href="home";
					}else{
						// 表示登录失败，给出错误提示
						$.messager.alert('登录失败','账号或者密码错误:'+data.message);
					}
			    }
			}); */
			
			$.ajax({ 
					type: "post"
					, timeout: 10000
					, // 超时时间 10 秒 
					headers: { 'X-Requested-With':'XMLHttpRequest' }
					, url: "login.do"
					, data: $("#ff").serialize()
					, success: function(data) { 
						if(JSON.parse(data).status==200){
							// 表示登录成功,跳转到home页面
							location.href="home";
						}else{
							$.messager.alert('登录失败',JSON.parse(data).message);	
						}
					}
				});
							
				
		}
		function clearForm(){
			$('#ff').form('clear');
		}
	</script>
</body>
</html>