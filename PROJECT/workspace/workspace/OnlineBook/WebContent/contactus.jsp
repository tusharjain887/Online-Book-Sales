<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="Error.jsp"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<%
String name = request.getParameter("name");
String lname = request.getParameter("lname");
String email = request.getParameter("email");
String subject = request.getParameter("subject");
String message = request.getParameter("message");
name=name+" "+lname;
int check=0;
%>
<%
try{
    Connection con1=null;
    Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance();
    con1=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh");	
    PreparedStatement ps=con1.prepareStatement("insert into CONTACTS (FROM_NAME,SUBJECT,NOTES,EMAIL) values (?,?,?,?)");
		ps.setString(1,name);
		ps.setString(2,subject);
		ps.setString(3,message);
		ps.setString(4,email);
    int n=ps.executeUpdate();
		if(n>0)
			check=1;
		else
			response.sendRedirect("Error.jsp");
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
<title>Ideal Book Store</title>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
<link rel="stylesheet" type="text/css" href="style.css" />
<!--[if IE 6]>
<link rel="stylesheet" type="text/css" href="iecss.css" />
<![endif]-->
<script type="text/javascript" src="js/boxOver.js"></script>
</head>
<body>
<div id="main_container">
  <div class="top_bar">
  <div id="header">
  <div style="float:right;font-size:14px;">
 <%  Object c=session.getAttribute("username");
if(c!=null)
	{
	out.print("Welcome  " +session.getAttribute("username").toString());
	out.print(" ,  <a href='logout.jsp'>Logout</a>");
	}
	%>
	</div>
  </div>
  <div id="main_content">
    <div id="menu_tab">
      <div class="left_menu_corner"></div>
      <ul class="menu">
        <li><a href="index.jsp" class="nav1"> Home</a></li>
        <li class="divider"></li>
        <li><a href="categories.jsp" class="nav2">Categories</a></li>
        <li class="divider"></li>
        <%
        if(c==null)
        {
        %><li><a href="registration.jsp" class="nav4">Sign Up</a></li>
        <li class="divider"></li>
        <%
        }%>
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
      <div class="center_title_bar">Contact Us</div>
      <br><br><br><br><center>
      <%
      if(check==1)
        out.println("Your query has been registered.You will be responded within 24 hours."); 
      else
        out.println("The operation did not happened successfully . Please try again .");
        %>
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
