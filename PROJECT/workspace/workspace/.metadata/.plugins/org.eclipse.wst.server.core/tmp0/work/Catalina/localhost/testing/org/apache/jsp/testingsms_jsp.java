package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.*;
import java.io.*;
import java.util.*;
import java.lang.*;

public final class testingsms_jsp extends org.apache.jasper.runtime.HttpJspBase
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


try{
	
	 String _userName   = "8976358948";
	 String _password   = "1521329";
	 String _url        = "http://madsmsapi.tk/smsapi.php";
	 String charset     = "UTF-8";
     String testPhoneNo = "8976358948";
     String testMessage = "test";
     
     
     String [] params = new String [5];

     params[0] = _userName;

     params[1] = _password;

     params[2] = testMessage;

     params[3] = testPhoneNo;

     params[4] = "site2sms";

     String query = String.format("usr=%s&amp;amp;pwd=%s&amp;amp;mes=%s&amp;amp;to=%s&amp;amp;site=%s",

     URLEncoder.encode(params[0],charset),

     URLEncoder.encode(params[1],charset),

     URLEncoder.encode(params[2],charset),

     URLEncoder.encode(params[3],charset),

     URLEncoder.encode(params[4],charset)
     );
     URLConnection connection = new URL(_url + "?" + query).openConnection();

     connection.setRequestProperty("Accept-Charset", charset);

     //This automatically fires the request and we can use it to determine the response status

     InputStream res = connection.getInputStream();

     BufferedReader br = new BufferedReader(new InputStreamReader(res));

     System.out.println(br.readLine());
	
}
catch(Exception e)
{
	e.printStackTrace();
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
