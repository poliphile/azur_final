/**
 *
 */
package mywebapp.java.main.presentation.utilisateur.action;

import mywebapp.java.main.presentation.utilisateur.bean.UtilisateurDTO;
import mywebapp.java.main.services.UtilisateurService;

/**
 * @author matthieu
 *
 */
public class LoginAction {

	/**
	 *
	 */
	private String username;

	private String password;

	private final UtilisateurService utilisateurService = UtilisateurService
			.getInstance();

	public String execute() {
		final UtilisateurDTO utilisateur = utilisateurService
				.rechercherUtilisateur(username, password);
		if (utilisateur.getLogin() != null) {
			return "SUCCESS";
		} else {
			return "FAIL";
		}

	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(final String username) {
		this.username = username;
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

}
