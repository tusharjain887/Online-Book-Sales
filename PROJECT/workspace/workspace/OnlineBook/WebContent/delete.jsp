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
	String catid=request.getParameter("catid");
	String adid=request.getParameter("adid");
	
	Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 	
	Connection Conn=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh"); 
	PreparedStatement ps = null;
	if(catid!="no")
	{
	ps=Conn.prepareStatement("DELETE FROM CATEGORY WHERE CAT_ID='"+catid+"'"); 
	int n=ps.executeUpdate();
	if(n>0)
		response.sendRedirect("viewcategories.jsp");
	else
		out.println("Sorry could not be deleted");
	
	}
   if(adid!="no")
{
	
	ps=Conn.prepareStatement("DELETE FROM ADVERTISEMENT WHERE AD_ID='"+adid+"'"); 
	int n=ps.executeUpdate();
	if(n>0)
		response.sendRedirect("viewads.jsp");
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