package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.*;
import java.lang.*;

public final class viewfeedback_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>View Feedback</title>\r\n");
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
      out.write("<table cellpadding=10 text-align=center>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Name</td>\r\n");
      out.write("<td>Email</td>\r\n");
      out.write("<td>Subject</td>\r\n");
      out.write("<td>Notes</td>\r\n");
      out.write("<td>Delete</td>\r\n");
      out.write("</tr>\r\n");

int check=0;
Connection Conn=null;
try{
	Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 	
	Conn=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh"); 
	PreparedStatement ps=Conn.prepareStatement("SELECT * FROM CONTACTS"); 
	ResultSet rs=ps.executeQuery();
	while(rs.next()) 
    {
		 out.println("<tr>");
		 	out.println("<td>"+rs.getString(2)+"</td>");
		 	out.println("<td>"+rs.getString(5)+"</td>");
		 	out.println("<td>"+rs.getString(3)+"</td>");
		 	out.println("<td>"+rs.getString(4)+"</td>");
		 	
      out.write("\r\n");
      out.write("\t\t \t<form name=\"form1\" method=\"post\" onsubmit=\"checkBoxValidation()\"> \t\r\n");
      out.write("\t\t \t<input type=\"HIDDEN\" name=\"conid\" value=");
      out.print(rs.getInt(1));
      out.write(">\r\n");
      out.write("\t\t \t<td><input type=\"SUBMIT\" name=\"SUBMIT\" value=\"Delete\"></td>\r\n");
      out.write("\t\t \t</form>\r\n");
      out.write("\t\t \t");

		 	out.println("</tr>");
    }
	
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\tfunction checkBoxValidation()\r\n");
      out.write("\t{\r\n");
      out.write("\t\t");

		check=1;	
		
      out.write("\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t");

	if(check==1)
	{
	int con=Integer.parseInt(request.getParameter("conid"));
	out.println(con);
	PreparedStatement ps1=Conn.prepareStatement("DELETE FROM CONTACTS WHERE CON_ID='"+con+"'"); 
	int n=ps1.executeUpdate();
	if(n>0)
		response.sendRedirect("viewfeedback.jsp");
	else
		out.println("Sorry could not be deleted"); 
	
	ps1.close();
	}
	ps.close();
	Conn.close(); 
	}
catch(Exception ex){
    //out.println(ex);	
}
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