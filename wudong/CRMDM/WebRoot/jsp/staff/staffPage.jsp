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
    
    <title>My JSP 'home.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/staffPage.css">
	

  <body><br>
  <form action="Staff_search">
  部门名称：<input type="text" name="depName" class="input">
  职务：<input type="text" name="postName" class="input">
  员工姓名：<input type="text" name="staffName" class="input">
  <input type="submit" value="查询">
 </form> 
  <div>
  <h3 style=" background-color: #93C9FF; color: white;height: 30px;width: 80%px;position: relative;top: 30px"> 
  &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;部&nbsp;门&nbsp;管&nbsp;理</h3>
  </div>
 <div style="position: relative; left: 80%">
 <a href="jsp/staff/addStaff.jsp" style="text-decoration: none;">添加</a>
 <a href="jsp/home.jsp" style="text-decoration: none;">返回</a>
 </div><br>
  <center>
  <h4 align="left" style="position:relative;left: 100px;color: orange ">查询结果</h4><br>
   <table width="80%" border="1px" bordercolor="#999999;">
    <tr height="50px"><th width="15%">员工姓名</th><th width="15%">性别</th><th width="15%">入职时间</th><th width="15%">所属部门</th><th width="15%">职务</th><th width="15%">编辑</th></tr>
   <c:forEach var="staff" items="${pageBean.list }">
    <tr align="center">
     <td>${staff.staffName }</td>
     <td>${staff.gender }</td>
     <td>${staff.onDutyDate }</td>
     <td>${staff.crmpost.crmdepartment.depName }</td>
     <td>${staff.crmpost.postName }</td>
     <td><a href="Staff_find?staffId=${staff.staffId }&pageCode=${pageBean.pageCode }"><img src="imgs/bianji.png" border="none"/></a></td>
    </tr>
   </c:forEach>
    <tr>
     <td colspan="3" align="right">
     <c:if test="${pageBean.pageCode>1 }">
     <a href="Dept_query?pageCode=${pageBean.pageCode-1 }" style="text-decoration: none;">上一页</a>
     </c:if>
     <c:forEach var="pageCode" begin="1" end="${pageBean.allPages }">
      <a href="Dept_query?pageCode=${pageCode }" style="text-decoration: none;">[${pageCode }]</a>
     </c:forEach>
     <c:if test="${pageBean.pageCode<pageBean.allPages }">
     <a href="Dept_query?pageCode=${pageBean.pageCode+1 }" style="text-decoration: none;">下一页</a>
     </c:if>
     <a href="Dept_query?pageCode=${pageBean.allPages }" style="text-decoration: none;">末页</a>
     </td>
     <td colspan="1">
       <form action="Dept_query">
          <input type="text" name="pageCode" size="1">
          <input type="submit" value="go">
        </form>
     </td>
     <td  colspan="2">
              共${pageBean.allPages }页
     </td>
    </tr>
   </table>
   </center>
  </body>
</html>
