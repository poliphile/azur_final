<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="margin-left: 40%;"><p><h1>Menu</h1></p></div>
<div style="border: solid 1px;width: 300px;margin-top: 50px;margin-left: 40%;">
<p>Gestion des candidats</p>
<p><a href="<s:url action='AfficherAjoutCandidatAction'/>">Ajout d'un candidat</a></p>
<p><a href="<s:url action='AfficherModifierCandidat'/>">Modifier un candidat</a></p>
<p><a href="#">Récapitulatif des scores</a></p>
</div>
<div style="border: solid 1px;width: 300px;margin-left: 40%;">
<p>Gestion des séries</p>
<p><a href="<s:url action='AfficherLancerSerie'/>">Projeter une série</a></p>
<p><a href="<s:url action='AjoutSerieAction'/>">Ajouter une série</a></p>
<p><a href="<s:url action='ModifierSerie'/>">Modifier une série</a></p>
</div>
</body>

</html>