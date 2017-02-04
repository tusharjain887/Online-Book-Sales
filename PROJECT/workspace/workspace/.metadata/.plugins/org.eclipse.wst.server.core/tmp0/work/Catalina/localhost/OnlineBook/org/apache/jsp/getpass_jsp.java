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

public final class getpass_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Forgot Password</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\r\n");
      out.write("<!--[if IE 6]>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"iecss.css\" />\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/boxOver.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"main_container\">\r\n");
      out.write("  \r\n");
      out.write("  <div id=\"header\">\r\n");
      out.write("  <div class=\"logout\">\r\n");
      out.write(" ");
  Object c=session.getAttribute("username");
if(c!=null)
	{
	out.print("Welcome  " +session.getAttribute("username").toString());
	
      out.write("\r\n");
      out.write("\t&nbsp<a href='myprofile.jsp'>Profile</a>\r\n");
      out.write("\t&nbsp<a href='logout.jsp'>Logout</a>\r\n");
      out.write("\t");

	}
	
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div id=\"main_content\">\r\n");
      out.write("    <div id=\"menu_tab\">\r\n");
      out.write("      <div class=\"left_menu_corner\"></div>\r\n");
      out.write("      <ul class=\"menu\">\r\n");
      out.write("        <li><a href=\"index.jsp\" class=\"nav1\"> Home</a></li>\r\n");
      out.write("        <li class=\"divider\"></li>\r\n");
      out.write("        <li><a href=\"categories.jsp\" class=\"nav2\">Categories</a></li>\r\n");
      out.write("        <li class=\"divider\"></li>\r\n");
      out.write("        ");

        if(c==null)
        {
        
      out.write("<li><a href=\"registration.html\" class=\"nav4\">Sign Up</a></li>\r\n");
      out.write("        <li class=\"divider\"></li>\r\n");
      out.write("        ");

        }
        
      out.write("\r\n");
      out.write("        <li><a href=\"news.jsp\" class=\"nav3\">Offers</a></li>\r\n");
      out.write("        <li class=\"divider\"></li>\r\n");
      out.write("        <li><a href=\"contact.jsp\" class=\"nav6\">Contact Us</a></li>\r\n");
      out.write("        <li class=\"divider\"></li>\r\n");
      out.write("        <li><a href=\"forum.jsp\" class=\"nav6\">Forum</a></li>\r\n");
      out.write("        <li class=\"divider\"></li>\r\n");
      out.write("        <li><a href=\"aboutus.jsp\" class=\"nav3\">About Us</a></li>\r\n");
      out.write("        <li class=\"divider\"></li>\r\n");
      out.write("        \r\n");
      out.write("      </ul>\r\n");
      out.write("      <div class=\"right_menu_corner\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- end of menu tab -->\r\n");
      out.write("    <div class=\"left_content\">\r\n");
      out.write("     <br><br><br>\r\n");
      out.write("      \r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("    <!-- end of left content -->\r\n");
      out.write("    <div class=\"center_content\">\r\n");
      out.write("      <div class=\"center_title_bar\">Get Password</div>\r\n");
      out.write("      <div style=\"font-size:16px;color:#B13052;\">\r\n");
      out.write("      <br><br><br><br><center>\r\n");

String uname = request.getParameter("uname");
String email = request.getParameter("email");
String mobile = request.getParameter("mobile");
String mob="0"+mobile;
String pass=null;
int check=0;
try
{
	Connection con1=null;
    Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 
    con1=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh");
    PreparedStatement ps=con1.prepareStatement("SELECT PASSWORD FROM USERS WHERE EMAIL_ID='"+email+"' AND CONTACT_NO='"+mobile+"' AND USERNAME='"+uname+"'"); 
	ResultSet rs=ps.executeQuery();
	if(rs.next()) 
	{
		pass=rs.getString(1);
	}
	if(pass!=null)
	{
      String HOST = "smtp.gmail.com";

      String USER = "idealbooksales";

      String PASSWORD = "ideal123456";

      String PORT = "465";

      String FROM = "idealbooksales@gmail.com";

      String TO = email;

 

      String STARTTLS = "true";

      String AUTH = "true";

      String DEBUG = "true";

      String SOCKET_FACTORY = "javax.net.ssl.SSLSocketFactory";

      String SUBJECT = "Password for Ideal Book Store";

      String TEXT ="This is your password "+pass;
      
      Properties props = new Properties();
	props.put("mail.smtp.host", HOST);

        props.put("mail.smtp.port", PORT);

        props.put("mail.smtp.user", USER);

 

        props.put("mail.smtp.auth", AUTH);

        props.put("mail.smtp.starttls.enable", STARTTLS);

        props.put("mail.smtp.debug", DEBUG);
     
 

        props.put("mail.smtp.socketFactory.port", PORT);

        props.put("mail.smtp.socketFactory.class", SOCKET_FACTORY);

        props.put("mail.smtp.socketFactory.fallback", "false");

 

       
 

            //Obtain the default mail session

            Session sessio = Session.getDefaultInstance(props, null);

            sessio.setDebug(true);

 System.out.println("Success");

            //Construct the mail message

            MimeMessage message = new MimeMessage(sessio);

            message.setText(TEXT);

            message.setSubject(SUBJECT);

            message.setFrom(new InternetAddress(FROM));

            message.addRecipient(RecipientType.TO, new InternetAddress(TO));

            message.saveChanges();

 
			System.out.println("Success");
            //Use Transport to deliver the message

            Transport transport = sessio.getTransport("smtp");

            transport.connect(HOST, USER, PASSWORD);
	System.out.println("Success");
            transport.sendMessage(message, message.getAllRecipients());

            transport.close();

 System.out.println("Success");
 out.println("Email Sent");
 check=1;
System.out.println(check);
 if(check==1)
 {
	 check++;
	System.out.println(check);
 
      out.write("\r\n");
      out.write(" <a href=\"http://api.mVaayoo.com/mvaayooapi/MessageCompose?user=chilukarakesh123@gmail.com:rakesh1234&senderID=TEST SMS&receipientno=");
      out.print(mob );
      out.write("&dcs=0&msgtxt=");
      out.print(TEXT );
      out.write("&state=0\" target=\"_blank\">Click To Receive SMS</a>\r\n");
      out.write(" ");

 }
	}
	else
	{
		out.println("Incorrect Username or Mobile no or Email id");
	}
}
catch(Exception e)
{
System.out.println(e);
}

      out.write("\r\n");
      out.write("</center>\r\n");
      out.write("</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- end of center content -->\r\n");
      out.write("    <div class=\"right_content\">\r\n");
      out.write("     <br><br><br>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- end of right content -->\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- end of main content -->\r\n");
      out.write("  <div class=\"footer\">\r\n");
      out.write("    <br><br>\r\n");
      out.write("    <center> All Rights Reserved 2008</center>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("<!-- end of main_container -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
