<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Books</title>
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
<a href="users.jsp">View Users</a>
<a href="viewbooks.jsp">View Books</a>
<%
int check=0;
try{
	int threadid = Integer.parseInt(request.getParameter("threadid"));
	int replyid = Integer.parseInt(request.getParameter("replyid"));
	out.println(threadid);
	out.println(replyid);
	Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 	
	Connection Conn=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh"); 
	PreparedStatement ps = null;
	if(threadid!=11111)
	{
		out.println(threadid);
		out.println(replyid);
	ps=Conn.prepareStatement("DELETE FROM THREAD WHERE THREAD_ID='"+threadid+"'"); 
	int n=ps.executeUpdate();
	if(n>0)
		response.sendRedirect("viewforum.jsp");
	else
		out.println("Sorry could not be deleted");
	
	}
   if(replyid!=11111)
{
	   out.println(threadid);
		out.println(replyid);
	ps=Conn.prepareStatement("DELETE FROM REPLY WHERE REPLY_ID='"+replyid+"'"); 
	int n=ps.executeUpdate();
	if(n>0)
		response.sendRedirect("viewforum.jsp");
	else
		out.println("Sorry could not be deleted"); 
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