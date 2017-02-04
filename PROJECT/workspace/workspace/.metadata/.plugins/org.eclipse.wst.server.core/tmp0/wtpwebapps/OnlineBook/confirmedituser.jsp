<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<%
String username = request.getParameter("username");
String name = request.getParameter("name");
String gender = request.getParameter("gender");
String pro = request.getParameter("pro");
int age = Integer.parseInt(request.getParameter("age"));
String mobile = request.getParameter("phone1");
String email = request.getParameter("email");
String address = request.getParameter("address");
String password = request.getParameter("pwd");
int check=0;
%>
<%
try{
    Connection con1=null;
    Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 
    con1=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh");
    PreparedStatement ps=con1.prepareStatement("update USERS set PASSWORD=?,AGE=?,GENDER=?,CONTACT_NO=?,EMAIL_ID=?,ADDRESS=?,CURRENT_STATUS=?,NAME=? where USERNAME='"+username+"'");
	ps.setString(1,password);
	ps.setString(7,pro);
	ps.setInt(2,age);
	ps.setString(3,gender);
	ps.setString(4,mobile);
	ps.setString(5,email);
	ps.setString(6,address);
	ps.setString(8,name);
		
    int n=ps.executeUpdate();
		if(n>0)
		   response.sendRedirect("myprofile.jsp");
		else
			out.println("Not Successful"); 
    ps.close();
    con1.close();
    }

catch(Exception ex){
    out.println(ex);
}
%>