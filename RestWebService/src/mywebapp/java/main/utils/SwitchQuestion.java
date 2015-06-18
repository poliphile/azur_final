/**
 * 
 */
package mywebapp.java.main.utils;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.jsf.FacesContextUtils;

import mywebapp.java.main.persistance.daoimpl.SerieDAOImpl;
import mywebapp.java.main.persistance.object.QuestionDO;

/**
 * @author matthieu
 *
 */
public class SwitchQuestion extends Thread {
	private int timeToWait;
	private HttpServletRequest request;
	private HttpServletResponse response;
	private String numQuestion;
	private String numSerie;
	
	@Override
	public void run(){
		while(timeToWait > 0){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			timeToWait = timeToWait -1;
		}

		final SerieDAOImpl dao = new SerieDAOImpl();
		int numQuestionToGet = Integer.parseInt(numQuestion) + 1;
		QuestionDO question = dao.recupererQuestionDO(numSerie, numQuestionToGet);
//		request.setAttribute("enonce", question.getEnonce());
//		request.setAttribute("image", question.getImage());
//		request.setAttribute("numQuestion", Integer.toString(question.getId()));
//		request.setAttribute("numSerie", numSerie);
//		request.setAttribute("time", Integer.toString(question.getTemps()));
//
//		try {
//			request.getRequestDispatcher("affichageQuestion.jsp").forward(request, response);
//		} catch (ServletException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			response.sendRedirect("localhost:8080/RestWebService/accueil.jsp");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * @return the timeToWait
	 */
	public int getTimeToWait() {
		return timeToWait;
	}
	/**
	 * @param timeToWait the timeToWait to set
	 */
	public void setTimeToWait(int timeToWait) {
		this.timeToWait = timeToWait;
	}
	/**
	 * @return the req
	 */
	public HttpServletRequest getReq() {
		return request;
	}
	/**
	 * @param req the req to set
	 */
	public void setReq(HttpServletRequest request) {
		this.request = request;
	}
	/**
	 * @return the res
	 */
	public HttpServletResponse getRes() {
		return response;
	}
	/**
	 * @param res the res to set
	 */
	public void setRes(HttpServletResponse res) {
		this.response = res;
	}
	/**
	 * @return the request
	 */
	public HttpServletRequest getRequest() {
		return request;
	}
	/**
	 * @param request the request to set
	 */
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	/**
	 * @return the response
	 */
	public HttpServletResponse getResponse() {
		return response;
	}
	/**
	 * @param response the response to set
	 */
	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}
	/**
	 * @return the numQuestion
	 */
	public String getNumQuestion() {
		return numQuestion;
	}
	/**
	 * @param numQuestion the numQuestion to set
	 */
	public void setNumQuestion(String numQuestion) {
		this.numQuestion = numQuestion;
	}
	/**
	 * @return the numSerie
	 */
	public String getNumSerie() {
		return numSerie;
	}
	/**
	 * @param numSerie the numSerie to set
	 */
	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

}
