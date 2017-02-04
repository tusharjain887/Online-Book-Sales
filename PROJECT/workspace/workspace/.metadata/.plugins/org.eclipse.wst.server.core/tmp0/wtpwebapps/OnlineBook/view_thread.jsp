<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Thread</title>
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
	out.print(" ,  <a href='myprofile.jsp'>Profile</a>");
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
        %><li><a href="registration.html" class="nav4">Sign Up</a></li>
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
      <div class="center_title_bar">Thread</div>
      <div style="font-size:16px;color:#B13052;"><center>
     <%
     String thread_id=request.getParameter("thread_id");
     try{
    	 Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 
      Connection Conn1=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh"); 
	PreparedStatement ps1=Conn1.prepareStatement("SELECT * FROM THREAD WHERE THREAD_ID='"+thread_id+"'"); 
	ResultSet rs1=ps1.executeQuery();
	while(rs1.next()) 
    {
		%>
    <strong><%out.println(rs1.getString(3));%></strong><br>
    Posted by <%out.println(rs1.getString(2));%><br><br>
<% 
    }
	out.println("<br><br><u>Replies</u><br><br>");
	PreparedStatement ps2=Conn1.prepareStatement("SELECT * FROM REPLY WHERE THREAD_ID='"+thread_id+"'"); 
	ResultSet rs2=ps2.executeQuery();
	while(rs2.next()) 
    {
		%>
		
    <strong><%out.println(rs2.getString(4));%></strong><br>
    Posted by <%out.println(rs2.getString(2));%><br><br>
<% 
    }
	ps1.close();
	ps2.close();
	Conn1.close();
	}
	catch(Exception ex){
	    out.println(ex);
	}
        
      %>
      <%
        if(c!=null)
        {
        %>
        <table width="600" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#CCCCCC">
<tr>
<form name="form1" method="post" action="add_reply.jsp?thread_id=<%=thread_id%>" onsubmit="return validateForm()">
<td>
<table width="100%" border="0" cellpadding="3" cellspacing="1" bgcolor="#FFFFFF">
<tr>
<td valign="top"><strong>Reply</strong></td>
<td valign="top">:</td>
<td><textarea name="reply" cols="45" rows="3" id="reply"></textarea></td>
</tr>

<tr>
<td></td>
<td></td>
<td><input type="submit" name="Submit" value="Submit"> <input type="reset" name="Submit2" value="Reset"></td>
</tr>
</table>
</td>
</form>
</tr>
</table>
        <%
        }%>
        </center></div>
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
