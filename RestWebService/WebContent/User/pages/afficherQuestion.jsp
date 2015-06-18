<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
    <%@ page import = "com.opensymphony.xwork2.ActionContext" %>
        <%@ page import = " mywebapp.java.main.presentation.serie.bean.QuestionDTO" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" rel="stylesheet" href="CSS/main.css" />
<title>Insert title here</title>
</head>

 <script type="text/javascript">
 <% 
	String clock =(String)ActionContext.getContext().getSession().get("time") ;
 %>
    var timeoutHandle = null;
    var timeout = <%=clock%>;
    function startTimer() {
        if (timeout <= 0) {
           document.forms['formulaireQuestionSuivante'].submit();
        } else  {
            document.getElementById('sessionTimer').innerHTML = 'Il reste : ' + timeout  + ' secondes';
        }
        timeout=timeout -1;
        timeoutHandle = setTimeout(function () { startTimer();}, '1000');
    }
    function refreshTimer() {
        killTimer(timeoutHandle);
    }
  </script>
 
<body onload="startTimer()">
 <div id="sessionTimer"></div>
 <div style="float: left;" >
<img alt="" src="data:image/jpg;base64,<%= ((QuestionDTO)ActionContext.getContext().getSession().get("Question")).getBitArrayString()%>" width="700" height="700"/>
</div>
<div id="numQuestion" style="float: right: ;">
<h3>Question <%=((QuestionDTO)ActionContext.getContext().getSession().get("Question")).getNum_question() %></h3>
</div>
<div id="enonce1" style="float: right: ;">
 <s:if test="%{#session.double==1}">
<p><h3><%=((QuestionDTO)ActionContext.getContext().getSession().get("Question")).getEnonce() %></h3></p>
<s:if test="%{#session.Question.getReponseA() != null}">
<p>A : <%=((QuestionDTO)ActionContext.getContext().getSession().get("Question")).getReponseA() %></p>
</s:if>
<s:if test="%{#session.Question.getReponseB() != null}">
<p>B : <%=((QuestionDTO)ActionContext.getContext().getSession().get("Question")).getReponseB() %></p>
</s:if>
<s:if test="%{#session.Question.getEnonce2() != null}">
<p><h3><%=((QuestionDTO)ActionContext.getContext().getSession().get("Question")).getEnonce2() %></h3></p>
</s:if>
<s:if test="%{#session.Question.getReponseC() != null}">
<p>C : <%=((QuestionDTO)ActionContext.getContext().getSession().get("Question")).getReponseC() %></p>
</s:if>
<s:if test="%{#session.Question.getReponseD() != null}">
<p>D : <%=((QuestionDTO)ActionContext.getContext().getSession().get("Question")).getReponseD() %></p>
</s:if>
</s:if>
<s:if test="%{#session.double!=1}">
<p><h3><%=((QuestionDTO)ActionContext.getContext().getSession().get("Question")).getEnonce() %></h3></p>
<s:if test="%{#session.Question.getReponseA() != null}">
<p>A : <%=((QuestionDTO)ActionContext.getContext().getSession().get("Question")).getReponseA() %></p>
</s:if>
<s:if test="%{#session.Question.getReponseB() != null}">
<p>B : <%=((QuestionDTO)ActionContext.getContext().getSession().get("Question")).getReponseB() %></p>
</s:if>
<s:if test="%{#session.Question.getReponseC() != null}">
<p>C : <%=((QuestionDTO)ActionContext.getContext().getSession().get("Question")).getReponseC() %></p>
</s:if>
<s:if test="%{#session.Question.getReponseD() != null}">
<p>D : <%=((QuestionDTO)ActionContext.getContext().getSession().get("Question")).getReponseD() %></p>
</s:if>
 </s:if> 
</div>

<div style="display: none;">
<s:form action="AfficherQuestionSuivanteAction" id="formulaireQuestionSuivante">
<s:submit id="submitButton"/>
</s:form>
</div>
</body>

</html>