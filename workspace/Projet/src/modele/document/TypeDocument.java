package modele.document;
/**
 * <b>Cette classe repr�sente les diff�rents types de Documents possibles.</b>
 * @author Schlange
 *
 */
public enum TypeDocument{
	FEUILLEEMARGEMENT("feuille d'�margement"),
	CONSIGNEJURY("consigne jury"),
	FEUILLELOCALISATIONSTAGE("feuille de localisation stage"),
	FICHEAPPRECIATION("fiche d'appreciation"),
	FICHEAVISETUDIANT("fiche avis de l'�tudiant"),
	FEUILLENOTATION("feuille de notation");		
	private String nomDocument;
	
	TypeDocument(String optionType) {
		this.nomDocument = optionType;
	}
	
	public String toString() {
		return nomDocument;
	}		
}
