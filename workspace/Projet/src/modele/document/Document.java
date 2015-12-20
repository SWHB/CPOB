package modele.document;
/**
 * <b>Cette Classe représente les documents que les étudiants doivent complétés</b>
 * @author Schlange
 *
 */
public class Document {
	/**
	 * Le type de document, il ne peut pas être changé
	 * @see TypeDocument
	 */
	private final TypeDocument typeDocument;
	/**
	 * Si le document est rempli ou non
	 */
	private boolean remplis;
	
	public Document(final TypeDocument type, boolean remplis){
		this.typeDocument=type;
		this.remplis=remplis;
	}

	public TypeDocument getTypeDocument() {
		return typeDocument;
	}

	public boolean isRemplis() {
		return remplis;
	}

	public void setRemplis(boolean remplis) {
		this.remplis = remplis;
	}
	
	
}
