<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Books</title>
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
<table cellpadding=10 text-align=center>
<tr>
<td>Book Id</td>
<td>Name</td>
<td>Price</td>
<td>Edition</td>
<td>ISBN</td>
<td>Rating</td>
<td>Category</td>
<td>Quantity</td>
<td>Offer</td>
<td>Edit</td>
<td>Delete</td>
</tr>
<%
int check=0;
try{
	Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 	
	Connection Conn=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh"); 
	PreparedStatement ps=Conn.prepareStatement("SELECT * FROM BOOKS"); 
	ResultSet rs=ps.executeQuery();
	while(rs.next()) 
    {
    out.println("<tr>");
 	out.println("<td>"+rs.getString(1)+"</td>");
 	out.println("<td>"+rs.getString(2)+"</td>");
 	out.println("<td>"+rs.getString(3)+"</td>");
 	out.println("<td>"+rs.getString(4)+"</td>");
 	out.println("<td>"+rs.getString(5)+"</td>");
 	out.println("<td>"+rs.getString(6)+"</td>");	
 	out.println("<td>"+rs.getString(9)+"</td>");
 	out.println("<td>"+rs.getString(10)+"</td>");
 	out.println("<td>"+rs.getString(12)+"</td>");
 	out.println("<td><a href='editbooks.jsp?bookid="+rs.getString(1)+"'>Edit</a></td>");
 	out.println("<td><a href='deletebooks.jsp?bookid="+rs.getString(1)+"'>Delete</a></td>");
 	out.println("</tr>");
    }
	ps.close();
	Conn.close(); 
	}
	catch(Exception ex){
	    out.println(ex);
	}
%>
</table>
</center>
</body>
</html>
<%
}
else
{
out.println("Please Login");
}
%>