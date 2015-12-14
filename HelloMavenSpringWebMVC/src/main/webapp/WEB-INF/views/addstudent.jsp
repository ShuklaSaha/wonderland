<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  

<html>
<body>

Dear,${student.firstname} 
<br>
Your Roll Number: ${student.roll} 
<br>
Email:${student.email}
<br>
Contact No:${student.mobileno} 
<a href="viewall">view</a>

</body>


</html>