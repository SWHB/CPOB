package panel;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.*;

import frame.FrameSoutenance;
import modele.planning.Planning;
import modele.planning.Soutenance;
import modele.stage.Stage;
import modele.utilisateur.Etudiant;
import modele.utilisateur.Jury;

public class SupprimerSoutenance extends JPanel implements ActionListener {
	
	private JLabel stage;
	private JLabel datedeb;
	private JLabel datefin;
	private JLabel heuredeb;
	private JLabel heurefin;
	private JLabel jury;
	
	private JTextField stg;
	private JTextField datdeb;
	private JTextField datfin;
	private JTextField heurdeb;
	private JTextField heurfin;
	private JTextField jr;
	
	private JButton supp;
	private JButton annuler;
	
	public SupprimerSoutenance()
	{
		stage=new JLabel("Stage :");
		stg=new JTextField(10);
		
		datedeb=new JLabel("Date de début :");
		datdeb=new JTextField(10);
		
		datefin=new JLabel("Date de fin :");
		datfin=new JTextField(10);
		
		heuredeb=new JLabel("Début heure :");
		heurdeb=new JTextField(10);
		
		heurefin=new JLabel("Fin de l'heure :");
		heurfin=new JTextField(10);
		
		jury=new JLabel("Jury :");
		jr=new JTextField(5);
		
		supp=new JButton("Supprimer");
		annuler=new JButton("Annuler");
		
		this.add(stage);
		this.add(stg);
		this.add(datedeb);
		this.add(datdeb);
		this.add(datefin);
		this.add(datfin);
		this.add(heuredeb);
		this.add(heurdeb);
		this.add(heurefin);
		this.add(heurfin);
		this.add(jury);
		this.add(jr);
		this.add(supp);
		this.add(annuler);
		this.setLayout(new GridLayout(7,1));
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==annuler)
		{
			this.setVisible(false);
		}
		if(e.getSource()==supp)
		{	
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy");
			try {
				if(new Planning(sdf.parse(datdeb.getText()),sdf.parse(datfin.getText())).rechercherSoutenance
						(new Soutenance(new Stage(stg.getText()), sdf.parse(datdeb.getText()),sdf.parse(datfin.getText()),new Jury(jr.getText(),new Stage(stg.getText())))))
				{
					new Planning(sdf.parse(datdeb.getText()),sdf.parse(datfin.getText())).supprimerSoutenance(new Soutenance(new Stage(stg.getText()), sdf.parse(datdeb.getText()),
																	sdf.parse(datfin.getText()),new Jury(jr.getText(),new Stage(stg.getText()))));
				}
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
