/**
 *
 */
package mywebapp.java.main.persistance.daointerface;

import mywebapp.java.main.persistance.object.UtilisateurQuestionDO;

/**
 * @author Sekioa
 *
 */
public interface IUtilisateurQuestionDAO {

	public UtilisateurQuestionDO ajouterUtilisateurQuestionDO(
			final String question, final String user, final String reponse1,
			final String reponse2, final String bonneReponse1,
			final String bonneReponse2);

	public UtilisateurQuestionDO recupererUtilisateurQuestionDO(
			final String question, final String user);

}
