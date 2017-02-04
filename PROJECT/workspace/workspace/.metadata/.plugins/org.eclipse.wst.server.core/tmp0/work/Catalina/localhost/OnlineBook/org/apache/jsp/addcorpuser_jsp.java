package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.*;
import java.lang.*;

public final class addcorpuser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Add Corporate User</title>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function formValidation()\r\n");
      out.write("{\r\n");
      out.write("var username = document.myForm.username;\r\n");
      out.write("var name = document.myForm.name;\r\n");
      out.write("var lname = document.myForm.lname;\r\n");
      out.write("var pro = document.myForm.pro;\r\n");
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
      out.write("alert('Please enter your Username !');\r\n");
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
      out.write("\talert('Please enter your First name !');\r\n");
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
      out.write("\talert('Please enter your Last name !');\r\n");
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
      out.write("var numbers = /^[0-9]+$/;\r\n");
      out.write("if(age.value.length==0)\r\n");
      out.write("{\r\n");
      out.write("\talert('Please enter your age !');\r\n");
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
      out.write("if ( ( myForm.gender[0].checked == false ) && ( myForm.gender[1].checked == false ))\r\n");
      out.write("{\r\n");
      out.write("alert('Please select your gender !');\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("if(pro.value.length==0)\r\n");
      out.write("{ \r\n");
      out.write("alert(\"Please select your institution !\");\r\n");
      out.write("document.myForm.pro.focus();\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("if(phone1.value.length==0)\r\n");
      out.write("{\r\n");
      out.write("\talert('Please enter your Mobile number !');\r\n");
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
      out.write("\talert(\"Please enter your email addres !\");\r\n");
      out.write("\temail.focus();\r\n");
      out.write("\treturn false;\t\r\n");
      out.write("\t}\r\n");
      out.write("else if(!email.value.match(mailformat))\r\n");
      out.write("    {\r\n");
      out.write("\talert(\"You have entered an invalid email address !\");\r\n");
      out.write("\temail.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("if(address.value.length==0)\r\n");
      out.write("{\r\n");
      out.write("\talert('Please enter your address !');\r\n");
      out.write("\tage.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("var pwd_len = pwd.value.length;\r\n");
      out.write("if (pwd_len == 0)\r\n");
      out.write("{\r\n");
      out.write("alert(\"Please enter your password !\");\r\n");
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
      out.write("alert(\"Password mismatch !\");\r\n");
      out.write("pwd.focus();\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("return true;\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <div style=\"float:right;font-size:14px;\">\r\n");
      out.write(" ");
  Object c=session.getAttribute("admin");
if(c!=null)
	{
	out.print("Welcome  " +session.getAttribute("admin").toString());
	out.print(" ,  <a href='logout.jsp'>Logout</a>");
	
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("<br><br><br><br><br><center>\r\n");
      out.write("<a href=\"adminhome.jsp\">Go To Home</a>\r\n");
      out.write("<form name=\"myForm\" action=\"addcorpuserdb.jsp\" method=\"post\" onsubmit=\"return formValidation()\">\r\n");
      out.write("      <center>\r\n");
      out.write("<table>\r\n");
      out.write("<pre><h3>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Username        : </td>\r\n");
      out.write("<td><input type=text name=\"username\" size=15></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>First name         : </td>\r\n");
      out.write("<td><input type=text name=\"name\" size=15></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Last name         : </td>\r\n");
      out.write("<td><input type=text name=\"lname\" size=15></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Age         : </td>\r\n");
      out.write("<td><input type=text name=\"age\" size=15></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Gender               :</td>\r\n");
      out.write("<td><input type=\"radio\" name=\"gender\" value=\"male\" /><span>Male</span><input type=\"radio\" name=\"gender\" value=\"female\" /><span>Female</span></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Institution        : </td>\r\n");
      out.write("<td><input type=text name=\"pro\" size=15></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Mobile.No         :</td>\r\n");
      out.write("<td><input type=text name=\"phone1\" size=15></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>E-MAIL            :</td>\r\n");
      out.write("<td><input type=text name=\"email\" size=15></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Address            :</td>\r\n");
      out.write("<td><input type=text name=\"address\" size=15></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Password          : </td>\r\n");
      out.write("<td><input type=password name=\"pwd\" size=15></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Confirm Password  : </td>\r\n");
      out.write("<td><input type=password name=\"pwd1\" size=15></td>\r\n");
      out.write("</tr></h3></pre>\r\n");
      out.write("</table>\r\n");
      out.write("<br><br>\r\n");
      out.write("<input type=submit value=\"submit\">\r\n");
      out.write("<input type=reset value=\"reset\">\r\n");
      out.write("</center>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");

}
else
{
out.println("Please Login");
}

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
