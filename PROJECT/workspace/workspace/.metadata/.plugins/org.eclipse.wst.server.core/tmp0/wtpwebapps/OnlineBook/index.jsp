<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
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
  
  <div id="header">
  <div class="logout">
 <%  Object c=session.getAttribute("username");
String cid[]=new String[40];
 int i=0;
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
        %><li><a href="registration.jsp" class="nav4">Sign Up</a></li>
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
	PreparedStatement ps8=Conn8.prepareStatement("SELECT CAT_ID,CAT_NAME FROM CATEGORY ORDER BY CAT_ID DESC"); 
	ResultSet rs8=ps8.executeQuery();
	while(rs8.next()) 
    {
		cid[i]=rs8.getString(1);
		String name=rs8.getString(2);
		i++;
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
      %>
    </div>
      </div>
      
      
    <!-- end of left content -->
    <div class="center_content">
      <div class="center_title_bar">Latest Products</div>
     <% 
      Connection Conn1=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh"); 
	PreparedStatement ps1=null;
 for(int j=0;j<=i;j++)
     { 
	ps1=Conn1.prepareStatement("SELECT * FROM BOOKS WHERE CAT_ID='"+cid[j]+"' ORDER BY BOOK_ID DESC LIMIT 0,1"); 
	ResultSet rs1=ps1.executeQuery();
	while(rs1.next()) 
    {
		String bookname=rs1.getString(2);
		bookname=bookname.substring(0, 30);
		
		%>
      <div class="prod_box">
        <div class="top_prod_box"></div>
        <div class="center_prod_box">
          <div class="product_title"><%out.println("<a href='bookview.jsp?book_id="+rs1.getString(1)+"'>"+bookname+"</a>");%></div>
          <div class="product_img"><%out.println("<img src='C:/Uploaded Images/"+rs1.getString(7)+"'></img>");%></div>
          <div class="prod_price"><span class="price">Rs. <%out.println(rs1.getString(3));%></span></div>
        </div>
        <div class="bottom_prod_box"></div>
        <div class="prod_details_tab">Rating : <%out.println(rs1.getString(6));%>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
        <%
        if(Integer.parseInt(rs1.getString(10))>0)
        {
       %>In Stock<% 
        }
        else
        {
        	%>Out of Stock<% 
        	}   
     %>
        </div>
      </div>
      <%    
      }
}
     ps1.close();		
	Conn1.close();
	}
	catch(Exception ex){
	    out.println(ex);
	}
        
      %>
    </div>
    <!-- end of center content -->
    <div class="right_content">
     <br><br><br>
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

        
        
        <div class="cart_icon"><a href="view_cart.jsp" title="header=[Checkout] body=[&nbsp;] fade=[on]"><img src="images/shoppingcart.png" alt="" 

width="48" height="48" border="0" /></a></div>
        </div>
     <%
     }
     %> 
     <br><br><br>
     <center>
     <%
        if(c==null)
        {
        %>
     <center>
<script type="text/javascript">

     function required()
{
    	 
    	 var uname = document.myForm.username;
    	 var pwd = document.myForm.password;

    	 var alphanum = /^[0-9a-zA-Z]+$/;

    	 if (uname.value.length == 0)
    	 {
    	 alert('Please enter your Username!');
    	 uname.focus();
    	 return false;
    	 }
    	 else if ((!uname.value.match(alphanum)))
    	 {
    	 alert('Username must have alphanumeric characters only.');
    	 uname.focus();
    	 return false;
    	 }

    	 var pwd_len = pwd.value.length;
    	 if (pwd_len == 0)
    	 {
    	 alert("Please enter your password!");
    	 pwd.focus();
    	 return false;
    	 }
    	 else if(!pwd.value.match(alphanum))
    	 	{
    	 	alert("Password must have alphanumeric characters only.");
    	 	pwd.focus();
    	 	return false;
    	 	}
    	 else if( pwd_len > 15 || pwd_len < 5)
    	 {
    	 	alert("Password should be between 5 to 15 characters");
    	 	pwd.focus();
    	 	return false;
    	 }

    	 return true; 
}
     </script>
      <div class="title_box">Login</div><br><br> 
      <form name="myForm" method="post" action="checklogin.jsp" onsubmit="return required()">
      
<div style="font-size:16px;color:#B13052;">Username : </div><input name="username" type="text" id="username" size="15"><br>
<p><div style="font-size:16px;color:#B13052;">Password : </div><input name="password" type="password" id="password" size="15"><br><br>
<input type="submit" name="Login" value="Login"><br><br>
<div style="font-size:16px;color:#B13052;"><a href="registration.html">Sign Up</a></div><br>
<div style="font-size:16px;color:#B13052;"><a href="corpuser.html">Login As Guest</a></div><br>
<div style="font-size:16px;color:#B13052;"><a href="forgotpassword.jsp">Forgot Password</a></div><br>
      
</form>
 </center>
 <%
        }%>
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
