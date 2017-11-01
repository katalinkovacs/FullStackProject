<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
    <title>Spring MVC Hello World</title>
</head>

<body>
    <h2>Every child in System</h2>

    <table border="1">
        <tr>
            <th>Child Id</th>
            <th>Child Name</th>
            <th>Child Age</th>
        </tr>
        <c:forEach items="${childrenList}" var="currentChild">
            <tr>
                <td>${currentChild.id}</td>
                <td>${currentChild.name}</td>
                <td>${currentChild.age}</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>