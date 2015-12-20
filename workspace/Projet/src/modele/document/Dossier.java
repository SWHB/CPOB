package modele.document;

import java.util.ArrayList;

import modele.utilisateur.Etudiant;

/**
 * <b>Cette Classe repr�sente le dossier de l'�tudiant</b>
 * @author Schlange
 *
 */
public class Dossier {
	
	/**
	 * Les documents n�cessaires pour le stage
	 * @see Document
	 */
	private ArrayList<Document> lesDocuments;
	/**
	 * Le nombre de Document necessaire � l'�tudiant
	 */
	private static final int nbDocument =6;
	/**
	 * L'�tudiant rattach� au dossier
	 */
	private Etudiant etudiant;
	/**
	 * Cr�er un dossier pour l'�tudiant
	 * @param etudiantDossier
	 * L'�tudiant rattach� � ce dossier
	 */
	public Dossier( Etudiant etudiantDossier){
		this.etudiant=etudiantDossier;
		this.lesDocuments=Dossier.consistuerDossier();
	}
	/**
	 * Consistitue le dossier de fa�on � ce qu'il n'y est qu'un seul document par type par dossier
	 * @return la liste des documents n�cessaires � l'�tudiant;
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
	 * Indique qu'un document est compl�t�
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
	 * Indique qu'un document n'est pas compl�t�
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
	 * @return Renvoi vrai si tous les documents sont compl�t�, faux sinon
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
