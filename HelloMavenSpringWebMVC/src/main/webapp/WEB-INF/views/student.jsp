<html>
<head>
<script src="../js/submitform.js"></script>
</head>
<body onload="document.myform.firstname.focus()">
	<h2>STUDENT FORM</h2>
	
<form name="student" method="post" onsubmit="return formValidation()" action="/HelloMavenSpringWebMVC/student/create">
<table>
<tr>
<td>First Name:</td>
<td><input type="text" name="firstname" size="18"/></td>
</tr>
<tr>
<td>Last Name:</td>
<td><input type="text" name="lastname"/></td>
</tr>
<tr>
<td>Roll Number:</td>
<td><input type="text" name="roll"/></td>
</tr>
<tr>
<td>Email:</td>
<td><input type="text" name="email"/></td>
</tr>
<tr>
<td>Mobile No:</td>
<td><input type="text" name="mobileno"/>
</tr>
<tr>
<td>Age:</td>
<td><input type="text" name="age"/>
</tr>
<tr>
<td>DOB:</td>
<td><input type="date" name="dob" placeholder="yyyy-mm-dd"></td>
</tr>
<tr>
<td>Gender:</td>
<td><input id="male" name="gender" type="radio" value="Male">
<label>Male</label></td>
<td><input id="female" name="gender" type="radio" value="Female">
<label>Female</label></td>
</tr>
<tr>
<td>Language Known:</td>
<td><input type="checkbox" name="language" value="C"><label>C</label></td>
<td><input type="checkbox" name="language" value="JAVA"><label>JAVA</label></td>
<td><input type="checkbox" name="language" value="ASP"><label>ASP.NET</label></td>
</tr>
<tr>
<td><input type="submit" value="Submit"></td>
</tr>

</table>

</form>
</body>
