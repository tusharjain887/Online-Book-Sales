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

public final class regconfirm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"Error.jsp", true, 8192, true);
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
      out.write("\r\n");

int code = Integer.parseInt(request.getParameter("code"));
String username = null;
String name = null;
String gender = null;
String pro = null;
int age = 0;
String mobile = null;
String email = null;
String address = null;
String password = null;
int count=0;
int i=0;
int check=0;
try{
    Connection con1=null;
    Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 
    con1=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh");
    PreparedStatement ps=con1.prepareStatement("SELECT * FROM TEMPUSER WHERE CODE='"+code+"'");
    ResultSet rs1=ps.executeQuery();
	while(rs1.next()) 
    {
		username = rs1.getString(2);
		name = rs1.getString(10);
	    gender = rs1.getString(5);
		pro = rs1.getString(9);
		age = rs1.getInt(4);
		mobile = rs1.getString(6);
		email = rs1.getString(7);
		address = rs1.getString(8);
		password = rs1.getString(3);
    }	
	if(i==0)
	{
		PreparedStatement ps2=con1.prepareStatement("insert into USERS values(?,?,?,?,?,?,?,?,?,?)");
		ps2.setString(1,username);
		ps2.setString(2,password);
		ps2.setString(3,"Regular");
		ps2.setString(9,pro);
		ps2.setInt(4,age);
		ps2.setString(5,gender);
		ps2.setString(6,mobile);
		ps2.setString(7,email);
		ps2.setString(8,address);
		ps2.setString(10,name);	
    int n2=ps2.executeUpdate();
		if(n2>0)
		   {
			check++;
			Connection Conn5=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh"); 
			PreparedStatement ps5=Conn5.prepareStatement("DELETE FROM TEMPUSER WHERE USERNAME='"+username+"'"); 
			int n5=ps5.executeUpdate();
			if(n5>0)
				{
				//response.sendRedirect("view_cart.jsp");
				}
			else
				{
				out.println("Sorry an error has occured");
				}
			ps5.close();
			Conn5.close(); 
		   }
		else
			out.println("1Not Successful"); 
		 ps2.close();
	}
	else
		out.println("3Not Successful"); 	
	
    ps.close();   
    con1.close();
    }

catch(Exception ex){
    out.println(ex);
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Confirm Registration</title>\r\n");
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
      out.write("        <li><a href=\"registration.html\" class=\"nav4\">Sign Up</a></li>\r\n");
      out.write("        <li class=\"divider\"></li>\r\n");
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
      out.write("      <div class=\"center_title_bar\">Registration Complete</div>\r\n");
      out.write("      \r\n");
      out.write("      <br><br><br><br><center>\r\n");
      out.write("      <div style=\"font-size:16px;color:#B13052;\">\r\n");
      out.write("  ");

if(check==1)
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

  String TEXT ="You have registered with Online Book Sales.Your Account Details are <br><br>Username= "+username+"<br><br>Password= "+password;
  
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
out.println("You have successfully registered your account");
		   out.println("<a href='index.jsp'>Login</a>");
}
else
{
 out.println("Registration not completed");
 out.println("<a href='registration.html'>Back to Sign Up</a>");
}

      out.write("\r\n");
      out.write("</div>      \r\n");
      out.write("</center>\r\n");
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
