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
    <link rel="stylesheet" href="css/quizdone.css">
    <title>EnglishQuiz</title>
</head>
<body>
        <h1>English Quiz</h1>
        <p class=callname><c:out value="${userId}"/>さん</p>
        <p class="quizCoreect">あなたの点数は<c:out value="${correctNumber}"/>/10点です。</p>
        <c:if test="${correctNumber >= 8}">
        <p class=evaluation>大変よくできました</p>
        </c:if>
        <c:if test="${correctNumber >= 6 && correctNumber< 8}">
        <p class=evaluation>いい調子です</p>
        </c:if>
        <c:if test="${correctNumber < 6}">
        <p class=evaluation>再度やり直しましょう</p>
        </c:if>
    	<a href =LoginServlet?action=reset class="toMain">メインへ </a>
		
</body>
</html>