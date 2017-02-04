package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.*;
import java.lang.*;

public final class editbooks_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Edit Books</title>\r\n");
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
      out.write("<div class=\"center_title_bar\">Edit Books</div>\r\n");

try{
String bookid=request.getParameter("bookid");
Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 	
Connection Conn=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh"); 
PreparedStatement ps=Conn.prepareStatement("SELECT * FROM BOOKS WHERE BOOK_ID='"+bookid+"'"); 
ResultSet rs=ps.executeQuery();
while(rs.next()) 
{

      out.write("\r\n");
      out.write("      <form name=\"myForm\" action=\"confirmeditbook.jsp\" method=\"post\" onsubmit=\"return formValidation()\">   \r\n");
      out.write("<table>\r\n");
      out.write("<pre><h3>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Book Id        : </td>\r\n");
      out.write("<td><input type=text name=\"bookid\" value=");
      out.print(rs.getString(1));
      out.write(" readonly></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Book Name         : </td>\r\n");
      out.write("<td><textarea name=\"bookname\" >");
      out.print(rs.getString(2));
      out.write("</textarea></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Book Price               :</td>\r\n");
      out.write("<td><input type=text name=\"bookprice\" value=");
      out.print(rs.getInt(3));
      out.write("></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Edition               :</td>\r\n");
      out.write("<td><input type=text name=\"edition\" value=");
      out.print(rs.getInt(4));
      out.write("></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>ISBN               :</td>\r\n");
      out.write("<td><input type=text name=\"isbn\" value=");
      out.print(rs.getString(5));
      out.write("></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Rating             :</td>\r\n");
      out.write("<td><input type=text name=\"rating\" value=");
      out.print(rs.getInt(6));
      out.write("></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Description               :</td>\r\n");
      out.write("<td><textarea name=\"description\" >");
      out.print(rs.getString(8));
      out.write("</textarea></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Category        : </td>\r\n");
      out.write("<td><select name=\"catid\">\r\n");
      out.write("<option value=None>\r\n");
      out.write("<option value=1>Arts & Philosophy\r\n");
      out.write("<option value=2>Business\r\n");
      out.write("<option value=4>Computers & Technology\r\n");
      out.write("</select></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Author       : </td>\r\n");
      out.write("<td><textarea name=\"author\" >");
      out.print(rs.getString(11));
      out.write("</textarea></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Quantity       : </td>\r\n");
      out.write("<td><input type=text name=\"quantity\" value=");
      out.print(rs.getInt(10));
      out.write("></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Offer       : </td>\r\n");
      out.write("<td><input type=text name=\"offer\" value=");
      out.print(rs.getInt(12));
      out.write("></td>\r\n");
      out.write("</tr>\r\n");
      out.write("</h3></pre>\r\n");
      out.write("</table>\r\n");
      out.write("<br><br>\r\n");
      out.write("<input type=submit value=\"submit\">\r\n");
      out.write("<input type=reset value=\"reset\">\r\n");
      out.write("</center>\r\n");
      out.write("</form>\r\n");

}
ps.close();
	Conn.close(); 
	}
	catch(Exception ex){
	    out.println(ex);
	}

      out.write("\r\n");
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
