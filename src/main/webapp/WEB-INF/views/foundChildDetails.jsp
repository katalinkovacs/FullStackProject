<html>
  <head>
    <title>foundChildDetails JSP - Title!</title>
  </head>
  <body>
    foundChildDetails JSP!!!!!!
    <br>
    Child id is:   ${child.id}. <br>
    Child name is:   ${child.fullName}.<br>
    Child age is: ${child.ageMonth} months.
    <br>


    <%
       System.out.println("Java in foundChildDetails.JSP");
       //System.out.println("The userName in welcome.jsp is: " +request.getParameter("childName"));

    %>

  </body>
</html>