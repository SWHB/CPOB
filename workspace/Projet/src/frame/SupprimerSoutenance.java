package frame;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SupprimerSoutenance extends JPanel implements ActionListener{
	
	private JLabel stage;
	private JLabel nometu;
	private JLabel prenometu;
	
	private JTextField stg;
	private JTextField nom;
	private JTextField prenom;
	
	private JButton supp;
	private JButton annuler;
	
	public SupprimerSoutenance()
	{
		stage=new JLabel("Stage :");
		stg=new JTextField(10);
		
		nometu=new JLabel("Nom :");
		nom=new JTextField(10);
		
		prenometu=new JLabel("pr�nom :");
		prenom=new JTextField(10);
		
		supp=new JButton("Supprimer");
		annuler=new JButton("Annuler");
		
		this.add(stage);
		this.add(stg);
		this.add(nometu);
		this.add(nom);
		this.add(prenometu);
		this.add(prenom);
		this.add(supp);
		this.add(annuler);
		this.setLayout(new GridLayout(4,1));
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==annuler)
		{
			
		}
		
	}
}
