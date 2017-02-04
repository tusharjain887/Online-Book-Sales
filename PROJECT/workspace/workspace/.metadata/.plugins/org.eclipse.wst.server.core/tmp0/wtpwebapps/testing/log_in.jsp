<%@page import="java.sql.*" language="java" 
contentType="text/html; 
charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> 
<%
try
{
System.out.println("driver loaded sucesssssssssssssssssss"); 
Class.forName("com.ibm.db2.jcc.DB2Driver"); 
System.out.println("driver loaded sucesssssssssssssssssss"); 
Connection Conn=DriverManager.getConnection("jdbc:db2://localhost:50000/TEST","Rakesh","rakesh"); 
int userid=Integer.parseInt(request.getParameter("userid"));
String name=request.getParameter("name");
int age=Integer.parseInt(request.getParameter("age")); 
System.out.println("name="+name+" id="+userid+" age="+age); 
PreparedStatement Stmt=Conn.prepareStatement("SELECT NAME FROM TEST1 WHERE ID='"+userid+"'"); 
//PreparedStatement Stmt=Conn.prepareStatement("SELECT USERNAME FROM LOGIN"); 
System.out.println("Statement loaded sucesssssssssssssssssss"); 
Stmt.executeQuery(); 
ResultSet rs=Stmt.getResultSet(); 
System.out.println("query execute loaded sucesssssssssssssssssss"); 
String name1= null; 
while(rs.next()) 
{ name1=rs.getString(1);}
System.out.println("query execute loaded sucesssssssssssssssssss "+name1); 
rs.close();
Stmt.close();
Conn.close(); 
if(name1 != null) 
	out.println("Welcome to "+name1); 
else 
	out.println("Please check your voter name and voter id..."); 
}
catch(Exception ex){
    out.println(ex);
} 
	%>


