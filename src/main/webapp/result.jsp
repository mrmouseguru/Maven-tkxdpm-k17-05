<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>

<html>
<head>
    <title>Kết quả - Nhân 2 số</title>
</head>
<body>
    <h1>Kết quả</h1>

    <c:choose>
        <c:when test="${not empty errorMessage}">
            <div style="color:red;">${errorMessage}</div>
        </c:when>
        <c:otherwise>
            <p>Kết quả: ${model.result}</p>
        </c:otherwise>
    </c:choose>

    <a href="${pageContext.request.contextPath}/index.jsp">Quay lại</a>
</body>
</html>
