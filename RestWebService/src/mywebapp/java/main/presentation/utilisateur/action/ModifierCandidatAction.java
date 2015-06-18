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
public class ModifierCandidatAction {

	private String id;
	private String nom;
	private String prenom;
	private String login;
	private String password;
	private String dateNaiss;

	private final UtilisateurService utilisateurService = UtilisateurService
			.getInstance();

	public String execute() {
		final UtilisateurDTO utilisateur = new UtilisateurDTO();
		utilisateur.setId(Integer.parseInt(id));
		utilisateur.setNom(nom);
		utilisateur.setPrenom(prenom);
		utilisateur.setLogin(login);
		utilisateur.setPassword(password);
		
		final String sFormat = "ddMMyyyy";
		final SimpleDateFormat sdf = new SimpleDateFormat(sFormat);
		Date date = new Date();
		try {
			date = sdf.parse(dateNaiss);
		} catch (final ParseException e) {
			e.printStackTrace();
		}
		utilisateur.setDateNaiss(date);
		utilisateur.setIsAdmin(0);
		utilisateur.setConnect(false);

		utilisateurService.modifierCandidat(utilisateur);
		return "SUCCESS";
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
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
	public void setNom(String nom) {
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
	public void setPrenom(String prenom) {
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
	public void setLogin(String login) {
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
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the dateNaiss
	 */
	public String getDateNaiss() {
		return dateNaiss;
	}

	/**
	 * @param dateNaiss
	 *            the dateNaiss to set
	 */
	public void setDateNaiss(String dateNaiss) {
		this.dateNaiss = dateNaiss;
	}

}
