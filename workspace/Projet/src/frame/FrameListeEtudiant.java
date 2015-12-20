package frame;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;


public class FrameListeEtudiant extends JFrame {
		
	private ArrayList<String> lesvoies;
	private JList<String>listEtu;
	private JLabel lbletu;
	private String etudiant[];
	private String infoetu[];
		
		
		public FrameListeEtudiant()
		{
			super("Liste �tudiant");
						
			this.setVisible(true);
			this.pack();
			this.setVisible(true);
			this.setSize(500, 500);
			this.setLocationRelativeTo(null);
			//test 
			etudiant=new String[100];
			infoetu=new String[100];
			etudiant[0]="Assous Hakim";
			etudiant[1]="Pourouchottamane Srivatsa";
			etudiant[2]="Ogez William";
			etudiant[3]="Pujos Bastien";
			
			this.creercomposant();			
		}
		
		public void creercomposant()
		{
		 this.lbletu=new JLabel();
		 this.lbletu.setBorder(BorderFactory.createTitledBorder( "Informations �tudiant:"));
		 this.add(this.lbletu, BorderLayout.CENTER);
		 this.listEtu=new JList<String>(this.etudiant);
		 this.listEtu.setFixedCellHeight(20);
		 this.listEtu.setFixedCellWidth(300);
		 this.listEtu.setBorder(BorderFactory.createTitledBorder( "Liste �tudiant:"));
		 this.add(this.listEtu, BorderLayout.WEST);		
		 }
		
		//M�thode pour l'affichage des information � partir un JList sur un JLabel
		public void valueChanged(ListSelectionEvent e) {
			if (e.getValueIsAdjusting() == false) 
			{
				this.lbletu.setText(this.lesvoies.get(this.listEtu.getSelectedIndex()).toString());
			}
					
				}

		public static void main(String args[])
		{
			FrameListeEtudiant fl=new FrameListeEtudiant();
		}
}
