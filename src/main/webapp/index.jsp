<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h2>Hello World!</h2>
</body>
    <a href="user/findAll">findAll</a><br>
    <form action="/user/saveUser" method="post">
       姓名：<input type="text" name="username"><br>
       生日：<input type="text" name="birthday"><br>
       性别：<input type="radio" name="sex" value="男">男
       <input type="radio" name="sex" value="女">女<br>
       地址：<input type="text" name="address"><br>
        <input type="submit">
    </form>
</html>
