<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Books</title>
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
      String book_id=null,book_name=null;
      int money=0;
      boolean stock=true;
      int bookquantity=0;
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
      <div class="center_title_bar">Book</div>
 <%
 book_id=request.getParameter("book_id");
int check=0;
try{
	Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 	
	Connection Conn1=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh"); 
	PreparedStatement ps1=Conn1.prepareStatement("SELECT * FROM BOOKS WHERE BOOK_ID='"+book_id+"'"); 
	ResultSet rs1=ps1.executeQuery();
	while(rs1.next()) 
    {
		book_name=rs1.getString(2);
		%>
		<div class="center_title_bar"><%out.println("<a href='bookview.jsp?book_id="+rs1.getString(1)+"'>"+book_name+"</a>");%></div>
      <div class="prod_box_big">
        <div class="top_prod_box_big"></div>
        <div class="center_prod_box_big">
          <div class="product_img_big"><%out.println("<img src='C:/Uploaded Images/"+rs1.getString(7)+"'></img>");%></a>
          </div>
          <div class="details_big_box">
            <div class="product_title_big"><%out.println("<a href='bookview.jsp?book_id="+rs1.getString(1)+"'>"+rs1.getString(2)+"</a>");%></div>
            <div class="specifications">
            
              Author: <span class="blue"><%out.println(rs1.getString(11));%></span><br />
              ISBN: <span class="blue"><%out.println(rs1.getString(5));%></span><br />
              <%
             if(rs1.getString(4)!="0")
             {
             %>
              Edition : <span class="blue"><%out.println(rs1.getString(4));%></span><br />
              <%
              }
              %>
             
            </div>          
            <div class="prod_price_big"><span class="reduce">Rs. <%out.println(rs1.getString(3));%></span><span class="price">&nbsp&nbspRs. <%out.println((int)((100-rs1.getInt(12))*0.01*rs1.getInt(3)));%></span></div>
            <%
            money=(int)((100-rs1.getInt(12))*0.01*rs1.getInt(3));
            bookquantity=rs1.getInt(10);
            %>
            <div class="prod_price_big">Description : <%out.println(rs1.getString(8));%></span></div>
            <div class="prod_price_big">Rating : <%out.println(rs1.getString(6));%> / 10</div>
            <div class="prod_price_big"> 
            <%
        if(Integer.parseInt(rs1.getString(10))>0)
        {
        	stock=true;
        	%>
        	In stock
        	<%
        }
        else
        {
        	stock=false;
        	%>
        	Out of stock
        	<%
        	
        }
        %></span></div>
        </div>
      <%
    }
	ps1.close();
	Conn1.close(); 
	}
	catch(Exception ex){
	    out.println(ex);
	}
%>
        <div class="bottom_prod_box_big"></div>
        
          <div class="prod_details_tab">

<%
            if(request.getParameter("buttonName") != null && c!=null) {
            //if(request.getParameterNames() != null) {
            	int quantity=0;
            	quantity=Integer.parseInt(request.getParameter("quantity"));
            	 if(quantity<bookquantity)
            	 {
            	try{
            	    Connection con1=null;
            	    Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance();
            	    con1=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh");	
            	    PreparedStatement ps=con1.prepareStatement("insert into TEMP values (?,?,?,?)");
            			ps.setString(1,book_id);
            			ps.setInt(2,money);
            			ps.setInt(3,quantity);
            			ps.setString(4,book_name);
                	    int n=ps.executeUpdate();
            			if(n>0)
            				response.sendRedirect("index.jsp");
            			else
            				response.sendRedirect("Error.jsp");
            	    ps.close();
            	    con1.close();
            	    }

            	catch(Exception ex){
            	    out.println(ex);
            	}
            	 }
            	 else
            	 {
            		 out.println("Select less quantity");
            		 %>
            		 stock="quantity()";
            		 <%
            	 }

            }
        %>

<%
            if(request.getParameter("username") != null && c!=null) {
            //if(request.getParameterNames() != null) {
            	
                String username=session.getAttribute("username").toString();
            
                try{
                	out.println(book_id);
                	out.println(username);
                    Connection con1=null;
                    Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance();
                    con1=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh");	
                    PreparedStatement ps=con1.prepareStatement("insert into NOTIFY values (?,?)");
                		ps.setString(1,username);
                		ps.setString(2,book_id);
                    int n=ps.executeUpdate();
                		if(n>0)
                		{
                			%>
                			alert("U will be notified when the book is in stock")
                			<% 
                			response.sendRedirect("index.jsp");	
                		}
                		else
                			response.sendRedirect("Error.jsp");
                    ps.close();
                    con1.close();
                    }

                catch(Exception ex){
                    out.println(ex);
                }
          
            
            }

%>
          <% 
          if(c!=null && stock==true)
          {
        	  %>
           <div class="form_row">
           <FORM NAME="form1" METHOD="POST" >
            <INPUT TYPE="HIDDEN" NAME="buttonName">
              <label class="contact"><strong>Quantity:</strong></label>
              <input type="text" name="quantity" value="1" />
              <INPUT TYPE="BUTTON" VALUE="Add to cart" ONCLICK="button1()">
           </FORM>
           </div>
           <%
          }
          if(c!=null && stock==false)   
          {
        	  %>
           <div class="form_row">
           <FORM NAME="form2" METHOD="POST">
            <INPUT TYPE="HIDDEN" NAME="username">
              <INPUT TYPE="BUTTON" VALUE="Notify me" ONCLICK="button2()">
           </FORM>
           </div>
           <%
          }
          %>
          
             <SCRIPT LANGUAGE="JavaScript">
            <!--
            function button1()
            {
                document.form1.buttonName.value = "button 1"
                form1.submit()
            }    
             --> 
        </SCRIPT>
        
             <SCRIPT LANGUAGE="JavaScript">
            <!--
      
            function button2()
            {
                document.form2.username.value = "button 1"
                form2.submit()
            } 
            function lessquantity()
            {
                alert("Select less quantity or contact us for huge orders");
            }    
            // --> 
            </SCRIPT>
          
          </div>
      </div>
      
      
      </div>

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
