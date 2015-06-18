/**
 *
 */
package mywebapp.java.main.persistance.object;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Sekioa
 *
 */
@Entity(name = "utilisateur_question")
public class UtilisateurQuestionDO {

	@Id
	@GeneratedValue
	private int id;
	private int id_utilisateur;
	private int id_question;
	private String reponse1;
	private String reponse2;
	@Column(name = "BONNE_REPONSE1")
	private String bonneReponse1;
	@Column(name = "BONNE_REPONSE2")
	private String bonneReponse2;

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
	 * @return the id_question
	 */
	public int getId_question() {
		return id_question;
	}

	/**
	 * @param id_question
	 *            the id_question to set
	 */
	public void setId_question(final int id_question) {
		this.id_question = id_question;
	}

	/**
	 * @return the reponse1
	 */
	public String getReponse1() {
		return reponse1;
	}

	/**
	 * @param reponse1
	 *            the reponse1 to set
	 */
	public void setReponse1(final String reponse1) {
		this.reponse1 = reponse1;
	}

	/**
	 * @return the reponse2
	 */
	public String getReponse2() {
		return reponse2;
	}

	/**
	 * @param reponse2
	 *            the reponse2 to set
	 */
	public void setReponse2(final String reponse2) {
		this.reponse2 = reponse2;
	}

	/**
	 * @return the bonneReponse1
	 */
	public String getBonneReponse1() {
		return bonneReponse1;
	}

	/**
	 * @param bonneReponse1
	 *            the bonneReponse1 to set
	 */
	public void setBonneReponse1(final String bonneReponse1) {
		this.bonneReponse1 = bonneReponse1;
	}

	/**
	 * @return the bonneReponse2
	 */
	public String getBonneReponse2() {
		return bonneReponse2;
	}

	/**
	 * @param bonneReponse2
	 *            the bonneReponse2 to set
	 */
	public void setBonneReponse2(final String bonneReponse2) {
		this.bonneReponse2 = bonneReponse2;
	}

}

