<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" href="css/registercheck.css">
    <title>English Quiz</title>
</head>
<body>
    <h1>Register</h1>
    <p>こちらの情報でお間違いありませんでしょうか？</p>
    <p>User_ID:${accountUser.userId}</p>
    <p>PASS:${accountUser.pass}</p>
    <p>お名前:${accountUser.name}</p>
    <p>メールアドレス:${accountUser.mail }</p>
    <form action="RegisterServlet" class="form1" method="post">
        <div class =flex>
            <input type="submit" value="Register" class="btn1">
            <a href = RegisterCheckServlet class="btn1">Cancel</a>
        </div>
    </form>
</body>
</html>