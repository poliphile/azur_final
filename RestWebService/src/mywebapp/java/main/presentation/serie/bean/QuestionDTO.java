/**
 *
 */
package mywebapp.java.main.presentation.serie.bean;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author matthieu
 *
 */
@XmlRootElement
public class QuestionDTO {

	private int id;
	private int id_serie;
	private String num_question;
	private String enonce;
	private byte[] image;
	private String reponse1;
	private String reponse2;
	private int question_double;
	private String temps;
	private String enonce2;
	private String reponseA;
	private String reponseB;
	private String reponseC;
	private String reponseD;
	private int isReady;

	public String getBitArrayString() {
		return new String(
				new org.apache.commons.codec.binary.Base64().encode(this.image));
	}

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
	 * @return the num_question
	 */
	public String getNum_question() {
		return num_question;
	}

	/**
	 * @param num_question
	 *            the num_question to set
	 */
	public void setNum_question(final String num_question) {
		this.num_question = num_question;
	}

	/**
	 * @return the enonce
	 */
	public String getEnonce() {
		return enonce;
	}

	/**
	 * @param enonce
	 *            the enonce to set
	 */
	public void setEnonce(final String enonce) {
		this.enonce = enonce;
	}

	/**
	 * @return the image
	 */
	public byte[] getImage() {
		return image;
	}

	/**
	 * @param image
	 *            the image to set
	 */
	public void setImage(final byte[] image) {
		this.image = image;
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
	 * @return the question_double
	 */
	public int getQuestion_double() {
		return question_double;
	}

	/**
	 * @param question_double
	 *            the question_double to set
	 */
	public void setQuestion_double(final int question_double) {
		this.question_double = question_double;
	}

	/**
	 * @return the temps
	 */
	public String getTemps() {
		return temps;
	}

	/**
	 * @param temps
	 *            the temps to set
	 */
	public void setTemps(final String temps) {
		this.temps = temps;
	}

	/**
	 * @return the enonce2
	 */
	public String getEnonce2() {
		return enonce2;
	}

	/**
	 * @param enonce2
	 *            the enonce2 to set
	 */
	public void setEnonce2(final String enonce2) {
		this.enonce2 = enonce2;
	}

	/**
	 * @return the reponseA
	 */
	public String getReponseA() {
		return reponseA;
	}

	/**
	 * @param reponseA
	 *            the reponseA to set
	 */
	public void setReponseA(final String reponseA) {
		this.reponseA = reponseA;
	}

	/**
	 * @return the reponseB
	 */
	public String getReponseB() {
		return reponseB;
	}

	/**
	 * @param reponseB
	 *            the reponseB to set
	 */
	public void setReponseB(final String reponseB) {
		this.reponseB = reponseB;
	}

	/**
	 * @return the reponseC
	 */
	public String getReponseC() {
		return reponseC;
	}

	/**
	 * @param reponseC
	 *            the reponseC to set
	 */
	public void setReponseC(final String reponseC) {
		this.reponseC = reponseC;
	}

	/**
	 * @return the reponseD
	 */
	public String getReponseD() {
		return reponseD;
	}

	/**
	 * @param reponseD
	 *            the reponseD to set
	 */
	public void setReponseD(final String reponseD) {
		this.reponseD = reponseD;
	}

	/**
	 * @return the isReady
	 */
	public int getIsReady() {
		return isReady;
	}

	/**
	 * @param isReady
	 *            the isReady to set
	 */
	public void setIsReady(final int isReady) {
		this.isReady = isReady;
	}
}

