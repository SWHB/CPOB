package modele.planning;

import java.util.Date;

import modele.stage.Stage;

/**
 * <b>Classe servant � g�rer les soutenances des stages.</b>
 * @author Schlange
 *
 */
public class Soutenance {
	/**
	 * Le stage rattach� � la soutenance
	 * @see Stage
	 */
	private Stage sonStage;
	/**
	 * La date de d�but rattach� � la soutenance
	 * @see Date
	 */
	private Date dateDebut;
	/**
	 * La date de fin rattach� � la soutenance
	 * @see Date
	 */
	private Date dateFin;
	
	public Soutenance(Stage stg, Date debut, Date fin){
		this.sonStage=stg;
		this.dateDebut=debut;
		this.dateFin=fin;
	}

	public Stage getSonStage() {
		return sonStage;
	}

	public void setSonStage(Stage sonStage) {
		this.sonStage = sonStage;
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
