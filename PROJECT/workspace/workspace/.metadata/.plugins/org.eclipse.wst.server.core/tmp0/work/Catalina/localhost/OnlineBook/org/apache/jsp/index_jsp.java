package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.*;
import java.lang.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.List<java.lang.String> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.List<java.lang.String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Ideal Book Store</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\r\n");
      out.write("<!--[if IE 6]>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"iecss.css\" />\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/boxOver.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"main_container\">\r\n");
      out.write("  \r\n");
      out.write("  <div id=\"header\">\r\n");
      out.write("  <div class=\"logout\">\r\n");
      out.write(" ");
  Object c=session.getAttribute("username");
String cid[]=new String[40];
 int i=0;
if(c!=null)
	{
	out.print("Welcome  " +session.getAttribute("username").toString());
	
      out.write("\r\n");
      out.write("\t&nbsp<a href='myprofile.jsp'>Profile</a>\r\n");
      out.write("\t&nbsp<a href='logout.jsp'>Logout</a>\r\n");
      out.write("\t");

	}
	
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div id=\"main_content\">\r\n");
      out.write("    <div id=\"menu_tab\">\r\n");
      out.write("      <div class=\"left_menu_corner\"></div>\r\n");
      out.write("      <ul class=\"menu\">\r\n");
      out.write("        <li><a href=\"index.jsp\" class=\"nav1\"> Home</a></li>\r\n");
      out.write("        <li class=\"divider\"></li>\r\n");
      out.write("        <li><a href=\"categories.jsp\" class=\"nav2\">Categories</a></li>\r\n");
      out.write("        <li class=\"divider\"></li>\r\n");
      out.write("        ");

        if(c==null)
        {
        
      out.write("<li><a href=\"registration.jsp\" class=\"nav4\">Sign Up</a></li>\r\n");
      out.write("        <li class=\"divider\"></li>\r\n");
      out.write("        ");

        }
        
      out.write("\r\n");
      out.write("        <li><a href=\"news.jsp\" class=\"nav3\">Offers</a></li>\r\n");
      out.write("        <li class=\"divider\"></li>\r\n");
      out.write("        <li><a href=\"contact.jsp\" class=\"nav6\">Contact Us</a></li>\r\n");
      out.write("        <li class=\"divider\"></li>\r\n");
      out.write("        <li><a href=\"forum.jsp\" class=\"nav6\">Forum</a></li>\r\n");
      out.write("        <li class=\"divider\"></li>\r\n");
      out.write("        <li><a href=\"aboutus.jsp\" class=\"nav3\">About Us</a></li>\r\n");
      out.write("        <li class=\"divider\"></li>\r\n");
      out.write("        \r\n");
      out.write("      </ul>\r\n");
      out.write("      <div class=\"right_menu_corner\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- end of menu tab -->\r\n");
      out.write("    <div class=\"left_content\">\r\n");
      out.write("     <br><br><br>\r\n");
      out.write("      <div class=\"title_box\">Categories</div>\r\n");
      out.write("      <ul class=\"left_menu\">\r\n");
      out.write("      ");

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
 	
      out.write(" \r\n");
      out.write("        <li class=\"even\">");
out.println("<a href='viewcategory.jsp?cat_id="+rs8.getString(1)+"'>"+name+"</a>");
      out.write("</li>  \r\n");
      out.write("        ");

        } 
        
      out.write("  \r\n");
      out.write("      </ul>\r\n");
      out.write("      ");

      PreparedStatement ps9=Conn8.prepareStatement("SELECT IMAGEURL FROM ADVERTISEMENT ORDER BY AD_ID DESC LIMIT 0,3"); 
	ResultSet rs9=ps9.executeQuery();
	while(rs9.next()) 
    {
		
      out.write("\r\n");
      out.write("      <div class=\"banner_adds\"><br><br><br> ");
out.println("<img src='C:/Uploaded Images/"+rs9.getString(1)+"'></img>");
      out.write(" </div>\r\n");
      out.write("      ");

      }
	ps8.close();
	ps9.close();
	Conn8.close();
      
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("    <!-- end of left content -->\r\n");
      out.write("    <div class=\"center_content\">\r\n");
      out.write("      <div class=\"center_title_bar\">Latest Products</div>\r\n");
      out.write("     ");
 
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
		
		
      out.write("\r\n");
      out.write("      <div class=\"prod_box\">\r\n");
      out.write("        <div class=\"top_prod_box\"></div>\r\n");
      out.write("        <div class=\"center_prod_box\">\r\n");
      out.write("          <div class=\"product_title\">");
out.println("<a href='bookview.jsp?book_id="+rs1.getString(1)+"'>"+bookname+"</a>");
      out.write("</div>\r\n");
      out.write("          <div class=\"product_img\">");
out.println("<img src='C:/Uploaded Images/"+rs1.getString(7)+"'></img>");
      out.write("</div>\r\n");
      out.write("          <div class=\"prod_price\"><span class=\"price\">Rs. ");
out.println(rs1.getString(3));
      out.write("</span></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"bottom_prod_box\"></div>\r\n");
      out.write("        <div class=\"prod_details_tab\">Rating : ");
out.println(rs1.getString(6));
      out.write("&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\r\n");
      out.write("        ");

        if(Integer.parseInt(rs1.getString(10))>0)
        {
       
      out.write("In Stock");
 
        }
        else
        {
        	
      out.write("Out of Stock");
 
        	}   
     
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      ");
    
      }
}
     ps1.close();		
	Conn1.close();
	}
	catch(Exception ex){
	    out.println(ex);
	}
        
      
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- end of center content -->\r\n");
      out.write("    <div class=\"right_content\">\r\n");
      out.write("     <br><br><br>\r\n");
      out.write("     ");

    if(c!=null)
    {
    	
      out.write("\r\n");
      out.write("    \t<div class=\"shopping_cart\">\r\n");
      out.write("        <div class=\"cart_title\">Shopping cart</div>\r\n");
      out.write("        ");

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
    		
      out.write("\r\n");
      out.write("        <div class=\"cart_details\">");
out.println(value);
      out.write(" items <br />\r\n");
      out.write("      ");

    }
        while(rs2.next()) 
        {
    		String value=rs2.getString(1);
        	if(value==null)
        	{value="0";}
    		
      out.write("\r\n");
      out.write("          <span class=\"border_cart\"></span> Total: <span class=\"price\">");
out.println(value);
      out.write("</span> </div>\r\n");
      out.write("      ");

    }
	ps1.close();
	Conn1.close();
	ps2.close();
	Conn2.close();
	}
	catch(Exception ex){
	    out.println(ex);
	}
        
      
      out.write("\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <div class=\"cart_icon\"><a href=\"view_cart.jsp\" title=\"header=[Checkout] body=[&nbsp;] fade=[on]\"><img src=\"images/shoppingcart.png\" alt=\"\" \r\n");
      out.write("\r\n");
      out.write("width=\"48\" height=\"48\" border=\"0\" /></a></div>\r\n");
      out.write("        </div>\r\n");
      out.write("     ");

     }
     
      out.write(" \r\n");
      out.write("     <br><br><br>\r\n");
      out.write("     <center>\r\n");
      out.write("     ");

        if(c==null)
        {
        
      out.write("\r\n");
      out.write("     <center>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("     function required()\r\n");
      out.write("{\r\n");
      out.write("    \t \r\n");
      out.write("    \t var uname = document.myForm.username;\r\n");
      out.write("    \t var pwd = document.myForm.password;\r\n");
      out.write("\r\n");
      out.write("    \t var alphanum = /^[0-9a-zA-Z]+$/;\r\n");
      out.write("\r\n");
      out.write("    \t if (uname.value.length == 0)\r\n");
      out.write("    \t {\r\n");
      out.write("    \t alert('Please enter your Username!');\r\n");
      out.write("    \t uname.focus();\r\n");
      out.write("    \t return false;\r\n");
      out.write("    \t }\r\n");
      out.write("    \t else if ((!uname.value.match(alphanum)))\r\n");
      out.write("    \t {\r\n");
      out.write("    \t alert('Username must have alphanumeric characters only.');\r\n");
      out.write("    \t uname.focus();\r\n");
      out.write("    \t return false;\r\n");
      out.write("    \t }\r\n");
      out.write("\r\n");
      out.write("    \t var pwd_len = pwd.value.length;\r\n");
      out.write("    \t if (pwd_len == 0)\r\n");
      out.write("    \t {\r\n");
      out.write("    \t alert(\"Please enter your password!\");\r\n");
      out.write("    \t pwd.focus();\r\n");
      out.write("    \t return false;\r\n");
      out.write("    \t }\r\n");
      out.write("    \t else if(!pwd.value.match(alphanum))\r\n");
      out.write("    \t \t{\r\n");
      out.write("    \t \talert(\"Password must have alphanumeric characters only.\");\r\n");
      out.write("    \t \tpwd.focus();\r\n");
      out.write("    \t \treturn false;\r\n");
      out.write("    \t \t}\r\n");
      out.write("    \t else if( pwd_len > 15 || pwd_len < 5)\r\n");
      out.write("    \t {\r\n");
      out.write("    \t \talert(\"Password should be between 5 to 15 characters\");\r\n");
      out.write("    \t \tpwd.focus();\r\n");
      out.write("    \t \treturn false;\r\n");
      out.write("    \t }\r\n");
      out.write("\r\n");
      out.write("    \t return true; \r\n");
      out.write("}\r\n");
      out.write("     </script>\r\n");
      out.write("      <div class=\"title_box\">Login</div><br><br> \r\n");
      out.write("      <form name=\"myForm\" method=\"post\" action=\"checklogin.jsp\" onsubmit=\"return required()\">\r\n");
      out.write("      \r\n");
      out.write("<div style=\"font-size:16px;color:#B13052;\">Username : </div><input name=\"username\" type=\"text\" id=\"username\" size=\"15\"><br>\r\n");
      out.write("<p><div style=\"font-size:16px;color:#B13052;\">Password : </div><input name=\"password\" type=\"password\" id=\"password\" size=\"15\"><br><br>\r\n");
      out.write("<input type=\"submit\" name=\"Login\" value=\"Login\"><br><br>\r\n");
      out.write("<div style=\"font-size:16px;color:#B13052;\"><a href=\"registration.html\">Sign Up</a></div><br>\r\n");
      out.write("<div style=\"font-size:16px;color:#B13052;\"><a href=\"corpuser.html\">Login As Guest</a></div><br>\r\n");
      out.write("<div style=\"font-size:16px;color:#B13052;\"><a href=\"forgotpassword.jsp\">Forgot Password</a></div><br>\r\n");
      out.write("      \r\n");
      out.write("</form>\r\n");
      out.write(" </center>\r\n");
      out.write(" ");

        }
      out.write("\r\n");
      out.write("        ");

        Connection Conn10=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh");
      PreparedStatement ps10=Conn10.prepareStatement("SELECT IMAGEURL FROM ADVERTISEMENT ORDER BY AD_ID DESC LIMIT 3,6"); 
	ResultSet rs10=ps10.executeQuery();
	while(rs10.next()) 
    {
		
      out.write("\r\n");
      out.write("      <div class=\"banner_adds\"><br><br><br> ");
out.println("<img src='C:/Uploaded Images/"+rs10.getString(1)+"'></img>");
      out.write(" </div>\r\n");
      out.write("      ");

      }
	ps10.close();
	Conn10.close();
      
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- end of right content -->\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- end of main content -->\r\n");
      out.write("  <div class=\"footer\">\r\n");
      out.write("    <br><br>\r\n");
      out.write("    <center> All Rights Reserved 2008</center>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("<!-- end of main_container -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}