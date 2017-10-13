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
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   <from action="" method="post">
   <div><h3 style=" background-color: #93C9FF; color: white;height: 30px;width: 80%px;position: relative;top: 30px"> 
  &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;部&nbsp;门&nbsp;管&nbsp;理</h3></div>
 <div style="position: relative; bottom: 0px;left: 80%">
 <a href=""><input type="button" value="保存"></a>
 <a href=""><input type="button" value="退回"></a>
 </div>
 <div style="margin-top: 30px">
  <center>
  	<table>
  		<tr>
  		<td>部门名称：</td>
  		<td><input type="text" name="depName" vlaue="${crmDepartment.depName}"></td>
  		td><input type="text" name="depId" vlaue="${crmDepartment.depId}"></td>
  		</tr>
   </table>
   </center>
   </div>
   </from>
  </body>
</html>
