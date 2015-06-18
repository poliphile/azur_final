<%@ page import = "java.io.*" %>
<%@ page import = "javax.persistence.EntityManager" %>
<%@ page import = "javax.persistence.EntityManagerFactory" %>
<%@ page import = "javax.persistence.Persistence" %>
<%@ page import = "javax.persistence.Query" %>
<%
  String iNumPhoto = (String)request.getParameter("idQuestion");
  String numSerie = (String)request.getParameter("idSerie");
 
    try
    { 
    	final EntityManagerFactory emF = new Persistence()
		.createEntityManagerFactory("my-pu");
		final EntityManager em = emF.createEntityManager();
    	final StringBuilder queryBuilder = new StringBuilder();
    	queryBuilder
		.append("SELECT question.IMAGE ");
		queryBuilder.append("FROM question WHERE question.ID = '" + Integer.parseInt(iNumPhoto)
				+ "' AND question.ID_SERIE = '" + Integer.parseInt(numSerie) + "'");
		final Query query = em.createNativeQuery(queryBuilder.toString());
		final byte[] results = (byte[]) query.getSingleResult();
       // get the image from the database
       byte[] imgData = results; 
       // display the image
       response.setContentType("image/jpeg");
       OutputStream o = response.getOutputStream();
       o.write(imgData);
       o.flush();
       o.close();
    }
    catch (Exception e)
    {
      e.printStackTrace();
      throw e;
    }
    finally
    {
      
    } 
  
%>