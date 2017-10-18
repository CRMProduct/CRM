<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<!-- 
<script type="text/javascript">
	//得到XMLHttpRequest对象 
	function getajaxHttp() {
		var xmlHttp;
		try {
			// Firefox, Opera 8.0+, Safari  
			xmlHttp = new XMLHttpRequest();
		} catch (e) {
			// Internet Explorer  
			try {
				xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
			} catch (e) {
				try {
					xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
				} catch (e) {
					alert("您的浏览器不支持AJAX！");
					return false;
				}
			}
		}
		return xmlHttp;
	}

	/** 
			 * 发送ajax请求 
			 * url--请求到服务器的URL 
			 * methodtype(post/get) 
			 * con (true(异步)|false(同步)) 
			 * functionName(回调方法名，不需要引号,这里只有成功的时候才调用) 
			 * (注意：这方法有二个参数，一个就是xmlhttp,一个就是要处理的对象) 
			 */
	function ajaxrequest(url, methodtype, con, functionName) {
		//获取XMLHTTPRequest对象
		var xmlhttp = getajaxHttp();
		//设置回调函数（响应的时候调用的函数）
		xmlhttp.onreadystatechange = function() {
			//这个函数中的代码在什么时候被XMLHTTPRequest对象调用？
			//当服务器响应时，XMLHTTPRequest对象会自动调用该回调方法
			if (xmlhttp.readyState == 4) {
				if (xmlhttp.status == 200) {
					functionName(xmlhttp.responseText);
				}
			}
		};
		//创建请求
		xmlhttp.open(methodtype, url, con);
		//发送请求
		xmlhttp.send();
	}
	
//自动加载
	window.onload = function() {
		ajaxrequest("postSerlvet?method=dep", "POST", true, depResponse);
	}
	
	//动态获取dep的信息
		function depResponse(responseContents){
			var jsonObj = new Function("return" + responseContents)();
			for(var i = 0; i < jsonObj.addrList.length;i++){
				document.getElementById('select').innerHTML += 
					"<option value='"+jsonObj.addrList[i].id+"'>"
						+jsonObj.addrList[i].address+
					"</option>"
			}
		}
</script>
 -->
<title>My JSP 'updateStaff.jsp' starting page</title>
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
	<form action="Staff_update" method="post">
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
						<td><input type="text" name="loginName" value="${staff.loginName }"></td>
						<td>密码：</td>
						<td><input type="text" name="loginPwd" value="${staff.loginPwd }"></td>
					</tr>
					<tr>
						<td>姓名：</td>
						<td><input type="text" name="staffName" value="${staff.staffName }"></td>
						<td>性别：</td>
						<td><input type="text" name="gender" value="${staff.gender }">
							
					</tr>
					<tr>
						<td>所属部门：</td>
						<td>
						<select name="depId" id="select" onchange="pChange()">
								<option value="${staff.crmpost.crmdepartment.depId }">${staff.crmpost.crmdepartment.depName }</option>
						<c:forEach var="dep" items="${dept}">
						<option value="${dep.depId }">${dep.depName }</option>
						</c:forEach>
						</select>
						</td>
						<td>职务：</td>
						<td><select name="postId" id="selectPost" onchange="cChange()">
								<option value="${staff.crmpost.postId }">${taff.crmpost.postName}</option>
								<%-- <c:forEach var="post" items="${post }">
						<option value="${post.postId }">${post.postName }</option>
						</c:forEach> --%>
						</select></td>
					</tr>
					<tr>
						<td>入职时间：</td>
						<td><input type="text" name="onDutyDate" class="laydate-icon"
							id="onDutyDate"  value="${staff.onDutyDate }"></td>

					</tr>
				</table>
				<input type="text" name="staffId" value="${staff.staffId }">
			</center>
		</div>
	</form>
</body>
</html>
