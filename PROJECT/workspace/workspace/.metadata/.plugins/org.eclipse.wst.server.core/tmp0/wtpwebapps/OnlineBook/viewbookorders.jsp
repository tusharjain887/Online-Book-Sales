<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Books Orders</title>
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
<br><br>
<%
try{
	String order_id=request.getParameter("order_id");
	Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 	
	Connection Conn=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh"); 
	PreparedStatement ps=Conn.prepareStatement("SELECT * FROM ORDERS WHERE ORDER_ID='"+order_id+"'"); 
	ResultSet rs=ps.executeQuery();
	while(rs.next()) 
    {
		%>
	    <strong><%out.println(rs.getString(1));%></strong><br><br><br>
	    Bought by <%out.println(rs.getString(2));%>
	<% 
	    }
		out.println("<br><br>Items<br><br>");
		%>
		<table>
		<tr>
		<td><strong>Book Id</strong></td>
		<td><strong>Quantity</strong></td>
		<td><strong>Cost</strong></td>
		</tr>
		<%
		PreparedStatement ps2=Conn.prepareStatement("SELECT * FROM BOOKORDER WHERE ORDER_ID='"+order_id+"'"); 
		ResultSet rs2=ps2.executeQuery();
		while(rs2.next()) 
	    {
			 out.println("<tr>");
			 	out.println("<td>"+rs2.getString(2)+"</td>");
			 	out.println("<td>"+rs2.getInt(3)+"</td>");
			 	out.println("<td>"+rs2.getInt(4)+"</td>");
			 	%>			 	
			 	<%
			 	out.println("</tr>");
			 	
			    }
		ps.close();
		ps2.close();
		Conn.close();
		}
		catch(Exception ex){
		    out.println(ex);
		}
	        
	      %>
	      
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