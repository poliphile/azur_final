/**
 *
 */
package mywebapp.java.main.services;

import java.util.HashMap;
import java.util.Map;

import mywebapp.java.main.persistance.daoimpl.UtilisateurSerieDAOImpl;
import mywebapp.java.main.persistance.object.UtilisateurSerieDO;
import mywebapp.java.main.presentation.serie.bean.UtilisateurSerieDTO;
import mywebapp.java.main.presentation.utilisateur.bean.UtilisateurDTO;

/**
 * @author Sekioa
 *
 */
public class UtilisateurSerieService {

	private static Map<UtilisateurDTO, Map<String, String>> listeUtilisateurDTO;

	private static UtilisateurSerieService instance;

	private final UtilisateurSerieDAOImpl utilisateurSerieDAO = new UtilisateurSerieDAOImpl();

	private UtilisateurSerieService() {
		// empty method
	}

	public static UtilisateurSerieService getInstance() {
		if (instance == null) {
			return new UtilisateurSerieService();
		} else {
			return instance;
		}
	}

	public static Map<UtilisateurDTO, Map<String, String>> getListeUtilisateurDTO() {
		if (listeUtilisateurDTO == null) {
			listeUtilisateurDTO = new HashMap<UtilisateurDTO, Map<String, String>>();
			return listeUtilisateurDTO;
		} else {
			return listeUtilisateurDTO;
		}
	}

	public UtilisateurSerieDTO recupereUtilisateurSerieDTO(final String user,
			final String serie) {
		return convertUtilisateurSerieDOtoDTO(utilisateurSerieDAO
				.recupererUtilisateurSerieDO(user, serie));
	}

	public boolean modifierUtilisateurSerie(
			final UtilisateurSerieDTO utilisateurSerieDTO) {

		final UtilisateurSerieDO utilisateurSerieDO = convertUtilisateurSerieDTOtoDO(utilisateurSerieDTO);

		final boolean result = utilisateurSerieDAO
				.modifierUtilisateurSerieDO(utilisateurSerieDO);

		return result;
	}

	public boolean supprimerUtilisateurSerie(
			final UtilisateurSerieDTO utilisateurSerieDTO) {

		final UtilisateurSerieDO utilisateurSerieDO = convertUtilisateurSerieDTOtoDO(utilisateurSerieDTO);

		final boolean result = utilisateurSerieDAO
				.supprimerUtilisateurSerieDO(utilisateurSerieDO);

		return result;
	}

	private UtilisateurSerieDO convertUtilisateurSerieDTOtoDO(
			final UtilisateurSerieDTO utilisateurSerieDTO) {

		final UtilisateurSerieDO utilisateurSerieDO = new UtilisateurSerieDO();

		utilisateurSerieDO.setId_serie(utilisateurSerieDTO.getId_serie());
		utilisateurSerieDO.setId_utilisateur(utilisateurSerieDTO
				.getId_utilisateur());

		return utilisateurSerieDO;
	}

	private UtilisateurSerieDTO convertUtilisateurSerieDOtoDTO(
			final UtilisateurSerieDO utilisateurSerieDO) {

		final UtilisateurSerieDTO utilisateurSerieDTO = new UtilisateurSerieDTO();

		utilisateurSerieDTO.setId_serie(utilisateurSerieDO.getId_serie());
		utilisateurSerieDTO.setId_utilisateur(utilisateurSerieDO
				.getId_utilisateur());
		utilisateurSerieDTO.setScore(utilisateurSerieDO.getScore());

		return utilisateurSerieDTO;
	}

}

