<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

username : <%=request.getAttribute("username") %> <br/>

userNo : <%=request.getAttribute("userNo") %> <br/>

userAddress : <%=request.getAttribute("userAddress")%> <br/>

re : <%=request.getAttribute("result") %>

</body>
</html>