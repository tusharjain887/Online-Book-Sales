<%@include file="paypalfunctions.jsp" %>
<%

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
    
%>