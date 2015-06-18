/**
 *
 */
package mywebapp.java.main.persistance.object;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Sekioa
 *
 */
@Entity(name = "serie")
public class SerieDO implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -8157390063607010869L;
	@Id
	@GeneratedValue
	private int id;
	private int num_serie;
	private int score_moyen;
	private Date date_creation;
	private Date date_passage;
	private int is_active;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(final int id) {
		this.id = id;
	}

	/**
	 * @return the num_serie
	 */
	public int getNum_serie() {
		return num_serie;
	}

	/**
	 * @param num_serie
	 *            the num_serie to set
	 */
	public void setNum_serie(final int num_serie) {
		this.num_serie = num_serie;
	}

	/**
	 * @return the score_moyen
	 */
	public int getScore_moyen() {
		return score_moyen;
	}

	/**
	 * @param score_moyen
	 *            the score_moyen to set
	 */
	public void setScore_moyen(final int score_moyen) {
		this.score_moyen = score_moyen;
	}

	/**
	 * @return the date_creation
	 */
	public Date getDate_creation() {
		return date_creation;
	}

	/**
	 * @param date_creation
	 *            the date_creation to set
	 */
	public void setDate_creation(final Date date_creation) {
		this.date_creation = date_creation;
	}

	/**
	 * @return the date_passage
	 */
	public Date getDate_passage() {
		return date_passage;
	}

	/**
	 * @param date_passage
	 *            the date_passage to set
	 */
	public void setDate_passage(final Date date_passage) {
		this.date_passage = date_passage;
	}

	/**
	 * @return the is_active
	 */
	public int getIs_active() {
		return is_active;
	}

	/**
	 * @param is_active
	 *            the is_active to set
	 */
	public void setIs_active(final int is_active) {
		this.is_active = is_active;
	}

}
