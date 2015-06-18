/**
 *
 */
package mywebapp.java.main.persistance.daointerface;

import java.util.List;

import mywebapp.java.main.persistance.object.QuestionDO;
import mywebapp.java.main.persistance.object.SerieDO;
import mywebapp.java.main.persistance.object.UtilisateurQuestionDO;

/**
 * @author matthieu
 *
 */
public interface ISerieDAO {

	public String lancerSerie(final int numeroSerie);

	public SerieDO recupererSerieEnCours();

	public String closeConnexion(final String numeroSerie);

	public QuestionDO recupererQuestionDO(final String numeroSerie,
			final int numeroQuestion);

	public String repondreQuestion(final String reponse1,
			final String numeroSerie, final int numeroQuestion);

	public String ajoutQuestion(final QuestionDO questionToADD);

	public List<UtilisateurQuestionDO> getAllReponse(final String numeroSerie,
			final String reponse1, final String reponse2,
			final String numeroQuestion, final String user);
	
	public String recupererNouvelleSerie();
	
	public List<String> recupererNumeroSerie();

	List<QuestionDO> recupererAllQuestionDO(final String numSerie);

}

