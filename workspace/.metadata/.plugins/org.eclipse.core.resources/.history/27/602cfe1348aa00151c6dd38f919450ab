package modele.utilisateur;

import java.util.ArrayList;

import modele.entreprise.Entreprise;

/**
 * <b>Cette classe représente la personne qui s'occupe de l'étudiants en temps que tuteur au seins de l'entreprise</b>
 * @author Schlange
 *
 */
public class TuteurEntreprise extends Utilisateur{
	/**
	 * L'entreprise où le tuteur travail
	 * @see Entreprise
	 */
	private Entreprise entreprise;
	/**
	 * 
	 * Les étudiants sous la responsabilité du tuteur
	 * @see Etudiant
	 * @see ArrayList
	 */
	private ArrayList<Etudiant> sesEtudiants;
	
	
	public TuteurEntreprise(String nomTuteur, String prenomTuteur, String adressePersoTuteur, String telTuteur, String adresseMailTuteur,
			String mdpTuteur) {
		super(nomTuteur, prenomTuteur, adressePersoTuteur, telTuteur, adresseMailTuteur, mdpTuteur);
		this.sesEtudiants= new ArrayList<Etudiant>();
	}

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	public ArrayList<Etudiant> getSesEtudiants() {
		return sesEtudiants;
	}

	public void setSesEtudiants(ArrayList<Etudiant> sesEtudiants) {
		this.sesEtudiants = sesEtudiants;
	}
	
	public void ajoutEtudiant(Etudiant etudiant){
		this.sesEtudiants.add(etudiant);
	}
	
}
