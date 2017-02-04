package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.*;
import java.lang.*;

public final class bookview_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Books</title>\r\n");
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
      out.write("\t\r\n");
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
        
      out.write("<li><a href=\"registration.html\" class=\"nav4\">Sign Up</a></li>\r\n");
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
      }
      catch(Exception ex){
  	    out.println(ex);
  	}
      
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("    <!-- end of left content -->\r\n");
      out.write("    <div class=\"center_content\">\r\n");
      out.write("      <div class=\"center_title_bar\">Book</div>\r\n");
      out.write(" ");

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
		
      out.write("\r\n");
      out.write("\t\t<div class=\"center_title_bar\">");
out.println("<a href='bookview.jsp?book_id="+rs1.getString(1)+"'>"+book_name+"</a>");
      out.write("</div>\r\n");
      out.write("      <div class=\"prod_box_big\">\r\n");
      out.write("        <div class=\"top_prod_box_big\"></div>\r\n");
      out.write("        <div class=\"center_prod_box_big\">\r\n");
      out.write("          <div class=\"product_img_big\">");
out.println("<img src='C:/Uploaded Images/"+rs1.getString(7)+"'></img>");
      out.write("</a>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"details_big_box\">\r\n");
      out.write("            <div class=\"product_title_big\">");
out.println("<a href='bookview.jsp?book_id="+rs1.getString(1)+"'>"+rs1.getString(2)+"</a>");
      out.write("</div>\r\n");
      out.write("            <div class=\"specifications\">\r\n");
      out.write("            \r\n");
      out.write("              Author: <span class=\"blue\">");
out.println(rs1.getString(11));
      out.write("</span><br />\r\n");
      out.write("              ISBN: <span class=\"blue\">");
out.println(rs1.getString(5));
      out.write("</span><br />\r\n");
      out.write("              ");

             if(rs1.getString(4)!="0")
             {
             
      out.write("\r\n");
      out.write("              Edition : <span class=\"blue\">");
out.println(rs1.getString(4));
      out.write("</span><br />\r\n");
      out.write("              ");

              }
              
      out.write("\r\n");
      out.write("             \r\n");
      out.write("            </div>          \r\n");
      out.write("            <div class=\"prod_price_big\"><span class=\"reduce\">Rs. ");
out.println(rs1.getString(3));
      out.write("</span><span class=\"price\">&nbsp&nbspRs. ");
out.println((int)((100-rs1.getInt(12))*0.01*rs1.getInt(3)));
      out.write("</span></div>\r\n");
      out.write("            ");

            money=(int)((100-rs1.getInt(12))*0.01*rs1.getInt(3));
            bookquantity=rs1.getInt(10);
            
      out.write("\r\n");
      out.write("            <div class=\"prod_price_big\">Description : ");
out.println(rs1.getString(8));
      out.write("</span></div>\r\n");
      out.write("            <div class=\"prod_price_big\">Rating : ");
out.println(rs1.getString(6));
      out.write(" / 10</div>\r\n");
      out.write("            <div class=\"prod_price_big\"> \r\n");
      out.write("            ");

        if(Integer.parseInt(rs1.getString(10))>0)
        {
        	stock=true;
        	
      out.write("\r\n");
      out.write("        \tIn stock\r\n");
      out.write("        \t");

        }
        else
        {
        	stock=false;
        	
      out.write("\r\n");
      out.write("        \tOut of stock\r\n");
      out.write("        \t");

        	
        }
        
      out.write("</span></div>\r\n");
      out.write("        </div>\r\n");
      out.write("      ");

    }
	ps1.close();
	Conn1.close(); 
	}
	catch(Exception ex){
	    out.println(ex);
	}

      out.write("\r\n");
      out.write("        <div class=\"bottom_prod_box_big\"></div>\r\n");
      out.write("        \r\n");
      out.write("          <div class=\"prod_details_tab\">\r\n");
      out.write("\r\n");

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
            		 
      out.write("\r\n");
      out.write("            \t\t stock=\"quantity()\";\r\n");
      out.write("            \t\t ");

            	 }

            }
        
      out.write("\r\n");
      out.write("\r\n");

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
                			
      out.write("\r\n");
      out.write("                \t\t\talert(\"U will be notified when the book is in stock\")\r\n");
      out.write("                \t\t\t");
 
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


      out.write("\r\n");
      out.write("          ");
 
          if(c!=null && stock==true)
          {
        	  
      out.write("\r\n");
      out.write("           <div class=\"form_row\">\r\n");
      out.write("           <FORM NAME=\"form1\" METHOD=\"POST\" >\r\n");
      out.write("            <INPUT TYPE=\"HIDDEN\" NAME=\"buttonName\">\r\n");
      out.write("              <label class=\"contact\"><strong>Quantity:</strong></label>\r\n");
      out.write("              <input type=\"text\" name=\"quantity\" value=\"1\" />\r\n");
      out.write("              <INPUT TYPE=\"BUTTON\" VALUE=\"Add to cart\" ONCLICK=\"button1()\">\r\n");
      out.write("           </FORM>\r\n");
      out.write("           </div>\r\n");
      out.write("           ");

          }
          if(c!=null && stock==false)   
          {
        	  
      out.write("\r\n");
      out.write("           <div class=\"form_row\">\r\n");
      out.write("           <FORM NAME=\"form2\" METHOD=\"POST\">\r\n");
      out.write("            <INPUT TYPE=\"HIDDEN\" NAME=\"username\">\r\n");
      out.write("              <INPUT TYPE=\"BUTTON\" VALUE=\"Notify me\" ONCLICK=\"button2()\">\r\n");
      out.write("           </FORM>\r\n");
      out.write("           </div>\r\n");
      out.write("           ");

          }
          
      out.write("\r\n");
      out.write("          \r\n");
      out.write("             <SCRIPT LANGUAGE=\"JavaScript\">\r\n");
      out.write("            <!--\r\n");
      out.write("            function button1()\r\n");
      out.write("            {\r\n");
      out.write("                document.form1.buttonName.value = \"button 1\"\r\n");
      out.write("                form1.submit()\r\n");
      out.write("            }    \r\n");
      out.write("             --> \r\n");
      out.write("        </SCRIPT>\r\n");
      out.write("        \r\n");
      out.write("             <SCRIPT LANGUAGE=\"JavaScript\">\r\n");
      out.write("            <!--\r\n");
      out.write("      \r\n");
      out.write("            function button2()\r\n");
      out.write("            {\r\n");
      out.write("                document.form2.username.value = \"button 1\"\r\n");
      out.write("                form2.submit()\r\n");
      out.write("            } \r\n");
      out.write("            function lessquantity()\r\n");
      out.write("            {\r\n");
      out.write("                alert(\"Select less quantity or contact us for huge orders\");\r\n");
      out.write("            }    \r\n");
      out.write("            // --> \r\n");
      out.write("            </SCRIPT>\r\n");
      out.write("          \r\n");
      out.write("          </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- end of center content -->\r\n");
      out.write("    <div class=\"right_content\">\r\n");
      out.write("     <br><br>\r\n");
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
      out.write("        <div class=\"cart_icon\"><a href=\"view_cart.jsp\" title=\"header=[Checkout] body=[&nbsp;] fade=[on]\"><img src=\"images/shoppingcart.png\" alt=\"\" width=\"48\" height=\"48\" border=\"0\" /></a></div>\r\n");
      out.write("        </div>\r\n");
      out.write("     ");

     }
     
      out.write(" \r\n");
      out.write("     <br><br>\r\n");
      out.write("     <center>\r\n");
      out.write("     \r\n");
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
