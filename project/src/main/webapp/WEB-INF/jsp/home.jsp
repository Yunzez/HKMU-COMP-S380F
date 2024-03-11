<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import ="java.util.List" %>
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns="http://java.sun.com/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd"
         version="3.0">
    <!-- Config here. -->
</web-app>
<!DOCTYPE html>
<html>  
<head>
    <link
      rel="stylesheet"
      href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
      integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
      crossorigin="anonymous"
    />

    <title>My Static Page</title>
  </head>
  <body>
    <div class="p-5 m-5">
      <h2 class="text-center border-bottom font-weight-bold">Welcome to the book store</h1>
      <p class="">This is a simple static page served by Spring Boot.</p>
      <p>Debug Message: ${message}</p>
      <div class="d-flex flex-wrap">
        <c:forEach var="book" items="${books}">
            <div>
                ${books.size()}
            </div>
            <div class="border shadow-sm p-5 mb-5 bg-white rounded">
                <h3 class="text-center">Title: ${book.getAuthor()}</h3>
                <p>Author: ${book.getAuthor()}</p>
                <p>Price: $${book.getPrice()}</p>
                <p>Description: ${book.description}</p>
            </div>
        </c:forEach>
    </div>
    </div>
  </body>
</html>
