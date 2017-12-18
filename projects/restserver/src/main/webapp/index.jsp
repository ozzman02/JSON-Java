<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>REST Server</title>
	</head>
	<body>
		Welcome rest server <br/><br/>
		<a href="<%= request.getContextPath()%>/json_stringify.jsp">JSON stringify</a><br/>
		<a href="<%= request.getContextPath()%>/json_parse.jsp">JSON parse</a><br/>
		<a href="<%= request.getContextPath()%>/json_array.jsp">JSON array</a><br/>
		<a href="<%= request.getContextPath()%>/json_array_of_objects.jsp">JSON array of objects</a><br/>
		<a href="<%= request.getContextPath()%>/json_nested_objects.jsp">JSON nested objects</a><br/>
		<a href="<%= request.getContextPath()%>/rest/jsonUdemyStudent">REST Json Udemy Student</a><br/>
		<a href="<%= request.getContextPath()%>/rest/jsonUdemyStudentList">REST Json Udemy Student List</a><br/>
		<a href="<%= request.getContextPath()%>/jquery_json_get.jsp">REST jQuery json GET</a><br/>
		<a href="<%= request.getContextPath()%>/jquery_json_list.jsp">REST jQuery json list</a><br/>
		<a href="<%= request.getContextPath()%>/jquery_json_post.jsp">REST jQuery json POST</a><br/>
	</body>
</html>