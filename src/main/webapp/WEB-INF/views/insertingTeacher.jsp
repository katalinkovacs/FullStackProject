<html>
  <head>
    <title> Title!</title>
  </head>
  <body>
     insertingTeacher JSP!!!!!!!!!!!!!!
     <br>
     <br>

  <form action="insertteacher" method="post">
     Please enter Teacher Id: <input type="text" name="id"/>
     <br>
     Please enter Teacher Name: <input type="text" name="name"/>
     <br>
     <input type="submit" value="Insert" />
  </form>


  <%
     System.out.println("Java in insertingTeacher.JSP");
  %>


  </body>
</html>