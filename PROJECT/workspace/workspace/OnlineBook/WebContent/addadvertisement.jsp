<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Advertisement</title>

<script type="text/javascript">
function formValidation()
{
	var emp_name = document.form1.emp_name;

	if(emp_name.value.length==0)
	{
	alert('Please enter title !');
	emp_name.focus();
	return false;
	}

return true;
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
<form action="advertisementdb.jsp" method="post" enctype="multipart/form-data" name="form1" id="form1" onsubmit="return formValidation()">
<center>
<table border="2">
<tr>
<td align="right"><b>Title:</td>
<td><input type="text" name="emp_name"></td>
</tr>
<tr>
<td align="right"><b>Image </td>
<td>
<input name="file" type="file" id="file">
<td>
</tr>
<tr>
<td align="center">
<input type="submit" name="Submit" value="Submit"/>
<input type="reset" name="Reset" value="Reset"/>
</td>
</tr>
</table>
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