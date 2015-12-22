package modele.planning;
import java.util.Date;
/**
 * <b>Cette classe représente le planning des soutenances</b>
 * On crée un singleton car il n'y a qu'un planning par application, il faudra donc définir la période de soutenance
 * @author Schlange
 *
 */
public class Planning {
	/**
	 * Date de début des soutenances
	 * @see Date
	 */
	private Date dateDebut;
	/**
	 * Date de fin des soutenances
	 */
	private Date dateFin;
	
	private  Planning(Date debut, Date fin){
		this.dateDebut=debut;
		this.dateFin=fin;
	}
	
	private static Planning INSTANCE =null;
	
	public static synchronized Planning getInstance(Date debut, Date fin){
		if(INSTANCE==null){
			INSTANCE = new Planning(debut, fin);
		}
		return INSTANCE;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	
	
	
}
