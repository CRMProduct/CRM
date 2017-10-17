<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'addStaff.jsp' starting page</title>

<script type="text/javascript" src="js/laydate.js"></script>
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
	<form action="Staff_addStaff" method="post">
		<div>
			<h3
				style=" background-color: #93C9FF; color: white;height: 30px;width: 80%px;position: relative;top: 30px">
				&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;员&nbsp;工&nbsp;管&nbsp;理</h3>
		</div>
		<div style="position: relative; bottom: 0px;left: 80%">
			<input type="submit" value="保存"> <a href=""><input
				type="button" value="退回"></a>
		</div>
		<div style="margin-top: 30px">
			<center>
				<table>
					<tr>
						<td>登录名：</td>
						<td><input type="text" name="loginName"></td>
						<td>密码：</td>
						<td><input type="text" name="loginPwd"></td>
					</tr>
					<tr>
						<td>姓名：</td>
						<td><input type="text" name="staffName"></td>
						<td>性别：</td>
						<td><input type="radio" name="gender" value="男">男<input
							type="radio" name="gender" value="女">女</td>
					</tr>
					<tr>
						<td>所属部门：</td>
						<td><select name="depId">
								<option>请选择</option>
								<c:forEach var="dept" items="${dept}">
									<option value="${dept.depId }">${dept.depName }</option>
								</c:forEach>
						</select></td>
						<td>职务：</td>
						<td><select name="postId">
								<option value="">--请选择--</option>
								<c:forEach var="post" items="${post}">
									<option value="${post.postId }">${post.postName}</option>
								</c:forEach>
						</select></td>
					</tr>
					<tr>
						<td>入职时间：</td>
						<td><input type="text" name="onDutyDate" class="laydate-icon"
							id="onDutyDate" /></td>

					</tr>
				</table>
			</center>
		</div>
	</form>

	<script type="text/javascript">
		!function() {
			laydate.skin('molv'); //切换皮肤，请查看skins下面皮肤库
			laydate({
				elem : '#onDutyDate'
			}); //绑定元素
		}();
	</script>
</body>
</html>
