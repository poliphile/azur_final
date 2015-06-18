/**
 *
 */
package mywebapp.java.main.persistance.daointerface;

import mywebapp.java.main.persistance.object.UtilisateurSerieDO;

/**
 * @author Sekioa
 *
 */
public interface IUtilisateurSerieDAO {

	UtilisateurSerieDO recupererUtilisateurSerieDO(final String user,
			final String serie);

	boolean modifierUtilisateurSerieDO(
			final UtilisateurSerieDO utilisateurSerieDO);

	boolean supprimerUtilisateurSerieDO(
			final UtilisateurSerieDO utilisateurSerieDO);

	void updateUtilisateurSerieDO(String numeroSerie, String user, int score);

}
