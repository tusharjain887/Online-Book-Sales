<html>
<head>
<title>Pay through PayPal: www.TestAccount.com</title>
</head>
<body onload="document.forms['paypalForm'].submit();">
<form name="paypalForm" action="https://www.sandbox.paypal.com/cgi-bin/webscr" method="post">
 <input type="hidden" name="cmd" value="_xclick" />
 <input type="hidden" name="business" value="chilukarakesh123@gmail.com" />
 <input type="hidden" name="password" value="Rakesh@chiluka" />
 <input type="hidden" name="custom" value="1123" />
 <input type="hidden" name="item_name" value="Computer-Laptop" />
 <input type="hidden" name="amount" value="5"/>
 <input type="hidden" name="rm" value="1" />
 <input type="hidden" name="return" value="paypalResponse.jsp" />
 <input type="hidden" name="cancel_return" value="paypalResponseCancel.jsp" />
 <input type="hidden" name="cert_id" value="AcSr4KhHI52ShCTg1rayL8HkXhkHAB5JJfIAAgG.r10f4AQeJb9bSkoM" />
</form>
</body>
</html>