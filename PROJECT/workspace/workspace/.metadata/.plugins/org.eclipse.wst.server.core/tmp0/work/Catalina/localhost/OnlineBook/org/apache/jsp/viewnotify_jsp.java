package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.*;
import java.lang.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.mail.internet.MimeMessage.RecipientType;

public final class viewnotify_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>View Requests</title>\r\n");
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
      out.write("<td>Username</td>\r\n");
      out.write("<td>BookId</td>\r\n");
      out.write("<td>Book Name</td>\r\n");
      out.write("<td>Send Email</td>\r\n");
      out.write("<td>Send SMS</td>\r\n");
      out.write("<td>Delete</td>\r\n");
      out.write("</tr>\r\n");

String email = null;
String mobile = null;
String mob=null;
String bookname=null;
int check=0;
Connection Conn=null;

try{
	Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 	
	Conn=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh"); 
	PreparedStatement ps=Conn.prepareStatement("SELECT * FROM NOTIFY"); 
	ResultSet rs=ps.executeQuery();
	while(rs.next()) 
    {
		 out.println("<tr>");
		 	out.println("<td>"+rs.getString(1)+"</td>");
		 	out.println("<td>"+rs.getString(2)+"</td>");
		 	PreparedStatement ps3=Conn.prepareStatement("SELECT BOOK_NAME FROM BOOKS WHERE BOOK_ID='"+rs.getString(2)+"'"); 
			ResultSet rs3=ps3.executeQuery();
			if(rs3.next()) 
			{
				bookname=rs3.getString(1);
				out.println("<td>"+rs3.getString(1)+"</td>");
			}
    PreparedStatement ps1=Conn.prepareStatement("SELECT CONTACT_NO FROM USERS WHERE USERNAME='"+rs.getString(1)+"'"); 
	ResultSet rs1=ps1.executeQuery();
	if(rs1.next()) 
	{		
		mobile=rs1.getString(1);
		mob="0"+mobile;
	}
	if(mobile!=null)
	{
		String TEXT ="Your requested book "+bookname+" is now available";
 check=1;
 out.println(check);
 if(check==1)
 {
	 check++;
	 out.println(check);
 
      out.write("\r\n");
      out.write(" <form name=\"form1\" method=\"post\" action=\"sendnotify.jsp\"> \t\r\n");
      out.write("\t\t \t<input type=\"HIDDEN\" name=\"username\" value=");
      out.print(rs.getString(1));
      out.write(">\r\n");
      out.write("\t\t \t<input type=\"HIDDEN\" name=\"bookname\" value=");
      out.print(bookname);
      out.write(">\r\n");
      out.write("\t\t \t<td><input type=\"SUBMIT\" name=\"SUBMIT\" value=\"Send Email\"></td>\r\n");
      out.write("\t\t \t</form>\r\n");
      out.write(" <td><a href=\"http://api.mVaayoo.com/mvaayooapi/MessageCompose?user=gauravahire28@gmail.com:system&senderID=TEST SMS&receipientno=");
      out.print(mob );
      out.write("&dcs=0&msgtxt=");
      out.print(TEXT );
      out.write("&state=0\" target=\"_blank\">Send SMS</a>\r\n");
      out.write(" </td>\r\n");
      out.write(" ");

 }
	}
	else
	{
		out.println("Wrong Mobile no or email id");
	}
	
      out.write("\r\n");
      out.write("\t\t \t<form name=\"form1\" method=\"post\" action=\"deletenotify.jsp\"> \t\r\n");
      out.write("\t\t \t<input type=\"HIDDEN\" name=\"username\" value=");
      out.print(rs.getString(1));
      out.write(">\r\n");
      out.write("\t\t \t<input type=\"HIDDEN\" name=\"bookid\" value=");
      out.print(rs.getString(2));
      out.write(">\r\n");
      out.write("\t\t \t<td><input type=\"SUBMIT\" name=\"SUBMIT\" value=\"Delete\"></td>\r\n");
      out.write("\t\t \t</form>\r\n");
      out.write("\t\t \t");

		 	out.println("</tr>");
    }
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");


	ps.close();
	Conn.close(); 
	}
catch(Exception ex){
    out.println(ex);	
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
