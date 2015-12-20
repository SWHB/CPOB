package modele.utilisateur;

import modele.document.Dossier;
import modele.entreprise.Entreprise;
import modele.stage.Stage;

/**
 * <b>Cette classe repr�sente les �tudiants participant aux stages</b>
 * @author Schlange
 *
 */
public class Etudiant extends Utilisateur{
	/**
	 * Le groupe de l'utilisateur
	 */
	private String groupe;
	/**
	 * L'enseignant r�f�rent de l'�tudiant
	 * @see Enseignant
	 */
	private Enseignant profReferent;
	/**
	 * L'entreprise o� l'�tudiant effectue son stage
	 * @see Entreprise
	 */
	private Entreprise entrepriseStage;
	/**
	 * Le stage de l'�tudiant
	 * @see Stage
	 */
	private Stage sonStage;
	/**
	 * Le dossier de l'�tudiant
	 * @see Dossier
	 */
	private Dossier sonDossier;
	
	public Etudiant(String nomEtudiant, String prenomEtudiant, String adressePersoEtudiant, String telEtudiant, String adresseMailEtudiant, String mdpEtudiant,
			String groupe) {
		super(nomEtudiant, prenomEtudiant, adressePersoEtudiant, telEtudiant, adresseMailEtudiant, mdpEtudiant);
		this.groupe = groupe;
	}

	public Entreprise getEntrepriseStage() {
		return entrepriseStage;
	}

	public void setEntrepriseStage(Entreprise entrepriseStage) {
		this.entrepriseStage = entrepriseStage;
	}

	public String getGroupe() {
		return groupe;
	}

	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}

	public Enseignant getProfReferent() {
		return profReferent;
	}

	public void setProfReferent(Enseignant profReferent) {
		this.profReferent = profReferent;
	}

	public Stage getSonStage() {
		return sonStage;
	}

	public void setSonStage(Stage sonStage) {
		this.sonStage = sonStage;
	}

	public Dossier getSonDossier() {
		return sonDossier;
	}

	public void setSonDossier(Dossier sonDossier) {
		this.sonDossier = sonDossier;
	}

}
