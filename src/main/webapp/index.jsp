<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" href="css/index.css">
    <title>English Quiz</title>
</head>
<body>
    <h1>English Quiz</h1>
    <form action="LoginServlet" class="form1" method="post">
        <input type="text" name="userId" class=input_name placeholder="User_ID"><br>
        <input type="password" name="pass" class=input_pass placeholder="PASS"><br>
        <div class =flex>
            <input type="submit" value="Login" class="btn1">
            <a href ="LoginServlet" class="btn1">Register</a>
        </div>
    </form>
</body>
</html>