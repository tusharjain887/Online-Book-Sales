<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<%@ page import="java.net.*"%>
<%


class SmsSender

{

//Replace your way2sms username and password below

static final String _userName = "8976358948";

static final String _password = "1521329";

static final String _url = "http://madsmsapi.tk/smsapi.php";

static final String charset = "UTF-8";

//to build the query string that will send a message

 String buildRequestString(String targetPhoneNo, String message) throws UnsupportedEncodingException

{

String [] params = new String [5];

params[0] = _userName;

params[1] = _password;

params[2] = message;

params[3] = targetPhoneNo;

params[4] = "Site2SMS";

String query = String.format("usr=%s&amp;amp;pwd=%s&amp;amp;mes=%s&amp;amp;to=%s&amp;amp;site=%s",

URLEncoder.encode(params[0],charset),

URLEncoder.encode(params[1],charset),

URLEncoder.encode(params[2],charset),

URLEncoder.encode(params[3],charset),

URLEncoder.encode(params[4],charset)

);

return query;

}

 void sendMessage(String reciever, String message) throws Exception

{

//To establish the connection and perform the post request

URLConnection connection = new URL(_url + "?" + buildRequestString(reciever,message)).openConnection();

connection.setRequestProperty("Accept-Charset", charset);

//This automatically fires the request and we can use it to determine the response status

InputStream response = connection.getInputStream();

BufferedReader br = new BufferedReader(new InputStreamReader(response));

System.out.println(br.readLine());

}

void main(String [] args) throws Exception

{

String testPhoneNo = "8976358948";

String testMessage = "test";

sendMessage(testPhoneNo,testMessage);

}

}


%>