package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.*;
import java.lang.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Sign Up</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\r\n");
      out.write("<!--[if IE 6]>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"iecss.css\" />\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/boxOver.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function formValidation()\r\n");
      out.write("{\r\n");
      out.write("var username = document.myForm.username;\r\n");
      out.write("var name = document.myForm.name;\r\n");
      out.write("var lname = document.myForm.lname;\r\n");
      out.write("var age = document.myForm.age;\r\n");
      out.write("var phone1 = document.myForm.phone1;\r\n");
      out.write("var email = document.myForm.email;\r\n");
      out.write("var address = document.myForm.address;\r\n");
      out.write("var pwd = document.myForm.pwd; \r\n");
      out.write("var pwd1 = document.myForm.pwd1;\r\n");
      out.write("\r\n");
      out.write("//username\r\n");
      out.write("var uid_len = username.value.length;\r\n");
      out.write("var alphanum = /^[0-9a-zA-Z]+$/;\r\n");
      out.write("if (uid_len == 0)\r\n");
      out.write("{\r\n");
      out.write("alert('Please enter your Username!');\r\n");
      out.write("username.focus();\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("else if ((!username.value.match(alphanum)))\r\n");
      out.write("{\r\n");
      out.write("alert('Username must have alphanumeric characters only.');\r\n");
      out.write("username.focus();\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("//Name\r\n");
      out.write("var letters = /^[A-Za-z]+$/;\r\n");
      out.write("if(name.value.length==0)\r\n");
      out.write("{\r\n");
      out.write("\talert('Please enter your First name!');\r\n");
      out.write("\tname.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("else if(!name.value.match(letters))\r\n");
      out.write("{\r\n");
      out.write("\talert('First name must have alphabet characters only');\r\n");
      out.write("\tname.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("if(lname.value.length==0)\r\n");
      out.write("{\r\n");
      out.write("\talert('Please enter your Last name!');\r\n");
      out.write("\tlname.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("else if(!lname.value.match(letters))\r\n");
      out.write("{\r\n");
      out.write("\talert('Last name must have alphabet characters only');\r\n");
      out.write("\tlname.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("if ( ( myForm.gender[0].checked == false ) && ( myForm.gender[1].checked == false ))\r\n");
      out.write("{\r\n");
      out.write("alert('Please select your gender!');\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("if(document.myForm.pro.selectedIndex==0)\r\n");
      out.write("{ \r\n");
      out.write("alert(\"Please select your profession!\");\r\n");
      out.write("document.myForm.pro.focus();\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write("var numbers = /^[0-9]+$/;\r\n");
      out.write("if(age.value.length==0)\r\n");
      out.write("{\r\n");
      out.write("\talert('Please enter your age!');\r\n");
      out.write("\tage.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("else if(!age.value.match(numbers))\r\n");
      out.write("{\r\n");
      out.write("\talert('Age must have numeric characters only.');\r\n");
      out.write("\tage.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("else if(age.value.length>2)\r\n");
      out.write("{\r\n");
      out.write("\talert('Age must be less than 100');\r\n");
      out.write("\tage.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("if(phone1.value.length==0)\r\n");
      out.write("{\r\n");
      out.write("\talert('Please enter your Mobile number!');\r\n");
      out.write("\tphone1.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("else if(!phone1.value.match(numbers))\r\n");
      out.write("{\r\n");
      out.write("\talert('Mobile number must have numeric characters only.');\r\n");
      out.write("\tphone1.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("else if(!(phone1.value.length==10))\r\n");
      out.write("{\r\n");
      out.write("\talert('Mobile number must be of 10 digits.');\r\n");
      out.write("    phone1.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("var mailformat = /^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$/;\r\n");
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
      out.write("\r\n");
      out.write("if(address.value.length==0)\r\n");
      out.write("{\r\n");
      out.write("\talert('Please enter your address!');\r\n");
      out.write("\tage.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("var pwd_len = pwd.value.length;\r\n");
      out.write("if (pwd_len == 0)\r\n");
      out.write("{\r\n");
      out.write("alert(\"Please enter your password!\");\r\n");
      out.write("pwd.focus();\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("else if(!pwd.value.match(alphanum))\r\n");
      out.write("\t{\r\n");
      out.write("\talert(\"Password must have alphanumeric characters only.\");\r\n");
      out.write("\tpwd.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("else if( pwd_len > 15 || pwd_len < 5)\r\n");
      out.write("{\r\n");
      out.write("\talert(\"Password should be between 5 to 15 characters\");\r\n");
      out.write("\tpwd.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("\t\r\n");
      out.write("pwd_len = pwd1.value.length;\r\n");
      out.write("if (pwd_len == 0)\r\n");
      out.write("{\r\n");
      out.write("alert(\"Please confirm your password\");\r\n");
      out.write("pwd1.focus();\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("else if(!pwd1.value.match(alphanum))\r\n");
      out.write("{\r\n");
      out.write("alert(\"Password must have alphanumeric characters only.\");\r\n");
      out.write("pwd1.focus();\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("else if( pwd_len > 15 || pwd_len < 5)\r\n");
      out.write("{\r\n");
      out.write("\talert(\"Password should be between 5 to 15 characters\");\r\n");
      out.write("\tpwd1.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("if(pwd.value!=pwd1.value)\r\n");
      out.write("{\r\n");
      out.write("alert(\"Password mismatch!\");\r\n");
      out.write("pwd.focus();\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("return true;\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"main_container\">\r\n");
      out.write("  \r\n");
      out.write("  <div id=\"header\">\r\n");
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
      out.write("        <li><a href=\"registration.jsp\" class=\"nav4\">Sign Up</a></li>\r\n");
      out.write("        <li class=\"divider\"></li>\r\n");
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
      out.write("</br></br></br>\r\n");
      out.write("    <div class=\"left_content\">\r\n");
      out.write("         <div class=\"title_box\">Categories</div>\r\n");
      out.write("      <ul class=\"left_menu\">\r\n");
      out.write("      ");

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
      catch(Exception e)
      {
    	  System.out.println(e);
      }
      
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- end of left content -->\r\n");
      out.write("    <div class=\"center_content\">\r\n");
      out.write("      <div class=\"center_title_bar\">User Registration</div>\r\n");
      out.write("      <div style=\"font-size:16px;color:#B13052;\">\r\n");
      out.write("      <form name=\"myForm\" action=\"registration1.jsp\" method=\"post\" onsubmit=\"return formValidation()\">\r\n");
      out.write("      <center>\r\n");
      out.write("      Note : All fields are necessary.\r\n");
      out.write("</br></br>\r\n");
      out.write("<table>\r\n");
      out.write("<h3>\r\n");
      out.write("<tr>\r\n");
      out.write("<td style=\"margin-bottom: 5px;\">Username        : </td>\r\n");
      out.write("<td style=\"margin-bottom: 5px;\"><input type=text name=\"username\" size=15></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td style=\"margin-bottom: 5px;\">First name         : </td>\r\n");
      out.write("<td style=\"margin-bottom: 5px;\"><input type=text name=\"name\" size=15></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td style=\"margin-bottom: 5px;\">Last name        : </td>\r\n");
      out.write("<td style=\"margin-bottom: 5px;\"><input type=text name=\"lname\" size=15></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td style=\"margin-bottom: 5px;\">Gender               :</td>\r\n");
      out.write("<td style=\"margin-bottom: 5px;\"><input type=\"radio\" name=\"gender\" value=\"male\" /><span>Male</span><input type=\"radio\" name=\"gender\" value=\"female\" /><span>Female</span></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td style=\"margin-bottom: 5px;\">Profession        : </td>\r\n");
      out.write("<td style=\"margin-bottom: 5px;\"><select name=\"pro\">\r\n");
      out.write("<option selected=\"\" value=\"Default\">(Please select a Profession)</option>\r\n");
      out.write("<option value=Student>Student</option>\r\n");
      out.write("<option value=Business>Business</option>\r\n");
      out.write("<option value=Govt. Employee>Govt.Employ</option>\r\n");
      out.write("<option value=Pvt.Employee>Pvt.Employ</option>\r\n");
      out.write("</select></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td style=\"margin-bottom: 5px;\">Age               :</td>\r\n");
      out.write("<td style=\"margin-bottom: 5px;\"><input type=text name=\"age\"size=15></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td style=\"margin-bottom: 5px;\">Mobile.No         :</td>\r\n");
      out.write("<td style=\"margin-bottom: 5px;\"><input type=text name=\"phone1\" size=15></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td style=\"margin-bottom: 5px;\">E-mail            :</td>\r\n");
      out.write("<td style=\"margin-bottom: 5px;\"><input type=text name=\"email\" size=15></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td style=\"margin-bottom: 5px;\">Address          : </td>\r\n");
      out.write("<td style=\"margin-bottom: 5px;\"><textarea rows=3 cols=15 name=\"address\" size=15></textarea></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td style=\"margin-bottom: 5px;\">Password          : </td>\r\n");
      out.write("<td style=\"margin-bottom: 5px;\"><input type=password name=\"pwd\" size=15></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td style=\"margin-bottom: 5px;\">Confirm Password  : </td>\r\n");
      out.write("<td style=\"margin-bottom: 5px;\"><input type=password name=\"pwd1\" size=15></td>\r\n");
      out.write("</tr></h3>\r\n");
      out.write("</table>\r\n");
      out.write("<br><br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<input type=submit value=\"submit\">\r\n");
      out.write("<input type=reset value=\"reset\">\r\n");
      out.write("</center>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- end of center content -->\r\n");
      out.write("    <div class=\"right_content\">\r\n");
      out.write("     <br><br><br>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- end of right content -->\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- end of main content -->\r\n");
      out.write("  </br></br>\r\n");
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
