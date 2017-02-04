<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="Error.jsp"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<%@ page import="org.apache.commons.fileupload.servlet.ServletFileUpload" %>
<%@ page import="org.apache.commons.fileupload.disk.DiskFileItemFactory" %>
<%@ page import="org.apache.commons.fileupload.*" %>
<%
int check=0;
String emp_name = "";
String itemName = "";
int count1 = 0;

boolean isMultipart = ServletFileUpload.isMultipartContent(request);
if (!isMultipart) {
} else {
FileItemFactory factory = new DiskFileItemFactory();
ServletFileUpload upload = new ServletFileUpload(factory);
List items = null;
try {
items = upload.parseRequest(request);
} catch (FileUploadException e) {
e.printStackTrace();
}
Iterator itr = items.iterator();
while (itr.hasNext()) {
FileItem item = (FileItem) itr.next();
if (item.isFormField()) {
	String name = item.getFieldName();
	String value = item.getString();
	if (name.equals("emp_name")) {
	emp_name = value;
	count1 = 1;
}
} else {
try {
itemName = item.getName();
File savedFile = new File("C:/Uploaded Images/" + itemName);
item.write(savedFile);
if (count1 == 1) {
out.println("<tr><td align=’left’><b>Name:</td><td><b>" + emp_name);
}
}
catch (Exception e) {
e.printStackTrace();
}
}
}
}

try{
    Connection con1=null;
    Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance();
    con1=DriverManager.getConnection("jdbc:db2://localhost:50000/BOOKS","Rakesh","Rakesh");	
    PreparedStatement ps=con1.prepareStatement("insert into ADVERTISEMENT (TITLE,IMAGEURL) values (?,?)");
		ps.setString(1,emp_name);
		ps.setString(2,itemName);
    int n=ps.executeUpdate();
		if(n>0)
			response.sendRedirect("viewads.jsp");
		else
			response.sendRedirect("Error.jsp");
    ps.close();
    con1.close();
    }

catch(Exception ex){
    out.println(ex);
}
%>

</body>
</html>
