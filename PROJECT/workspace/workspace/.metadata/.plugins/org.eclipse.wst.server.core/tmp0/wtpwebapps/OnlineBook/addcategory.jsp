<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Category</title>

<script type="text/javascript">
function formValidation()
{
var catid = document.myForm.categoryid;
var name = document.myForm.name;
var des = document.myForm.description;

if(catid.value.length==0)
{
	alert('Please enter Category ID !');
	catid.focus();
	return false;
}

if(name.value.length==0)
{
	alert('Please enter Category name!');
	name.focus();
	return false;
}

if(des.value.length==0)
{
	alert('Please enter Description !');
	des.focus();
	return false;
}
}
</script>
</head>
<body>
  <div style="float:right;font-size:14px;">
 <%  Object c=session.getAttribute("admin");
if(c!=null)
	{
	out.print("Welcome  " +session.getAttribute("admin").toString());
	out.print(" ,  <a href='logout.jsp'>Logout</a>");
	%>
	</div>
<br><br><br><br><br><center>
<a href="adminhome.jsp">Go To Home</a>
<center>
</br></br>
<div class="center_title_bar">Add Categories</div>
      <form name="myForm" action="addcategorydb.jsp" method="post" onsubmit="return formValidation()">   
<table>
<pre><h3>
<tr>
<td>Category Id        : </td>
<td><input type=text name="categoryid" size=15></td>
</tr>
<tr>
<td>Category Name         : </td>
<td><input type=text name="name" size=15></td>
</tr>
<tr>
<td>Description               :</td>
<td><input type=text name="description" size=15></td>
</tr>
</h3></pre>
</table>
<br><br>
<input type=submit value="submit">
<input type=reset value="reset">
</center>
</form>
</body>
</html>
<%
}
else
{
out.println("Please Login");
}
%>