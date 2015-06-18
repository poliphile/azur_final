/**
 *
 */
package mywebapp.java.main.presentation.utilisateur.bean;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Sekioa
 *
 */
@XmlRootElement
public class UtilisateurDTO {

	private int id;
	private String nom;
	private String prenom;
	private String login;
	private String password;
	private Date dateNaiss;
	private int isAdmin;
	private boolean isConnect;

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
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(final String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom
	 *            the prenom to set
	 */
	public void setPrenom(final String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login
	 *            the login to set
	 */
	public void setLogin(final String login) {
		this.login = login;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(final String password) {
		this.password = password;
	}

	/**
	 * @return the dateNaiss
	 */
	public Date getDateNaiss() {
		return dateNaiss;
	}

	/**
	 * @param dateNaiss
	 *            the dateNaiss to set
	 */
	public void setDateNaiss(final Date dateNaiss) {
		this.dateNaiss = dateNaiss;
	}

	/**
	 * @return the isAdmin
	 */
	public int getIsAdmin() {
		return isAdmin;
	}

	/**
	 * @param isAdmin
	 *            the isAdmin to set
	 */
	public void setIsAdmin(final int isAdmin) {
		this.isAdmin = isAdmin;
	}

	/**
	 * @return the isConnect
	 */
	public boolean isConnect() {
		return isConnect;
	}

	/**
	 * @param isConnect
	 *            the isConnect to set
	 */
	public void setConnect(final boolean isConnect) {
		this.isConnect = isConnect;
	}

}
