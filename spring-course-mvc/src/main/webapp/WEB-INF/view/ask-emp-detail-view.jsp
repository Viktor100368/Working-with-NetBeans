
<!doctype html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<html>
    <body>
        <h2>Der employee, pleace enter your details</h2>
        <br>
        <br>
    <form:form action="/showDetails" modelAttribute="employee">
      Name  <form:input path="name"/>
      <br><br>
      Sruname  <form:input path="surname"/>
      <br><br>
      Salary <form:input path="salary"/>
      <br><br>
      <input type="submit" value="Ok"/>
        
    </form:form>
    </body>
</html>
