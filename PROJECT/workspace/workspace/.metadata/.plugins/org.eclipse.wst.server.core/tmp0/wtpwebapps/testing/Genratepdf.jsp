<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<%@ page import="java.io.FileOutputStream"%>
<%@ page import="java.io.FileOutputStream"%>
<%@ page import="java.io.OutputStream"%>
<%@ page import="java.util.Date"%>
<%@ page import="com.itextpdf.text.Document"%>
<%@ page import="com.itextpdf.text.Paragraph"%>
<%@ page import="com.itextpdf.text.pdf.PdfWriter"%>
<%@ page import="com.itextpdf.*"%>
<%

try {
	OutputStream file = new FileOutputStream(new File("D:\\Test.pdf"));

	Document document = new Document();
	PdfWriter.getInstance(document, file);

	document.open();
	document.add(new Paragraph("Hello World, iText"));
	document.add(new Paragraph(new Date().toString()));

	document.close();
	file.close();

} catch (Exception e) {

	e.printStackTrace();
}

%>

		