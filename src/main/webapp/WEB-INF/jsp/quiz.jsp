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
    <title>EnglishQuiz</title>
</head>
<body>
    <div class="flex">
        <h1>English Quiz</h1>
        <span class="quizNumber"><c:out value="${quizNumber+1}"/>/10問</span>
    </div>
    	<p class="question">${quizList[quizNumber].question}</p>
   <form action="MatchingAnswer" method="post">
    	<div class="flex-box">
    	<input type="radio" name="choice" value="${quizList[quizNumber].choice_a}" class=choice id=box1>
    	<label class= choice-box for=box1>${quizList[quizNumber].choice_a}</label>
    	<input type="radio" name="choice" value="${quizList[quizNumber].choice_b}" class=choice id=box2>
    	<label class= choice-box for=box2>${quizList[quizNumber].choice_b}</label>
    	</div>
    	<div class="flex-box">
    	<input type="radio" name="choice" value="${quizList[quizNumber].choice_c}" class=choice id=box3>
    	<label class= choice-box for=box3>${quizList[quizNumber].choice_c}</label>
    	<input type="radio" name="choice" value="${quizList[quizNumber].choice_d}" class=choice id=box4>
    	<label class= choice-box for=box4>${quizList[quizNumber].choice_d}</label>
    	</div>
    	<input type="hidden" value="${quizList[quizNumber].answer}">
    	<div class="center">
    	<input type="submit" value="Answer" class=btn1>
    	</div>
		</form>
	
</body>
</html>