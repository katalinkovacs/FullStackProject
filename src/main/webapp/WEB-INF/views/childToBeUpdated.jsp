<html>
  <head>
    <title> Title!</title>
  </head>
  <body>
     childToBeUpdated JSP!!!!!!!!!!!!!!
     <br>

  <form action="updatechild" method="post">
     Please enter Child Id whose age you want to update : <input type="text" name="id"/>
     <br>
     Please enter Child new Age in moths: <input type="text" name="ageMonth"/>
     <input type="submit" value="Update" />
  </form>


  <%
     System.out.println("Java in childToBeUpdated.JSP");
  %>


  </body>
</html>