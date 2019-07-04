<%--
  Created by IntelliJ IDEA.
  User: dengp
  Date: 2019/5/6
  Time: 19:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="/easyui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="/easyui/demo.css">
    <script type="text/javascript" src="/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/easyui/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript">
        $(function(){
            $.extend($.fn.validatebox.defaults.rules, {
                phoneNum: { //验证手机号
                    validator: function(value, param){
                        return /^1[3-8]+\d{9}$/.test(value);
                    },
                    message: '请输入正确的手机号码。'
                },

                equals: {
                    validator: function(value,param){
                        return value == $(param[0]).val();
                    },
                    message: '密码不一致.'
                }
            });
        })
    </script>
</head>
<body>
<h2>表单验证</h2>
<div style="margin:20px 0;"></div>
<div class="easyui-panel" title="New Topic" style="width:400px">
    <div style="padding:10px 60px 20px 60px">
        <form id="ff" class="easyui-form" method="post" data-options="novalidate:true">
            <table cellpadding="5">
                <tr>
                    <td>Name:</td>
                    <td><input class="easyui-textbox" type="text" name="name" data-options="required:true,validType:'length[2,5]'"></input></td>
                </tr>
                <tr>
                    <td>Email:</td>
                    <td><input class="easyui-textbox" type="text" name="email" data-options="required:true,validType:'email'"></input></td>
                </tr>
                <tr>
                    <td>url:</td>
                    <td><input class="easyui-textbox" type="text" name="email" data-options="required:true,validType:'url'"></input></td>
                </tr>
                <tr>
                    <td>手机号码:</td>
                    <td><input class="easyui-textbox" type="text" name="subject" data-options="required:true" validType='phoneNum' ></input></td>
                </tr>
                <tr>
                    <td>密码:</td>
                    <td><input class="easyui-textbox" type="text" id="pwd" name="pwd" data-options="required:true"></input></td>
                </tr>
                <tr>
                    <td>确认密码:</td>
                    <td><input class="easyui-textbox" type="text" name="subject" data-options="required:true"  validType="equals['#pwd']"></input></td>
                </tr>
                <tr>
                    <td>Message:</td>
                    <td><input class="easyui-textbox" name="message" data-options="multiline:true" style="height:60px"></input></td>
                </tr>
                <tr>
                    <td>Language:</td>
                    <td>
                        <select class="easyui-combobox" name="language"><option value="ar">Arabic</option><option value="bg">Bulgarian</option><option value="ca">Catalan</option><option value="zh-cht">Chinese Traditional</option><option value="cs">Czech</option><option value="da">Danish</option><option value="nl">Dutch</option><option value="en" selected="selected">English</option><option value="et">Estonian</option><option value="fi">Finnish</option><option value="fr">French</option><option value="de">German</option><option value="el">Greek</option><option value="ht">Haitian Creole</option><option value="he">Hebrew</option><option value="hi">Hindi</option><option value="mww">Hmong Daw</option><option value="hu">Hungarian</option><option value="id">Indonesian</option><option value="it">Italian</option><option value="ja">Japanese</option><option value="ko">Korean</option><option value="lv">Latvian</option><option value="lt">Lithuanian</option><option value="no">Norwegian</option><option value="fa">Persian</option><option value="pl">Polish</option><option value="pt">Portuguese</option><option value="ro">Romanian</option><option value="ru">Russian</option><option value="sk">Slovak</option><option value="sl">Slovenian</option><option value="es">Spanish</option><option value="sv">Swedish</option><option value="th">Thai</option><option value="tr">Turkish</option><option value="uk">Ukrainian</option><option value="vi">Vietnamese</option></select>
                    </td>
                </tr>
            </table>
        </form>
        <div style="text-align:center;padding:5px">
            <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">Submit</a>
            <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">Clear</a>
        </div>
    </div>
</div>
<script>
    function submitForm(){
        $('#ff').form('submit',{
            onSubmit:function(){
                return $(this).form('enableValidation').form('validate');
            }
        });
    }
    function clearForm(){
        $('#ff').form('clear');
    }
</script>
</body>
</html>
