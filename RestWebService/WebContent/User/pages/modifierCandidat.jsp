<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>

<body>
<form action="ModifierCandidatAction" enctype="multipart/form-data" method="POST">
<table>
<tr align="right">
<td>
<p><s:textfield name="id" label="ID " value="%{#attr['utilRetrieve'].id}" readonly="true"/></p>
</td></tr>
<tr align="right">
<td>
<p><s:textfield name="nom" label="Nom " value="%{#attr['utilRetrieve'].nom}"/></p>
</td></tr>
<tr align="right">
<td>
<p><s:textfield  label="Prenom " name="prenom" value="%{#attr['utilRetrieve'].prenom}"/></p>
</td></tr>
<tr align="right">
<td>
<p><s:textfield  label="Login " name="login" value="%{#attr['utilRetrieve'].login}"/></p>
</td></tr>
<tr align="right">
<td>
<p><s:textfield  label="Password  " name="password" value="%{#attr['utilRetrieve'].password}"/></p>
</td></tr>
<tr align="right">
<td>
<p><s:textfield  label="Date de naissance " name="dateNaiss" value="%{#attr['utilRetrieve'].dateNaissance}"/></p>
</td></tr>
<tr align="right">
<td>
<s:submit value="Modifier"/>
</td></tr>
</table>


</form>


</html>