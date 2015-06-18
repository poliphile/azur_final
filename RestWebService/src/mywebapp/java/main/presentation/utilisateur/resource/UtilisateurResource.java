/**
 *
 */
package mywebapp.java.main.presentation.utilisateur.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import mywebapp.java.main.presentation.utilisateur.bean.UtilisateurDTO;
import mywebapp.java.main.services.UtilisateurService;

/**
 * @author Sekioa
 *
 */
@Path("/login_user")
public class UtilisateurResource {

	final UtilisateurService utilisateurService = UtilisateurService
			.getInstance();

	// The @Context annotation allows us to have certain contextual objects
	// injected into this class.
	// UriInfo object allows us to get URI information (no kidding).
	@Context
	UriInfo uriInfo;

	// Another "injected" object. This allows us to use the information that's
	// part of any incoming request.
	// We could, for example, get header information, or the requestor's
	// address.
	@Context
	Request request;

	// Basic "is the service running" test
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String respondAsReady() {
		return "Demo service is ready you fucking bastards!";
	}

	// Use data from the client source to create a new Person object, returned
	// in JSON format.
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public UtilisateurDTO postPerson(@FormParam("user") final String user,
			@FormParam("password") final String password) {

		final UtilisateurDTO utilisateurDTO = utilisateurService
				.rechercherUtilisateur(user, password);
		if (utilisateurDTO.getLogin() != null
				&& utilisateurDTO.getPassword().equals(password)) {

			utilisateurDTO.setConnect(true);

		}

		return utilisateurDTO;

	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/password")
	public UtilisateurDTO afficherNouveauMdp(
			@FormParam("user") final String user,
			@FormParam("date_naissance") final String dateNaissance) {

		final UtilisateurDTO utilisateurDTO = utilisateurService
				.rechercherUtilisateurByNaissance(user, dateNaissance);

		if (utilisateurDTO != null && utilisateurDTO.getLogin().equals(user)) {
			return utilisateurDTO;
		}

		return null;
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/new_password")
	public UtilisateurDTO confirmerNouveauMdp(
			@FormParam("user") final String user,
			@FormParam("password") final String password) {

		final UtilisateurDTO utilisateurDTO = utilisateurService
				.changerMdpUtilisateur(user, password);

		if (utilisateurDTO != null && utilisateurDTO.getLogin().equals(user)) {
			return utilisateurDTO;
		}

		return null;
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/disconnect")
	public UtilisateurDTO seDeconnecter(@FormParam("user") final String user,
			@FormParam("password") final String password) {

		final UtilisateurDTO utilisateurDTO = utilisateurService
				.rechercherUtilisateur(user, password);
		if (utilisateurDTO.getLogin() != null
				&& utilisateurDTO.getPassword().equals(password)) {

			utilisateurDTO.setConnect(false);

		}

		return utilisateurDTO;
	}
}
