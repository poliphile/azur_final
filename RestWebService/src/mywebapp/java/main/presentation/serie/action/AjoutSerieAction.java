/**
 * 
 */
package mywebapp.java.main.presentation.serie.action;

import mywebapp.java.main.services.SerieService;

import com.opensymphony.xwork2.ActionContext;

/**
 * @author matthieu
 *
 */
public class AjoutSerieAction {

	private final SerieService serieService = SerieService.getInstance();

	public String execute() {
		final String numSerie = serieService.recupererNouvelleSerie();
		ActionContext.getContext().getSession().put("numeroSerie", numSerie);
		ActionContext.getContext().getSession().put("numeroQuestion", 1);
		return "SUCCESS";
	}
}
