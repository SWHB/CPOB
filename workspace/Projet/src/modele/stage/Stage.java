package modele.stage;

import modele.entreprise.Entreprise;
import modele.utilisateur.*;

/**
 * <b>Cette classe représente les stages des étudiants</b>
 * @author Schlange
 *
 */
public class Stage {
	/**
	 * identifiant du Stage
	 */
	private String identifiant;
	/**
	 * Permet de savoir si le Stage est rénuméré
	 */
	private boolean renumere;
	/**
	 * Permet de savoir combien le Stage est rénuméré
	 */
	private float renumeration;
	/**
	 * Permet d'affecter l'identification du stage
	 */
	private static int identif=0;
	/**
	 * l'entreprise concerné par le Stage
	 * @see Entreprise
	 */
	private Entreprise entrepriseStage;
	/**
	 * L'étudiant concerné par le Stage
	 * @see Etudiant
	 */
	private Etudiant etudiantStage;
	
	
	public Stage(boolean renumereStage, float renumerationStage) {
		this.renumere = renumereStage;
		if(this.renumere){
			this.renumeration = renumerationStage;
		}
		else{
			this.renumeration = 0;
		}
		this.identifiant=Integer.toString(identif);
		identif++;
	}
	
	public Stage(boolean renumereStage) {
		this.renumere = renumereStage;
		this.renumeration = 0;
		this.identifiant=Integer.toString(identif);
		identif++;
		
	}
	
	public Stage(boolean renumere, float renumeration, Entreprise entrepriseStage,
			Etudiant etudiantStage) {
		this.renumere = renumere;
		this.renumeration = renumeration;
		this.entrepriseStage = entrepriseStage;
		this.etudiantStage = etudiantStage;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public boolean isRenumere() {
		return renumere;
	}

	public void setRenumere(boolean renumere) {
		this.renumere = renumere;
	}

	public float getRenumeration() {
		return renumeration;
	}

	public void setRenumeration(float renumeration) {
		this.renumeration = renumeration;
	}

	public static int getIdentif() {
		return identif;
	}

	public static void setIdentif(int identif) {
		Stage.identif = identif;
	}

	public Entreprise getEntrepriseStage() {
		return entrepriseStage;
	}

	public void setEntrepriseStage(Entreprise entrepriseStage) {
		this.entrepriseStage = entrepriseStage;
	}

	public Etudiant getEtudiantStage() {
		return etudiantStage;
	}

	public void setEtudiantStage(Etudiant etudiantStage) {
		this.etudiantStage = etudiantStage;
	}
	
	
	

}
