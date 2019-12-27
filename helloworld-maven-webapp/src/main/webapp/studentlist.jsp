<%@ page import="com.zxj.helloworld.crudservlet.model.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: zhaoxiujie
  Date: 2019/12/27
  Time: 09:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>studentList</title>
</head>
<body>
<div>this is a student list.</div>

<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>age</th>
        <th>grade</th>
        <th>interest</th>
        <th>Operation</th>
    </tr>



<%
    List<Student> studentList=(List<Student>)request.getAttribute("studentList");
%>

<%
    for (Student student:studentList){
%>
<tr>
    <td><%=student.getId()%></td>
    <td><%=student.getName()%></td>
    <td><%=student.getAge()%></td>
    <td><%=student.getGrade()%></td>
    <td><%=student.getIntests()%></td>
    <td><a href="/deleteStudentServlet?id=<%=student.getId()%>">delete</a></td>
</tr>
<%
    }
%>
</table>
</body>
</html>
