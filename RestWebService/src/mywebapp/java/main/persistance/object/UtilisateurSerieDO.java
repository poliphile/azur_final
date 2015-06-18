/**
 *
 */
package mywebapp.java.main.persistance.object;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Sekioa
 *
 */
@Entity(name = "utilisateur_serie")
public class UtilisateurSerieDO {

	@Id
	@GeneratedValue
	private int id;
	private int id_utilisateur;
	private int id_serie;
	private int score;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(final int id) {
		this.id = id;
	}

	/**
	 * @return the id_utilisateur
	 */
	public int getId_utilisateur() {
		return id_utilisateur;
	}

	/**
	 * @param id_utilisateur
	 *            the id_utilisateur to set
	 */
	public void setId_utilisateur(final int id_utilisateur) {
		this.id_utilisateur = id_utilisateur;
	}

	/**
	 * @return the id_serie
	 */
	public int getId_serie() {
		return id_serie;
	}

	/**
	 * @param id_serie
	 *            the id_serie to set
	 */
	public void setId_serie(final int id_serie) {
		this.id_serie = id_serie;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score
	 *            the score to set
	 */
	public void setScore(final int score) {
		this.score = score;
	}

}
