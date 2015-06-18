/**
 *
 */
package mywebapp.java.main.utils;

import mywebapp.java.main.persistance.daoimpl.QuestionDAO;
import mywebapp.java.main.persistance.object.QuestionDO;

/**
 * @author matthieu
 *
 */
public class RecupererQuestion extends Thread {

	private int numeroSerie;
	private int numeroQuestion;

	@Override
	public void run() {
		final QuestionDAO dao = new QuestionDAO();
		final QuestionDO question = dao.recupererQuestion(numeroQuestion,
				numeroSerie);
	}

	/**
	 * @return the numeroSerie
	 */
	public int getNumeroSerie() {
		return numeroSerie;
	}

	/**
	 * @param numeroSerie
	 *            the numeroSerie to set
	 */
	public void setNumeroSerie(final int numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	/**
	 * @return the numeroQuestion
	 */
	public int getNumeroQuestion() {
		return numeroQuestion;
	}

	/**
	 * @param numeroQuestion
	 *            the numeroQuestion to set
	 */
	public void setNumeroQuestion(final int numeroQuestion) {
		this.numeroQuestion = numeroQuestion;
	}

}
