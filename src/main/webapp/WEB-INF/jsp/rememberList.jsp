<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" href="css/rememberList.css">
    <title>RememberList</title>
</head>
<body>
    <h1>RememberList</h1>
    <p class="call"><c:out value="${userId}"/>さん</p>
    <c:forEach var ="remember" items ="${rememberList}">
    <form action ="RememberListServlet?action=delete" method="post">
    <div class="flex">
    	<input type="hidden" value="${remember.userId}" name="userId">
    	<input type="hidden" value="${remember.quiz_Id}" name="quiz_Id">
    	<div class= left>
    		<input type="submit" class="btn" value="覚えた">
    	</div>
    	<div class=right>
    		<p class=txt>問題:<c:out value ="${remember.question}"/></p>
    		<p class=txt>答え:<c:out value ="${remember.answer}"/></p>
    		<p class=txt>解説:<c:out value ="${remember.explanation}"/></p>
    	</div>
    </div>
    </form>
    </c:forEach>
    <a href =LoginServlet?action=main class="toMain">メインへ </a>
</body>
</html>