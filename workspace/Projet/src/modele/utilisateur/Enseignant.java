package modele.utilisateur;

import java.util.ArrayList;

/**
 * <b>Cette classe représente les enseignants référents d'un ou plusieurs étudiants</b>
 * @author Schlange
 *
 */
public class Enseignant extends Utilisateur{
	/**
	 * Les Etudiants dont l'enseignant est responsable
	 * @see Etudiant
	 * @see ArrayList
	 */
	private ArrayList<Etudiant> sesEtudiants;
	
	public Enseignant(String nomEnseignant, String prenomEnseignant, String adressePersoEnseignant, String telEnseignant, String adresseMailEnseignant, String mdpEnseignant) {
		super(nomEnseignant, prenomEnseignant, adressePersoEnseignant, telEnseignant, adresseMailEnseignant, mdpEnseignant);
		this.sesEtudiants = new ArrayList<Etudiant>();
	}

	public ArrayList<Etudiant> getSesEtudiants() {
		return sesEtudiants;
	}

	public void setSesEtudiants(ArrayList<Etudiant> sesEtudiants) {
		this.sesEtudiants = sesEtudiants;
	}
	
	public void ajouterEtudiant(Etudiant etudiant){
		this.sesEtudiants.add(etudiant);
	}
	
}
