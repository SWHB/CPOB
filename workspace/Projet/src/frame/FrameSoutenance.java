package frame;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrameSoutenance extends JFrame implements ActionListener{
	
	//info etudiant
	private JLabel infoEtudiant;
	private JLabel firstnameetu;
	private JLabel lastnameetu;
	private JLabel emailetu;
	private JLabel phoneetu;
	private JTextField prenometu;
	private JTextField nometdu;
	private JTextField email;
	private JTextField tel;
	
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
		
		date=new JLabel("Date :");
		dat=new JTextField(10);
		
		classroom=new JLabel("Salle :");
		salle=new JComboBox<>(classe);
		
		jury=new JLabel("Jury :");
		jr=new JComboBox<>(listjury);
		
		document=new JLabel("Document");
		documents=new JComboBox<>(docs);
		
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
		
		pnlsout.add(jury);
		pnlsout.add(jr);
		
		pnlsout.add(classroom);
		pnlsout.add(salle);
		
		pnlsout.add(date);
		pnlsout.add(dat);
		
		pnlsout.add(document);
		pnlsout.add(documents);
		
		this.setVisible(true);
		
		this.pack();
		
		this.setSize(400,300);
	
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		this.add(pnlsout,BorderLayout.WEST);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pnlsout.setLayout(new GridLayout(8,2));	
		
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
