package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.*;
import java.lang.*;

public final class confirmeditbook_jsp extends org.apache.jasper.runtime.HttpJspBase
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

String bookid = request.getParameter("bookid");
String bookname = request.getParameter("bookname");
String isbn = request.getParameter("isbn");
String catid = request.getParameter("catid");
int price = Integer.parseInt(request.getParameter("bookprice"));
int edition = Integer.parseInt(request.getParameter("edition"));
int rating = Integer.parseInt(request.getParameter("rating"));
String des = request.getParameter("description");
String author = request.getParameter("author");
int offer = Integer.parseInt(request.getParameter("offer"));
int quantity = Integer.parseInt(request.getParameter("quantity"));
int check=0;

      out.write('\r');
      out.write('\n');

try{
    Connection con1=null;
    Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 
    con1=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh");
    PreparedStatement ps=con1.prepareStatement("update BOOKS set BOOK_ID=?,BOOK_NAME=?,BOOKPRICE=?,EDITION=?,ISBN=?,RATING=?,DESCRIPTION=?,CAT_ID=?,QUANTITY=?,AUTHOR=?,OFFER=? where BOOK_ID='"+bookid+"'");
		ps.setString(1,bookid);
		ps.setString(2,bookname);
		ps.setInt(3,price);
		ps.setInt(4,edition);
		ps.setString(5,isbn);
		ps.setInt(6,rating);
		ps.setString(7,des);
		ps.setString(8,catid);
		ps.setInt(11,offer);
		ps.setInt(9,quantity);
		ps.setString(10,author);
    int n=ps.executeUpdate();
		if(n>0)
		   response.sendRedirect("viewbooks.jsp");
		else
			out.println("Not Successful"); 
    ps.close();
    con1.close();
    }

catch(Exception ex){
    out.println(ex);
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
