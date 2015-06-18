<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
    <%@ page import = "com.opensymphony.xwork2.ActionContext" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" rel="stylesheet" href="main.css" />
<title>Merci de patienter....</title>
 
 </head>
 <script type="text/javascript">
 <% 
 String clock =(String) ActionContext.getContext().getSession().get("time");
 %>
    var timeoutHandle = null;
    var timeout = <%=clock%>;
    function startTimer() {
        if (timeout <= 0) {
           document.forms['formulaire'].submit();
        } else  {
            document.getElementById('sessionTimer').innerHTML = '<h1>'+'La série commencera dans ' + timeout  + ' secondes'+'<h1>';
        }
        timeout=timeout -1;
        timeoutHandle = setTimeout(function () { startTimer();}, '1000');
    }
    function refreshTimer() {
        killTimer(timeoutHandle);
    }
  </script>
 <body onload="startTimer()">
  <div id="sessionTimer" style="margin-left: 30%;margin-top: 20%;"></div>
  <div style="display: none;">
  <s:form action="AfficherQuestionAction" name="formulaire">
  <s:submit id="submitButton"/>
  </s:form>
  </div>
 </body>

</html>