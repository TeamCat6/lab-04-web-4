<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Video Total Watch</title>
</head>
<body>

<jsp:useBean id="videoList" scope="request" type="java.util.ArrayList"/>
<jsp:useBean id="maxDislikes" scope="request" type="java.lang.Integer"/>
<jsp:useBean id="videoBlog" scope="request" type="com.harrypottervideoblog.model.VideoBlog"/>

<c:forEach items="${videoBlog.videos}" var="video">
    <c:choose>
        <c:when test="${video.dislikes > maxDislikes}">
            <c:set var="noUse" value="${
            videoList.clear();
            videoList.add(video);
            maxDislikes = video.dislikes
            }"/>
        </c:when>
        <c:otherwise>
            <c:if test="${video.dislikes == maxDislikes}">
                <c:set var="noUse" value="${
            videoList.add(video)
            }"/>
            </c:if>
        </c:otherwise>
    </c:choose>
</c:forEach>

<h1>Videos With Most Dislikes:</h1>

<c:forEach items="${videoList}" var="video">
    <h1><c:out value="${video}"/></h1>
</c:forEach>

<button style="display:block" onclick="history.back()">Back</button>

</body>
</html>