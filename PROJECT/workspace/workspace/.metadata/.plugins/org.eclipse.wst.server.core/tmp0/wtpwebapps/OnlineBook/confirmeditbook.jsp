<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<%
String bookid = request.getParameter("bookid");
String bookname = request.getParameter("bookname");
String isbn = request.getParameter("isbn");
String catid = request.getParameter("catid");
int price = Integer.parseInt(request.getParameter("bookprice"));
int edition = Integer.parseInt(request.getParameter("edition"));
int rating = Integer.parseInt(request.getParameter("rating"));
String des = request.getParameter("description");
String author = request.getParameter("author");
int offer = Integer.parseInt(request.getParameter("offer"));
int quantity = Integer.parseInt(request.getParameter("quantity"));
int check=0;
%>
<%
try{
    Connection con1=null;
    Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 
    con1=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh");
    PreparedStatement ps=con1.prepareStatement("update BOOKS set BOOK_ID=?,BOOK_NAME=?,BOOKPRICE=?,EDITION=?,ISBN=?,RATING=?,DESCRIPTION=?,CAT_ID=?,QUANTITY=?,AUTHOR=?,OFFER=? where BOOK_ID='"+bookid+"'");
		ps.setString(1,bookid);
		ps.setString(2,bookname);
		ps.setInt(3,price);
		ps.setInt(4,edition);
		ps.setString(5,isbn);
		ps.setInt(6,rating);
		ps.setString(7,des);
		ps.setString(8,catid);
		ps.setInt(11,offer);
		ps.setInt(9,quantity);
		ps.setString(10,author);
    int n=ps.executeUpdate();
		if(n>0)
		   response.sendRedirect("viewbooks.jsp");
		else
			out.println("Not Successful"); 
    ps.close();
    con1.close();
    }

catch(Exception ex){
    out.println(ex);
}
%>