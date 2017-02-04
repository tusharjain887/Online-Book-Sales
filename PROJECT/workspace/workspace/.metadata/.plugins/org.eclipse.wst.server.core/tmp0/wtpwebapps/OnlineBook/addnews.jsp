<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add News</title>


<script type="text/javascript">
function formValidation()
{
	var newsid = document.myForm.newsid;
	var subject = document.myForm.subject;
	var description = document.myForm.description;

	if(newsid.value.length==0)
	{
	alert('Please enter News ID !');
	newsid.focus();
	return false;
	}
	if(subject.value.length==0)
	{
	alert('Please enter subject !');
	subject.focus();
	return false;
	}
	if(description.value.length==0)
	{
	alert('Please enter description !');
	description.focus();
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
<form name="myForm" action="addnewsdb.jsp" method="post" onsubmit="return formValidation()">
      <center>
<table>
<pre><h3>
<tr>
<td>News Id        : </td>
<td><input type=text name="newsid" size=15></td>
</tr>
<tr>
<td>Subject         : </td>
<td><input type=text name="subject" size=15></td>
</tr>
<tr>
<td>Description         : </td>
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