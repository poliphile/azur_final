/**
 *
 */
package mywebapp.java.main.services;

import mywebapp.java.main.persistance.daoimpl.UtilisateurQuestionDAO;
import mywebapp.java.main.persistance.object.UtilisateurQuestionDO;
import mywebapp.java.main.presentation.serie.bean.UtilisateurQuestionDTO;

/**
 * @author Sekioa
 *
 */
public class UtilisateurQuestionService {

	private static UtilisateurQuestionService instance;

	private UtilisateurQuestionService() {
		// empty Method
	}

	public static UtilisateurQuestionService getInstance() {
		if (instance == null) {
			return new UtilisateurQuestionService();
		} else {
			return instance;
		}
	}

	/**
	 *
	 */
	private final UtilisateurQuestionDAO utilisateurQuestionDAO = new UtilisateurQuestionDAO();

	public UtilisateurQuestionDTO creerUtilisateurQuestion(
			final String question, final String user, final String reponse1,
			final String reponse2, final String bonneReponse1,
			final String bonneReponse2) {

		return utilisateurQuestionDOtoDTO(utilisateurQuestionDAO
				.ajouterUtilisateurQuestionDO(question, user, reponse1,
						reponse2, bonneReponse1, bonneReponse2));
	}

	public UtilisateurQuestionDTO recupererReponse(final String question,
			final String user) {
		return utilisateurQuestionDOtoDTO(utilisateurQuestionDAO
				.recupererUtilisateurQuestionDO(question, user));
	}

	private UtilisateurQuestionDO utilisateurQuestionDTOtoDO(
			final UtilisateurQuestionDTO utilisateurQuestionDTO) {

		final UtilisateurQuestionDO utilisateurQuestionDO = new UtilisateurQuestionDO();

		utilisateurQuestionDO.setId(utilisateurQuestionDTO.getId());
		utilisateurQuestionDO.setId_question(utilisateurQuestionDTO
				.getIdQuestion());
		utilisateurQuestionDO.setId_utilisateur(utilisateurQuestionDTO
				.getIdUtilisateur());
		utilisateurQuestionDO.setReponse1(utilisateurQuestionDTO.getReponse1());
		utilisateurQuestionDO.setReponse2(utilisateurQuestionDTO.getReponse2());

		return utilisateurQuestionDO;
	}

	private UtilisateurQuestionDTO utilisateurQuestionDOtoDTO(
			final UtilisateurQuestionDO utilisateurQuestionDO) {

		final UtilisateurQuestionDTO utilisateurQuestionDTO = new UtilisateurQuestionDTO();

		utilisateurQuestionDTO.setId(utilisateurQuestionDO.getId());
		utilisateurQuestionDTO.setIdQuestion(utilisateurQuestionDO
				.getId_question());
		utilisateurQuestionDTO.setIdUtilisateur(utilisateurQuestionDO
				.getId_utilisateur());
		utilisateurQuestionDTO.setReponse1(utilisateurQuestionDO.getReponse1());
		utilisateurQuestionDTO.setReponse2(utilisateurQuestionDO.getReponse2());
		utilisateurQuestionDTO.setBonneReponse1((utilisateurQuestionDO
				.getBonneReponse1()));
		utilisateurQuestionDTO.setBonneReponse2(utilisateurQuestionDO
				.getBonneReponse2());

		return utilisateurQuestionDTO;
	}

}

