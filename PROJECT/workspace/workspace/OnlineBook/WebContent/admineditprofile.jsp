<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<%
String name = request.getParameter("name");
String mobile = request.getParameter("phone1");
String email = request.getParameter("email");
String password = request.getParameter("pwd");
int check=0;
%>
<%
try{
    Connection con1=null;
    Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 
    con1=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh");
    PreparedStatement ps=con1.prepareStatement("update ADMIN set PASSWORD=?,CONTACT_NO=?,EMAIL_ID=?,NAME=?");
	ps.setString(1,password);
	ps.setString(2,mobile);
	ps.setString(3,email);
	ps.setString(4,name);
		
    int n=ps.executeUpdate();
		if(n>0)
		   response.sendRedirect("adminprofile.jsp");
		else
			out.println("Not Successful"); 
    ps.close();
    con1.close();
    }

catch(Exception ex){
    out.println(ex);
}
%>