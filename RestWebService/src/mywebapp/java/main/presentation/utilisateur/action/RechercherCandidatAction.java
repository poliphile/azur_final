/**
 * 
 */
package mywebapp.java.main.presentation.utilisateur.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import mywebapp.java.main.presentation.utilisateur.bean.UtilisateurDTO;
import mywebapp.java.main.services.UtilisateurService;

import com.opensymphony.xwork2.ActionContext;

/**
 * @author matthieu
 *
 */
public class RechercherCandidatAction {

	private String nom;
	private String prenom;
	private String dateNaissance;

	private final UtilisateurService utilisateurService = UtilisateurService
			.getInstance();

	public String execute() {
		final String sFormat = "dd-MM-yyyy";
		final SimpleDateFormat sdf = new SimpleDateFormat(sFormat);
		Date date = new Date();
		try {
			date = sdf.parse(dateNaissance);
		} catch (final ParseException e) {
			e.printStackTrace();
		}
		final UtilisateurDTO utilisateurFind = utilisateurService
				.rechercherCandidat(nom, prenom, date);
		ActionContext.getContext().getSession()
				.put("utilRetrieve", utilisateurFind);
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
	 * @return the dateNaissance
	 */
	public String getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * @param dateNaissance
	 *            the dateNaissance to set
	 */
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
}
