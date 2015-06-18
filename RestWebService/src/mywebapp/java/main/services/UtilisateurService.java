/**
 *
 */
package mywebapp.java.main.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import mywebapp.java.main.persistance.daoimpl.UtilisateurDAOImpl;
import mywebapp.java.main.persistance.object.UtilisateurDO;
import mywebapp.java.main.presentation.utilisateur.bean.UtilisateurDTO;

/**
 * @author matthieu
 *
 */
public class UtilisateurService {

	private static UtilisateurService instance;

	private final UtilisateurDAOImpl utilisateurDAO = new UtilisateurDAOImpl();

	private UtilisateurService() {
		// empty Method
	}

	public UtilisateurDTO rechercherUtilisateur(final String login,
			final String password) {
		final UtilisateurDO utilisateur = utilisateurDAO
				.recupererUtilisateurDO(login, password);
		return utilisateurDOtoDTO(utilisateur);
	}

	public UtilisateurDTO rechercherUtilisateurByNaissance(final String login,
			final String dateNaissance) {

		final String sFormat = "ddMMyyyy";
		final SimpleDateFormat sdf = new SimpleDateFormat(sFormat);
		Date date = new Date();
		try {
			date = sdf.parse(dateNaissance);
		} catch (final ParseException e) {
			e.printStackTrace();
		}

		System.out.println("DateNaiss= " + dateNaissance);
		System.out.println("date= " + date);

		final UtilisateurDO utilisateur = utilisateurDAO
				.recupererUtilisateurDOByNaissance(login, date);
		return utilisateurDOtoDTO(utilisateur);
	}

	public UtilisateurDTO changerMdpUtilisateur(final String login,
			final String password) {
		final UtilisateurDO utilisateur = utilisateurDAO
				.updateUtilisateurPassword(login, password);
		return utilisateurDOtoDTO(utilisateur);
	}

	public static UtilisateurService getInstance() {
		if (instance == null) {
			return new UtilisateurService();
		} else {
			return instance;
		}
	}

	private UtilisateurDTO utilisateurDOtoDTO(final UtilisateurDO utilisateurDO) {
		final UtilisateurDTO utilisateurDTO = new UtilisateurDTO();

		utilisateurDTO.setId(utilisateurDO.getId());
		utilisateurDTO.setLogin(utilisateurDO.getLogin());
		utilisateurDTO.setPassword(utilisateurDO.getPassword());
		utilisateurDTO.setDateNaiss(utilisateurDO.getDateNaiss());
		utilisateurDTO.setNom(utilisateurDO.getNom());
		utilisateurDTO.setPrenom(utilisateurDO.getPrenom());

		return utilisateurDTO;
	}

	public UtilisateurDO utilisateurDTOtoDO(final UtilisateurDTO utilisateurDTO) {
		final UtilisateurDO utilisateurDO = new UtilisateurDO();
		if (utilisateurDO.getId() != 0) {
			utilisateurDO.setId(utilisateurDTO.getId());

		}
		utilisateurDO.setLogin(utilisateurDTO.getLogin());
		utilisateurDO.setNom(utilisateurDTO.getNom());
		utilisateurDO.setPrenom(utilisateurDTO.getPrenom());
		utilisateurDO.setPassword(utilisateurDTO.getPassword());
		utilisateurDO.setDateNaiss(utilisateurDTO.getDateNaiss());
		return utilisateurDO;

	}

	public String ajouterUtilisateur(final UtilisateurDTO utilisateurDTO) {
		utilisateurDAO.ajouterUtilisateur(utilisateurDTOtoDO(utilisateurDTO));
		return "SUCCESS";
	}

	public UtilisateurDTO rechercherCandidat(final String nom,
			final String prenom, final Date dateNaissance) {
		return utilisateurDOtoDTO(utilisateurDAO.rechercherCandidat(nom,
				prenom, dateNaissance));
	}

	public void modifierCandidat(final UtilisateurDTO utilisateur) {
		utilisateurDAO.modifierUtilisateur(utilisateurDTOtoDO(utilisateur));
	}
}
