package modele.utilisateur;

import java.util.ArrayList;

import modele.planning.Soutenance;
import modele.stage.Stage;
/**
 * Classe représentant les Jury
 * @author Schlange
 *
 */
public class Jury {
	/**
	 * List des Enseignants
	 * @see ArrayList
	 * @see Enseignant
	 */
	private ArrayList<Enseignant> lesEnseignant;
	private Stage sonStage;
	private Enseignant president;
	private String id;
	private ArrayList<Soutenance> sesSoutenances;
	
	public Jury(String id,Stage stg){
		this.id=id;
		this.president=null;
		this.sonStage = stg;
		this.lesEnseignant = new ArrayList<Enseignant>();
		sesSoutenances=new ArrayList<Soutenance>();
		this.lesEnseignant.add(this.sonStage.getEtudiantStage().getProfReferent());
	}
	
	public Jury(Stage stg, Enseignant president){
		this.president=null;
		this.sonStage = stg;
		this.lesEnseignant = new ArrayList<Enseignant>();
		this.lesEnseignant.add(this.sonStage.getEtudiantStage().getProfReferent());
		this.president=president;
	}

	public ArrayList<Enseignant> getLesEnseignant() {
		return lesEnseignant;
	}

	public void setLesEnseignant(ArrayList<Enseignant> lesEnseignant) {
		this.lesEnseignant = lesEnseignant;
	}

	public Stage getSonStage() {
		return sonStage;
	}

	public void setSonStage(Stage sonStage) {
		this.sonStage = sonStage;
	}
	
	public void ajoutEnseignant(Enseignant ens){
		this.lesEnseignant.add(ens);
	}
	
	public Etudiant getEtudiant(){
		return this.sonStage.getEtudiantStage();
	}
	
	public Enseignant getPresident() {
		return president;
	}

	public void setPresident(Enseignant president) {
		this.president = president;
	}
	/**
	 * Renvoi si le jury est prèt:
	 *  
	 * @return
	 * 		0: pas prêt
	 *  	1: prêt
	 *  	2: manque le president
	 */
	public int juryPret(){
		if(lesEnseignant.size()>2){
			if(this.president==null){
				return 2;
			}
			return 1;
		}
		else{
			return 0;
		}
	}
}
