<%@page import="mywebapp.java.main.persistance.daoimpl.SerieDAOImpl"%>
<%@ page import = "java.io.*" %>
<%@ page import = "javax.persistence.EntityManager" %>
<%@ page import = "javax.persistence.EntityManagerFactory" %>
<%@ page import = "javax.persistence.Persistence" %>
<%@ page import = "javax.persistence.Query" %>
<%@ page import = "mywebapp.java.main.persistance.object.QuestionDO" %>
<%
 String temps = request.getParameter("time");
String numQuestion = request.getParameter("numQuestion");
String numSerie = request.getParameter("numSerie");
int timeToWait = Integer.parseInt(temps);
while(timeToWait > 0){
	Thread.sleep(1000);
	timeToWait = timeToWait -1;
}

final SerieDAOImpl dao = new SerieDAOImpl();
QuestionDO question = dao.recupererQuestionDO(numSerie, Integer.parseInt(numQuestion));
request.setAttribute("enonce", question.getEnonce());
request.setAttribute("image", question.getImage());
request.setAttribute("numQuestion", question.getId());
request.setAttribute("numSerie", numSerie);

request.getRequestDispatcher("affichageQuestion.jsp").forward(request, response);

  
%>