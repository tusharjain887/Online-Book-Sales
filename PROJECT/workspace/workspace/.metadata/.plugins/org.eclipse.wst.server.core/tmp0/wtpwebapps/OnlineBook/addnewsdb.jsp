<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<%
String newsid = request.getParameter("newsid");
String subject = request.getParameter("subject");
String description = request.getParameter("description");
%>
<%
try{
    Connection con1=null;
    Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 
    con1=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh");
    PreparedStatement ps=con1.prepareStatement("insert into NEWS values(?,?,?)");
		ps.setString(1,newsid);
		ps.setString(2,subject);
		ps.setString(3,description);
    int n=ps.executeUpdate();
		if(n>0)
		   response.sendRedirect("viewnews.jsp");
		else
			out.println("Not Successful"); 
    ps.close();
    con1.close();
    }

catch(Exception ex){
    out.println(ex);
}
%>