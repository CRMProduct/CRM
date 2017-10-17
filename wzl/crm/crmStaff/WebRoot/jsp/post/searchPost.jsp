<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'searchPost.jsp' starting page</title>
    
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
    
   <div><h3 style=" background-color: #93C9FF; color: white;height: 30px;width: 80%px;position: relative;left: 100px;top: 30px"> 
  职务管理</h3></div>
 <div style="position: relative; bottom: 0px;left: 80%">
 <a href="Post_all"><input type="button" value="添加"></a>
 </div>
 <center>
 <h4 align="left" style="position:relative;left: 100px;color: orange ">查询结果</h4>
   <table width="80%" border="1px" >
    <tr align="center">
    <th>部门名称</th><th>职务名称</th><th>编辑</th>
    </tr>
    <c:forEach var="post" items="${pageBean.list}">
    <tr align="center">
     	<td>${post.crmdepartment.depName }</td>
     	<td>${post.postName }</td>
     	<td><a href="Post_find?postId=${post.postId }" style="text-decoration: none;">img</a></td>
    </tr>
    </c:forEach>
    <tr>
    	<td colspan="2" align="right">
    	第${pageBean.pageCode}/${pageBean.allPages}页
    	<a href="Post_query?pageCode=1">[首页]</a>
    	 <c:if test="${pageBean.pageCode>1 }">
    	<a href="Post_query?pageCode=${pageBean.pageCode-1}">[上一页]</a>
    	</c:if>
    	 <c:if test="${pageBean.pageCode < pageBean.allPages}">
    	<a href="Post_query?pageCode=${pageBean.pageCode+1}">[下一页]</a>
    	</c:if>
    	<a href="Post_query?pageCode=${pageBean.allPages}">[尾页]</a>
    	</td>
    </tr>
   
    <tr>
   </table>
   </center>
   </div>
   
  </body>
</html>
