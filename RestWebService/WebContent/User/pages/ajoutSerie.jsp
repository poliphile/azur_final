<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>

<body>
<form action="AjoutQuestionAction" enctype="multipart/form-data" method="POST">
<table>
<tr align="right">
<td>
<p><s:textfield name="numeroSerie" label="Numéro de la série" readonly="true" value="%{#attr['numeroSerie']}"/></p>
</td></tr>
<tr align="right"><td>
<p><s:file name="upload" label="Image"/></p>
</td></tr>
<tr align="right">
<td>
<p><s:textfield id="temps" label="Temps pour répondre" name="temps"/></p>
</td></tr>
<tr align="right">
<td>
<p><s:textfield id="numeroQuestion" label="Numéro de la question" name="numeroQuestion" readonly="true" value="%{#attr['numeroQuestion']}"/></p>
</td></tr>
<tr align="right"><td>
<p><s:checkbox id="checkBoxDouble" name="isDouble" label="Question en deux partie" labelposition="left" onclick="affiche_bloc(checkBoxDouble)"/></p>
</td></tr>
</table>
 <div id="questionSimple" style="display: block;">
 <table>
 <tr align="right"><td>
<p><s:textarea name="enonce1" label="Enoncé de la question" cols="40" rows="10"/></p>
</td></tr>
<tr align="right"><td>
<p><s:textfield name="reponseA" label="A "/></p>
<s:checkbox  name="reponse1" fieldValue="A"/>
</td></tr>
<tr align="right"><td>
<p><s:textfield name="reponseB" label="B "></s:textfield></p>
<s:checkbox  name="reponse1" fieldValue="B"/>
</td></tr>
<tr align="right"><td>
<p><s:textfield name="reponseC" label="C "></s:textfield></p>
<s:checkbox  name="reponse1" fieldValue="C"/>
</td></tr>
<tr align="right"><td>
<p><s:textfield name="reponseD" label="D "></s:textfield></p>
<s:checkbox  name="reponse1" fieldValue="D"/>
</td></tr>
<tr align="center"><td>
<s:submit value="Ajouter"/>
</td></tr>
</table>
</div> 
<div id="questionDouble" style="display: none;">
<table>
<tr align="right"><td>
<p><s:textarea name="enonce1" label="Enoncé de la question" cols="40" rows="10"/></p>
</td></tr>
<tr align="right"><td>
<p><s:textfield name="reponseA" label="A "/></p>
<s:checkbox  name="reponse1" fieldValue="A"/>
</td></tr>
<tr align="right"><td>
<p><s:textfield name="reponseB" label="B "></s:textfield></p>
<s:checkbox  name="reponse1" fieldValue="B"/>
</td></tr>
<tr align="right"><td>
<p><s:textarea name="enonce2" label="Enoncé de la question" cols="40" rows="10"/></p>
</td></tr>
<tr align="right"><td>
<p><s:textfield name="reponseC" label="C "></s:textfield></p>
<s:checkbox  name="reponse2" fieldValue="C"/>
</td></tr>
<tr align="right"><td>
<p><s:textfield name="reponseD" label="D "></s:textfield></p>
<s:checkbox  name="reponse2" fieldValue="D"/>
</td></tr>
<tr align="center"><td>
<s:submit value="Ajouter"/>

</td></tr>
</table>
</div> 


</form>
<s:form action="RedirigerMenuAction"> 
<s:submit value="Retour menu"/>
</s:form>
<script type="text/javascript">
function affiche_bloc(CheckBox) {
    if (CheckBox.checked)
    {
        document.getElementById("questionDouble").style.display="block";
        document.getElementById("questionSimple").style.display="none";
    }
    
    else
    {
    	document.getElementById("questionDouble").style.display="none";
        document.getElementById("questionSimple").style.display="block";
    }
}
</script>
</body>

</html>