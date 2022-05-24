<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h1 style="text-align:center; Color:black">Welcome</h1><b>
        <h1 style="text-align:center; Color:black">SimpliLearn Phase 5 Project Assessment</h1><b>
        
         
        <h2 style="text-align:center; Color:red">Login</h2>
        <br/>
        <br/>
<div style="margin-top: 5%; margin-left: 45%;";>
<form action="login">
Username<input type="text" name="un"><br>
Password<input type="password" name="pwd"><br>
<input type="submit" value="login" id="sub"> 
</form>
<h3>if the user is not registered</h3>
<form action="register.jsp">
<input type="submit" value="register">
</form>
</div>
</body>
</html>
