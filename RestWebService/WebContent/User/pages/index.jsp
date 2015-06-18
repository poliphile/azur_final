<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head></head>
<body>
<div style="margin-left: 40%;">
	<h1>Application Azur</h1>
 
	<s:form action="LoginAction">
		<s:textfield name="username" label="Login" />
		<s:password name="password" label="Password" />
		<s:submit value="Envoyer"/>
	</s:form>
 </div>
</body>
</html>
