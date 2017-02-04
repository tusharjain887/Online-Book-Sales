<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Login</title>

<script type="text/javascript">

function required()
{
    	 
    	 var uname = document.myForm.username;
    	 var pwd = document.myForm.password;

    	 var alphanum = /^[0-9a-zA-Z]+$/;

    	 if (uname.value.length == 0)
    	 {
    	 alert('Please enter your Username!');
    	 uname.focus();
    	 return false;
    	 }
    	 else if ((!uname.value.match(alphanum)))
    	 {
    	 alert('Username must have alphanumeric characters only.');
    	 uname.focus();
    	 return false;
    	 }

    	 var pwd_len = pwd.value.length;
    	 if (pwd_len == 0)
    	 {
    	 alert("Please enter your password!");
    	 pwd.focus();
    	 return false;
    	 }
    	 else if(!pwd.value.match(alphanum))
    	 	{
    	 	alert("Password must have alphanumeric characters only.");
    	 	pwd.focus();
    	 	return false;
    	 	}
    	 else if( pwd_len > 15 || pwd_len < 5)
    	 {
    	 	alert("Password should be between 5 to 15 characters");
    	 	pwd.focus();
    	 	return false;
    	 }

    	 return true; 

}
     </script>

</head>
<body>
<center>
      <div class="title_box">Admin Login</div><br><br>
      <form name="myForm" method="post" action="checkadminlogin.jsp" onsubmit="return required()">
<div style="font-size:16px;color:#B13052;">Username : </div><input name="username" type="text" id="username" size="15"><br>
<p><div style="font-size:16px;color:#B13052;">Password : </div><input name="password" type="password" id="password" size="15"><br><br>
<input type="submit" name="Login" value="Login"><br><br>
</form>
 </center>
</body>
</html>