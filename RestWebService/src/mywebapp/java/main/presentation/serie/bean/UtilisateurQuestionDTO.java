/**
 *
 */
package mywebapp.java.main.presentation.serie.bean;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Sekioa
 *
 */
@XmlRootElement
public class UtilisateurQuestionDTO {

	private int id;
	private int idUtilisateur;
	private int idQuestion;
	private String reponse1;
	private String reponse2;
	private String bonneReponse1;
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
	 * @return the idUtilisateur
	 */
	public int getIdUtilisateur() {
		return idUtilisateur;
	}

	/**
	 * @param idUtilisateur
	 *            the idUtilisateur to set
	 */
	public void setIdUtilisateur(final int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	/**
	 * @return the idQuestion
	 */
	public int getIdQuestion() {
		return idQuestion;
	}

	/**
	 * @param idQuestion
	 *            the idQuestion to set
	 */
	public void setIdQuestion(final int idQuestion) {
		this.idQuestion = idQuestion;
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
