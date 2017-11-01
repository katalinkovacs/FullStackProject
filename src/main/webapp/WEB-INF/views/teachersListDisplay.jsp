<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
    <title>Spring MVC Hello World</title>
</head>

<body>
    <h2>All Teachers in System</h2>

    <table border="1">
        <tr>
            <th>Teacher Id</th>
            <th>Teacher Name</th>
        </tr>
        <c:forEach items="${teachers}" var="teacher">
            <tr>
                <td>${teacher.id}</td>
                <td>${teacher.name}</td>

            </tr>
        </c:forEach>
    </table>

    <%
        System.out.println("Java in teachersListDisplay.JSP");
    %>

</body>
</html>