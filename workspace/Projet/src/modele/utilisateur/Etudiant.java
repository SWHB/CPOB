package modele.utilisateur;

import java.util.ArrayList;

import modele.document.Dossier;
import modele.entreprise.Entreprise;
import modele.planning.Soutenance;
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
	
	private TuteurEntreprise sonTuteurEntreprise;
	
	private Soutenance saSoutenance;
	
	public Etudiant(String nom, String prenom, String adressePerso, String tel, String adresseMail, String mdp,
			String groupe, Enseignant profReferent, Entreprise entrepriseStage, Stage sonStage, Dossier sonDossier,
			TuteurEntreprise sonTuteurEntreprise, Soutenance saSoutenance) {
		super(nom, prenom, adressePerso, tel, adresseMail, mdp);
		this.groupe = groupe;
		this.profReferent = profReferent;
		this.entrepriseStage = entrepriseStage;
		this.sonStage = sonStage;
		this.sonDossier = sonDossier;
		this.sonTuteurEntreprise = sonTuteurEntreprise;
		this.saSoutenance = saSoutenance;
	}


	public Etudiant(String nomEtudiant, String prenomEtudiant, String adressePersoEtudiant, String telEtudiant, String adresseMailEtudiant, String mdpEtudiant,
			String groupe) {
		super(nomEtudiant, prenomEtudiant, adressePersoEtudiant, telEtudiant, adresseMailEtudiant, mdpEtudiant);
		this.groupe = groupe;
		this.saSoutenance=null;
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

	public Soutenance getSaSoutenance() {
		return saSoutenance;
	}

	public void setSaSoutenance(Soutenance saSoutenance) {
		this.saSoutenance = saSoutenance;
	}

	public TuteurEntreprise getSonTuteurEntreprise() {
		return sonTuteurEntreprise;
	}

	public void setSonTuteurEntreprise(TuteurEntreprise sonTuteurEntreprise) {
		this.sonTuteurEntreprise = sonTuteurEntreprise;
	}
	
}
