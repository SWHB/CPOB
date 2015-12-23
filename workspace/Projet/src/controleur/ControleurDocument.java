package controleur;

import java.util.ArrayList;
import modele.document.*;
import modele.utilisateur.Etudiant;

public class ControleurDocument {
	
	private ArrayList<Document> lesDocuments;
	private ArrayList<Dossier> lesDossiers;
	
	public ControleurDocument(){
		this.lesDocuments = new ArrayList<Document>();
	}
	
	public void ajoutDocument(Document doc){
		this.lesDocuments.add(doc);
	}
	
	public void ajoutDossier(Dossier dos){
		this.lesDossiers.add(dos);
	}
	
	public boolean dossierExist(Dossier dos){
		for(Dossier doss : this.lesDossiers){
			if(dos == doss){
				return true;
			}
		}
		return false;
	}
	
	public boolean dossierExist(Etudiant etu){
		for(Dossier doss : this.lesDossiers){
			if(doss.getEtudiant()==etu){
				return true;
			}
		}
		return false;
	}
	
	
}
