<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="Error.jsp"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<%
String username = session.getAttribute("username").toString();
String name = request.getParameter("threadname");
try{
    Connection con1=null;
    Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 
    con1=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh");
    PreparedStatement ps=con1.prepareStatement("insert into THREAD (USERNAME,THREADNAME) values(?,?)");
		ps.setString(1,username);
		ps.setString(2,name);
		int n=ps.executeUpdate();
		if(n>0)
		   response.sendRedirect("forum.jsp");
		else
			out.println("Not Successful"); 
    ps.close();
    con1.close();
    }

catch(Exception ex){
    out.println(ex);
}
%>