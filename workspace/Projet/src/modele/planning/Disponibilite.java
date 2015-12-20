package modele.planning;
import modele.utilisateur.*;
import java.util.Date;
/**
 * <b>Cette Classe représente les disponibilites des différents utilisateurs</b> 
 * @author Schlange
 *
 */
public class Disponibilite {
	/**
	 * Début de la disponibilité
	 * @see Date
	 */
	private Date disponibiliteDebut;
	/**
	 * Fin de la disponibilité
	 */
	private Date disponibiliteFin;
	/**
	 * Utilisateur disponible durant cette disponibilité
	 */
	private Utilisateur utilisateurDisponible;
	
	public Disponibilite(Date disponibiliteDebut, Date disponibiliteFin, Utilisateur utilisateurDisponible) {
		this.disponibiliteDebut = disponibiliteDebut;
		this.disponibiliteFin = disponibiliteFin;
		this.utilisateurDisponible = utilisateurDisponible;
	}
	
	
	

}
