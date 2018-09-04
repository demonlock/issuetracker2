<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>New Issue</title>
</head>
<body>
	<form:form modelAttribute="issueAction" method="post">
		Subject:<form:input path="issue.subject" />
		<br/>
		Context:<form:input path="issue.body" />
		<br/>
		<!--  Scheduled Date:<form:input type="date" path="issue.scheduledDate" /> -->  
		<br/>
		<form:button name="submit">Create</form:button>
	</form:form>
</body>
</html>