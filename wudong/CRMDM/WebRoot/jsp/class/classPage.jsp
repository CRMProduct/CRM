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
    
    <title>My JSP 'classPage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/classPage.css">
	

  </head>
  
  <body>
     <div style=" height: 80px; background: #09F">
  <div style=" font-size: 12px; color: white;height: 15px;width: 200px;position:relative;left: 80%;top: 5px" align="right">今天是${session.systemTime}</div>
  <table align="right" style="position: relative;top: 40px;width: 300px">
  <tr style="font-size: 12px; color: white">
  <td>欢迎您，管理员 ${sessionScope.staffName }</td>
  <td><a href="jsp/login.jsp" style="text-decoration: none; color: white">更改口令</a></td>
  <td><a href="jsp/login.jsp" style="text-decoration: none; color: white">重新登录</a></td>
  </tr>
  </table>
  </div>
  <img src="imgs/1.png" width="90%" height="500px" style=" position: relative;left: 195px">
  <div style=" width: 195px; height:500px;background: #ABD1E7;position: relative;bottom: 504px">
  <table>
  <tr style=" font-size:14px"><td>系统控制面板</td></tr>
  <tr style=" font-size:14px;color:#666"><td>CRM管理系统</td></tr>
  <tr><td>
  <font style=" font-size:14px">人力资源部</font><br>
  <a href="Dept_query" style="text-decoration: none;">&nbsp;&nbsp;&nbsp;&nbsp;<font style=" font-size: 12px">部门管理</font></a><br>
  <a href="Post_query" style="text-decoration: none;">&nbsp;&nbsp;&nbsp;&nbsp;<font style=" font-size: 12px">职务管理</font></a><br>
  <a href="Staff_query" style="text-decoration: none;">&nbsp;&nbsp;&nbsp;&nbsp;<font style=" font-size: 12px">员工管理</font></a><br>
  </td></tr>
  <tr><td>
   <font style="font-size:14px">教学部</font><br>
  <a href="Class_queryClass" style="text-decoration: none;">&nbsp;&nbsp;&nbsp;&nbsp;<font style=" font-size: 12px">班级管理</font></a><br>
  <a href="Course_queryCourse" style="text-decoration: none;">&nbsp;&nbsp;&nbsp;&nbsp;<font style=" font-size: 12px">课程类别</font></a><br>
  </td></tr>
  <tr><td>
   <font style=" font-size:14px">咨询部</font><br>
  <a href="Refer_queryRefer" style="text-decoration: none;">&nbsp;&nbsp;&nbsp;&nbsp;<font style=" font-size: 12px">咨询学生管理</font></a><br>
  <a href="" style="text-decoration: none;">&nbsp;&nbsp;&nbsp;&nbsp;<font style=" font-size: 12px">查询报名学生</font></a><br>
  </td></tr>
  <tr><td>
  <font style=" font-size:14px">学工部</font><br>
  <a href="Student_query" style="text-decoration: none;">&nbsp;&nbsp;&nbsp;&nbsp;<font style=" font-size: 12px">在校学生管理</font></a><br>
  <a href="Station_query" style="text-decoration: none;">&nbsp;&nbsp;&nbsp;&nbsp;<font style=" font-size: 12px">学生升级/留班</font></a><br>
  <a href="RunOff_query" style="text-decoration: none;">&nbsp;&nbsp;&nbsp;&nbsp;<font style=" font-size: 12px">学生流失情况</font></a><br>
  </td></tr>
  <tr><td>
   <font style=" font-size:14px">就业部</font><br>
  <a href="Graduate_queryGraduate" style="text-decoration: none;">&nbsp;&nbsp;&nbsp;&nbsp;<font style=" font-size: 12px">就业情况</font></a><br>
  </td></tr>
  
  </table>
  </div>
  <div style="width: 80%; height: 50%; position: absolute;bottom: 20%;left: 20%" >
    <div>
  <h3 style=" background-color: #93C9FF; color: white;height: 30px;width: 80%px;position: relative;top: 30px"> 
  &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;班&nbsp;级&nbsp;管&nbsp;理</h3>
  </div>
 <div style="position: relative; bottom: 16px;left: 80%">
 <a href="jsp/class/addClass.jsp" style=" text-decoration: none; position: relative;top:20px">添加班级</a>
 <a href="jsp/home.jsp" style="text-decoration: none;position: relative;top:20px">返回</a>
 </div>
 <br>
  <center>
  <h4 align="left" style="position:relative;left: 100px;color: orange ">查询结果</h4><br>
   <table width="85%" border="1px" bordercolor="#999999;" bgcolor="#F0FFFF">
    <tr height="30px"><th width="10%">班级名称</th><th width="10%">所属课程</th><th width="10%">开班时间</th><th width="10%">毕业时间</th><th width="8%">状态</th><th width="10%">学生总数</th><th width="9%">升学数</th><th width="9%">转班数</th>
    <th width="8%">编辑</th><th width="8%">查看</th><th width="10%">课表</th>
    </tr>
    <c:forEach var="class1" items="${ pageBean.list }">
    <tr align="center">
    <c:if test="pageBean.list!= null"></c:if>
     <td>${ class1.className}</td>
     <td>${ class1.crmcoursetype.courseName}</td>
     <td>${ class1.beginTime}</td>
     <td>${ class1.endTime}</td>
     <td>${ class1.status}</td>
     <td>${ class1.totalCount}</td>
     <td>${ class1.upgradeCount}</td>
     <td>${ class1.changeCount}</td>
     <td><a href="Class_findClass?classId=${ class1.classId}&pageCpde=${ pageBean.pageCode}" style="text-decoration: none;"><img src="imgs/bianji.png" border="none"/></a></td>
     <td><a href="Class_find?classId=${ class1.classId}&pageCpde=${ pageBean.pageCode}"style="text-decoration: none;"><img src="imgs/chakan.png" border="none"/></a></td>
     <td>${ class1.uploadFileName}</td>
    </tr>
    
   </c:forEach>
    <tr>
     <td colspan="6" align="right">
     <c:if test="${pageBean.pageCode>1 }">
     <a href="Class_queryClass?pageCode=${pageBean.pageCode-1 }" style="text-decoration: none;">上一页</a>
     </c:if>
     <c:forEach var="pageCode" begin="1" end="${pageBean.allPages }">
      <a href="Class_queryClass?pageCode=${pageCode }" style="text-decoration: none;">[${pageCode }]</a>
     </c:forEach>
     <c:if test="${pageBean.pageCode<pageBean.allPages }">
     <a href="Class_queryClass?pageCode=${pageBean.pageCode+1 }" style="text-decoration: none;">下一页</a>
     </c:if>
     <a href="Class_queryClass?pageCode=${pageBean.allPages }" style="text-decoration: none;">末页</a>
     </td>
     <td colspan="2">
       <form action="Class_queryClass">
          <input type="text" name="pageCode" size="1">
          <input type="submit" value="go">
        </form>
     </td>
     <td  colspan="3">
              共${pageBean.allPages }页
     </td>
    </tr>
   </table>
   </center>
   </div>
  </body>
</html>
