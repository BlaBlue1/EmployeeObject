# EmployeeObject
  <!DOCTYPE html>
<html lang="en" xmlns:th="www.thymeleaf.org">
<head>
  <meta charset="UTF-8">
  <title>Title</title>
</head>
<body>
<h2>Employee Object</h2>
<form action="#" th:action="@{/employeeobjectform}" th:object="${employeeobject}" method="post">
  First Name: <input type="text" th:field="*{firstName}"><br><br>
  Last Name: <input type="text" th:field="*{lastName}"><br><br>
  SSN: <input type="number" th:field="*{ssn}"><br><br>
  DOB: <input type="date" th:field="*{dob}"><br><br>
  <input type="submit" value="Submit">

</form>

</body>
</html>
