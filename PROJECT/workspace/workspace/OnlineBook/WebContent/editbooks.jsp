<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Books</title>
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
<div class="center_title_bar">Edit Books</div>
<%
try{
String bookid=request.getParameter("bookid");
Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 	
Connection Conn=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh"); 
PreparedStatement ps=Conn.prepareStatement("SELECT * FROM BOOKS WHERE BOOK_ID='"+bookid+"'"); 
ResultSet rs=ps.executeQuery();
while(rs.next()) 
{
%>
      <form name="myForm" action="confirmeditbook.jsp" method="post" onsubmit="return formValidation()">   
<table>
<pre><h3>
<tr>
<td>Book Id        : </td>
<td><input type=text name="bookid" value=<%=rs.getString(1)%> readonly></td>
</tr>
<tr>
<td>Book Name         : </td>
<td><textarea name="bookname" ><%=rs.getString(2)%></textarea></td>
</tr>
<tr>
<td>Book Price               :</td>
<td><input type=text name="bookprice" value=<%=rs.getInt(3)%>></td>
</tr>
<tr>
<td>Edition               :</td>
<td><input type=text name="edition" value=<%=rs.getInt(4)%>></td>
</tr>
<tr>
<td>ISBN               :</td>
<td><input type=text name="isbn" value=<%=rs.getString(5)%>></td>
</tr>
<tr>
<td>Rating             :</td>
<td><input type=text name="rating" value=<%=rs.getInt(6)%>></td>
</tr>
<tr>
<td>Description               :</td>
<td><textarea name="description" ><%=rs.getString(8)%></textarea></td>
</tr>
<tr>
<td>Category        : </td>
<td><select name="catid">
<option value=None>
<option value=1>Arts & Philosophy
<option value=2>Business
<option value=4>Computers & Technology
</select></td>
</tr>
<tr>
<td>Author       : </td>
<td><textarea name="author" ><%=rs.getString(11)%></textarea></td>
</tr>
<tr>
<td>Quantity       : </td>
<td><input type=text name="quantity" value=<%=rs.getInt(10)%>></td>
</tr>
<tr>
<td>Offer       : </td>
<td><input type=text name="offer" value=<%=rs.getInt(12)%>></td>
</tr>
</h3></pre>
</table>
<br><br>
<input type=submit value="submit">
<input type=reset value="reset">
</center>
</form>
<%
}
ps.close();
	Conn.close(); 
	}
	catch(Exception ex){
	    out.println(ex);
	}
%>
</body>
</html>
<%
}
else
{
out.println("Please Login");
}
%>