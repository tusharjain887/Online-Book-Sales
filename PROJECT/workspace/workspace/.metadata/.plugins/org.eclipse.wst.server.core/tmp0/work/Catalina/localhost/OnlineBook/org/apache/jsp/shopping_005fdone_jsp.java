package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.io.FileOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;
import com.itextpdf.text.Anchor;
import com.itextpdf.text.Element;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Image;
import com.itextpdf.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.mail.internet.MimeMessage.RecipientType;

public final class shopping_005fdone_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 java.util.Locale locale = request.getLocale(); 
      out.write("    \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Shopping Done</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\r\n");
      out.write("<!--[if IE 6]>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"iecss.css\" />\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/boxOver.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"main_container\">\r\n");
      out.write(" \r\n");
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
else
{
	response.sendRedirect("index.jsp");
}
	
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("   ");

String email = request.getParameter("email").toString();
String address = request.getParameter("address").toString();
int totalitems = Integer.parseInt(request.getParameter("items"));
int totalcost = Integer.parseInt(request.getParameter("tcost"));
java.sql.Date sqlDate=null;
String bookname[];
bookname=new String[100];
int cost[],quantity[];
cost=new int[100];
quantity=new int[100];

      out.write("  \r\n");
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
      out.write("      <div class=\"title_box\">Categories</div>\r\n");
      out.write("      <ul class=\"left_menu\">\r\n");
      out.write("      ");

      try{
    	  Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 	
	Connection Conn8=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh"); 
	PreparedStatement ps8=Conn8.prepareStatement("SELECT CAT_ID,CAT_NAME FROM CATEGORY"); 
	ResultSet rs8=ps8.executeQuery();
	while(rs8.next()) 
    {
		String name=rs8.getString(2);
 	
      out.write(" \r\n");
      out.write("        <li class=\"even\">");
out.println("<a href='viewcategory.jsp?cat_id="+rs8.getString(1)+"'>"+name+"</a>");
      out.write("</li>  \r\n");
      out.write("        ");

        } 
        
      out.write("  \r\n");
      out.write("      </ul>\r\n");
      out.write("      ");

      PreparedStatement ps9=Conn8.prepareStatement("SELECT IMAGEURL FROM ADVERTISEMENT ORDER BY AD_ID DESC LIMIT 0,3"); 
	ResultSet rs9=ps9.executeQuery();
	while(rs9.next()) 
    {
		
      out.write("\r\n");
      out.write("      <div class=\"banner_adds\"><br><br><br> ");
out.println("<img src='C:/Uploaded Images/"+rs9.getString(1)+"'></img>");
      out.write(" </div>\r\n");
      out.write("      ");

      }
	ps8.close();
	ps9.close();
	Conn8.close();
      }
      catch(Exception ex){
  	    out.println(ex);
  	}
      
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("    <!-- end of left content -->\r\n");
      out.write("    <div class=\"center_content\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"center_title_bar\"></div>\r\n");
      out.write("<div style=\"font-size:16px;color:#B13052;\"><center>\r\n");

int order_id=0;
boolean done=false;
try{
	Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 	
	
	Connection Conn1=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh"); 
	PreparedStatement ps1=Conn1.prepareStatement("INSERT INTO ORDERS (USERNAME,EMAIL,ADDRESS,DATE,TOTALITEMS,TOTALCOST) VALUES (?,?,?,?,?,?)");
    ps1.setString(1,session.getAttribute("username").toString());
	ps1.setString(2,email);
	ps1.setString(3,address);
	
	 SimpleDateFormat reFormat = new SimpleDateFormat("yyyy-MM-dd");
	 Date activityDate = new Date();
     sqlDate = new java.sql.Date(activityDate.getTime());
  	 ps1.setDate(4,sqlDate);

//	ps1.setString(4,address);
	ps1.setInt(5,totalitems);
	ps1.setInt(6,totalcost);
    int n=ps1.executeUpdate();
	if(n>0)
	{
		Connection Conn=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh"); 
		Connection Conn2=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh"); 
		Connection Conn3=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh");
		 Connection con6=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh");
		PreparedStatement ps3=null;
		PreparedStatement ps6=null;
		PreparedStatement ps=Conn.prepareStatement("SELECT MAX(ORDER_ID) FROM ORDERS");
		PreparedStatement ps2=Conn2.prepareStatement("SELECT * FROM TEMP");
		ResultSet rs=ps.executeQuery();
		if(rs.next()) 
	    {
			order_id=rs.getInt(1);
	    }
		ResultSet rs2=ps2.executeQuery();
		int i=0;
		while(rs2.next()) 
	    {
			 
			ps3=Conn3.prepareStatement("INSERT INTO BOOKORDER VALUES (?,?,?,?,?)");
			ps3.setInt(1,order_id);
			ps3.setString(2,rs2.getString(1));
			ps3.setInt(3,rs2.getInt(2));
			cost[i]=rs2.getInt(2);
			ps3.setInt(4,rs2.getInt(3));
			quantity[i]=rs2.getInt(3);
			ps3.setString(5,rs2.getString(4));
			bookname[i]=rs2.getString(4);
			i++;
		    int n1=ps3.executeUpdate();
			if(n1>0)
			{
				done=true;
					ps6=con6.prepareStatement("UPDATE BOOKS SET QUANTITY=QUANTITY-'"+rs2.getInt(3)+"' WHERE BOOK_ID='"+rs2.getString(1)+"'");
					
            	   int n6=ps6.executeUpdate();
        			if(n6>0)
        				{
        			//response.sendRedirect("index.jsp");
        				}
        			else
        				{
        				response.sendRedirect("Error.jsp");
        				}
			}			
			else
			{
				response.sendRedirect("Error.jsp");
			}
			ps3.close();
			 
	    }

		if(done)
		{
			
      out.write("\r\n");
      out.write("\t\t\t<br><br>The order has been successfully processed.\r\n");
      out.write("\t\t\t<br><br> All the details has been mailed to you.\r\n");
      out.write("\t\t\t<br><br> Your books would be available to you in 3-7 business days. \r\n");
      out.write("\t\t\t<br><br> Pay the specified total cost in cash on delivery.\r\n");
      out.write("\t\t\t<br><br> Note down the order id of your transaction.\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");

		}			
ps2.close();
Conn3.close();
ps6.close();
con6.close();
		Conn2.close(); 
		ps.close();
		Conn.close(); 
	}
	else
	{
		response.sendRedirect("Error.jsp");
	}

	ps1.close();
	Conn1.close(); 
	}
	catch(Exception ex){
	    out.println(ex);
	}
    
    
      out.write("\r\n");
      out.write("    </center></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- end of center content -->\r\n");
      out.write("      </div>\r\n");
      out.write("  <!-- end of main content -->\r\n");
      out.write("  <div class=\"footer\">\r\n");
      out.write("    <br><br>\r\n");
      out.write("    <center> All Rights Reserved 2008</center>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("<!-- end of main_container -->\r\n");
      out.write("\r\n");
      out.write("    ");

        	            	    
        	try{
        	    Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance();
        	    Connection con1=null;
        	   
        	    con1=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh");	
        	    PreparedStatement ps=con1.prepareStatement("delete from TEMP");
            	    int n=ps.executeUpdate();
        			if(n>0)
        				{
        				//response.sendRedirect("index.jsp");
        				}
        			else
        				{
        				//response.sendRedirect("Error.jsp");
        				}
        				
        	    ps.close();
        	    con1.close();
        	    }

        	catch(Exception ex){
        	    out.println(ex);
        	}
    
      out.write("\r\n");
      out.write("       \r\n");
      out.write("       ");


try {
	Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,Font.BOLD);
	Font catFont1 = new Font(Font.FontFamily.TIMES_ROMAN, 15,Font.UNDERLINE);
	Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,Font.BOLD);

	OutputStream file = new FileOutputStream(new File("C:\\Uploaded Images\\Invoice.pdf"));
	
	Document document = new Document();
	PdfWriter.getInstance(document, file);

	document.open();
	
    	document.addTitle("Ideal Books Store Invoice");
	    document.addSubject("Invoice");
	    document.addKeywords("Total, Quantity, Cost");
	    document.addAuthor("Ideal Books Store");
	    document.addCreator("Admin");
	    
	    Paragraph preface = new Paragraph();
	    
		  preface.add(new Paragraph(" "));
	    
		      preface = new Paragraph("IDEAL BOOKS STORE",catFont);
		      preface.setAlignment(Element.ALIGN_CENTER);
		      
		      preface.add(new Paragraph(" "));
			  preface.add(new Paragraph(" "));
		      document.add(preface);

		      preface = new Paragraph("Invoice",catFont1);
		      preface.setAlignment(Element.ALIGN_CENTER);
		      
		      preface.add(new Paragraph(" "));
		      document.add(preface);
		      
		      preface= new Paragraph("Report generated on: " + new Date(), smallBold);
		      preface.setAlignment(Element.ALIGN_RIGHT);
		      
		      preface.add(new Paragraph(" "));
		      
		      document.add(preface);
		      
		      preface = new Paragraph("Order Id   : "+order_id);
		      preface.setAlignment(Element.ALIGN_LEFT);
		      preface.setIndentationLeft(50);
		      document.add(preface);

		      preface = new Paragraph("Username   : " +session.getAttribute("username").toString());
		      preface.setAlignment(Element.ALIGN_LEFT);
		      preface.setIndentationLeft(50);
		      document.add(preface);

		      preface = new Paragraph("Email Id   : "+email);
		      preface.setAlignment(Element.ALIGN_LEFT);
		      preface.setIndentationLeft(50);
		      document.add(preface);

		      preface = new Paragraph("Ordered on : "+sqlDate);
		      preface.setAlignment(Element.ALIGN_LEFT);
		      preface.setIndentationLeft(50);
		      document.add(preface);

		      preface = new Paragraph(" ");
		      preface.setAlignment(Element.ALIGN_LEFT);
		      preface.setIndentationLeft(50);
			  
		      PdfPTable table = new PdfPTable(4);
		      PdfPCell c1 = new PdfPCell(new Phrase("Book Name"));
		      c1.setHorizontalAlignment(Element.ALIGN_CENTER);
		      table.addCell(c1);

		      c1 = new PdfPCell(new Phrase("Quantity"));
		      c1.setHorizontalAlignment(Element.ALIGN_CENTER);
		      table.addCell(c1);

		      c1 = new PdfPCell(new Phrase("Cost"));
		      c1.setHorizontalAlignment(Element.ALIGN_CENTER);
		      table.addCell(c1);

		      c1 = new PdfPCell(new Phrase("Total"));
		      c1.setHorizontalAlignment(Element.ALIGN_CENTER);
		      table.addCell(c1);

		      int count=0;
		      
		      while(cost[count]!=0)
		    	  count++;
		      
		      table.setHeaderRows(1);
              float total=0;
              
		      for(int i=0;i<count;i++)
		      {
				    table.addCell(bookname[i]);
				    table.addCell(Float.toString(quantity[i]));
				    table.addCell(Float.toString(cost[i]));
				    total=total + (quantity[i]*cost[i]);
				    table.addCell(Float.toString(quantity[i]*cost[i]));
			
		      }
		      
			    table.addCell("Total");
			    table.addCell("");
			    table.addCell("");
			    table.addCell(Float.toString(total));

			    table.addCell("Discounted Total");
			    table.addCell("");
			    table.addCell("");
			    table.addCell(Float.toString(totalcost));

			    preface.add(table);
			    
			      preface.add(new Paragraph(" "));
			      preface.add(new Paragraph(" "));
			      
			      preface.add(new Paragraph(" Your products will be delivered in 3-7 business days.",smallBold));
			      preface.add(new Paragraph(" For any enquiry, visit our website.",smallBold));

			      preface.add(new Paragraph(" "));
			      preface.add(new Paragraph(" "));

			      preface.add(new Paragraph("Thank You.",smallBold));
			      preface.setAlignment(Element.ALIGN_CENTER);
			      document.add(preface);
		      
		      document.close();
		  	  file.close();
	
			      
		  	  
		  	  
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

		      String SUBJECT = "Invoice";

		      String TEXT ="Your invoice is attached.\n\nThank you; ";
		      
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

		            String filename = "C:/Uploaded Images/Invoice.pdf";
		            DataSource source = new FileDataSource(filename);
		            message.setDataHandler(new DataHandler(source));
		            message.setFileName(filename);

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

} catch (Exception e) {

	e.printStackTrace();
}


      out.write("\r\n");
      out.write("\r\n");
      out.write("       \r\n");
      out.write("       \r\n");
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
