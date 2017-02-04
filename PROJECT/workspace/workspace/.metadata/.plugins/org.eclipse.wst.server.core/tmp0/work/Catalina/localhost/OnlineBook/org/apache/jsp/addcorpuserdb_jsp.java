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

public final class addcorpuserdb_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Add Corporate User</title>\r\n");
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
      out.write("<br><br><br><br><br>\r\n");

String username = request.getParameter("username");
String name = request.getParameter("name");
String lname = request.getParameter("lname");
String gender = request.getParameter("gender");
String pro = request.getParameter("pro");
String mobile = request.getParameter("phone1");
String email = request.getParameter("email");
String password = request.getParameter("pwd");
int age = Integer.parseInt(request.getParameter("age"));
String address = request.getParameter("address");
name=name+" "+lname;
out.println(username+" "+name+" "+gender+" "+pro+" "+mobile+" "+email+" "+password+" "+age+" "+address);

int count=0;
int i=1;
int check=0;
try{
    Connection con1=null;
    Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 
    con1=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh");
    PreparedStatement ps=con1.prepareStatement("insert into USERS values(?,?,?,?,?,?,?,?,?,?)");
		ps.setString(1,username);
		ps.setString(2,password);
		ps.setString(3,"Corporate");
		ps.setInt(4,age);
		ps.setString(5,gender);
		ps.setString(6,mobile);
		ps.setString(7,email);
		ps.setString(8,address);
		ps.setString(9,pro);
		ps.setString(10,name);
		
		
    int n=ps.executeUpdate();
		if(n>0)
		   check=1;
		else
			out.println("Not Successful"); 
		
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
	 response.sendRedirect("users.jsp");
}
    ps.close();
    con1.close();
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
