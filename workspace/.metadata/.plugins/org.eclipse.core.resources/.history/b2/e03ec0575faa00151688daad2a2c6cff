package modele.entreprise;

import java.util.ArrayList;

import modele.stage.Stage;
import modele.utilisateur.*;

/**
 * <b>Cette classe représente les entreprises où les étudiants effectuent leur stage</b>
 * @author Schlange
 *
 */
public class Entreprise {
	/**
	 * Le nom de l'entreprise
	 */
	private String nom;
	/**
	 * L'adresse de l'entreprise
	 */
	private String adresse;
	/**
	 * Les etudiants qui effectuent un stage dans l'entreprise
	 * @see Etudiant
	 * @see ArrayList
	 */
	private ArrayList<Etudiant> sesEtudiants;
	/**
	 * Les employées responsables des étudiants en stage
	 * @see TuteurEntreprise
	 * @see ArrayList
	 */
	private ArrayList<TuteurEntreprise> sesTuteurs;
	/**
	 * Les Stages effectués au seins de l'entreprise
	 * @see Stage
	 * @see ArrayList
	 */
	private ArrayList<Stage> sesStages;
	
	public Entreprise(String nomEntreprise, String adresseEntrepise) {
		this.nom = nomEntreprise;
		this.adresse = adresseEntrepise;
		this.sesEtudiants = new ArrayList<Etudiant>();
		this.sesStages = new ArrayList<Stage>();
		this.sesTuteurs = new ArrayList<TuteurEntreprise>();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public ArrayList<Etudiant> getSesEtudiants() {
		return sesEtudiants;
	}

	public void setSesEtudiants(ArrayList<Etudiant> sesEtudiants) {
		this.sesEtudiants = sesEtudiants;
	}

	public ArrayList<TuteurEntreprise> getTuteur() {
		return sesTuteurs;
	}

	public void setTuteur(ArrayList<TuteurEntreprise> tuteur) {
		this.sesTuteurs = tuteur;
	}
	
	public void ajoutEtudiant(Etudiant etudiantAjout){
		this.sesEtudiants.add(etudiantAjout);
	}
	
	public void ajoutTuteur(TuteurEntreprise tuteur){
		this.sesTuteurs.add(tuteur);
	}
	
	public void ajoutStages(Stage stageEtudiant){
		this.sesStages.add(stageEtudiant);
	}	
	
}
