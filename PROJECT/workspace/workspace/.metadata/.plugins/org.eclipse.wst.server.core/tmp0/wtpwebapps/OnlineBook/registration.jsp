<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Sign Up</title>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
<link rel="stylesheet" type="text/css" href="style.css" />
<!--[if IE 6]>
<link rel="stylesheet" type="text/css" href="iecss.css" />
<![endif]-->
<script type="text/javascript" src="js/boxOver.js"></script>

<script type="text/javascript">
function formValidation()
{
var username = document.myForm.username;
var name = document.myForm.name;
var lname = document.myForm.lname;
var age = document.myForm.age;
var phone1 = document.myForm.phone1;
var email = document.myForm.email;
var address = document.myForm.address;
var pwd = document.myForm.pwd; 
var pwd1 = document.myForm.pwd1;

//username
var uid_len = username.value.length;
var alphanum = /^[0-9a-zA-Z]+$/;
if (uid_len == 0)
{
alert('Please enter your Username!');
username.focus();
return false;
}
else if ((!username.value.match(alphanum)))
{
alert('Username must have alphanumeric characters only.');
username.focus();
return false;
}

//Name
var letters = /^[A-Za-z]+$/;
if(name.value.length==0)
{
	alert('Please enter your First name!');
	name.focus();
	return false;
}
else if(!name.value.match(letters))
{
	alert('First name must have alphabet characters only');
	name.focus();
	return false;
}

if(lname.value.length==0)
{
	alert('Please enter your Last name!');
	lname.focus();
	return false;
}
else if(!lname.value.match(letters))
{
	alert('Last name must have alphabet characters only');
	lname.focus();
	return false;
}

if ( ( myForm.gender[0].checked == false ) && ( myForm.gender[1].checked == false ))
{
alert('Please select your gender!');
return false;
}

if(document.myForm.pro.selectedIndex==0)
{ 
alert("Please select your profession!");
document.myForm.pro.focus();
return false;
}
 
var numbers = /^[0-9]+$/;
if(age.value.length==0)
{
	alert('Please enter your age!');
	age.focus();
	return false;
}
else if(!age.value.match(numbers))
{
	alert('Age must have numeric characters only.');
	age.focus();
	return false;
}
else if(age.value.length>2)
{
	alert('Age must be less than 100');
	age.focus();
	return false;
}

if(phone1.value.length==0)
{
	alert('Please enter your Mobile number!');
	phone1.focus();
	return false;
}
else if(!phone1.value.match(numbers))
{
	alert('Mobile number must have numeric characters only.');
	phone1.focus();
	return false;
}
else if(!(phone1.value.length==10))
{
	alert('Mobile number must be of 10 digits.');
    phone1.focus();
	return false;
}

var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
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


if(address.value.length==0)
{
	alert('Please enter your address!');
	age.focus();
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
	
pwd_len = pwd1.value.length;
if (pwd_len == 0)
{
alert("Please confirm your password");
pwd1.focus();
return false;
}
else if(!pwd1.value.match(alphanum))
{
alert("Password must have alphanumeric characters only.");
pwd1.focus();
return false;
}
else if( pwd_len > 15 || pwd_len < 5)
{
	alert("Password should be between 5 to 15 characters");
	pwd1.focus();
	return false;
}

if(pwd.value!=pwd1.value)
{
alert("Password mismatch!");
pwd.focus();
return false;
}
	


return true;
}
</script>
</head>
<body>
<div id="main_container">
  
  <div id="header">
	
  </div>
  
  <div id="main_content">
    <div id="menu_tab">
      <div class="left_menu_corner"></div>
      <ul class="menu">
        <li><a href="index.jsp" class="nav1"> Home</a></li>
        <li class="divider"></li>
        <li><a href="categories.jsp" class="nav2">Categories</a></li>
        <li class="divider"></li>
        <li><a href="registration.jsp" class="nav4">Sign Up</a></li>
        <li class="divider"></li>
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
</br></br></br>
    <div class="left_content">
         <div class="title_box">Categories</div>
      <ul class="left_menu">
      <%
      try{
    	  Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 	
	Connection Conn8=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh"); 
	PreparedStatement ps8=Conn8.prepareStatement("SELECT CAT_ID,CAT_NAME FROM CATEGORY"); 
	ResultSet rs8=ps8.executeQuery();
	while(rs8.next()) 
    {
		String name=rs8.getString(2);
 	%> 
        <li class="even"><%out.println("<a href='viewcategory.jsp?cat_id="+rs8.getString(1)+"'>"+name+"</a>");%></li>  
        <%
        } 
        %>  
      </ul>
      <%
      PreparedStatement ps9=Conn8.prepareStatement("SELECT IMAGEURL FROM ADVERTISEMENT ORDER BY AD_ID DESC LIMIT 0,3"); 
	ResultSet rs9=ps9.executeQuery();
	while(rs9.next()) 
    {
		%>
      <div class="banner_adds"><br><br><br> <%out.println("<img src='C:/Uploaded Images/"+rs9.getString(1)+"'></img>");%> </div>
      <%
      }
	ps8.close();
	ps9.close();
	Conn8.close();
      }
      catch(Exception e)
      {
    	  System.out.println(e);
      }
      %>
    </div>
    </div>
    <!-- end of left content -->
    <div class="center_content">
      <div class="center_title_bar">User Registration</div>
      <div style="font-size:16px;color:#B13052;">
      <form name="myForm" action="registration1.jsp" method="post" onsubmit="return formValidation()">
      <center>
      Note : All fields are necessary.
</br></br>
<table>
<h3>
<tr>
<td style="margin-bottom: 5px;">Username        : </td>
<td style="margin-bottom: 5px;"><input type=text name="username" size=15></td>
</tr>
<tr>
<td style="margin-bottom: 5px;">First name         : </td>
<td style="margin-bottom: 5px;"><input type=text name="name" size=15></td>
</tr>
<tr>
<td style="margin-bottom: 5px;">Last name        : </td>
<td style="margin-bottom: 5px;"><input type=text name="lname" size=15></td>
</tr>
<tr>
<td style="margin-bottom: 5px;">Gender               :</td>
<td style="margin-bottom: 5px;"><input type="radio" name="gender" value="male" /><span>Male</span><input type="radio" name="gender" value="female" /><span>Female</span></td>
</tr>
<tr>
<td style="margin-bottom: 5px;">Profession        : </td>
<td style="margin-bottom: 5px;"><select name="pro">
<option selected="" value="Default">(Please select a Profession)</option>
<option value=Student>Student</option>
<option value=Business>Business</option>
<option value=Govt. Employee>Govt.Employ</option>
<option value=Pvt.Employee>Pvt.Employ</option>
</select></td>
</tr>
<tr>
<td style="margin-bottom: 5px;">Age               :</td>
<td style="margin-bottom: 5px;"><input type=text name="age"size=15></td>
</tr>
<tr>
<td style="margin-bottom: 5px;">Mobile.No         :</td>
<td style="margin-bottom: 5px;"><input type=text name="phone1" size=15></td>
</tr>
<tr>
<td style="margin-bottom: 5px;">E-mail            :</td>
<td style="margin-bottom: 5px;"><input type=text name="email" size=15></td>
</tr>
<tr>
<td style="margin-bottom: 5px;">Address          : </td>
<td style="margin-bottom: 5px;"><textarea rows=3 cols=15 name="address" size=15></textarea></td>
</tr>
<tr>
<td style="margin-bottom: 5px;">Password          : </td>
<td style="margin-bottom: 5px;"><input type=password name="pwd" size=15></td>
</tr>
<tr>
<td style="margin-bottom: 5px;">Confirm Password  : </td>
<td style="margin-bottom: 5px;"><input type=password name="pwd1" size=15></td>
</tr></h3>
</table>
<br><br>


<input type=submit value="submit">
<input type=reset value="reset">
</center>
</form>
</div>
    </div>
    <!-- end of center content -->
    <div class="right_content">
     <br><br><br>
    </div>
    <!-- end of right content -->
  </div>
  <!-- end of main content -->
  </br></br>
  <div class="footer">
    <br><br>
    <center> All Rights Reserved 2008</center>
      </div>

<!-- end of main_container -->
</body>
</html>
