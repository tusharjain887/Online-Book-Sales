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

public final class registration1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Activation Code</title>\r\n");
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
      out.write(" <div class=\"center_content\">\r\n");
      out.write("      <div class=\"center_title_bar\">Registration</div>\r\n");
      out.write("      <div style=\"font-size:16px;color:#B13052;\"><center>\r\n");
      out.write("      <br><br><br><br><center>\r\n");

String username = request.getParameter("username");
String name = request.getParameter("name");
String lname = request.getParameter("lname");
String gender = request.getParameter("gender");
String pro = request.getParameter("pro");
int age = Integer.parseInt(request.getParameter("age"));
String mobile = request.getParameter("phone1");
String email = request.getParameter("email");
String address = request.getParameter("address");
String password = request.getParameter("pwd");
name=name+" "+lname;
int count=0;
int check=0;
int checksms=0;
int code=0;
int usercount=0;
int mobemcount=0;
String mob="0"+mobile;
try{
    Connection con1=null;
    Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 
    con1=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh");
    PreparedStatement ps12=con1.prepareStatement("SELECT USERNAME FROM USERS WHERE USERNAME='"+username+"'");
    PreparedStatement ps13=con1.prepareStatement("SELECT CONTACT_NO FROM USERS WHERE CONTACT_NO='"+mobile+"'");
    PreparedStatement ps14=con1.prepareStatement("SELECT EMAIL_ID FROM USERS WHERE EMAIL_ID='"+email+"'");
	ResultSet rs12=ps12.executeQuery();
	ResultSet rs13=ps13.executeQuery();
	ResultSet rs14=ps14.executeQuery();
	if(rs12.next())
	{
		if(rs12.getString(1)!=null)
			{
			usercount=1;
			}
	}
	if(rs13.next())
	{
		if(rs13.getString(1)!=null)
		{
			mobemcount=1;
		}	
	}
	if(rs14.next())
	{
		if(rs14.getString(1)!=null)
		{
			mobemcount=1;
		}	
	}
	out.println(usercount);
	out.println(mobemcount);
	if(usercount==0 && mobemcount==0)
	{
    PreparedStatement ps=con1.prepareStatement("insert into TEMPUSER (USERNAME,PASSWORD,AGE,GENDER,CONTACT_NO,EMAIL_ID,ADDRESS,CURRENT_STATUS,NAME) values(?,?,?,?,?,?,?,?,?)");
		ps.setString(1,username);
		ps.setString(2,password);
		ps.setString(8,pro);
		ps.setInt(3,age);
		ps.setString(4,gender);
		ps.setString(5,mobile);
		ps.setString(6,email);
		ps.setString(7,address);
		ps.setString(9,name);	
    int n=ps.executeUpdate();
		if(n>0)
		  {
			check=1;
			PreparedStatement ps4=con1.prepareStatement("SELECT MAX(CODE) FROM TEMPUSER");
			ResultSet rs4=ps4.executeQuery();
			if(rs4.next()) 
		    {
				code=rs4.getInt(1);
		    }
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

		      String SUBJECT = "Activation Code for Ideal Book Sales";

		      String TEXT ="Your activation code is "+code;
		      
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
		 out.println(" Email Has Been Sent To You");
		 check++;
		 
      out.write("\r\n");
      out.write("\t\t <a href=\"http://api.mVaayoo.com/mvaayooapi/MessageCompose?user=singh.maharshi@gmail.com:system&senderID=TEST SMS&receipientno=");
      out.print(mob );
      out.write("&dcs=0&msgtxt=");
      out.print(TEXT );
      out.write("&state=0\" target=\"_blank\">Click To Receive SMS</a>\r\n");
      out.write("\t\t ");

		
		  }
		else
			out.println("Not Successful"); 
    ps.close();
	}
    ps12.close();
    ps13.close();
    con1.close();
    }

catch(Exception ex){
    out.println(ex);
}
if(check==2)
{
	
	
      out.write("\r\n");
      out.write("\t\t   The activation code has been mailed and messaged to you .<br><br>Please enter here to activate your account.\r\n");
      out.write("\t\t   <form name=\"myForm\" action=\"regconfirm.jsp\" method=\"post\">\r\n");
      out.write("\t\t   Enter the code : <input type=text name=\"code\" size=15>\r\n");
      out.write("\t\t   <input type=submit value=\"submit\">\r\n");
      out.write("\t\t   </form>\r\n");
		   
}
else
{
 out.println("Registration not completed");
 out.println("<a href='registration.jsp'>Back to Sign Up</a>");
}

      out.write("  \r\n");
      out.write("</center></div>\r\n");
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
