/**
 *
 */
package mywebapp.java.main.persistance.daoimpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import mywebapp.java.main.persistance.daointerface.IUtilisateurQuestionDAO;
import mywebapp.java.main.persistance.object.UtilisateurQuestionDO;

/**
 * @author Sekioa
 *
 */
public class UtilisateurQuestionDAO implements IUtilisateurQuestionDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see mywebapp.java.main.persistance.daointerface.IUtilisateurQuestionDAO#
	 * ajouterUtilisateurQuestionDO(java.lang.String, java.lang.String,
	 * java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public UtilisateurQuestionDO ajouterUtilisateurQuestionDO(
			final String question, final String user, final String reponse1,
			final String reponse2, final String bonneReponse1,
			final String bonneReponse2) {

		final EntityManagerFactory emF = new Persistence()
				.createEntityManagerFactory("my-pu");
		final EntityManager em = emF.createEntityManager();

		final UtilisateurQuestionDO utilisateurQuestionDO = new UtilisateurQuestionDO();

		utilisateurQuestionDO.setId_question(Integer.parseInt(question));
		utilisateurQuestionDO.setId_utilisateur(Integer.parseInt(user));
		utilisateurQuestionDO.setReponse1(reponse1);
		utilisateurQuestionDO.setReponse2(reponse2);
		utilisateurQuestionDO.setBonneReponse1(bonneReponse1);
		utilisateurQuestionDO.setBonneReponse2(bonneReponse2);

		em.getTransaction().begin();
		em.persist(utilisateurQuestionDO);
		em.getTransaction().commit();

		em.close();
		emF.close();

		return utilisateurQuestionDO;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see mywebapp.java.main.persistance.daointerface.IUtilisateurQuestionDAO#
	 * recupererUtilisateurQuestionDO(java.lang.String, java.lang.String)
	 */
	@Override
	public UtilisateurQuestionDO recupererUtilisateurQuestionDO(
			final String question, final String user) {

		final EntityManagerFactory emF = new Persistence()
		.createEntityManagerFactory("my-pu");
		final EntityManager em = emF.createEntityManager();

		final CriteriaBuilder builder = emF.getCriteriaBuilder();
		final CriteriaQuery<UtilisateurQuestionDO> criteria = builder
				.createQuery(UtilisateurQuestionDO.class);
		final Root<UtilisateurQuestionDO> utilisateurQuestionRoot = criteria
				.from(UtilisateurQuestionDO.class);
		criteria.select(utilisateurQuestionRoot);
		criteria.where(builder.equal(
				utilisateurQuestionRoot.get("id_question"), question), builder
				.equal(utilisateurQuestionRoot.get("id_utilisateur"), user));

		final UtilisateurQuestionDO utilisateurQuestionDO = em.createQuery(
				criteria).getSingleResult();
		
		em.close();
		emF.close();

		return utilisateurQuestionDO;
	}

}

