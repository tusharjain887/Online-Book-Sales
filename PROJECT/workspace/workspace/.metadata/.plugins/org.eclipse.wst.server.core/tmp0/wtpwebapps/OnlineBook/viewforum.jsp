<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Forum</title>
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
<td><strong>Topic</strong></td>
<td><strong>Posted By</strong></td>
<td><strong>Delete</strong></td>
</tr>
<%
try{
	Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 	
	Connection Conn=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh"); 
	PreparedStatement ps=Conn.prepareStatement("SELECT * FROM THREAD"); 
	ResultSet rs=ps.executeQuery();
	while(rs.next()) 
    {
    out.println("<tr>");
 	out.println("<td><a href='viewforumthread.jsp?thread_id="+rs.getInt(1)+"'>"+rs.getString(3)+"</a></td>");
 	out.println("<td>"+rs.getString(2)+"</td>");
 	%>
 	<td>
 	<form name="form1" method="post" action="deleteforum.jsp">
 	<input type="HIDDEN" name="threadid" value=<%=rs.getInt(1)%>>
 	<input type="HIDDEN" name="replyid" value="11111">
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