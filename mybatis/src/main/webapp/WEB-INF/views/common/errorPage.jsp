<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error Page</title>
</head>
<body>
	<jsp:include page="menubar.jsp" />
	<h1 align="center" style="margin-top:50px">${ errorMsg }</h1>
</body>
</html>