package modele.planning;
import java.util.ArrayList;
import java.util.Date;
/**
 * <b>Cette classe repr�sente le planning des soutenances</b>
 * On cr�e un singleton car il n'y a qu'un planning par application, il faudra donc d�finir la p�riode de soutenance
 * @author Schlange
 *
 */
public class Planning {
	/**
	 * Date de d�but des soutenances
	 * @see Date
	 */
	private Date dateDebut;
	/**
	 * Date de fin des soutenances
	 */
	private Date dateFin;
	/**
	 * Les soutenances du planning
	 */
	private ArrayList<Soutenance> lesSoustenances;
	
	public  Planning(Date debut, Date fin){
		this.dateDebut=debut;
		this.dateFin=fin;
		this.lesSoustenances= new ArrayList<Soutenance>();
	}
	
	private static Planning INSTANCE =null;
	
	public static synchronized Planning getInstance(Date debut, Date fin){
		if(INSTANCE==null){
			INSTANCE = new Planning(debut, fin);
		}
		return INSTANCE;
	}
	
	public boolean rechercherSoutenance(Soutenance s)
	{
		boolean trouve=false;
		
		for(Soutenance sout:lesSoustenances)
		{
			if(sout.toString()==s.toString())
			{
				trouve=true;
			}
			else
			{
				trouve=false;
			}
		}
		return trouve;
	}
	
	public void ajoutSoutenance(Soutenance s)
	{
		this.lesSoustenances.add(s);
	}
	
	public void supprimerSoutenance(Soutenance s)
	{
		this.lesSoustenances.remove(s);
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public ArrayList<Soutenance> getLesSoustenances() {
		return lesSoustenances;
	}

	public void setLesSoustenances(ArrayList<Soutenance> lesSoustenances) {
		this.lesSoustenances = lesSoustenances;
	}

	public static Planning getINSTANCE() {
		return INSTANCE;
	}

	public static void setINSTANCE(Planning iNSTANCE) {
		INSTANCE = iNSTANCE;
	}
	/**
	 * permet d'ajouter une soutenance au planning
	 * @param sout
	 * @return vrai si la Soutenance � bien �t� ajouter, faux sinon
	 */
	public boolean ajouterSoutenance(Soutenance sout){
		if(this.verifSoutenance(sout)){
			this.lesSoustenances.add(sout);
			return true;
		}
		return false;
	}
	/**
	 * V�rifie si la soutenance peut �tre ajouter au planning
	 * @param sout
	 * @return
	 * 		vrai si la soutenance est contenu dans l'intervale du planning, faux sinon
	 */
	public boolean verifSoutenance(Soutenance sout){
		if(sout.getDateDebut().after(this.dateDebut) && sout.getDateFin().before(this.dateFin)){
			return true;
		}
		return false;
	}
	
	
}
