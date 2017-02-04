package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.*;
import java.lang.*;

public final class addcategory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Add Category</title>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function formValidation()\r\n");
      out.write("{\r\n");
      out.write("var catid = document.myForm.categoryid;\r\n");
      out.write("var name = document.myForm.name;\r\n");
      out.write("var des = document.myForm.description;\r\n");
      out.write("\r\n");
      out.write("if(catid.value.length==0)\r\n");
      out.write("{\r\n");
      out.write("\talert('Please enter Category ID !');\r\n");
      out.write("\tcatid.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("if(name.value.length==0)\r\n");
      out.write("{\r\n");
      out.write("\talert('Please enter Category name!');\r\n");
      out.write("\tname.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("if(des.value.length==0)\r\n");
      out.write("{\r\n");
      out.write("\talert('Please enter Description !');\r\n");
      out.write("\tdes.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
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
      out.write("<center>\r\n");
      out.write("</br></br>\r\n");
      out.write("<div class=\"center_title_bar\">Add Categories</div>\r\n");
      out.write("      <form name=\"myForm\" action=\"addcategorydb.jsp\" method=\"post\" onsubmit=\"return formValidation()\">   \r\n");
      out.write("<table>\r\n");
      out.write("<pre><h3>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Category Id        : </td>\r\n");
      out.write("<td><input type=text name=\"categoryid\" size=15></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Category Name         : </td>\r\n");
      out.write("<td><input type=text name=\"name\" size=15></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Description               :</td>\r\n");
      out.write("<td><input type=text name=\"description\" size=15></td>\r\n");
      out.write("</tr>\r\n");
      out.write("</h3></pre>\r\n");
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
