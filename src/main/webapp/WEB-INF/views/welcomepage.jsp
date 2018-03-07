<html>
  <head>
    <title>Sample Application JSP Page</title>
  </head>

  <body bgcolor= coral>

  <table border="0" cellpadding="10">
    <tr>
      <td align=center>
         <h1>Welcome to FullStackProject - ChildCare</h1>
      </td>
    </tr>
  </table>

  <br />
  <p>This is the output of hello.jsp that is part of the application.</p>

  <%= new String("Welcome!") %>

  <h1 align="center">Welcome!</h1>


  <a href="<c:url value="http://localhost:8080/fullstackproject/findchild" />">find a child</a> |
  <a href="<c:url value="/findteacher" />">find a teacher</a>


  </body>
</html>