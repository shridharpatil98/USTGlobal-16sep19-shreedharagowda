<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
Date date = new Date();
m1();
%>
<%! int i=10;
void m1(){
	System.out.println("i="+i);
}
public void jspInit(){
	System.out.println("this is Init");
}
public void jspDestroy(){
	System.out.println("this is Destroy");
}
%>
<body>
<h1 style="color:red;">Time and Date is<%=date %></h1>
</body>
</html>
