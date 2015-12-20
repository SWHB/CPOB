package modele.document;
/**
 * <b>Cette classe représente les différents types de Documents possibles.</b>
 * @author Schlange
 *
 */
public enum TypeDocument{
	FEUILLEEMARGEMENT("feuille d'émargement"),
	CONSIGNEJURY("consigne jury"),
	FEUILLELOCALISATIONSTAGE("feuille de localisation stage"),
	FICHEAPPRECIATION("fiche d'appreciation"),
	FICHEAVISETUDIANT("fiche avis de l'étudiant"),
	FEUILLENOTATION("feuille de notation");		
	private String nomDocument;
	
	TypeDocument(String optionType) {
		this.nomDocument = optionType;
	}
	
	public String toString() {
		return nomDocument;
	}		
}
