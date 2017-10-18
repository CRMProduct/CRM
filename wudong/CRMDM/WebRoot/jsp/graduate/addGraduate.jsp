<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'updatePost.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" type="text/css" href="css/addGraduate.css">
</head>

<body>
	<form action="Graduate_addGraduate" method="post">
		<div>
			<h3
				style=" background-color: #93C9FF; color: white;height: 30px;width: 80%px;position: relative;top: 30px">
				&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;添加学员就业信息</h3>
		</div>
		<div style="position: relative; bottom: 0px;left: 80%;">
			<input type="submit" value="保存"> <a
				href="Graduate_queryGraduate"><input type="button" value="退回"></a>
		</div>
		<div style="margin-top: 30px; background-color: #ABD1E7;">
			<center>
			<br>
				<table>
					<tr>
						<td>班&emsp;&emsp;级：</td>
						<td><select name="classId" class="input">
								<option value="1">请选择</option>
						</select></td>
					</tr>
					<tr>
						<td>学&emsp;&emsp;生：</td>
						<td><select name="studentId"class="input">
								<option  value="1">请选择</option>
						</select></td>
					</tr>
					<tr>
						<td>就业公司：</td>
						<td><input type="text"
							name="companyName"class="input"><td>
        			</tr>
        			<tr>
						<td>薪&emsp;&emsp;资：</td>
						<td><input type="text" name="salary"class="input"><td>
        			</tr>
        			<tr>
						<td>岗&emsp;&emsp;位：</td>
						<td><input type="text" name="post"class="input"><td>
        			</tr>
        			<tr>
						<td>入职时间：</td>
						<td><input type="text" name="entryTime"class="input"><td>
        			</tr>
        			<tr><td colspan="2">备&emsp;&emsp;注:<br><textarea name="remark" style="width:100%;height: 100px "class="input"></textarea></td></tr>
        			
   </table>
   <br>
   </center>
   </div>
 
   </form>
   
   
  </body>
</html>