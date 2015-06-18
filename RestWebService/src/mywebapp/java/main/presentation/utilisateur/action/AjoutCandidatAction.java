/**
 * 
 */
package mywebapp.java.main.presentation.utilisateur.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import mywebapp.java.main.presentation.utilisateur.bean.UtilisateurDTO;
import mywebapp.java.main.services.UtilisateurService;

/**
 * @author matthieu
 *
 */
public class AjoutCandidatAction {

	private String nom;
	private String prenom;
	private String login;
	private String password;
	private String dateNaissance;

	private final UtilisateurService utilisateurService = UtilisateurService
			.getInstance();

	public String execute() {
		final UtilisateurDTO utilisateur = new UtilisateurDTO();
		utilisateur.setNom(nom);
		utilisateur.setPrenom(prenom);
		utilisateur.setLogin(login);

		final String sFormat = "dd/MM/yyyy";
		final SimpleDateFormat sdf = new SimpleDateFormat(sFormat);
		Date date = new Date();
		try {
			date = sdf.parse(dateNaissance);
		} catch (final ParseException e) {
			e.printStackTrace();
		}
		utilisateur.setDateNaiss(date);
		utilisateur.setPassword(password);
		utilisateurService.ajouterUtilisateur(utilisateur);
		return "SUCCESS";
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
	 * @return the dateNaissance
	 */
	public String getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * @param dateNaissance
	 *            the dateNaissance to set
	 */
	public void setDateNaissance(final String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

}
