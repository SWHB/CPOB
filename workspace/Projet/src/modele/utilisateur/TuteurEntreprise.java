package modele.utilisateur;

import java.util.ArrayList;

import modele.entreprise.Entreprise;
import modele.planning.Soutenance;

/**
 * <b>Cette classe repr�sente la personne qui s'occupe de l'�tudiants en temps que tuteur au seins de l'entreprise</b>
 * @author Schlange
 *
 */
public class TuteurEntreprise extends Utilisateur{
	/**
	 * L'entreprise o� le tuteur travail
	 * @see Entreprise
	 */
	private Entreprise entreprise;
	/**
	 * 
	 * Les �tudiants sous la responsabilit� du tuteur
	 * @see Etudiant
	 * @see ArrayList
	 */
	private ArrayList<Etudiant> sesEtudiants;
	
	private ArrayList<Soutenance> sesSoutenaces;
	
	
	public TuteurEntreprise(String nomTuteur, String prenomTuteur, String adressePersoTuteur, String telTuteur, String adresseMailTuteur,
			String mdpTuteur, Entreprise ens) {
		super(nomTuteur, prenomTuteur, adressePersoTuteur, telTuteur, adresseMailTuteur, mdpTuteur);
		this.sesEtudiants= new ArrayList<Etudiant>();
		this.entreprise=ens;
		this.sesSoutenaces= new ArrayList<Soutenance>();
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
	
	public void ajoutSoutenance(Soutenance sout){
		this.sesSoutenaces.add(sout);
	}
	
}
