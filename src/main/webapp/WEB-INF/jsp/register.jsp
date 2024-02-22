<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" href="css/register.css">
    <title>English Quiz</title>
</head>
<body>
    <h1>Register</h1>
    <form action="RegisterCheckServlet" class="form1" method="post">
        <input type="text" name="userId" class="input" placeholder="User_ID"><br>
        <input type="password" name="pass" class="input" placeholder="PASS"><br>
        <input type="text" name="name" class="input" placeholder="お名前"><br>
        <input type="email" name="mail" class="input" placeholder="メールアドレス"><br>
        <div class =flex>
            <input type="submit" value="Register" class="btn1">
            <a href ="index.jsp" class="btn1">Cancel</a>
        </div>
    </form>
</body>
</html>