<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Issues</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<td>ID</td>
				<td>Subject</td>
				<td>Body</td>
			</tr>
		</thead>
		<c:forEach items="${issues}" var="issue">
			<tr>
				<td>${issue.id}</td>
				<td>${issue.subject}</td>
				<td>${issue.body}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>