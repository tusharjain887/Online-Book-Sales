<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Create Thread</title>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
<link rel="stylesheet" type="text/css" href="style.css" />
<!--[if IE 6]>
<link rel="stylesheet" type="text/css" href="iecss.css" />
<![endif]-->
<script type="text/javascript" src="js/boxOver.js"></script>

<script type="text/javascript">
function formValidation()
{
var thread = document.form1.threadname;

if(thread.value.length==0)
{
	alert('Please enter Forum Topic Name !');
	thread.focus();
	return false;
}

}
</script>
</head>
<body>
<div id="main_container">
  
  <div id="header">
  <div class="logout">
 <%  Object c=session.getAttribute("username");
if(c!=null)
	{
	out.print("Welcome  " +session.getAttribute("username").toString());
	%>
	&nbsp<a href='myprofile.jsp'>Profile</a>
	&nbsp<a href='logout.jsp'>Logout</a>
	<%
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
        }
        %>
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
      <div class="title_box">Categories</div>
      <ul class="left_menu">
      <%
      try{
    	  Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 	
	Connection Conn8=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh"); 
	PreparedStatement ps8=Conn8.prepareStatement("SELECT CAT_ID,CAT_NAME FROM CATEGORY"); 
	ResultSet rs8=ps8.executeQuery();
	while(rs8.next()) 
    {
		String name=rs8.getString(2);
 	%> 
        <li class="even"><%out.println("<a href='viewcategory.jsp?cat_id="+rs8.getString(1)+"'>"+name+"</a>");%></li>  
        <%
        } 
        %>  
      </ul>
      <%
      PreparedStatement ps9=Conn8.prepareStatement("SELECT IMAGEURL FROM ADVERTISEMENT ORDER BY AD_ID DESC LIMIT 0,3"); 
	ResultSet rs9=ps9.executeQuery();
	while(rs9.next()) 
    {
		%>
      <div class="banner_adds"><br><br><br> <%out.println("<img src='C:/Uploaded Images/"+rs9.getString(1)+"'></img>");%> </div>
      <%
      }
	ps8.close();
	ps9.close();
	Conn8.close();
      }
      catch(Exception ex){
  	    out.println(ex);
  	}
      %>
    </div>
      </div>
      
      
    <!-- end of left content -->
    <div class="center_content">
    <%
        if(c!=null)
        {
        %>
      <div class="center_title_bar">Create Thread</div>
<table width="600" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#CCCCCC">
<tr>
<form id="form1" name="form1" method="post" action="add_thread.jsp" onsubmit="return validateForm()">
<td>
<table width="100%" border="0" cellpadding="3" cellspacing="1" bgcolor="#FFFFFF">
<tr>
<td colspan="3" bgcolor="#E6E6E6"><strong>Create New Thread</strong> </td>
</tr>
<tr>
<td width="14%"><strong>Name</strong></td>
<td width="2%">:</td>
<td width="84%"><br><br><textarea name="threadname" cols="50" rows="3" id="topic"></textarea><br><br></td>
</tr>
<tr>
<td></td>
<td></td>
<td><input type="submit" name="Submit" value="Submit" /> <input type="reset" name="Submit2" value="Reset" /></td>
</tr>
</table>
</td>
</form>
</tr>
</table>
<%
      }
      else
       out.println("<a href='index.jsp'>Please Login</a>"); 
       %>
    </div>
    <!-- end of center content -->
    <div class="right_content">
     <br><br>
     <%
    if(c!=null)
    {
    	%>
    	<div class="shopping_cart">
        <div class="cart_title">Shopping cart</div>
        <%
        try{
        	Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 	
            Connection Conn1=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh"); 
            Connection Conn2=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh"); 
        PreparedStatement ps1=Conn1.prepareStatement("SELECT sum(s.quantity)FROM TEMP s"); 
        PreparedStatement ps2=Conn2.prepareStatement("SELECT sum(s.quantity * s.cost)FROM TEMP s"); 
        ResultSet rs1=ps1.executeQuery();
        ResultSet rs2=ps2.executeQuery();
        while(rs1.next()) 
        {
        	String value=rs1.getString(1);
        	if(value==null)
        	{value="0";}
    		%>
        <div class="cart_details"><%out.println(value);%> items <br />
      <%
    }
        while(rs2.next()) 
        {
    		String value=rs2.getString(1);
        	if(value==null)
        	{value="0";}
    		%>
          <span class="border_cart"></span> Total: <span class="price"><%out.println(value);%></span> </div>
      <%
    }
	ps1.close();
	Conn1.close();
	ps2.close();
	Conn2.close();
	}
	catch(Exception ex){
	    out.println(ex);
	}
        
      %>

        
        
        <div class="cart_icon"><a href="view_cart.jsp" title="header=[Checkout] body=[&nbsp;] fade=[on]"><img src="images/shoppingcart.png" alt="" width="48" height="48" border="0" /></a></div>
        </div>
     <%
     }
     %> 
     <br><br>
     <center>
     
        <%
        Connection Conn10=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh");
      PreparedStatement ps10=Conn10.prepareStatement("SELECT IMAGEURL FROM ADVERTISEMENT ORDER BY AD_ID DESC LIMIT 3,6"); 
	ResultSet rs10=ps10.executeQuery();
	while(rs10.next()) 
    {
		%>
      <div class="banner_adds"><br><br><br> <%out.println("<img src='C:/Uploaded Images/"+rs10.getString(1)+"'></img>");%> </div>
      <%
      }
	ps10.close();
	Conn10.close();
      %>
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
