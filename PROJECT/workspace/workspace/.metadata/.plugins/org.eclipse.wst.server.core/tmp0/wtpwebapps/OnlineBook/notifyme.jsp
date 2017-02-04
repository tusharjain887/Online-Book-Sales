<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="Error.jsp"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>



<%
String username = request.getParameter("username");
String bookid = request.getParameter("book_id");
int check=0;
%>
<%
try{
    Connection con1=null;
    Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance();
    con1=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","rakesh");	
    PreparedStatement ps=con1.prepareStatement("insert into NOTIFY values (?,?)");
		ps.setString(1,username);
		ps.setString(2,bookid);
    int n=ps.executeUpdate();
		if(n>0)
		{
			%>
			alert("U will be notified when the book is in stock")
			<% 
			response.sendRedirect("index.jsp");	
		}
		else
			response.sendRedirect("Error.jsp");
    ps.close();
    con1.close();
    }

catch(Exception ex){
    out.println(ex);
}
%>
