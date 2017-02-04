package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.*;
import java.lang.*;

public final class process_005fshopping_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Shopping</title>\r\n");
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
else
{
	response.sendRedirect("index.jsp");
}
	
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
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
      out.write("\r\n");
      out.write("<div class=\"center_title_bar\">Your Final Cart</div>\r\n");
      out.write("<div style=\"font-size:16px;color:#B13052;\"><center>\r\n");
      out.write("    <table cellpadding=10 text-align=center>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Book Name</td>\r\n");
      out.write("<td>Quantity</td>\r\n");
      out.write("<td>Cost</td>\r\n");
      out.write("<td>Total</td>\r\n");
      out.write("</tr>\r\n");

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
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Total</td>\r\n");
      out.write("<td></td>\r\n");
      out.write("<td></td>\r\n");
      out.write("<td>");
 out.println(total);
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</br></br>\r\n");
      out.write("<p>Please confirm your email-id and address</p>\r\n");
      out.write("\r\n");
      out.write("</br>\r\n");
      out.write("<form action=\"shopping_done.jsp\" method=\"post\">\r\n");
      out.write("\r\n");

try{
	Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 	
	Connection Conn=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh"); 
	PreparedStatement ps=Conn.prepareStatement("SELECT EMAIL_ID,ADDRESS FROM USERS WHERE USERNAME='"+session.getAttribute("username").toString()+"'");
	ResultSet rs=ps.executeQuery();
	while(rs.next()) 
    {

      out.write("\r\n");
      out.write("\t\tEmail-ID<input name=\"email\" type=\"textarea\" value=");
      out.print(rs.getString(1) );
      out.write("/></br></br>\r\n");
      out.write("\t\tAddress<input name=\"address\" type=\"textarea\" value=");
      out.print(rs.getString(2) );
      out.write("/></br></br>\r\n");
      out.write("\t\tTotal Items<input name=\"items\" type=\"text\" value=");
out.println(items);
      out.write("  readonly /></br></br>\r\n");
      out.write("\t\tTotal Cost<input name=\"tcost\" type=\"text\" value=");
out.println(totalcost);
      out.write("  readonly /></br></br>\r\n");
      out.write("\t\t\r\n");
 
    }
	
    ps.close();
	Conn.close(); 
	}
	catch(Exception ex){
	    out.println(ex);
	}
    
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("<input type=\"submit\" name=\"confirm\" value=\"Confirm Order\"/>\r\n");
      out.write("</form>\r\n");
      out.write("</center></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- end of center content -->\r\n");
      out.write("      </div>\r\n");
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
