<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
Object c=session.getAttribute("username");
if(c!=null)
{
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>      
        <br/><br/><br/><br/><br/>
        <center>
            <h2>
            <%
            String a=session.getAttribute("username").toString();
            String b=session.getAttribute("password").toString();
            out.println("Hello  "+a+" "+b);
            %>
            </h2>
            <br/>
            <br/>
            <br/><br/><br/><br/><br/>
        <a href="Logout.jsp" >Logout</a>
        </center>
 
    </body>
</html>
<%
}
else
{
out.println("Please Login");
}
%>