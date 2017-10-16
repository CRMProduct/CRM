<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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

</head>

<body>
	<form action="Post_update" method="post">
		<div>
			<h3
				style=" background-color: #93C9FF; color: white;height: 30px;width: 80%px;position: relative;top: 30px">
				&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;职&nbsp;务&nbsp;管&nbsp;理</h3>
		</div>
		<div style="position: relative; bottom: 0px;left: 80%">
			<input type="submit" value="保存"> <a href="Post_query"><input
				type="button" value="退回"></a>
		</div>
		<div style="margin-top: 30px">
			<center>
				<table>
					<tr>
						<td>选择部门： <select name="depId">
								<option value="${crmPost.crmdepartment.depId}">${crmPost.crmdepartment.depName}</option>
								<c:forEach var="dept" items="${dept}">
									<option value="${dept.depId }">${dept.depName }</option>
								</c:forEach>
						</select>
						</td>
						<td>职务：</td>
						<td><input type="text" name="postName"
							value="${crmPost.postName}"></td>
						<td><input type="text" name="postId"
							value="${crmPost.postId}"></td>
					</tr>
				</table>
			</center>
		</div>

	</form>


</body>
</html>
