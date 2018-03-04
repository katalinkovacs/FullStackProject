<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    <!-- c --> java code -->
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
            <th>Child FullName</th>
            <th>Child AgeMonth</th>
        </tr>
        <c:forEach items="${children}" var="currentChild">
            <tr>
                <td>${currentChild.id}</td>
                <td>${currentChild.fullName}</td>
                <td>${currentChild.ageMonth}</td>
            </tr>
        </c:forEach>
    </table>

    <%
       System.out.println("Java in childrenListDisplay.JSP");
    %>
</body>
</html>