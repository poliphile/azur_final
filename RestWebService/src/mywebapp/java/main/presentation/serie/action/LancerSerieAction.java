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
public class LancerSerieAction {

	/**
	 *
	 */
	private String numserie;
	/**
	 *
	 */
	private String tempsDepart;

	private final SerieService serieService = SerieService.getInstance();

	public String execute() {
		final int numeroSerie = Integer.parseInt(numserie);
		final String result = serieService.lancerSerie(numeroSerie);
		final ActionContext context = ActionContext.getContext();
		context.getSession().put("time", tempsDepart);
		return "SUCCESS";
	}

	/**
	 * @return the numserie
	 */
	public String getNumserie() {
		return numserie;
	}

	/**
	 * @param numserie
	 *            the numserie to set
	 */
	public void setNumserie(final String numserie) {
		this.numserie = numserie;
	}

	/**
	 * @return the tempsdepart
	 */
	public String getTempsDepart() {
		return tempsDepart;
	}

	/**
	 * @param tempsdepart
	 *            the tempsdepart to set
	 */
	public void setTempsDepart(final String tempsdepart) {
		this.tempsDepart = tempsdepart;
	}

}
