<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">

function validate()
{
	
	var site = encodeURIComponent("Site2SMS");
	var usr =encodeURIComponent("8976358948");
	var pwd = encodeURIComponent("1521329");
	var to = encodeURIComponent($("8976358948"));
            var mes = encodeURIComponent("testing");
            var gui = encodeURIComponent("1");
            
	var dataString = 'site='+ site+ '&usr=' + usr + '&pwd=' + pwd + '&to=' + to+ '&mes=' + mes + '&gui=' + gui;
	
	
	
	window.location = "http://madsmsapi.tk/smsapi.php/"+dataString
	
	return true;
	}



</script>


</head>


<body>

<form method ="post"  action"#" onsubmit="validate()">
<input type="submit" name="submit"/> 

</form>

</body>
</html>