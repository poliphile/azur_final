/**
 *
 */
package mywebapp.java.main.persistance.object;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author matthieu
 *
 */
@Entity(name = "utilisateur")
public class UtilisateurDO implements Serializable {

	@Id
	@GeneratedValue
	private int id;
	private String nom;
	private String prenom;
	private String login;
	private String password;
	@Column(name = "DATE_NAISS")
	private Date dateNaiss;
	@Column(name = "IS_ADMIN")
	private int isAdmin;

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
	public int isAdmin() {
		return isAdmin;
	}

	/**
	 * @param isAdmin
	 *            the isAdmin to set
	 */
	public void setAdmin(final int isAdmin) {
		this.isAdmin = isAdmin;
	}
}
