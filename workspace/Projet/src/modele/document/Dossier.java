package modele.document;

import java.util.ArrayList;

import modele.utilisateur.Etudiant;

/**
 * <b>Cette Classe représente le dossier de l'étudiant</b>
 * @author Schlange
 *
 */
public class Dossier {
	
	/**
	 * Les documents nécessaires pour le stage
	 * @see Document
	 */
	private ArrayList<Document> lesDocuments;
	/**
	 * Le nombre de Document necessaire à l'étudiant
	 */
	private static final int nbDocument =6;
	/**
	 * L'étudiant rattaché au dossier
	 */
	private Etudiant etudiant;
	/**
	 * Créer un dossier pour l'étudiant
	 * @param etudiantDossier
	 * L'étudiant rattaché à ce dossier
	 */
	public Dossier( Etudiant etudiantDossier){
		this.etudiant=etudiantDossier;
		this.lesDocuments=Dossier.consistuerDossier();
	}
	/**
	 * Consistitue le dossier de façon à ce qu'il n'y est qu'un seul document par type par dossier
	 * @return la liste des documents nécessaires à l'étudiant;
	 */
	static ArrayList<Document> consistuerDossier(){
		ArrayList<Document> dossier = new ArrayList<>(Dossier.nbDocument);
		TypeDocument lesTypes[] = TypeDocument.values();
		for(TypeDocument typ : lesTypes){
			dossier.add(new Document(typ, false));
		}
		return dossier;
	}
	/**
	 * Indique qu'un document est complété
	 * @param docComplet
	 * Le document qui est complet
	 */
	public void documentRemplis(TypeDocument docComplet){
		for(Document docu : lesDocuments){
			if(docu.getTypeDocument()==docComplet){
				docu.setRemplis(true);
				break;
			}
		}
	}
	/**
	 * Indique qu'un document n'est pas complété
	 * @param docNonComplet
	 * Le document qui n'est pas complet
	 */
	public void documentNonRemplis(TypeDocument docNonComplet){
		for(Document docu : lesDocuments){
			if(docu.getTypeDocument()==docNonComplet){
				docu.setRemplis(false);
				break;
			}
		}
	}
	
	public ArrayList<Document> getLesDocuments() {
		return lesDocuments;
	}

	public void setLesDocuments(ArrayList<Document> lesDocuments) {
		this.lesDocuments = lesDocuments;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	/**
	 * 
	 * @return Renvoi vrai si tous les documents sont complété, faux sinon
	 */
	public boolean isComplet() {
		for(Document docu : lesDocuments){
			if(!docu.isRemplis()){
				return false;
			}
		}
		return true;
	}

	
}
