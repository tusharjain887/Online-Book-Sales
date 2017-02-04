<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<%
String username=request.getParameter("username");
String password=request.getParameter("password");
int check=0;
try{
	Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 	
	Connection Conn=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh"); 
	PreparedStatement Stmt=Conn.prepareStatement("SELECT USERNAME FROM USERS WHERE USERTYPE='Corporate' AND USERNAME='"+username+"' AND PASSWORD='"+password+"'"); 
	Stmt.executeQuery(); 
	ResultSet rs=Stmt.getResultSet(); 
	String name1= null; 
	while(rs.next()) 
	{ name1=rs.getString(1); } 
	rs.close();
	Stmt.close();
	Conn.close(); 
	if(name1 != null) 
	   {
        session.setAttribute("username",username);
        response.sendRedirect("index.jsp");
        }
	else 
		response.sendRedirect("Error.jsp");
	}
	catch(Exception ex){
	    out.println(ex);
	}
%>