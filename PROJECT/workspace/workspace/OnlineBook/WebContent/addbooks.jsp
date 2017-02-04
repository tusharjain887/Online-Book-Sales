<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Books</title>
</head>

<script type="text/javascript">
function formValidation()
{
	var bookid = document.myForm.bookid;
	var bookname = document.myForm.bookname;
	var bookprice = document.myForm.bookprice;
	var edition = document.myForm.edition;
	var isbn = document.myForm.isbn;
	var rating = document.myForm.rating;
	var description = document.myForm.description;
	var catid = document.myForm.catid;
	var author = document.myForm.author;
	var quantity = document.myForm.quantity;
	var offer = document.myForm.offer;
	
	var alphanum = /^[0-9a-zA-Z]+$/;
	if (bookid.value.length == 0)
	{
	alert('Please enter Book ID !');
	bookid.focus();
	return false;
	}
	else if ((!bookid.value.match(alphanum)))
	{
	alert('Book ID must have alphanumeric characters only.');
	bookid.focus();
	return false;
	}

	if(bookname.value.length==0)
		{
		alert('Please enter Book name !');
		bookname.focus();
		return false;
		}
	
	var numbers = /^[0-9]+$/;
	if(bookprice.value.length==0)
	{
		alert('Please enter book price !');
		bookprice.focus();
		return false;
	}
	else if(!bookprice.value.match(numbers))
	{
		alert('Book price must have numeric characters only.');
		bookprice.focus();
		return false;
	}

	if(edition.value.length==0)
	{
		alert('Please enter Edition !');
		edition.focus();
		return false;
	}
	else if(!edition.value.match(numbers))
	{
		alert('Edition must have numeric characters only.');
		edition.focus();
		return false;
	}
	
	if(isbn.value.length==0)
	{
	alert('Please enter ISBN !');
	isbn.focus();
	return false;
	}

	if(rating.value.length==0)
	{
		alert('Please enter Rating !');
		rating.focus();
		return false;
	}
	else if(!rating.value.match(numbers))
	{
		alert('Rating must have numeric characters only.');
		rating.focus();
		return false;
	}

	if(description.value.length==0)
	{
	alert('Please enter description !');
	description.focus();
	return false;
	}

	if(catid.value.length==0)
	{
	alert('Please enter catid !');
	catid.focus();
	return false;
	}


	if(author.value.length==0)
	{
	alert('Please enter author !');
	author.focus();
	return false;
	}

	if(quantity.value.length==0)
	{
		alert('Please enter quantity !');
		quantity.focus();
		return false;
	}
	else if(!quantity.value.match(numbers))
	{
		alert('quantity must have numeric characters only.');
		quantity.focus();
		return false;
	}
	
	if(offer.value.length==0)
	{
		alert('Please enter offer !');
		offer.focus();
		return false;
	}
	else if(!offer.value.match(numbers))
	{
		alert('offer must have numeric characters only.');
		offer.focus();
		return false;
	}

	return true;
}
</script>

<body>
  <div style="float:right;font-size:14px;">
 <%  Object c=session.getAttribute("admin");
if(c!=null)
	{
	out.print("Welcome  " +session.getAttribute("admin").toString());
	out.print(" ,  <a href='logout.jsp'>Logout</a>");
	%>
	</div>
<br><br><br><br><br><center>
<a href="adminhome.jsp">Go To Home</a>
<center>
</br>
<div class="center_title_bar">Add Books</div>
      <form name="myForm" action="confirmaddbook.jsp" method="post" onsubmit="return formValidation()">   
<table>
<pre><h3>
<tr>
<td>Book Id        : </td>
<td><input type=text name="bookid" size=15></td>
</tr>
<tr>
<td>Book Name         : </td>
<td><input type=text name="bookname" size=15></td>
</tr>
<tr>
<td>Book Price               :</td>
<td><input type=text name="bookprice" size=15></td>
</tr>
<tr>
<td>Edition               :</td>
<td><input type=text name="edition" size=15></td>
</tr>
<tr>
<td>ISBN               :</td>
<td><input type=text name="isbn" size=15></td>
</tr>
<tr>
<td>Rating             :</td>
<td><input type=text name="rating" size=15></td>
</tr>
<tr>
<td>Description               :</td>
<td><input type=text name="description" size=15></td>
</tr>
<tr>
<td>Category Id       : </td>
<td><input type=text name="catid" size=15></td>
</tr>
<tr>
<td>Author       : </td>
<td><input type=text name="author" size=15></td>
</tr>
<tr>
<td>Quantity       : </td>
<td><input type=text name="quantity" size=15></td>
</tr>
<tr>
<td>Offer       : </td>
<td><input type=text name="offer" size=15></td>
</tr>
</h3></pre>
</table>
<br><br>

<input type=submit value="submit">
<input type=reset value="reset">
</center>
</form>
</body>
</html>
<%
}
else
{
out.println("Please Login");
}
%>