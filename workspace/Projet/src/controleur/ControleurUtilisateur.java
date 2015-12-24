package controleur;

import java.util.ArrayList;

import modele.planning.Soutenance;
import modele.utilisateur.*;
/**
 * Controleur des Utilisateurs
 * @author Schlange
 *
 */
public class ControleurUtilisateur {
	/**
	 * Liste contenant les utilisateurs
	 * @see Utilisateur
	 * @see Enseignant
	 * @see Etudiant
	 * @see TuteurEntreprise
	 * @see ArrayList
	 */
	private ArrayList<Utilisateur> lesUtilisateurs;
	/**
	 * Cr�ation du controleur
	 */
	public ControleurUtilisateur(){
		lesUtilisateurs = new ArrayList<Utilisateur>();
	}
	/**
	 * Ajout d'un Etudiant
	 * @param nomEtudiant
	 * @param prenomEtudiant
	 * @param adressePersoEtudiant
	 * @param telEtudiant
	 * @param adresseMailEtudiant
	 * @param mdpEtudiant
	 * @param groupe
	 * @see Etudiant
	 */
	public void ajouterEtudiant(String nomEtudiant, String prenomEtudiant, String adressePersoEtudiant, String telEtudiant, String adresseMailEtudiant, String mdpEtudiant,
			String groupe){
		
		this.ajouterUtilisateur(new Etudiant(nomEtudiant, prenomEtudiant, adressePersoEtudiant, telEtudiant, adresseMailEtudiant, mdpEtudiant, groupe));
	}
	/**
	 * Ajout d'un TuteurEntreprise
	 * @param nomTuteur
	 * @param prenomTuteur
	 * @param adressePersoTuteur
	 * @param telTuteur
	 * @param adresseMailTuteur
	 * @param mdpTuteur
	 * @see TuteurEntreprise
	 */
	public void ajouterTuteurEntreprise(String nomTuteur, String prenomTuteur, String adressePersoTuteur, String telTuteur, String adresseMailTuteur,
			String mdpTuteur){
		this.ajouterUtilisateur( new TuteurEntreprise( nomTuteur, prenomTuteur, adressePersoTuteur,  telTuteur,  adresseMailTuteur, mdpTuteur));
	}
	/**
	 * Ajout d'une Enseignant
	 * @param nomEnseignant
	 * @param prenomEnseignant
	 * @param adressePersoEnseignant
	 * @param telEnseignant
	 * @param adresseMailEnseignant
	 * @param mdpEnseignant
	 * @see Enseignant
	 */
	public void ajouterEnseignant(String nomEnseignant, String prenomEnseignant, String adressePersoEnseignant, String telEnseignant, String adresseMailEnseignant, String mdpEnseignant) {
		this.ajouterUtilisateur( new Enseignant(nomEnseignant, prenomEnseignant, adressePersoEnseignant, telEnseignant, adresseMailEnseignant, mdpEnseignant));
	}
	/**
	 * Ajout d'un Utilisateur
	 * @param util
	 * @see Utilisateur
	 */
	public void ajouterUtilisateur(Utilisateur util){
		if(!this.rechercherUtilisateur(util)){
			lesUtilisateurs.add(util);
		}
	}
	
	/**
	 * Regarde si un utilisateur existe
	 * @param recheUti
	 * @return
	 */
	public boolean rechercherUtilisateur(Utilisateur recheUti){
		for(Utilisateur util : lesUtilisateurs){ 
			if(util.getClass()==recheUti.getClass()){
				System.out.println("ok");
				if(util.comparerUtil(recheUti)){
					return true;
				}				
			}
		}
		return false;
	}
	/**
	 * Regarde si un utilisateur existe
	 * @param nom
	 * @param prenom
	 * @return
	 */
	public boolean rechercherUtilisateur(String nom, String prenom){
		for(Utilisateur util : lesUtilisateurs){
			if(util.comparerUtil(nom, prenom)){
				return true;
			}
		}
		return false;
	}
	
	public Utilisateur renvoiUtilisateur(Utilisateur recheUti){
		for(Utilisateur util : lesUtilisateurs){ 
			if(util.getClass()==recheUti.getClass()){
				System.out.println("ok");
				if(util.comparerUtil(recheUti)){
					return util;
				}				
			}
		}
		return null;
	}
	/**
	 * Regarde si un utilisateur existe
	 * @param nom
	 * @param prenom
	 * @return
	 */
	public Utilisateur renvoiUtilisateur(String nom, String prenom){
		for(Utilisateur util : lesUtilisateurs){
			if(util.comparerUtil(nom, prenom)){
				return util;
			}
		}
		return null;
	}
	
	public void ajoutSoutenanceEtudiant(Etudiant etu, Soutenance sout){
		for(Utilisateur util : lesUtilisateurs){ 
			if(util.getClass()==etu.getClass()){
				System.out.println("ok");
				if(util.comparerUtil(etu)){
					((Etudiant)util).setSaSoutenance(sout);;
				}				
			}
		}
	}
	
	public void retirerSoutenanceEtudiant(Etudiant etu){
		for(Utilisateur util : lesUtilisateurs){ 
			if(util.getClass()==etu.getClass()){
				System.out.println("ok");
				if(util.comparerUtil(etu)){
					((Etudiant)util).setSaSoutenance(null);;
				}				
			}
		}
	}
	
}
