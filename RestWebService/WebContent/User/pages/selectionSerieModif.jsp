<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Menu</title>
<base/>
</head>
<body bgcolor="white">
<s:form action="PreparationModifSerie">
<table border="0" align="center">
<tr>
<td align="right">
<s:select label="Numéro de la série " 
		headerKey="-1" headerValue="Sélectionez une série"
		list="listSerie" 
		name="numSerie" 
		value="0" />
</td>
<tr>
<td align="right">
<s:submit value="Modifier"/>
</td>
</tr>
</table>
</s:form>
</body>

</html>