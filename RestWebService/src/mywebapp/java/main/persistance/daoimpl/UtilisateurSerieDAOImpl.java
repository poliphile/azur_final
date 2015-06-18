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

import mywebapp.java.main.persistance.daointerface.IUtilisateurSerieDAO;
import mywebapp.java.main.persistance.object.UtilisateurSerieDO;

/**
 * @author Sekioa
 *
 */
public class UtilisateurSerieDAOImpl implements IUtilisateurSerieDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see mywebapp.java.main.persistance.daointerface.IUtilisateurSerieDAO#
	 * modifierUtilisateurSerieDO
	 * (mywebapp.java.main.persistance.object.UtilisateurSerieDO)
	 */
	@Override
	public boolean modifierUtilisateurSerieDO(
			final UtilisateurSerieDO utilisateurSerieDO) {

		final EntityManagerFactory emF = new Persistence()
				.createEntityManagerFactory("my-pu");
		final EntityManager em = emF.createEntityManager();

		em.getTransaction().begin();

		final UtilisateurSerieDO utilisateurSerieDOTest = em
				.merge(utilisateurSerieDO);

		em.getTransaction().commit();
		em.close();
		emF.close();

		if (utilisateurSerieDOTest.getScore() >= 0) {
			return true;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see mywebapp.java.main.persistance.daointerface.IUtilisateurSerieDAO#
	 * supprimerUtilisateurSerieDO
	 * (mywebapp.java.main.persistance.object.UtilisateurSerieDO)
	 */
	@Override
	public boolean supprimerUtilisateurSerieDO(
			final UtilisateurSerieDO utilisateurSerieDO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateUtilisateurSerieDO(final String numeroSerie,
			final String user, final int score) {
		final EntityManagerFactory emF = new Persistence()
				.createEntityManagerFactory("my-pu");
		final EntityManager em = emF.createEntityManager();
		final UtilisateurSerieDO utilisateurSerieDO = new UtilisateurSerieDO();

		utilisateurSerieDO.setId_serie(Integer.parseInt(numeroSerie));
		utilisateurSerieDO.setId_utilisateur(Integer.parseInt(user));
		utilisateurSerieDO.setScore(score);

		em.getTransaction().begin();

		em.merge(utilisateurSerieDO);

		em.getTransaction().commit();

		em.close();
		emF.close();
	}

	@Override
	public UtilisateurSerieDO recupererUtilisateurSerieDO(final String user,
			final String serie) {
		final EntityManagerFactory emF = new Persistence()
				.createEntityManagerFactory("my-pu");
		final EntityManager em = emF.createEntityManager();

		final CriteriaBuilder builder = emF.getCriteriaBuilder();
		final CriteriaQuery<UtilisateurSerieDO> criteria = builder
				.createQuery(UtilisateurSerieDO.class);
		final Root<UtilisateurSerieDO> utilisateurSerieRoot = criteria
				.from(UtilisateurSerieDO.class);
		criteria.select(utilisateurSerieRoot);
		criteria.where(
				builder.equal(utilisateurSerieRoot.get("id_serie"), serie),
				builder.equal(utilisateurSerieRoot.get("id_utilisateur"), user));

		em.close();
		emF.close();

		return em.createQuery(criteria).getSingleResult();
	}

}
