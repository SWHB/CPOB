package modele.utilisateur;
/**
 * <b>Cette Classe représente les utilisateurs de l'application</b>
 * @author Schlange
 *
 */
public abstract class Utilisateur {
	/**
	 * Le nom de l'utilisateur
	 */
	protected String nom;
	/**
	 * Le prénom de l'utilisateur
	 */
	protected String prenom;
	/**
	 * L'identifiant de l'utilisateur généré automatiquement par la classe
	 */
	private String identifiant;
	/**
	 * l'adresse personnelle de l'utilisateur
	 */
	protected String adressePerso;
	/**
	 * Le numéro de téléphone de l'utilisateur
	 */
	protected String tel;
	/**
	 * L'adresse mail de l'utilisateur
	 */
	protected String adresseMail;
	/**
	 * Le mot de passe de l'utilisateur
	 */
	protected String mdp;
	/**
	 * Pour savoir si la personne est vide
	 */
	protected boolean vide;
	/**
	 * Permet de donner un identifiant unique à chacun
	 */
	protected static int identifNum=0;
	/**
	 * Les Disponibilités de l'utilisateur
	 * @see Disponibilite
	 */
	
	public Utilisateur(){
		vide=true;
		this.identifiant=Integer.toString(identifNum);
		identifNum++;
	}

	public Utilisateur(String nom, String prenom, String adressePerso, String tel, String adresseMail,
			String mdp) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adressePerso = adressePerso;
		this.tel = tel;
		this.adresseMail = adresseMail;
		this.mdp = mdp;
		this.vide=false;
		this.identifiant=Integer.toString(identifNum);
		identifNum++;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getAdressePerso() {
		return adressePerso;
	}

	public void setAdressePerso(String adressePerso) {
		this.adressePerso = adressePerso;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAdresseMail() {
		return adresseMail;
	}

	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public boolean isVide() {
		return vide;
	}
	
	public boolean comparerUtil(Utilisateur util){
		return (this.adresseMail == util.adresseMail &&
				this.adressePerso==util.adressePerso &&
				this.mdp==util.mdp &&
				this.nom == util.nom &&
				this.prenom == util.prenom &&
				this.tel == util.tel);
	}
	
	public boolean comparerUtil(String nom, String prenom){
		return (this.nom == nom &&
				this.prenom == prenom);
	}
}
