<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/addPost.css">
	
  </head>
  
  <body style=" width: 100%;height: 100%">
  <div><h3 style=" background-color: #93C9FF; color: white;height: 30px;width: 80%px;position: relative;top: 30px"> 
  &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;[职&nbsp;务&nbsp;管&nbsp;理]</h3></div><br>
 <div style="position: relative; top:5%; background: #ABD1E7;height: 60%">
 <br>
 <form action="Post_addPost" method="post">
  &emsp;&emsp;&emsp;&emsp;&emsp; &emsp;&emsp;&emsp;&emsp;&emsp;
  选择部门：<select name="depName">
        <option>---请选择---</option>
        <option value="人力资源部">人力资源部</option>
        <option value="咨询部">咨询部</option>
        <option value="教学部">教学部</option>
        <option value="学工部">学工部 </option>
        <option value="就业部">就业部</option>
        </select>
&emsp;&emsp;&emsp;&emsp;&emsp; &emsp;&emsp;&emsp;&emsp;&emsp;
职务：<input type="text" name="postName">
  <div style="position: relative;bottom: 27%;left: 70% ">
  <input type="submit" value="保存" style="background-color: orange;color: white">&emsp;
  <input type="button" value="返回" onclick="javaScript:history.go(-1)"></div>
</form> 
</div> 
  </body>
  
 </html>
