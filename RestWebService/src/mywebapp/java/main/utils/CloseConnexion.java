/**
 *
 */
package mywebapp.java.main.utils;

import mywebapp.java.main.persistance.daoimpl.SerieDAOImpl;

/**
 * @author matthieu
 *
 */
public class CloseConnexion extends Thread {

	public static int timeToCount;
	private String numeroSerie;

	@Override
	public void run() {
		while (CloseConnexion.timeToCount > 0) {
			try {
				sleep(1000);
				CloseConnexion.timeToCount = CloseConnexion.timeToCount - 1;
			} catch (final InterruptedException e) {
				e.printStackTrace();
			}

		}
		final SerieDAOImpl dao = new SerieDAOImpl();
		final String result = dao.closeConnexion(numeroSerie);
	}

	/**
	 * @return the timeToCount
	 */
	public int getTimeToCount() {
		return timeToCount;
	}

	/**
	 * @param timeToCount
	 *            the timeToCount to set
	 */
	public void setTimeToCount(final int timeToCount) {
		CloseConnexion.timeToCount = timeToCount;
	}

	/**
	 * @return the numeroSerie
	 */
	public String getNumeroSerie() {
		return numeroSerie;
	}

	/**
	 * @param numeroSerie
	 *            the numeroSerie to set
	 */
	public void setNumeroSerie(final String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
}
