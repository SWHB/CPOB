package modele.planning;
import modele.utilisateur.*;
import java.util.Date;
/**
 * <b>Cette Classe repr�sente les disponibilites des diff�rents utilisateurs</b> 
 * @author Schlange
 *
 */
public class Disponibilite {
	/**
	 * D�but de la disponibilit�
	 * @see Date
	 */
	private Date disponibiliteDebut;
	/**
	 * Fin de la disponibilit�
	 */
	private Date disponibiliteFin;
	/**
	 * Utilisateur disponible durant cette disponibilit�
	 */
	private Utilisateur utilisateurDisponible;
	
	public Disponibilite(Date disponibiliteDebut, Date disponibiliteFin, Utilisateur utilisateurDisponible) {
		this.disponibiliteDebut = disponibiliteDebut;
		this.disponibiliteFin = disponibiliteFin;
		this.utilisateurDisponible = utilisateurDisponible;
	}
	
	
	

}
