package controleur;

import java.util.ArrayList;

import modele.entreprise.Entreprise;

public class ControlEntreprise {
	
	private ArrayList<Entreprise> lesEntreprises;
	
	public ControlEntreprise(){
		this.lesEntreprises = new ArrayList<Entreprise>();
	}
	
	public void ajouterEntreprise(Entreprise ent){
		if (!this.lesEntreprises.contains(ent)){
			this.lesEntreprises.add(ent);
		}
	}
	
	public void ajouterEntreprise(String nomEntreprise, String adresseEntrepise){
		this.ajouterEntreprise(new Entreprise(nomEntreprise, adresseEntrepise));
	}
	
	public boolean entrepriseExist(String nomEntreprise, String adresseEntrepise){
		for(Entreprise ent : this.lesEntreprises){
			if(ent.getAdresse()==adresseEntrepise && ent.getNom()==nomEntreprise){
				return true;
			}
		}
		return false;
	}
	
	public Entreprise RechercheEntreprise(String nomEntreprise, String adresseEntrepise){
		for(Entreprise ent : this.lesEntreprises){
			if(ent.getAdresse()==adresseEntrepise && ent.getNom()==nomEntreprise){
				return ent;
			}
		}
		return null;
	}

	public ArrayList<Entreprise> getLesEntreprises() {
		return lesEntreprises;
	}

	public void setLesEntreprises(ArrayList<Entreprise> lesEntreprises) {
		this.lesEntreprises = lesEntreprises;
	}
	
	
}
