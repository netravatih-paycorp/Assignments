<html>
<body>
<!-- <center> -->
	
<form action="save" method="post">
		<input type="text" name="name"> 
		<br> <br>
		<label>Male</label>	<input type="radio" name="gender" value="male"> 
		<label>Female</label>	<input type="radio" name="gender" value="female">  <br> <br>
		<select name="branch">
		<option>CSE</option>
		<option>ME</option>
		<option>Civil</option>
		</select>

		<input type="date" name="DOB" placeholder="DD-MM-YYYY">

		<input type="submit" value="save">
	</form>
	
	<%= request.getAttribute("student") %>
	<!-- </center> -->
</body>
</html>
