package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class log_005fin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; \r\ncharset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write(' ');
      out.write('\r');
      out.write('\n');

try
{
System.out.println("driver loaded sucesssssssssssssssssss"); 
Class.forName("com.ibm.db2.jcc.DB2Driver"); 
System.out.println("driver loaded sucesssssssssssssssssss"); 
Connection Conn=DriverManager.getConnection("jdbc:db2://localhost:50000/TEST","Rakesh","rakesh"); 
int userid=Integer.parseInt(request.getParameter("userid"));
String name=request.getParameter("name");
int age=Integer.parseInt(request.getParameter("age")); 
System.out.println("name="+name+" id="+userid+" age="+age); 
PreparedStatement Stmt=Conn.prepareStatement("SELECT NAME FROM TEST1 WHERE ID='"+userid+"'"); 
//PreparedStatement Stmt=Conn.prepareStatement("SELECT USERNAME FROM LOGIN"); 
System.out.println("Statement loaded sucesssssssssssssssssss"); 
Stmt.executeQuery(); 
ResultSet rs=Stmt.getResultSet(); 
System.out.println("query execute loaded sucesssssssssssssssssss"); 
String name1= null; 
while(rs.next()) 
{ name1=rs.getString(1);}
System.out.println("query execute loaded sucesssssssssssssssssss "+name1); 
rs.close();
Stmt.close();
Conn.close(); 
if(name1 != null) 
	out.println("Welcome to "+name1); 
else 
	out.println("Please check your voter name and voter id..."); 
}
catch(Exception ex){
    out.println(ex);
} 
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
