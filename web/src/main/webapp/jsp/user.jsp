<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link type="text/css"
    href="css/ui-lightness/jquery-ui-1.8.18.custom.css" rel="stylesheet" />
<title>Add new photographer</title>
</head>
<body>

    <form method="POST" action='UserController' name="frmAddUser">
        Username : <input type="text" name="username"
            value="<c:out value="${user.username}" />" /> <br /> 
        First Name : <input
            type="text" name="name"
            value="<c:out value="${user.name}" />" /> <br /> 
        Last Name : <input
            type="text" name="surname"
            value="<c:out value="${user.surame}" />" /> <br /> 
        Password : <input type="text" name="password"
            value="<c:out value="${user.password}" />" /> <br /> <input
            type="submit" value="Submit" />
    </form>
</body>
</html>