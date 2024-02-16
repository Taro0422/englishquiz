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
    		<c:choose>
    			<c:when test="${quizList[quizNumber].choice_a.equals(quizList[quizNumber].answer)}">
    				<p class= choice-box id=yellow>${quizList[quizNumber].choice_a}</p>
    			</c:when>
    			<c:otherwise>
    				<p class= choice-box>${quizList[quizNumber].choice_a}<p></p>
    			</c:otherwise>
    		</c:choose>
    		<c:choose>
    			<c:when test="${quizList[quizNumber].choice_b.equals(quizList[quizNumber].answer)}">
    				<p class= choice-box id=yellow>${quizList[quizNumber].choice_b}</p>
    			</c:when>
    			<c:otherwise>
    				<p class= choice-box>${quizList[quizNumber].choice_b}<p></p>
    			</c:otherwise>
    		</c:choose>
    	</div>
    	<div class="flex-box">
    		<c:choose>
    			<c:when test="${quizList[quizNumber].choice_c.equals(quizList[quizNumber].answer)}">
    				<p class= choice-box id=yellow>${quizList[quizNumber].choice_c}</p>
    			</c:when>
    			<c:otherwise>
    				<p class= choice-box>${quizList[quizNumber].choice_c}<p></p>
    			</c:otherwise>
    		</c:choose>
    		<c:choose>
    			<c:when test="${quizList[quizNumber].choice_d.equals(quizList[quizNumber].answer)}">
    				<p class= choice-box id=yellow>${quizList[quizNumber].choice_d}</p>
    			</c:when>
    			<c:otherwise>
    				<p class= choice-box>${quizList[quizNumber].choice_d}</p>
    			</c:otherwise>
    		</c:choose>
    	</div>
    	<p class=answer>${quizList[quizNumber].answer}</p>
    	<div class="flex">
    	<span class= "ex">${quizList[quizNumber].explanation}</span>
    	<a href =GivingQuizServlet?action=2 class="next">次へ </a>
    	</div>
		
</body>
</html>