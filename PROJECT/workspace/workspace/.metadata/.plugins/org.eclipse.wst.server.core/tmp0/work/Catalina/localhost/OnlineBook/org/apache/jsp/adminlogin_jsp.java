package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Admin Login</title>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("function required()\r\n");
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
      out.write("\r\n");
      out.write("}\r\n");
      out.write("     </script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<center>\r\n");
      out.write("      <div class=\"title_box\">Admin Login</div><br><br>\r\n");
      out.write("      <form name=\"myForm\" method=\"post\" action=\"checkadminlogin.jsp\" onsubmit=\"return required()\">\r\n");
      out.write("<div style=\"font-size:16px;color:#B13052;\">Username : </div><input name=\"username\" type=\"text\" id=\"username\" size=\"15\"><br>\r\n");
      out.write("<p><div style=\"font-size:16px;color:#B13052;\">Password : </div><input name=\"password\" type=\"password\" id=\"password\" size=\"15\"><br><br>\r\n");
      out.write("<input type=\"submit\" name=\"Login\" value=\"Login\"><br><br>\r\n");
      out.write("</form>\r\n");
      out.write(" </center>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
