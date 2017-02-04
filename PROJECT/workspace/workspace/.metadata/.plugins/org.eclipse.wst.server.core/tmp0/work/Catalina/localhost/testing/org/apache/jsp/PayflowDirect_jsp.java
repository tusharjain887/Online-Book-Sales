package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.URLDecoder.*;
import java.util.*;
import java.util.HashMap;
import java.util.StringTokenizer.*;
import java.io.*;
import java.net.*;
import javax.net.ssl.*;

public final class PayflowDirect_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    String gv_APIEndpoint;
	String gv_APIUser;
	String gv_APIPassword;
	String gv_APIVendor;
	String gv_APIPartner;
	String gv_BNCode;
	String gv_Env;

	String gv_nvpHeader;
	String gv_ProxyServer;	
	String gv_ProxyServerPort; 
	int gv_Proxy;
	boolean gv_UseProxy;
	String PAYPAL_URL;
	String Env;
        String sessionuuid;

	public HashMap DirectPayment( String paymentType, String paymentAmount, String creditCardType, String creditCardNumber, String expDate, String cvv2, String firstName, String lastName, String street, String city, String state, String zip, String countryCode, String currencyCode, String orderdescription, String IPAddress )
	{
		/* Construct the parameter string that describes the credit card payment */
		String nvpstr = "&TENDER=C";
		if (paymentType.equalsIgnoreCase("Sale"))
		{
			nvpstr = nvpstr + "&TRXTYPE=S";
		}
		else if (paymentType.equalsIgnoreCase("Authorization"))
		{
			nvpstr = nvpstr + "&TRXTYPE=A";
		}
		else /* default to sale */
		{
			nvpstr = nvpstr + "&TRXTYPE=S";
		}

	    /* requires at least Java 5 */
		UUID uid = UUID.randomUUID();
		nvpstr = nvpstr + "&ACCT=" + creditCardNumber + "&EXPDATE=" + expDate +"&CVV2="+ cvv2 + "&ACCTTYPE=" + creditCardType;
		nvpstr = nvpstr + "&AMT=" + paymentAmount + "&CURRENCYCODE=" + currencyCode;
		nvpstr = nvpstr + "&FIRSTNAME=" + firstName + "&LASTNAME=" + lastName + "&STREET=" + street + "&CITY=" + city;
		nvpstr = nvpstr + "&STATE=" + state + "&ZIP=" + zip + "&COUNTRY=" + countryCode;
		nvpstr = nvpstr + "&INVNUM=" + uid.toString() + "&ORDERDESC=" + orderdescription+"&ITEMAMT="+ paymentAmount;
		nvpstr = nvpstr + "&VERBOSITY=HIGH";
        nvpstr = nvpstr + "&Email=test@test.com&Ponum="+uid.toString()+"&PhoneNum=6365414705";
                
		/*
		'-------------------------------------------------------------------------------------------
		' Make the call to Payflow to finalize payment
		' If an error occured, show the resulting errors
		'-------------------------------------------------------------------------------------------
		*/
 		HashMap nvp = httpcall(nvpstr,uid.toString());
 		return nvp;
	}
	
	
	/* ********************************************************************************
	  * httpcall: Function to perform the Payflow call
	  * 	@nvpStr is nvp string.
	  * returns a NVP string containing the response from the server.
	******************************************************************************** */
	public HashMap httpcall( String nvpStr, String unique_id )
	{

		String agent = "Mozilla/4.0";
		String respText = "";
		HashMap nvp = null;

		String encodedData = "PWD=" + gv_APIPassword + "&USER=" + gv_APIUser + "&VENDOR=" + gv_APIVendor + "&PARTNER=" + gv_APIPartner + nvpStr + "&BUTTONSOURCE=" + gv_BNCode;

		try 
		{
			URL postURL = new URL( gv_APIEndpoint );
			HttpURLConnection conn = (HttpURLConnection)postURL.openConnection();

			// Set connection parameters. We need to perform input and output, 
	        // so set both as true. 
			conn.setDoInput (true);
			conn.setDoOutput (true);

			// Set the content type we are POSTing.
			conn.setRequestProperty("Content-Type", "text/namevalue");
			conn.setRequestProperty("User-Agent", agent );

			conn.setRequestProperty("Content-Length", String.valueOf(encodedData.length()));
			conn.setRequestMethod("POST");

			// set the host header
			if (gv_Env == "pilot") 
			{
				conn.setRequestProperty("Host", "pilot-payflowpro.paypal.com");
			}
			else
			{
				conn.setRequestProperty("Host", "payflowpro.paypal.com");
			}

			conn.setRequestProperty("X-VPS-CLIENT-TIMEOUT", "45");
			conn.setRequestProperty("X-VPS-REQUEST-ID", unique_id);
				
	        // get the output stream to POST to. 
			DataOutputStream output = new DataOutputStream(conn.getOutputStream());
			output.writeBytes( encodedData );
			output.flush();
	        output.close();
			
			// Read input from the input stream.
			DataInputStream  in = new DataInputStream(conn.getInputStream()); 
	    	int rc = conn.getResponseCode();
			if ( rc != -1)
			{
				BufferedReader is = new BufferedReader(new InputStreamReader( conn.getInputStream()));
				String _line = null;
				while(((_line = is.readLine()) !=null))
				{
					respText = respText + _line;
				}			
				nvp = deformatNVP( respText );
			}
			return nvp;
		}
		catch( IOException e )
		{
			// handle the error here
			return null;
		}
                
	}
	
	/* ********************************************************************************
	  * deformatNVP: Function to break the NVP string into a HashMap
	  * 	pPayLoad is the NVP string.
	  * returns a HashMap object containing all the name value pairs of the string.
	******************************************************************************** */
	public HashMap deformatNVP( String pPayload )
	{
		HashMap nvp = new HashMap(); 
		StringTokenizer stTok = new StringTokenizer( pPayload, "&");
		while (stTok.hasMoreTokens())
		{
			StringTokenizer stInternalTokenizer = new StringTokenizer( stTok.nextToken(), "=");
			if (stInternalTokenizer.countTokens() == 2)
			{
				String key = URLDecoder.decode( stInternalTokenizer.nextToken());
				String value = URLDecoder.decode( stInternalTokenizer.nextToken());
				nvp.put( key.toUpperCase(), value );
			}
		}
		return nvp;
	}
	
        

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.List<java.lang.String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<java.lang.String>(1);
    _jspx_dependants.add("/paypalfunctions.jsp");
  }

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
      response.setContentType("text/html;charset=windows-1252");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\"/>\r\n");
      out.write("    <title>paypalfunctions</title>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");

	/*
	'------------------------------------
	' Payflow Credentials 
	'------------------------------------
	*/

	gv_APIUser	="chilukarakesh123-facilitator_api1.gmail.com";
	gv_APIPassword	="1364979517";
	gv_APIVendor = "chilukarakesh123-facilitator_api1.gmail.com";
	gv_APIPartner = "PayPal";
	gv_Env = "pilot";
		
	if (gv_Env == "pilot")
	{
		gv_APIEndpoint = "https://pilot-payflowpro.paypal.com";
		PAYPAL_URL = "https://www.sandbox.paypal.com/cgi-bin/webscr?cmd=_express-checkout&token=";
	}
	else
	{
		gv_APIEndpoint = "https://payflowpro.paypal.com";
		PAYPAL_URL = "https://www.paypal.com/cgi-bin/webscr?cmd=_express-checkout&token=";
	} 

	String HTTPREQUEST_PROXYSETTING_SERVER = "";
	String HTTPREQUEST_PROXYSETTING_PORT = "";
	boolean USE_PROXY = false;
	
	//WinObjHttp Request proxy settings.
	gv_ProxyServer	= HTTPREQUEST_PROXYSETTING_SERVER;
	gv_ProxyServerPort = HTTPREQUEST_PROXYSETTING_PORT;
	gv_Proxy		= 2;	//'setting for proxy activation
	gv_UseProxy		= USE_PROXY;

	

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');


String PaymentOption = "Visa";//request.getParameter("CreditCardType");
 if (((PaymentOption=="Visa")||(PaymentOption=="MasterCard")||(PaymentOption=="Discover")||(PaymentOption=="AmEx")))
 {
 
	/*		
	'------------------------------------
	' The paymentAmount is the total value of 
	' the shopping cart, that was set 
	' earlier in a session variable 
	' by the shopping cart page
	'------------------------------------
	*/
	String paymentAmount = "500";//(String)session.getAttribute("Payment_Amount");

	/*
	'------------------------------------
	' The paymentType that was selected earlier 
	'------------------------------------
	*/
	String paymentType = "Sale";
        //String paymentType = "Authorization";
	
	/*
	' Set these values based on what was selected by the user on the Billing page Html form
	*/
	
	String creditCardType = "Visa";//request.getParameter("CreditCardType");
	String creditCardNumber	= "xxxxxxxxxxxxxx122";//request.getParameter("CreditCardNumber");
	String expDate = "1212";//request.getParameter("expDate");
	String cvv2 = "122";//request.getParameter("CVV"); 			
	String firstName = "Pavana";//request.getParameter("FirstName"); 		
	String lastName = "D";//request.getParameter("LastName"); 		
	String street = "7700 Eastport Pkwy";//request.getParameter("Street");			
	String city = "La Vista";//request.getParameter("City");			
	String state = "NE";//request.getParameter("State");			
	String zip = "68128";//request.getParameter("Zip"); 			
	String countryCode = "US";//request.getParameter("Country");		
	String currencyCode = "USD";//request.getParameter("Currency");		
	String orderDesc = "test order";
    String IPAddress = request.getRemoteAddr();
	
	/*	
	'------------------------------------------------
	' Calls the DoDirectPayment API call
	'
	' The DirectPayment function is defined in PayPalFunctions.jsp 
	' included at the top of this file.
	'-------------------------------------------------
	*/
    
    
	HashMap nvp = DirectPayment ( paymentType, paymentAmount, 
								creditCardType, creditCardNumber, expDate, cvv2, 
								firstName, lastName, street, city, state, zip, countryCode, 
								currencyCode, orderDesc, IPAddress ); 

	String strAck = nvp.get("PNREF").toString();

        out.println("Thank you for your Order!!! Transaction ID: "+ strAck);
    if(strAck ==null || strAck.equalsIgnoreCase("Success") || strAck.equalsIgnoreCase("SuccessWithWarning") )
	{
		// Display a user friendly Error on the page using any of the following error information returned by PayPal
		String ErrorCode = nvp.get("L_ERRORCODE0").toString();
		String ErrorShortMsg = nvp.get("L_SHORTMESSAGE0").toString();
		String ErrorLongMsg = nvp.get("L_LONGMESSAGE0").toString();
		String ErrorSeverityCode = nvp.get("L_SEVERITYCODE0").toString();
	}
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
