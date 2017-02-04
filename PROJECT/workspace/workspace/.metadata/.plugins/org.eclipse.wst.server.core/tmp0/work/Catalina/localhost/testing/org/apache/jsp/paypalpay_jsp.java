package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class paypalpay_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Pay through PayPal: www.TestAccount.com</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"document.forms['paypalForm'].submit();\">\r\n");
      out.write("<form name=\"paypalForm\" action=\"https://www.sandbox.paypal.com/cgi-bin/webscr\" method=\"post\">\r\n");
      out.write(" <input type=\"hidden\" name=\"cmd\" value=\"_xclick\" />\r\n");
      out.write(" <input type=\"hidden\" name=\"business\" value=\"chilukarakesh123@gmail.com\" />\r\n");
      out.write(" <input type=\"hidden\" name=\"password\" value=\"Rakesh@chiluka\" />\r\n");
      out.write(" <input type=\"hidden\" name=\"custom\" value=\"1123\" />\r\n");
      out.write(" <input type=\"hidden\" name=\"item_name\" value=\"Computer-Laptop\" />\r\n");
      out.write(" <input type=\"hidden\" name=\"amount\" value=\"5\"/>\r\n");
      out.write(" <input type=\"hidden\" name=\"rm\" value=\"1\" />\r\n");
      out.write(" <input type=\"hidden\" name=\"return\" value=\"paypalResponse.jsp\" />\r\n");
      out.write(" <input type=\"hidden\" name=\"cancel_return\" value=\"paypalResponseCancel.jsp\" />\r\n");
      out.write(" <input type=\"hidden\" name=\"cert_id\" value=\"AcSr4KhHI52ShCTg1rayL8HkXhkHAB5JJfIAAgG.r10f4AQeJb9bSkoM\" />\r\n");
      out.write("</form>\r\n");
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
