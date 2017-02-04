<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Shopping</title>
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
if(c!=null)
	{
	out.print("Welcome  " +session.getAttribute("username").toString());
	%>
	&nbsp<a href='myprofile.jsp'>Profile</a>
	&nbsp<a href='logout.jsp'>Logout</a>
	<%
	}
else
{
	response.sendRedirect("index.jsp");
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
      int totalitems=0;
      int totalcost=0;
      String usertype=null;
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

<div class="center_title_bar">Your Final Cart</div>
<div style="font-size:16px;color:#B13052;"><center>
    <table cellpadding=10 text-align=center>
<tr>
<td>Book Name</td>
<td>Quantity</td>
<td>Cost</td>
<td>Total</td>
</tr>
<%
int total=0;
int items=0;
try{
	Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 	
	Connection Conn=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh"); 
	PreparedStatement ps=Conn.prepareStatement("SELECT * FROM TEMP");
	ResultSet rs=ps.executeQuery();
	while(rs.next()) 
    {
		out.println("<tr>");
         	out.println("<td>"+rs.getString(4)+"</td>");
         	int quantity=rs.getInt(3);
	        out.println("<td>"+rs.getInt(3)+"</td>");
         	int cost=rs.getInt(2);
         	out.println("<td>"+rs.getInt(2)+"</td>");
         	out.println("<td>"+(quantity*cost)+"</td>");
		 	total=total+quantity*cost;
		 	items=items+quantity;
         	out.println("</tr>");
    }
	PreparedStatement ps6=Conn.prepareStatement("SELECT USERTYPE FROM USERS WHERE USERNAME='"+session.getAttribute("username").toString()+"'");
	ResultSet rs6=ps6.executeQuery();
	if(rs6.next()) 
    {
		usertype=rs6.getString(1);
    }
    ps.close();
    ps6.close();
	Conn.close(); 
	}
	catch(Exception ex){
	    out.println(ex);
	}
totalcost=total;   
totalitems=(int)items;
if(usertype=="Corporate" && totalitems>=50)
{
	totalcost=(int)(totalcost*0.80);
}
else if(usertype=="Corporate" && totalitems>=100)
{
	totalcost=(int)(totalcost*0.70);
}

else if(totalitems>20 && totalitems<50)
{
	totalcost=(int)(totalcost*0.95);
}
else if(totalitems>=50)
{
	totalcost=(int)(totalcost*0.90);
}
    %>


<tr>
<td>Total</td>
<td></td>
<td></td>
<td><% out.println(total);%></td>
</tr>

</table>
</br></br>
<p>Please confirm your email-id and address</p>

</br>
<form action="shopping_done.jsp" method="post">

<%
try{
	Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 	
	Connection Conn=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh"); 
	PreparedStatement ps=Conn.prepareStatement("SELECT EMAIL_ID,ADDRESS FROM USERS WHERE USERNAME='"+session.getAttribute("username").toString()+"'");
	ResultSet rs=ps.executeQuery();
	while(rs.next()) 
    {
%>
		Email-ID<input name="email" type="textarea" value=<%=rs.getString(1) %>/></br></br>
		Address<input name="address" type="textarea" value=<%=rs.getString(2) %>/></br></br>
		Total Items<input name="items" type="text" value=<%out.println(items);%>  readonly /></br></br>
		Total Cost<input name="tcost" type="text" value=<%out.println(totalcost);%>  readonly /></br></br>
		
<% 
    }
	
    ps.close();
	Conn.close(); 
	}
	catch(Exception ex){
	    out.println(ex);
	}
    
    %>

<input type="submit" name="confirm" value="Confirm Order"/>
</form>
</center></div>
    </div>
    <!-- end of center content -->
      </div>
  <!-- end of main content -->
  <div class="footer">
    <br><br>
    <center> All Rights Reserved 2008</center>
      </div>

<!-- end of main_container -->
</body>
</html>