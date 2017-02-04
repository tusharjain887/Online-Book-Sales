<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="Error.jsp"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<%@ page import="javax.mail.*" %>
<%@ page import="javax.mail.internet.*" %>
<%@ page import="javax.activation.*,javax.mail.internet.MimeMessage.RecipientType" %>
<%
int code = Integer.parseInt(request.getParameter("code"));
String username = null;
String name = null;
String gender = null;
String pro = null;
int age = 0;
String mobile = null;
String email = null;
String address = null;
String password = null;
int count=0;
int i=0;
int check=0;
try{
    Connection con1=null;
    Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 
    con1=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh");
    PreparedStatement ps=con1.prepareStatement("SELECT * FROM TEMPUSER WHERE CODE='"+code+"'");
    ResultSet rs1=ps.executeQuery();
	while(rs1.next()) 
    {
		username = rs1.getString(2);
		name = rs1.getString(10);
	    gender = rs1.getString(5);
		pro = rs1.getString(9);
		age = rs1.getInt(4);
		mobile = rs1.getString(6);
		email = rs1.getString(7);
		address = rs1.getString(8);
		password = rs1.getString(3);
    }	
	if(i==0)
	{
		PreparedStatement ps2=con1.prepareStatement("insert into USERS values(?,?,?,?,?,?,?,?,?,?)");
		ps2.setString(1,username);
		ps2.setString(2,password);
		ps2.setString(3,"Regular");
		ps2.setString(9,pro);
		ps2.setInt(4,age);
		ps2.setString(5,gender);
		ps2.setString(6,mobile);
		ps2.setString(7,email);
		ps2.setString(8,address);
		ps2.setString(10,name);	
    int n2=ps2.executeUpdate();
		if(n2>0)
		   {
			check++;
			Connection Conn5=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh"); 
			PreparedStatement ps5=Conn5.prepareStatement("DELETE FROM TEMPUSER WHERE USERNAME='"+username+"'"); 
			int n5=ps5.executeUpdate();
			if(n5>0)
				{
				//response.sendRedirect("view_cart.jsp");
				}
			else
				{
				out.println("Sorry an error has occured");
				}
			ps5.close();
			Conn5.close(); 
		   }
		else
			out.println("1Not Successful"); 
		 ps2.close();
	}
	else
		out.println("3Not Successful"); 	
	
    ps.close();   
    con1.close();
    }

catch(Exception ex){
    out.println(ex);
}
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Confirm Registration</title>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
<link rel="stylesheet" type="text/css" href="style.css" />
<!--[if IE 6]>
<link rel="stylesheet" type="text/css" href="iecss.css" />
<![endif]-->
<script type="text/javascript" src="js/boxOver.js"></script>
</head>
<body>
<div id="main_container">
  
  <div id="header">
	
  </div>
  
  <div id="main_content">
    <div id="menu_tab">
      <div class="left_menu_corner"></div>
      <ul class="menu">
        <li><a href="index.jsp" class="nav1"> Home</a></li>
        <li class="divider"></li>
        <li><a href="categories.jsp" class="nav2">Categories</a></li>
        <li class="divider"></li>
        <li><a href="registration.html" class="nav4">Sign Up</a></li>
        <li class="divider"></li>
        <li><a href="news.jsp" class="nav3">Offers</a></li>
        <li class="divider"></li>
        <li><a href="contact.jsp" class="nav6">Contact Us</a></li>
        <li class="divider"></li>
        <li><a href="forum.jsp" class="nav6">Forum</a></li>
        <li class="divider"></li>
        <li><a href="aboutus.jsp" class="nav3">About Us</a></li>
        <li class="divider"></li>
        
      </ul>
      <div class="right_menu_corner"></div>
    </div>
    <!-- end of menu tab -->
    <div class="left_content">
     <br><br><br>
      
      </div>
      
      
    <!-- end of left content -->
    <div class="center_content">
      <div class="center_title_bar">Registration Complete</div>
      
      <br><br><br><br><center>
      <div style="font-size:16px;color:#B13052;">
  <%
if(check==1)
{
	String HOST = "smtp.gmail.com";

	String USER = "idealbooksales";

    String PASSWORD = "ideal123456";

    String PORT = "465";

    String FROM = "idealbooksales@gmail.com";

  String TO = email;



  String STARTTLS = "true";

  String AUTH = "true";

  String DEBUG = "true";

  String SOCKET_FACTORY = "javax.net.ssl.SSLSocketFactory";

  String SUBJECT = "Password for Ideal Book Store";

  String TEXT ="You have registered with Online Book Sales.Your Account Details are <br><br>Username= "+username+"<br><br>Password= "+password;
  
  Properties props = new Properties();
props.put("mail.smtp.host", HOST);

    props.put("mail.smtp.port", PORT);

    props.put("mail.smtp.user", USER);



    props.put("mail.smtp.auth", AUTH);

    props.put("mail.smtp.starttls.enable", STARTTLS);

    props.put("mail.smtp.debug", DEBUG);
 


    props.put("mail.smtp.socketFactory.port", PORT);

    props.put("mail.smtp.socketFactory.class", SOCKET_FACTORY);

    props.put("mail.smtp.socketFactory.fallback", "false");



   


        //Obtain the default mail session

        Session sessio = Session.getDefaultInstance(props, null);

        sessio.setDebug(true);

System.out.println("Success");

        //Construct the mail message

        MimeMessage message = new MimeMessage(sessio);

        message.setText(TEXT);

        message.setSubject(SUBJECT);

        message.setFrom(new InternetAddress(FROM));

        message.addRecipient(RecipientType.TO, new InternetAddress(TO));

        message.saveChanges();


		System.out.println("Success");
        //Use Transport to deliver the message

        Transport transport = sessio.getTransport("smtp");

        transport.connect(HOST, USER, PASSWORD);
System.out.println("Success");
        transport.sendMessage(message, message.getAllRecipients());

        transport.close();

System.out.println("Success");
out.println("You have successfully registered your account");
		   out.println("<a href='index.jsp'>Login</a>");
}
else
{
 out.println("Registration not completed");
 out.println("<a href='registration.html'>Back to Sign Up</a>");
}
%>
</div>      
</center>
    </div>
    <!-- end of center content -->
    <div class="right_content">
     <br><br><br>
    </div>
    <!-- end of right content -->
  </div>
  <!-- end of main content -->
  <div class="footer">
    <br><br>
    <center> All Rights Reserved 2008</center>
      </div>

<!-- end of main_container -->
</body>
</html>