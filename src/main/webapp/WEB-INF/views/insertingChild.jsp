<html>
  <head>
    <title> Title!</title>
  </head>
  <body>
     insertingChild JSP!!!!!!!!!!!!!!
     <br>

  <form action="insertchild" method="post">
     Please enter Child Id: <input type="text" name="id"/>
     <br>
     Please enter Child Full Name: <input type="text" name="fullName"/>
     <br>
     Please enter Child Age in moths: <input type="text" name="ageMonth"/>
     <input type="submit" value="Insert" />
  </form>


  <%
     System.out.println("Java in insertingChild.JSP");
  %>


  </body>
</html>