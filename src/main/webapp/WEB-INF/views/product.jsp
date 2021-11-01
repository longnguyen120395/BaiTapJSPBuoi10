<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Products</title>
<!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<h1> Show Products.</h1>
	<br>
	<h2> Add Product </h2>
	<%String path =request.getContextPath(); %>
	<form action= "<%= path %>/products"  method ="post"> 
		<label> Product's Name: </label>
		<input type= "text" name="name"/>
		<br>
		<label> Quantity: </label>
		<input type= "text" name="quantity"/>
		<br>
		<label> Price: </label	>
		<input type= "text" name="price"/>
		<br>
		<button type="submit"> Add </button>
	</form>
	<br>
	
	<div class="container-fluid">
      <h1>Product page</h1>
        
      <table class="table mt-5">
          <thead>
            <tr>
              <th>Name</th>
              <th>Quantity</th>
              <th>Price</th>
              
            </tr>
          </thead>
          <tbody>
          <c:forEach var="product" items="${products}">
            <tr>
              <td scope="row">${product.name}</td>
              <td>${product.quantity}</td>
              <td>${product.price}</td>
              
            </tr>
          </c:forEach>
          </tbody>
        </table>
    </div>
	
</body>
</html>