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
    <link rel="stylesheet" href="css/quiz.css">
    <title>EnglishQuizAnswer</title>
</head>
<body>
    <div class="flex">
        <h1>English Quiz Answer</h1>
        <span class="quizNumber"><c:out value="${quizNumber+1}"/>/10問</span>
    </div>
    	<p class="question">${quizList[quizNumber].question}</p>
    	<div class="flex-box">
    	<p class= choice-box>${quizList[quizNumber].choice_a}<p>
    	
    	<p class= choice-box>${quizList[quizNumber].choice_b}<p>
    	
    	</div>
    	<div class="flex-box">
    	<p class= choice-box>${quizList[quizNumber].choice_c}</p>
    	
    	<p class= choice-box>${quizList[quizNumber].choice_d}</p>
    	</div>
    	<p class=answer>${quizList[quizNumber].answer}</p>
    	<div class="flex">
    	<span class= "ex">${quizList[quizNumber].explanation}</span>
    	<a href =GivingQuizServlet?action=2 class="next">次へ </a>
    	</div>
		
</body>
</html>