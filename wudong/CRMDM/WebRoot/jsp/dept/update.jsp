<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'modifyDept.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/update.css">
	

  </head>
  
  <body>
   <form action="Dept_update" method="post">
   <div><h3 style=" background-color: #93C9FF; color: white;height: 30px;width: 80%px;position: relative;top: 30px"> 
  &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;部&nbsp;门&nbsp;管&nbsp;理</h3></div>
 <div style="position: relative; bottom: 0px;left: 80%">
 <input type="submit" value="保存">
 <input type="button" value="返回" onclick="javaScript:history.go(-1)">
 </div>
 <div style="margin-top: 30px">
  <center>
  	<table>
  		<tr>
  		<td>部门名称：</td>
  		<td><input type="text" name="depName" value="${crmDepartment.depName}" class="input"></td>
  		<td><input type="hidden" name="depId" value="${crmDepartment.depId}"></td>
  		</tr>
   </table>
   </center>
   </div>
   </form>
  </body>
</html>
