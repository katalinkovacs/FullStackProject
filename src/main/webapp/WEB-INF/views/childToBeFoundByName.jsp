<html>
  <head>
    <title>Welcome JSP - Title!</title>
  </head>
  <body>
     childToBeFoundByName JSP!!!!!!!!!!!!!!
     <br>

  <form action="findchild" method="post">
     Please enter Child Name: <input type="text" name="fullName"/>
     <input type="submit" value="Find" />
  </form>


  <%
     System.out.println("Java in childToBeFoundByName.JSP");
     System.out.println("The name of the child is: " +request.getParameter("childName"));

  %>


  </body>
</html>



