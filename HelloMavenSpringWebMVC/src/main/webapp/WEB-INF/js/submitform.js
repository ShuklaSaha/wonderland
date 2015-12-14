function formValidation()
{
	firstname=document.myform.firstname;
	lastname=document.myform.lastname;
	email=document.myform.email;
	mobile=document.myform.mobileno;
	age=document.myform.age;
	if(validate_required(firstname,lastname,email,mobile,age))
	{	
	if(validate_name(firstname,lastname))
	{
			if(validate_email(email))
		
		{
			if(validate_mobile(mobile))
			{
				if(validate_age(age,16,24))
				{
				    document.getElementById("myForm").submit();
					
				}
				
			}
		}
	}
	}
	else
		return false;
}
function validate_required(firstname,lastname,email,mobile,age)
{
	var flen=firstname.value.length;
	var llen=lastname.value.length;
	var elen=email.value.length;
	var mlen=mobile.value.length;
	var alen=age.value.length;
	if(flen==0 || llen==0 || elen==0 || mlen==0 || alen==0)
		
		{
			alert("please fill up the form");
			
		return false;
		}
		else
			return true;
}
function validate_age(age,min,max)

{
	if(age.value<min || age.value>max)
	{
		alert("Age should be in between"+min+"\t"+"and"+"\t"+max);
		age.focus();
		return false;
		
	}
	else
		return true;
	
}
function validate_mobile(mobile)
{
	var regx=/^\+\d{2}-\d{10}$/;
	if(mobile.value.match(regx))
		return true;
	else{
		alert("Mobile number should be in this format{+(country code)-(contact number)}");
		return false;
	}
}
function validate_email(email) 
{  
var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;  
if(email.value.match(mailformat))  
{  
return true;  
}  
else  
{  
alert("You have entered an invalid email address!");  
email.focus();  
return false;  
}  
}  
function validate_name(firstname,lastname)
{
	var letters = /^[A-Za-z]+$/;  
	if(firstname.value.match(letters) && lastname.value.match(letters))
		return true;
	else
	{
		alert("Please enter a valid name");
		return false;
	}
}
