/**
 *
 */
package mywebapp.java.main.persistance.daointerface;

import mywebapp.java.main.persistance.object.QuestionDO;

/**
 * @author matthieu
 *
 */
public interface IQuestionDAO {

	public QuestionDO recupererQuestion(final int idQuestion, final int idSerie);

	public void updateQuestion(final QuestionDO questionDO);
}
