package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.*;
import java.lang.*;

public final class addbooks_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Add Books</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function formValidation()\r\n");
      out.write("{\r\n");
      out.write("\tvar bookid = document.myForm.bookid;\r\n");
      out.write("\tvar bookname = document.myForm.bookname;\r\n");
      out.write("\tvar bookprice = document.myForm.bookprice;\r\n");
      out.write("\tvar edition = document.myForm.edition;\r\n");
      out.write("\tvar isbn = document.myForm.isbn;\r\n");
      out.write("\tvar rating = document.myForm.rating;\r\n");
      out.write("\tvar description = document.myForm.description;\r\n");
      out.write("\tvar catid = document.myForm.catid;\r\n");
      out.write("\tvar author = document.myForm.author;\r\n");
      out.write("\tvar quantity = document.myForm.quantity;\r\n");
      out.write("\tvar offer = document.myForm.offer;\r\n");
      out.write("\t\r\n");
      out.write("\tvar alphanum = /^[0-9a-zA-Z]+$/;\r\n");
      out.write("\tif (bookid.value.length == 0)\r\n");
      out.write("\t{\r\n");
      out.write("\talert('Please enter Book ID !');\r\n");
      out.write("\tbookid.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\telse if ((!bookid.value.match(alphanum)))\r\n");
      out.write("\t{\r\n");
      out.write("\talert('Book ID must have alphanumeric characters only.');\r\n");
      out.write("\tbookid.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tif(bookname.value.length==0)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\talert('Please enter Book name !');\r\n");
      out.write("\t\tbookname.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\tvar numbers = /^[0-9]+$/;\r\n");
      out.write("\tif(bookprice.value.length==0)\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert('Please enter book price !');\r\n");
      out.write("\t\tbookprice.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\telse if(!bookprice.value.match(numbers))\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert('Book price must have numeric characters only.');\r\n");
      out.write("\t\tbookprice.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tif(edition.value.length==0)\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert('Please enter Edition !');\r\n");
      out.write("\t\tedition.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\telse if(!edition.value.match(numbers))\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert('Edition must have numeric characters only.');\r\n");
      out.write("\t\tedition.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif(isbn.value.length==0)\r\n");
      out.write("\t{\r\n");
      out.write("\talert('Please enter ISBN !');\r\n");
      out.write("\tisbn.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tif(rating.value.length==0)\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert('Please enter Rating !');\r\n");
      out.write("\t\trating.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\telse if(!rating.value.match(numbers))\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert('Rating must have numeric characters only.');\r\n");
      out.write("\t\trating.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tif(description.value.length==0)\r\n");
      out.write("\t{\r\n");
      out.write("\talert('Please enter description !');\r\n");
      out.write("\tdescription.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tif(catid.value.length==0)\r\n");
      out.write("\t{\r\n");
      out.write("\talert('Please enter catid !');\r\n");
      out.write("\tcatid.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tif(author.value.length==0)\r\n");
      out.write("\t{\r\n");
      out.write("\talert('Please enter author !');\r\n");
      out.write("\tauthor.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tif(quantity.value.length==0)\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert('Please enter quantity !');\r\n");
      out.write("\t\tquantity.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\telse if(!quantity.value.match(numbers))\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert('quantity must have numeric characters only.');\r\n");
      out.write("\t\tquantity.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif(offer.value.length==0)\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert('Please enter offer !');\r\n");
      out.write("\t\toffer.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\telse if(!offer.value.match(numbers))\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert('offer must have numeric characters only.');\r\n");
      out.write("\t\toffer.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\treturn true;\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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
      out.write("</br>\r\n");
      out.write("<div class=\"center_title_bar\">Add Books</div>\r\n");
      out.write("      <form name=\"myForm\" action=\"confirmaddbook.jsp\" method=\"post\" onsubmit=\"return formValidation()\">   \r\n");
      out.write("<table>\r\n");
      out.write("<pre><h3>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Book Id        : </td>\r\n");
      out.write("<td><input type=text name=\"bookid\" size=15></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Book Name         : </td>\r\n");
      out.write("<td><input type=text name=\"bookname\" size=15></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Book Price               :</td>\r\n");
      out.write("<td><input type=text name=\"bookprice\" size=15></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Edition               :</td>\r\n");
      out.write("<td><input type=text name=\"edition\" size=15></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>ISBN               :</td>\r\n");
      out.write("<td><input type=text name=\"isbn\" size=15></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Rating             :</td>\r\n");
      out.write("<td><input type=text name=\"rating\" size=15></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Description               :</td>\r\n");
      out.write("<td><input type=text name=\"description\" size=15></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Category Id       : </td>\r\n");
      out.write("<td><input type=text name=\"catid\" size=15></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Author       : </td>\r\n");
      out.write("<td><input type=text name=\"author\" size=15></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Quantity       : </td>\r\n");
      out.write("<td><input type=text name=\"quantity\" size=15></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Offer       : </td>\r\n");
      out.write("<td><input type=text name=\"offer\" size=15></td>\r\n");
      out.write("</tr>\r\n");
      out.write("</h3></pre>\r\n");
      out.write("</table>\r\n");
      out.write("<br><br>\r\n");
      out.write("\r\n");
      out.write("<input type=submit value=\"submit\">\r\n");
      out.write("<input type=reset value=\"reset\">\r\n");
      out.write("</center>\r\n");
      out.write("</form>\r\n");
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
