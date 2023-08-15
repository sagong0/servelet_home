<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test page</title>
</head>
<body>
고객명 : <%=request.getAttribute("jspName") %> <br/>
주소 : <%=request.getAttribute("jspAddress") %><br/><br/><br/>

합쳐진 거보소 :   <%=request.getAttribute("addedName") %>
</body>
</html>