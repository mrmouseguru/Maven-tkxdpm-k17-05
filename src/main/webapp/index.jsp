<!-- src/main/webapp/index.jsp -->
<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Nhân 2 số - Web Demo</title>
</head>
<body>
    <h1>Nhân 2 số</h1>
    <form action="${pageContext.request.contextPath}/nhan2so" method="post">
        <label>Number 1: <input type="text" name="num1" /></label><br/>
        <label>Number 2: <input type="text" name="num2" /></label><br/>
        <button type="submit">Tính</button>
    </form>
</body>
</html>
