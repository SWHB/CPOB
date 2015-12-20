package controleur;

import java.util.ArrayList;

import modele.utilisateur.*;

public class ControleurUtilisateur {
	
	private ArrayList<Utilisateur> lesUtilisateurs;
	
	public ControleurUtilisateur(){
		lesUtilisateurs = new ArrayList<Utilisateur>();
	}
	
	public void ajouterEtudiant(String nomEtudiant, String prenomEtudiant, String adressePersoEtudiant, String telEtudiant, String adresseMailEtudiant, String mdpEtudiant,
			String groupe){
		this.ajouterUtilisateur(new Etudiant(nomEtudiant, prenomEtudiant, adressePersoEtudiant, telEtudiant, adresseMailEtudiant, mdpEtudiant, groupe));
	}
	
	public void ajouterTuteurEntreprise(String nomTuteur, String prenomTuteur, String adressePersoTuteur, String telTuteur, String adresseMailTuteur,
			String mdpTuteur){
		this.ajouterUtilisateur( new TuteurEntreprise( nomTuteur, prenomTuteur, adressePersoTuteur,  telTuteur,  adresseMailTuteur, mdpTuteur));
	}
	
	public void ajouterEnseignant(String nomEnseignant, String prenomEnseignant, String adressePersoEnseignant, String telEnseignant, String adresseMailEnseignant, String mdpEnseignant) {
		this.ajouterUtilisateur( new Enseignant(nomEnseignant, prenomEnseignant, adressePersoEnseignant, telEnseignant, adresseMailEnseignant, mdpEnseignant));
	}
	
	public void ajouterUtilisateur(Utilisateur util){
		lesUtilisateurs.add(util);
	}
	
	public boolean rechercherUtilisateur(Utilisateur recheEtu){
		for(Utilisateur util : lesUtilisateurs){ 
			if(util.getClass()==recheEtu.getClass()){
				System.out.println("ok");
				if(util.comparerUtil(recheEtu)){
					return true;
				}				
			}
		}
		return false;
	}
	
	public boolean rechercherUtilisateur(String nom, String prenom){
		for(Utilisateur util : lesUtilisateurs){
			if(util.comparerUtil(nom, prenom)){
				return true;
			}
		}
		return false;
	}
	
}
