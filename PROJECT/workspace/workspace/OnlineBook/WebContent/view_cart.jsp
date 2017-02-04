<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Cart</title>
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
      <div class="title_box">Categories</div>
      <ul class="left_menu">
      <%
      try{
	Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 	
	Connection Conn=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh"); 
	PreparedStatement ps=Conn.prepareStatement("SELECT CAT_ID,CAT_NAME FROM CATEGORY"); 
	ResultSet rs=ps.executeQuery();
	while(rs.next()) 
    {
		String name=rs.getString(2);
 	%> 
        <li class="even"><%out.println("<a href='viewcategory.jsp?cat_id="+rs.getString(1)+"'>"+name+"</a>");%></li>  
        <%
        } 
        %>  

     <% 
	ps.close();
	Conn.close(); 
	}
	catch(Exception ex){
	    out.println(ex);
	}
        
      %>
      </ul>
      </div>
    </div>
    <!-- end of left content -->
    <div class="center_content">
    <div style="font-size:16px;color:#B13052;"><center>
    <table cellpadding=10 text-align=center>
<tr>
<td>Book Name</td>
<td>Quantity</td>
<td>Cost</td>
<td>Total</td>
<td>Delete</td>
</tr>
<%
int total=0;
int check=0;
try{
	Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 	
	Connection Conn=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh"); 
	PreparedStatement ps=Conn.prepareStatement("SELECT * FROM TEMP");
	ResultSet rs=ps.executeQuery();
	while(rs.next()) 
    {
		check++;
		out.println("<tr>");
         	out.println("<td>"+rs.getString(4)+"</td>");
         	int quantity=Integer.parseInt(rs.getString(3));
	        out.println("<td>"+rs.getString(3)+"</td>");
         	int cost=Integer.parseInt(rs.getString(2));
         	out.println("<td>"+rs.getString(2)+"</td>");
         	out.println("<td>"+(quantity*cost)+"</td>");
		 	total=total+quantity*cost;
		 	out.println("<td><a href='deletecartitem.jsp?bookid="+rs.getString(1)+"'>Delete</a></td>");
         	out.println("</tr>");
    }
	
    ps.close();
	Conn.close(); 
	}
	catch(Exception ex){
	    out.println(ex);
	}
    
    %>


<tr>
<td>Total</td>
<td></td>
<td></td>
<td><% out.println(total);%></td>
</tr>
<%
if(check>0)
{
%>
</table>
<form action="process_shopping.jsp" method="post">
<input type="submit" name="continue" value="Continue"/>
</form>
<%
}
%>
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
