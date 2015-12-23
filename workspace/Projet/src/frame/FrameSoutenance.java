package frame;



import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

import modele.planning.Soutenance;
import modele.stage.Stage;
import modele.utilisateur.Etudiant;
import modele.utilisateur.Jury;
import panel.SupprimerSoutenance;

public class FrameSoutenance extends JFrame implements ActionListener{
	
	//info etudiant
	private JLabel infoEtudiant;
	private JLabel firstnameetu;
	private JLabel lastnameetu;
	private JLabel emailetu;
	private JLabel groupe;
	private JLabel phoneetu;
	private JLabel stage;
	private JTextField prenometu;
	private JTextField grp;
	private JTextField nometdu;
	private JTextField email;
	private JTextField tel;
	private JTextField stg;
	
	//info soutenance
	private JLabel date;
	private JLabel heuredeb;
	private JLabel heurefin;
	private JLabel classroom;
	private JLabel jury;
	private JLabel document;
	
	//saisie info soutenance
	private JTextField dat;
	private JTextField heurdeb;
	private JTextField heurfin;
	private JComboBox<String> salle;
	private JComboBox<String>jur;
	private JButton documents;
	
	private JButton creersout;
	private JButton suppsout;
	private JButton consullist;
	
	private JMenu menu;
	private JMenu menuEdition;
	private JMenu menuView;
	private JMenu menuAide;
	private JMenuItem menuItemLoad;
	private JMenuItem menuItemSave;
	private JMenuItem menuItemQuit;
	
	private JMenuItem menuItemView;
	private JMenuItem menuItemMonth;
	private JMenuItem menuItemWeek;
	private JMenuItem menuItemDay;
	
	private JMenuItem menuItemAbout;
	
	private JMenuItem menuItem;
	
	//panel info soutenance
	private JPanel pnlsout;
	
	//panel calendrier
	private JPanel pnlcal;
	
	//test salle
	private String[] listjury = { "1", "2", "3", "4", "5" };
	
	//test salle
	private String[] classe = { "I107", "I105", "I200", "D103", "I210" };
	
	//test doc
	private String[] docs = { "stage", "entreprise", "fonction",  };
	
	private Etudiant etu;
	private Soutenance sout;
	
	public FrameSoutenance() {
		super("Soutenance");
		
		SupprimerSoutenance s=new SupprimerSoutenance();
		
		infoEtudiant=new JLabel("Information �tudiant:");
		
		firstnameetu=new JLabel("pr�nom :");
		prenometu=new JTextField(10);
		
		lastnameetu=new JLabel("nom :");
		nometdu=new JTextField(20);
		
		groupe=new JLabel("Groupe :");
		grp=new JTextField(5);
		
		emailetu=new JLabel("Email :");
		email=new JTextField(10);
		
		phoneetu=new JLabel("T�l�phone :");
		tel=new JTextField(10);
		
		stage=new JLabel("Stage :");
		stg=new JTextField(10);
		
		date=new JLabel("Date :");
		dat=new JTextField(5);
		
		heuredeb=new JLabel("Heure de d�but :");
		heurdeb=new JTextField(5);
		
		heurefin=new JLabel("Heure de fin :");
		heurfin=new JTextField(5);
		
		classroom=new JLabel("Salle :");
		salle=new JComboBox<>(classe);
		
		jury=new JLabel("Jury :");
		jur=new JComboBox<>(listjury);
		
		document=new JLabel("Document");
		documents=new JButton("Parcourrir");
		documents.addActionListener(this);
		
		creersout=new JButton("Ajouter soutenance");
		creersout.addActionListener(this);
		
		suppsout=new JButton("Supprimer soutenance");
		suppsout.addActionListener(this);
		
		consullist=new JButton("Consulter liste �tudiant");
		consullist.addActionListener(this);
		
		pnlsout=new JPanel();
		pnlcal=new JPanel();
		
		pnlsout.add(firstnameetu);
		pnlsout.add(prenometu);
		
		pnlsout.add(lastnameetu);
		pnlsout.add(nometdu);
		
		pnlsout.add(firstnameetu);
		pnlsout.add(prenometu);
		
		pnlsout.add(groupe);
		pnlsout.add(grp);
		
		pnlsout.add(emailetu);
		pnlsout.add(email);
		
		pnlsout.add(phoneetu);
		pnlsout.add(tel);
		
		pnlsout.add(stage);
		pnlsout.add(stg);
		
		pnlsout.add(jury);
		pnlsout.add(jur);
		
		pnlsout.add(classroom);
		pnlsout.add(salle);
		
		pnlsout.add(date);
		pnlsout.add(dat);
		
		pnlsout.add(heuredeb);
		pnlsout.add(heurdeb);
		
		pnlsout.add(heurefin);
		pnlsout.add(heurfin);
		
		pnlsout.add(document);
		pnlsout.add(documents);
		
		pnlsout.add(creersout);
		pnlsout.add(suppsout);
		
		menu = new JMenu("File");
		menuEdition= new JMenu("Edit");
		menuView= new JMenu("View");
		menuAide= new JMenu("Help");
		
		
		menuItemLoad=new JMenuItem("Load");
		menuItemSave=new JMenuItem("Save");
		menuItemQuit=new JMenuItem("Quit");
		
		menuItemView=new JMenuItem("View");
		menuItemMonth=new JMenuItem("Month");
		menuItemWeek=new JMenuItem("Week");
		menuItemDay=new JMenuItem("Day");
		
		menuItemDay.addActionListener(this);
		menuItemMonth.addActionListener(this);
		menuItemWeek.addActionListener(this);
		
		menuItemAbout=new JMenuItem("About");
		
		menuItemLoad.addActionListener(this);
		
		menuItemSave.addActionListener(this);
		
		menuItemQuit.addActionListener(this);
		
		menuItemAbout.addActionListener(this);
		
		
		menu.add(menuItemSave);
		menu.add(menuItemQuit);
		
		menuView.add(menuItemMonth);
		menuView.add(menuItemWeek);
		menuView.add(menuItemDay);
		
		menuEdition.add(menuView);
		
		menuAide.add(menuItemAbout);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(menu);
		menuBar.add(menuEdition);
		menuBar.add(menuAide);
		menuBar.add(menu);
		menuBar.add(menuEdition);
		menuBar.add(menuAide);
		this.setJMenuBar(menuBar);
		
		this.setVisible(true);
		
		this.pack();
		
		this.setSize(600,400);
	
		this.setLocationRelativeTo(null);
		this.add(pnlsout,BorderLayout.WEST);
		this.add(pnlcal,BorderLayout.EAST);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pnlsout.setLayout(new GridLayout(13,2));	
		
	}
	
	public static void main(String args[])
	{
		FrameSoutenance f=new FrameSoutenance();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==suppsout)
		{	
			this.setSize(700,200);
			this.remove(pnlsout);
			this.remove(pnlcal);
			this.setLocationRelativeTo(null);
			this.setVisible(true);
			// soit un nouveau panel SupprimerSoutenance()
			this.add(new SupprimerSoutenance(),BorderLayout.WEST);
			
			// soit supprimer direct
			
		}
		
		
		if(e.getSource()==documents)
		{
			 JFileChooser chooser = new JFileChooser();
		        int val = chooser.showOpenDialog(null);
		        if(val == JFileChooser.APPROVE_OPTION) {
		           String doc=chooser.getSelectedFile().getName();
		           JLabel document=new JLabel(doc);
		           pnlcal.add(document);
		        }
		}
		
		
		if(e.getSource()==creersout)
		{	
			etu=new Etudiant(nometdu.getText(), prenometu.getText(),"lpl" , tel.getText(),email.getText(),"42",grp.getText());
			
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy");
			/*try {
				sout=new Soutenance(new Stage(stg.getText()), sdf.parse(dat.getText()), sdf.parse(dat.getText()), new Jury(new Stage(stg.getText())));
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}*/
			
			JLabel lblnom=new JLabel(nometdu.getText());
			JLabel lblprenom=new JLabel(prenometu.getText());
			JLabel lbltel=new JLabel(tel.getText());
			JLabel lbldate=new JLabel(dat.getText());
			JLabel lblmail=new JLabel(email.getText());
			JLabel lblgroup=new JLabel(grp.getText());
			JLabel lbldeb=new JLabel(heurdeb.getText());
			JLabel lblfin=new JLabel(heurfin.getText());
			JLabel jr=new JLabel(jur.getSelectedItem().toString());
			JLabel sall=new JLabel(salle.getSelectedItem().toString());
			JLabel lblstg=new JLabel(stg.getText());
			
			pnlcal.add(lblnom);
			pnlcal.add(lblprenom);
			pnlcal.add(lblgroup);
			pnlcal.add(lblmail);
			pnlcal.add(lbltel);
			pnlcal.add(lblstg);
			pnlcal.add(jr);
			pnlcal.add(sall);
			pnlcal.add(lbldate);
			pnlcal.add(lbldeb);
			pnlcal.add(lblfin);
			
			nometdu.setText("");
			prenometu.setText("");
			grp.setText("");
			email.setText("");
			tel.setText("");
			stg.setText("");
			dat.setText("");
			heurdeb.setText("");
			heurfin.setText("");
			
			this.setVisible(true);
			this.add(pnlcal,BorderLayout.CENTER);
			pnlcal.setLayout(new GridLayout(11,1));
			
			
		}
	}
	
	
}
