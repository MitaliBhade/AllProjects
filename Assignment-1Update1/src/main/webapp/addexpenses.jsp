<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TotalExpensesPage</title>
</head>
<body>
 Add Expenses if you have any   
 <form action = "addExpenses">
sr no <input type ="text" name="srno"><br>
month <input type ="text" name="month"><br>
year <input type ="text" name="year"><br>
expenses <input type ="text" name="expenses">
<br>
<%--category <input type ="text" name="categories_categories"> --%>
category<Select name="categories">

<%--category <Select name = "categories_categories">  --%>
<option>Select Option</option>
<option>Fuel</option>
<option>Food</option>
<option>Grocery</option>
<option>Phone</option>
<option>Internet</option>
<option>Electricity</option>
</Select>

<br>

<input type="submit"><br>

<strong><a href="home.jsp">got to home page</a></strong>
</form>
</body>
</html>