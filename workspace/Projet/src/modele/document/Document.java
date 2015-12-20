package modele.document;
/**
 * <b>Cette Classe repr�sente les documents que les �tudiants doivent compl�t�s</b>
 * @author Schlange
 *
 */
public class Document {
	/**
	 * Le type de document, il ne peut pas �tre chang�
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
