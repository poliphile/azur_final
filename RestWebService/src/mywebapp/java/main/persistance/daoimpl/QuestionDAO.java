/**
 *
 */
package mywebapp.java.main.persistance.daoimpl;

import java.io.File;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import mywebapp.java.main.persistance.daointerface.IQuestionDAO;
import mywebapp.java.main.persistance.object.QuestionDO;

/**
 * @author matthieu
 *
 */
public class QuestionDAO implements IQuestionDAO {
	final File monImage = new File(
			"C:\\Users\\matthieu\\Documents\\workspaceLuna\\RestWebService\\WebContent\\monimage.jpg");

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * mywebapp.java.main.persistance.daointerface.IQuestionDAO#recupererQuestion
	 * (int)
	 */
	@Override
	public QuestionDO recupererQuestion(final int idQuestion, final int idSerie) {
		final EntityManagerFactory emF = new Persistence()
		.createEntityManagerFactory("my-pu");
		final EntityManager em = emF.createEntityManager();
		final StringBuilder queryBuilder = new StringBuilder();
		queryBuilder
		.append("SELECT question.ID , question.ID_SERIE , question.ENONCE , question.IMAGE , question.REPONSE1 , question.REPONSE2 , question.QUESTION_DOUBLE , question.TEMPS ");
		queryBuilder.append("FROM question WHERE question.ID = '" + idQuestion
				+ "' AND question.ID_SERIE = '" + idSerie + "'");
		final Query query = em.createNativeQuery(queryBuilder.toString());
		final Object[] results = (Object[]) query.getSingleResult();
		final QuestionDO question = new QuestionDO();
		if (results != null && results.length != 0) {
			question.setId(idQuestion);
			question.setId_serie(idSerie);
			question.setEnonce((String) results[2]);
			question.setTemps(Integer.toString((int) results[7]));

		}
		em.close();
		emF.close();
		return question;
	}

	@Override
	public void updateQuestion(final QuestionDO questionDO) {
		final EntityManagerFactory emF = new Persistence()
				.createEntityManagerFactory("my-pu");
		final EntityManager em = emF.createEntityManager();

		final QuestionDO questionDOFind = em.find(QuestionDO.class,
				questionDO.getId());
		questionDOFind.setIsReady(questionDO.getIsReady());
		em.getTransaction().begin();
		em.getTransaction().commit();

		em.close();
		emF.close();
	}
}


