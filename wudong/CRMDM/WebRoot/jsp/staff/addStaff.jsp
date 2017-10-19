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

<title>My JSP 'addStaff.jsp' starting page</title>
<!-- <script type="text/javascript">
	
		/** 
		 * 得到XMLHttpRequest对象 
		 */
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
		
		window.onload=function(){
			ajaxrequest("selectSerlvet?method=dep","POST",true,depResponse);
		}
		//动态获取部门的信息
		function depResponse(responseContents){
			var jsonObj = new Function("return" + responseContents)();
			for(var i = 0; i < jsonObj.addrList.length;i++){
				document.getElementById('select').innerHTML += 
					"<option value='"+jsonObj.addrList[i].id+"'>"
						+jsonObj.addrList[i].address+
					"</option>"
			}
		}
		//选中省后
		function pChange(){
			//先将职务的之前的信息清除
			document.getElementById('selectPost').innerHTML="<option value='-1'>--请选择--</option>";
			var val = document.getElementById('select').value;
			if(val == -1){
				document.getElementById('selectPost')[0].selected = true;
				return;
			}
			//开始执行获取职务
			ajaxrequest("selectSerlvet?method=post&dep="+val,"POST",true,postResponse);
		}
		//获取职务的动态数据
		function postResponse(responseContents){
			var jsonObj = new Function("return" + responseContents)();
			for(var i = 0; i < jsonObj.postList.length;i++){
				document.getElementById('selectPost').innerHTML += 
					"<option value='"+jsonObj.postList[i].id+"'>"
						+jsonObj.postList[i].address+
					"</option>"
			}
		}
		
		
	</script> -->
<script type="text/javascript" src="js/laydate.js"></script>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css" href="css/addStaff.css">


</head>

<body>
	<form action="Staff_addStaff" method="post">
		<div>
			<h3
				style=" background-color: #93C9FF; color: white;height: 30px;width: 80%px;position: relative;top: 30px">
				&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;员&nbsp;工&nbsp;管&nbsp;理</h3>
		</div>
		<div style="position: relative; bottom: 0px;left: 80%">
			<input type="submit" value="保存"> 
			<input type="button" value="返回" onclick="javaScript:history.go(-1)"></a>
		</div>
		<div style="margin-top: 30px; background: #ABD1E7;"><br>
			<center>
				登录名&emsp;： <input type="text" name="loginName" class="input"> <br><br>
				密&emsp;码&emsp;： <input type="text" name="loginPwd" class="input"><br><br>
				 姓&emsp;名&emsp;： <input type="text" name="staffName" class="input"><br><br>
					 性&emsp;别&emsp;：&emsp;&emsp;&emsp;&emsp;&emsp; <input type="radio" name="gender"
					value="男">男<input type="radio" name="gender" value="女">&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;女<br><br>
				所属部门： <select name="depId" id="select" onchange="pChange()" class="input">
					<option value="">请选择</option>
					<c:forEach var="dep" items="${dept }">
						<option value="${dep.depId }">${dep.depName } </option>
					</c:forEach>
				</select><br><br>
				 职&emsp;务&emsp;：<select name="postId" id="selectPost" onchange="cChange()" class="input">
					<option value="-1">--请选择--</option>
					<c:forEach var="post" items="${post }">
						<option value="${post.postId }">${post.postName} </option>
					</c:forEach>
				</select><br><br>
				入职时间：<input type="text" name="onDutyDate"
					class="input" />
			</center><br>
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
