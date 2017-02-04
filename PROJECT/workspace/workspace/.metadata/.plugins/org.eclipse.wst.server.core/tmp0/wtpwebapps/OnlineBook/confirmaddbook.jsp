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
    PreparedStatement ps=con1.prepareStatement("insert into BOOKS values(?,?,?,?,?,?,?,?,?,?,?,?)");
		ps.setString(1,bookid);
		ps.setString(2,bookname);
		ps.setInt(3,price);
		ps.setInt(4,edition);
		ps.setString(5,isbn);
		ps.setInt(6,rating);
		ps.setString(7,null);
		ps.setString(8,des);
		ps.setString(9,catid);
		ps.setInt(12,offer);
		ps.setInt(10,quantity);
		ps.setString(11,author);
    int n=ps.executeUpdate();
		if(n>0)
		   response.sendRedirect("addbookimage.jsp?bookid="+bookid);
		else
			out.println("Not Successful"); 
    ps.close();
    con1.close();
    }

catch(Exception ex){
    out.println(ex);
}
%>