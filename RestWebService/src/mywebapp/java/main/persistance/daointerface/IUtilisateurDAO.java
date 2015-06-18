/**
 *
 */
package mywebapp.java.main.persistance.daointerface;

import java.util.Date;

import mywebapp.java.main.persistance.object.UtilisateurDO;

/**
 * @author matthieu
 *
 */

public interface IUtilisateurDAO {

	/**
	 *
	 * Permet de récupérer un utilisateur en base
	 *
	 * @param login
	 * @param password
	 * @return UtilisateurDO
	 */
	public UtilisateurDO recupererUtilisateurDO(final String login,
			final String password);

	/**
	 * @param login
	 * @param dateNaissance
	 * @return UtilisateurDO
	 */
	public UtilisateurDO recupererUtilisateurDOByNaissance(final String login,
			final Date dateNaissance);

	/**
	 * @param login
	 * @param password
	 * @return
	 */
	public UtilisateurDO updateUtilisateurPassword(final String login,
			final String password);

	/**
	 * @param utilisateurToAdd
	 * @return
	 */
	public String ajouterUtilisateur(final UtilisateurDO utilisateurToAdd);

	/**
	 * @param nom
	 * @param prenom
	 * @param dateNaissance
	 * @return
	 */
	public UtilisateurDO rechercherCandidat(final String nom,
			final String prenom, final Date dateNaissance);
	
	public void modifierUtilisateur(final UtilisateurDO utilisateur);
}
