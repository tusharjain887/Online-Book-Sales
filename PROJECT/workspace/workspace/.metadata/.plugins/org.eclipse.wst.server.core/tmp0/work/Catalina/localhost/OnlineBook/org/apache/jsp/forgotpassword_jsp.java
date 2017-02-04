package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.*;
import java.lang.*;

public final class forgotpassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Forgot Password</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\r\n");
      out.write("<!--[if IE 6]>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"iecss.css\" />\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/boxOver.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function validate()\r\n");
      out.write("{\r\n");
      out.write("var uname = document.myForm.uname;\r\n");
      out.write("var email = document.myForm.email;\r\n");
      out.write("var phone = document.myForm.mobile;\r\n");
      out.write("\r\n");
      out.write("var mailformat = /^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$/;\r\n");
      out.write("var numbers = /^[0-9]+$/;\r\n");
      out.write("var alphanum = /^[0-9a-zA-Z]+$/;\r\n");
      out.write("\r\n");
      out.write("if (uname.value.length == 0)\r\n");
      out.write("{\r\n");
      out.write("alert('Please enter your Username!');\r\n");
      out.write("uname.focus();\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("else if ((!uname.value.match(alphanum)))\r\n");
      out.write("{\r\n");
      out.write("alert('Username must have alphanumeric characters only.');\r\n");
      out.write("uname.focus();\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("if(email.value.length==0)\r\n");
      out.write("\t{\r\n");
      out.write("\talert(\"Please enter your email addres!\");\r\n");
      out.write("\temail.focus();\r\n");
      out.write("\treturn false;\t\r\n");
      out.write("\t}\r\n");
      out.write("else if(!email.value.match(mailformat))\r\n");
      out.write("    {\r\n");
      out.write("\talert(\"You have entered an invalid email address!\");\r\n");
      out.write("\temail.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("if(phone.value.length==0)\r\n");
      out.write("{\r\n");
      out.write("\talert('Please enter your Mobile number!');\r\n");
      out.write("\tphone.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("else if(!phone.value.match(numbers))\r\n");
      out.write("{\r\n");
      out.write("\talert('Mobile number must have numeric characters only.');\r\n");
      out.write("\tphone.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("else if(!(phone.value.length==10))\r\n");
      out.write("{\r\n");
      out.write("\talert('Mobile number must be of 10 digits.');\r\n");
      out.write("    phone.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("return true;\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
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
      out.write("      \r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("    <!-- end of left content -->\r\n");
      out.write("    <div class=\"center_content\">\r\n");
      out.write("      <div class=\"center_title_bar\">Contact Us</div>\r\n");
      out.write("      <div style=\"font-size:16px;color:#B13052;\">\r\n");
      out.write("      <br><br><br><br><center>\r\n");
      out.write("      <form name=\"myForm\" method=\"post\" action=\"getpass.jsp\" onsubmit=\"return validate()\">\r\n");
      out.write("Enter your username : <input type=\"text\" name=\"uname\" /><br><br>\r\n");
      out.write("Enter your email id : <input type=\"text\" name=\"email\" /><br><br>\r\n");
      out.write("Enter your mobile no : <input type=\"text\" name=\"mobile\" /><br><br>\r\n");
      out.write("<input type=\"submit\" name=\"submit\" value=\"Submit\" />\r\n");
      out.write("</form>\r\n");
      out.write("</center>\r\n");
      out.write("</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- end of center content -->\r\n");
      out.write("    <div class=\"right_content\">\r\n");
      out.write("     <br><br><br>\r\n");
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
