<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="getById">
        <h1 >Enter the Student Id:</h1>
        <input type="text" name="id" placeholder="enter the id">
        <br><br>
        <button type="submit">submit</button>
    </form>
    
  <br><br>
   <br>

  <h1>Student Details</h1>
    <table border="3">
        <tr>
            <th>Student-ID</th>
            <th>Student-Name</th>
            <th>Student-Gender</th>
            <th>Student-Branch</th>
            <th>Student-DOB</th>
         </tr>
        
           <tr>
                <td>${data.id}</td>
                <td>${data.name}</td>
                <td>${data.gender}</td>
                <td>${data.branch}</td>
                <td>${data.DOB}</td>
            </tr>
    </table>
     
 </body>
 

</html>