<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Issues</title>
<style>
div.card {
  width: 250px;
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
  text-align: left;
  height: 200px;
  background-color:lightblue;
  font-family: Arial;
}

div.header {
    background-color: #4CAF50;
    color: white;
    padding: 5px;
    font-size: 12px;
    height: 17px;
    overflow-y: hidden;
}

div.bandHeader {
    width:250px;
    height:20px;
    background-color: #CCCCCC;
    color: black;
    padding: 5px 1px 1px 5px;
    font-size: 15px;
    font-family: Arial;
    font-weight: Bold;
}

div.IssueContainerByActionType {
 	overflow-y: auto; 
 	height:700px;
}


div.container {
    padding: 2px;
    font-size: 11px;
    
}
</style>

</head>
<body>
<table align="center" valign="top" width="800px" height="100%">
	<tr valign="top">
	<td width="30%">
		<div class="bandHeader"><span>TODO</span></div>
		<br/>
		<div class="IssueContainerByActionType">
		<c:if test="${toDoIssues==null}">
			<nbsp;>
			<br/>
		</c:if>
		<c:forEach items="${toDoIssues}" var="ix">
			<div class="card">
				<div class="header">
					${ix.issue.id} - ${ix.issue.subject}
				</div>
				<div class="container">
					${ix.issue.body}
				</div>
			</div>
			<br/>
		</c:forEach>
		</div>
	</td>
	<td width="30%">
		<div class="bandHeader"><span>Working</span></div>
		<br/>
		<div class="IssueContainerByActionType">
		<c:if test="${empty workingIssues}">
			<nbsp;>
			<br/>
		</c:if>
		<c:forEach items="${workingIssues}" var="ix">
			<div class="card">
				<div class="header">
					${ix.issue.id} - ${ix.issue.subject}
				</div>
				<div class="container">
					${ix.issue.body}
				</div>
			</div>
			<br/>
		</c:forEach>
		</div>
	</td>
	<td width="30%">
		<div class="bandHeader"><span>Finished</span></div>
		<br/>
		<div class="IssueContainerByActionType">
		<c:if test="${empty finishedIssues}">
			<nbsp;>
			<br/>
		</c:if>
		<c:forEach items="${finishedIssues}" var="ix">
			<div class="card">
				<div class="header">
					${ix.issue.id} - ${ix.issue.subject}
				</div>
				<div class="container">
					${ix.issue.body}
				</div>
			</div>
			<br/>
		</c:forEach>
		</div>
	</td>
	</tr>
</table>

</body>
</html>