package modele.planning;

import java.util.ArrayList;
import java.util.Date;

import modele.stage.Stage;
import modele.utilisateur.Etudiant;
import modele.utilisateur.Jury;

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
	/**
	 * Le Jury de la soutenance
	 */
	private Jury jury;
	
	private ArrayList<Etudiant> sesEtudiants;
	
	
	public Soutenance(Stage stg, Date debut, Date fin, Jury jur){
		this.sonStage=stg;
		this.dateDebut=debut;
		this.dateFin=fin;
		this.jury=jur;
		ArrayList<Etudiant> sesEtudiants=new ArrayList<>();
	}
	
	public void supprimerEtu(Etudiant e)
	{
		for(Etudiant etu:sesEtudiants)
		{
			if(etu.toString()==e.toString())
			{
				sesEtudiants.remove(e);
			}
		}
	}
	
	public void ajoutEtu(Etudiant e)
	{
		for(Etudiant etu:sesEtudiants)
		{
			if(etu.toString()==e.toString())
			{
				sesEtudiants.add(e);
			}
		}
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

	public Jury getJury() {
		return jury;
	}

	public void setJury(Jury jury) {
		this.jury = jury;
	}
	
	
}
