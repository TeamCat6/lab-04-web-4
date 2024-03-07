<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Harry Potter Video Blog</title>
</head>
<body>

<c:set var="commentLikesGreaterThanVideoLikes" value="false" />
<jsp:useBean id="videoBlog" scope="request" type="com.harrypottervideoblog.model.VideoBlog"/>

<c:forEach items="${videoBlog.videos}" var="video">
    <c:forEach items="${video.comments}" var="comment">
        <c:if test="${comment.likes > video.likes && !commentLikesGreaterThanVideoLikes}">
            <c:set var="commentLikesGreaterThanVideoLikes" value="true"/>
        </c:if>
    </c:forEach>
</c:forEach>

<h1>Is Comment Likes Greater Than Video Likes: ${commentLikesGreaterThanVideoLikes}</h1>

<button style="display:block" onclick="history.back()">Back</button>
</body>
</html>
