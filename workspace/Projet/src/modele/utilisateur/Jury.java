package modele.utilisateur;

import java.util.ArrayList;

import modele.stage.Stage;

public class Jury {
	private ArrayList<Enseignant> lesEnseignant;
	private Stage sonStage;
	private Enseignant president;
	
	public Jury(Stage stg){
		this.president=null;
		this.sonStage = stg;
		this.lesEnseignant = new ArrayList<Enseignant>();
		this.lesEnseignant.add(this.sonStage.getEtudiantStage().getProfReferent());
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
	 * Renvoi si le jury est pr�t:
	 *  0: pas pr�t
	 *  1: pr�t
	 *  2: manque le president
	 * @return
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
