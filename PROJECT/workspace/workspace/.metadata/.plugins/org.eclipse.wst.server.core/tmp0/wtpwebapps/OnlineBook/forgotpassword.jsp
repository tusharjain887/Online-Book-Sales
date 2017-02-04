<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Forgot Password</title>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
<link rel="stylesheet" type="text/css" href="style.css" />
<!--[if IE 6]>
<link rel="stylesheet" type="text/css" href="iecss.css" />
<![endif]-->
<script type="text/javascript" src="js/boxOver.js"></script>


<script type="text/javascript">
function validate()
{
var uname = document.myForm.uname;
var email = document.myForm.email;
var phone = document.myForm.mobile;

var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
var numbers = /^[0-9]+$/;
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

if(email.value.length==0)
	{
	alert("Please enter your email addres!");
	email.focus();
	return false;	
	}
else if(!email.value.match(mailformat))
    {
	alert("You have entered an invalid email address!");
	email.focus();
	return false;
}

if(phone.value.length==0)
{
	alert('Please enter your Mobile number!');
	phone.focus();
	return false;
}
else if(!phone.value.match(numbers))
{
	alert('Mobile number must have numeric characters only.');
	phone.focus();
	return false;
}
else if(!(phone.value.length==10))
{
	alert('Mobile number must be of 10 digits.');
    phone.focus();
	return false;
}

return true;
}
</script>
</head>
<body>
<div id="main_container">
  
  <div id="header">
  <div class="logout">
 <%  Object c=session.getAttribute("username");
if(c!=null)
	{
	out.print("Welcome  " +session.getAttribute("username").toString());
	%>
	&nbsp<a href='myprofile.jsp'>Profile</a>
	&nbsp<a href='logout.jsp'>Logout</a>
	<%
	}
	%>
	</div>
	
  </div>
  
  <div id="main_content">
    <div id="menu_tab">
      <div class="left_menu_corner"></div>
      <ul class="menu">
        <li><a href="index.jsp" class="nav1"> Home</a></li>
        <li class="divider"></li>
        <li><a href="categories.jsp" class="nav2">Categories</a></li>
        <li class="divider"></li>
        <%
        if(c==null)
        {
        %><li><a href="registration.jsp" class="nav4">Sign Up</a></li>
        <li class="divider"></li>
        <%
        }
        %>
        <li><a href="news.jsp" class="nav3">Offers</a></li>
        <li class="divider"></li>
        <li><a href="contact.jsp" class="nav6">Contact Us</a></li>
        <li class="divider"></li>
        <li><a href="forum.jsp" class="nav6">Forum</a></li>
        <li class="divider"></li>
        <li><a href="aboutus.jsp" class="nav3">About Us</a></li>
        <li class="divider"></li>
        
      </ul>
      <div class="right_menu_corner"></div>
    </div>
    <!-- end of menu tab -->
    <div class="left_content">
     <br><br><br>
      
      </div>
      
      
    <!-- end of left content -->
    <div class="center_content">
      <div class="center_title_bar">Contact Us</div>
      <div style="font-size:16px;color:#B13052;">
      <br><br><br><br><center>
      <form name="myForm" method="post" action="getpass.jsp" onsubmit="return validate()">
Enter your username : <input type="text" name="uname" /><br><br>
Enter your email id : <input type="text" name="email" /><br><br>
Enter your mobile no : <input type="text" name="mobile" /><br><br>
<input type="submit" name="submit" value="Submit" />
</form>
</center>
</div>
    </div>
    <!-- end of center content -->
    <div class="right_content">
     <br><br><br>
    </div>
    <!-- end of right content -->
  </div>
  <!-- end of main content -->
  <div class="footer">
    <br><br>
    <center> All Rights Reserved 2008</center>
      </div>

<!-- end of main_container -->
</body>
</html>
