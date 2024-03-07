<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"%>

<html>
<head>
    <title>Video Total Watch</title>
</head>
<body>

<c:set var="result" value="0" property="number"/>
<jsp:useBean id="videoBlog" scope="request" type="com.harrypottervideoblog.model.VideoBlog"/>

<c:forEach items="${videoBlog.videos}" var="video">
    <c:set var="result" value="${result + video.watchCount}" property="number"/>
</c:forEach>

<h1>Video Total Watch : ${result}</h1>

<button style="display:block" onclick="history.back()">Back</button>

</body>
</html>