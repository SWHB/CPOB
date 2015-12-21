package frame;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrameSoutenance extends JFrame implements ActionListener{
	
	//info etudiant
	private JLabel infoEtudiant;
	private JLabel firstnameetu;
	private JLabel lastnameetu;
	private JLabel emailetu;
	private JLabel phoneetu;
	private JLabel stage;
	private JTextField prenometu;
	private JTextField nometdu;
	private JTextField email;
	private JTextField tel;
	private JTextField stg;
	
	//info soutenance
	private JLabel date;
	private JLabel classroom;
	private JLabel jury;
	private JLabel document;
	
	//saisie info soutenance
	private JTextField dat;
	private JComboBox<String> salle;
	private JComboBox<String>jr;
	private JComboBox<String>documents;
	
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
	
	public FrameSoutenance() {
		super("Soutenance");
		
		infoEtudiant=new JLabel("Information �tudiant:");
		
		firstnameetu=new JLabel("pr�nom :");
		prenometu=new JTextField(10);
		
		lastnameetu=new JLabel("nom :");
		nometdu=new JTextField(20);
		
		emailetu=new JLabel("Email :");
		email=new JTextField(10);
		
		phoneetu=new JLabel("T�l�phone :");
		tel=new JTextField(10);
		
		stage=new JLabel("Stage :");
		stg=new JTextField(10);
		
		date=new JLabel("Date :");
		dat=new JTextField(10);
		
		classroom=new JLabel("Salle :");
		salle=new JComboBox<>(classe);
		
		jury=new JLabel("Jury :");
		jr=new JComboBox<>(listjury);
		
		document=new JLabel("Document");
		documents=new JComboBox<>(docs);
		
		creersout=new JButton("Ajouter soutenance");
		suppsout=new JButton("Supprimer soutenance");
		consullist=new JButton("Consulter liste �tudiant");
		
		pnlsout=new JPanel();
		pnlcal=new JPanel();
		
		pnlsout.add(firstnameetu);
		pnlsout.add(prenometu);
		
		pnlsout.add(lastnameetu);
		pnlsout.add(nometdu);
		
		pnlsout.add(firstnameetu);
		pnlsout.add(prenometu);
		
		pnlsout.add(emailetu);
		pnlsout.add(email);
		
		pnlsout.add(phoneetu);
		pnlsout.add(tel);
		
		pnlsout.add(stage);
		pnlsout.add(stg);
		
		pnlsout.add(jury);
		pnlsout.add(jr);
		
		pnlsout.add(classroom);
		pnlsout.add(salle);
		
		pnlsout.add(date);
		pnlsout.add(dat);
		
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
		
		this.setSize(464,400);
	
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		this.add(pnlsout,BorderLayout.WEST);
		this.add(pnlcal,BorderLayout.EAST);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pnlsout.setLayout(new GridLayout(10,2));	
		
	}
	
	public static void main(String args[])
	{
		FrameSoutenance f=new FrameSoutenance();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
