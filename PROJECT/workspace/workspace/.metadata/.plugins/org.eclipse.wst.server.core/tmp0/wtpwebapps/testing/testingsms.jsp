<%@ page import="java.net.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<%

try{
	
	 String _userName   = "8976358948";
	 String _password   = "1521329";
	 String _url        = "http://madsmsapi.tk/smsapi.php";
	 String charset     = "UTF-8";
     String testPhoneNo = "8976358948";
     String testMessage = "test";
     
     
     String [] params = new String [5];

     params[0] = _userName;

     params[1] = _password;

     params[2] = testMessage;

     params[3] = testPhoneNo;

     params[4] = "site2sms";

     String query = String.format("usr=%s&amp;amp;pwd=%s&amp;amp;mes=%s&amp;amp;to=%s&amp;amp;site=%s",

     URLEncoder.encode(params[0],charset),

     URLEncoder.encode(params[1],charset),

     URLEncoder.encode(params[2],charset),

     URLEncoder.encode(params[3],charset),

     URLEncoder.encode(params[4],charset)
     );
     URLConnection connection = new URL(_url + "?" + query).openConnection();

     connection.setRequestProperty("Accept-Charset", charset);

     //This automatically fires the request and we can use it to determine the response status

     InputStream res = connection.getInputStream();

     BufferedReader br = new BufferedReader(new InputStreamReader(res));

     System.out.println(br.readLine());
	
}
catch(Exception e)
{
	e.printStackTrace();
}
%>