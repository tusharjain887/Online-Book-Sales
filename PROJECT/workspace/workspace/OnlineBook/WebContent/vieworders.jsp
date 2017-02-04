<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Orders</title>
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
<table>
<tr>
<td><strong>Order Id</strong></td>
<td><strong>Username</strong></td>
<td><strong>Email</strong></td>
<td><strong>Address</strong></td>
<td><strong>Date</strong></td>
<td><strong>Total Items</strong></td>
<td><strong>Total Cost</strong></td>
<td><strong>Delete</strong></td>
</tr>
<%
try{
	Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 	
	Connection Conn=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh"); 
	PreparedStatement ps=Conn.prepareStatement("SELECT * FROM ORDERS"); 
	ResultSet rs=ps.executeQuery();
	while(rs.next()) 
    {
    out.println("<tr>");
 	out.println("<td><a href='viewbookorders.jsp?order_id="+rs.getInt(1)+"'>"+rs.getInt(1)+"</a></td>");
 	out.println("<td>"+rs.getString(2)+"</td>");
 	out.println("<td>"+rs.getString(3)+"</td>");
 	out.println("<td>"+rs.getString(4)+"</td>");
 	out.println("<td>"+rs.getString(5)+"</td>");
 	out.println("<td>"+rs.getInt(6)+"</td>");
 	out.println("<td>"+rs.getInt(7)+"</td>");
 	%>
 	<td>
 	<form name="form1" method="post" action="deleteorder.jsp">
 	<input type="HIDDEN" name="orderid" value=<%=rs.getInt(1)%>>
 	<td><input type="SUBMIT" name="SUBMIT" value="Delete"></td>
 	</form>
 	</td>
 	<%
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