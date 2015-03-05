<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="pl">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/style/style.css'/>"/>
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css" />
    <link rel="stylesheet" href="/resources/css/main.css" />
	
	<script src="/resources/js/jquery-2.1.3.min.js"></script>
	<script src="/resources/js/bootstrap.min.js"></script>
	
	<title>Football Club Manager</title>
	</head>
	
	<body>
	
		<div class="wrapper">
			<tiles:insertAttribute name="header" />
		</div>
		
		<div class="container " >
			<tiles:insertAttribute name="body" />
		</div>
		
		<div class="footer">
			<tiles:insertAttribute name="footer" />
		</div>
	</body>
	
</html>