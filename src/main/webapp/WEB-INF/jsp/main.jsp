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
    <link rel="stylesheet" href="css/main.css">
    <title>EnglishQuiz</title>
</head>
<body>
    <h1>English Quiz</h1>
    <p class="welcome">Welcome&ensp;<c:out value="${userId}"/>さん</p>
    <div class="items">
        <form action="GivingQuizServlet?action=1" method="post">
            <input type="submit" class="btn" value="QUIZ">
        </form>
        <form action="" method="post">
            <input type="submit" class="btn" value="RememberList">
        </form>
    </div>
</body>
</html>