/**
 *
 */
package mywebapp.java.main.services;

import java.util.ArrayList;
import java.util.List;

import mywebapp.java.main.persistance.daoimpl.QuestionDAO;
import mywebapp.java.main.persistance.daoimpl.SerieDAOImpl;
import mywebapp.java.main.persistance.daoimpl.UtilisateurSerieDAOImpl;
import mywebapp.java.main.persistance.object.QuestionDO;
import mywebapp.java.main.persistance.object.SerieDO;
import mywebapp.java.main.persistance.object.UtilisateurQuestionDO;
import mywebapp.java.main.presentation.serie.bean.QuestionDTO;
import mywebapp.java.main.presentation.serie.bean.SerieDTO;

/**
 * @author matthieu
 *
 */
public class SerieService {

	private static SerieService instance;

	private SerieService() {
		// empty Method
	}

	/**
	 *
	 */
	private final SerieDAOImpl serieDAO = SerieDAOImpl.getInstance();

	private final QuestionDAO questionDAO = new QuestionDAO();

	private final UtilisateurSerieDAOImpl utilisateurSerieDAOImpl = new UtilisateurSerieDAOImpl();

	public String lancerSerie(final int numserie) {
		final String result = serieDAO.lancerSerie(numserie);
		return result;
	}

	public SerieDTO recupererSerieEnCours() {
		return serieDOToDTO(serieDAO.recupererSerieEnCours());
	}

	public String closeConnexion(final String numSerie) {
		return serieDAO.closeConnexion(numSerie);
	}

	public QuestionDTO recupererQuestion(final String numeroSerie,
			final int numeroQuestion) {
		return questionDOToDTO(serieDAO.recupererQuestionDO(numeroSerie,
				numeroQuestion));
	}

	public String ajouterQuestion(final QuestionDO question) {
		return serieDAO.ajoutQuestion(question);
	}

	public void activerQuestion(final QuestionDTO questionDTO) {
		questionDAO.updateQuestion(questionDTOtoDO(questionDTO));
	}

	public void calculerScore(final String numeroSerie, final String reponse1,
			final String reponse2, final String numeroQuestion,
			final String user) {

		final List<UtilisateurQuestionDO> listUtilisateurQuestion = serieDAO
				.getAllReponse(numeroSerie, reponse1, reponse2, numeroQuestion,
						user);

		int score = 0;
		final List<QuestionDTO> questionsDTO = recupererAllQuestion(numeroSerie);
		int indice = 0;
		for (final UtilisateurQuestionDO utilisateurQuestionDO : listUtilisateurQuestion) {
			final QuestionDTO questionDTO = questionsDTO.get(indice);
			indice = indice + 1;
			if (questionDTO.getReponse1().equals(
					utilisateurQuestionDO.getReponse1())) {
				score++;
				if (questionDTO.getQuestion_double() == 1
						&& !questionDTO.getReponse2().equals(
								utilisateurQuestionDO.getReponse2())) {
					score--;
				}
			}
		}

		utilisateurSerieDAOImpl.updateUtilisateurSerieDO(numeroSerie, user,
				score);
	}

	public SerieDTO serieDOToDTO(final SerieDO serieDO) {

		final SerieDTO serieDTO = new SerieDTO();

		serieDTO.setId(serieDO.getId());
		serieDTO.setNum_serie((serieDO.getNum_serie()));
		serieDTO.setScore_moyen((serieDO.getScore_moyen()));
		serieDTO.setDate_creation((serieDO.getDate_creation()));
		serieDTO.setDate_passage((serieDO.getDate_passage()));
		serieDTO.setIs_active((serieDO.getId()));

		return serieDTO;
	}

	public QuestionDTO questionDOToDTO(final QuestionDO questionDO) {

		final QuestionDTO questionDTO = new QuestionDTO();

		if (questionDO != null) {
			questionDTO.setId(questionDO.getId());
			questionDTO.setId_serie((questionDO.getId_serie()));
			questionDTO.setNum_question((questionDO.getNum_question()));
			questionDTO.setEnonce((questionDO.getEnonce()));
			questionDTO.setImage((questionDO.getImage()));
			questionDTO.setReponse1((questionDO.getReponse1()));
			questionDTO.setReponse2((questionDO.getReponse2()));
			questionDTO.setQuestion_double((questionDO.getQuestion_double()));
			questionDTO.setTemps((questionDO.getTemps()));
			questionDTO.setEnonce2((questionDO.getEnonce2()));
			questionDTO.setReponseA((questionDO.getReponseA()));
			questionDTO.setReponseB((questionDO.getReponseB()));
			questionDTO.setReponseC((questionDO.getReponseC()));
			questionDTO.setReponseD((questionDO.getReponseD()));
			questionDTO.setIsReady(questionDO.getIsReady());
		}

		return questionDTO;
	}

	public QuestionDO questionDTOtoDO(final QuestionDTO questionDTO) {

		final QuestionDO questionDO = new QuestionDO();

		questionDO.setId(questionDTO.getId());
		questionDO.setId_serie((questionDTO.getId_serie()));
		questionDO.setNum_question((questionDTO.getNum_question()));
		questionDO.setEnonce((questionDTO.getEnonce()));
		questionDO.setImage((questionDTO.getImage()));
		questionDO.setReponse1((questionDTO.getReponse1()));
		questionDO.setReponse2((questionDTO.getReponse2()));
		questionDO.setQuestion_double((questionDTO.getQuestion_double()));
		questionDO.setTemps((questionDTO.getTemps()));
		questionDO.setEnonce2((questionDTO.getEnonce2()));
		questionDO.setReponseA((questionDTO.getReponseA()));
		questionDO.setReponseB((questionDTO.getReponseB()));
		questionDO.setReponseC((questionDTO.getReponseC()));
		questionDO.setReponseD((questionDTO.getReponseD()));
		questionDO.setIsReady(questionDTO.getIsReady());

		return questionDO;

	}

	public static SerieService getInstance() {
		if (instance == null) {
			return new SerieService();
		} else {
			return instance;
		}
	}

	public String recupererNouvelleSerie() {
		return serieDAO.recupererNouvelleSerie();
	}

	public List<String> recupererIDSerie() {
		return serieDAO.recupererNumeroSerie();
	}

	public List<QuestionDTO> recupererAllQuestion(final String numSerie) {
		final List<QuestionDO> questionsDO = serieDAO
				.recupererAllQuestionDO(numSerie);
		final List<QuestionDTO> questionsDTO = new ArrayList<QuestionDTO>();
		for (final QuestionDO questionDO : questionsDO) {
			questionsDTO.add(questionDOToDTO(questionDO));
		}
		return questionsDTO;
	}
}
