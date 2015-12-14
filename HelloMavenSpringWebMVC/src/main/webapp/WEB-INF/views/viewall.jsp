<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<c:if test="${not empty students}">

			
			

			
			<table border="1px" cellpadding="0" cellspacing="0">  
	<thead>  
		<tr>  
		<th width="10%">FirstName</th>
		<th width="15%">LastName</th>
		<th width="10%">RollNo</th>
		<th width="10%">Email</th>  
		<th width="10%">Mobile</th>
		<th width="10%">Age</th>
		<th width="10%">DOB</th>
		<th width="10%">Gender</th>
		<th width="10%">Languages</th>
</tr>  
</thead>  
<tbody> 
 <c:forEach var="listValue" items="${students}">
			<tr>
				<td>${listValue.getFirstname()}</td>
				<td>${listValue.getLastname()}</td>
				<td>${listValue.getRoll()}</td>
				<td>${listValue.getEmail()}</td>
				<td>${listValue.getMobileno()}</td>
				
				<td>${listValue.getAge()}</td>
				<td>${listValue.getDob()}</td>
				<td>${listValue.getGender()}</td>
				<td>${listValue.getLanguage()}</td>
				<td><a href="edit/${listValue.getEmail()}">Edit</a></td>
				<td><a href="delete/${listValue.getEmail()}">Delete</a></td>
				</tr>
</c:forEach> 
				</tbody>
				</table>
			
		
 
	</c:if>