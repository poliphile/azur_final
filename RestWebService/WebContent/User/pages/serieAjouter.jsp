<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
    <%@ page import = "com.opensymphony.xwork2.ActionContext" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" rel="stylesheet" href="main.css" />
<title>Fin de la série</title>
 
 </head>

 <body >
  <div id="sessionTimer" style="margin-left: 30%;margin-top: 20%;"><h1>La série est Ajoutée<h1>
  <s:form action="RedirigerMenu2Action" name="formulaire" >
  <s:submit id="submitButton" value="Menu"/>
  </s:form>
  </div>
  <div>
  
  </div>
 </body>

</html>