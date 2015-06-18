/**
 *
 */
package mywebapp.java.main.presentation.serie.action;

import mywebapp.java.main.presentation.serie.bean.QuestionDTO;
import mywebapp.java.main.presentation.serie.bean.SerieDTO;
import mywebapp.java.main.services.SerieService;

import com.opensymphony.xwork2.ActionContext;

/**
 * @author matthieu
 *
 */
public class AfficherQuestionAction {

	private final SerieService serieService = SerieService.getInstance();

	public String execute() {
		final ActionContext context = ActionContext.getContext();
		final SerieDTO serie = serieService.recupererSerieEnCours();
		final String numSerie = Integer.toString(serie.getNum_serie());
		final String resut = serieService.closeConnexion(numSerie);
		final QuestionDTO question = serieService
				.recupererQuestion(numSerie, 1);
		if ("1".equals(question.getNum_question())) {
			question.setIsReady(1);
			serieService.activerQuestion(question);
		}
		if(question.getReponseC() == null || question.getReponseC().isEmpty()){
			question.setReponseC(null);
		}
		if(question.getReponseD() == null || question.getReponseD().isEmpty()){
			question.setReponseD(null);
		}
		context.getSession().put("Question", question);
		context.getSession().put("time", question.getTemps());
		context.getSession().put("double", question.getQuestion_double());
		return "SUCCESS";
	}
}

