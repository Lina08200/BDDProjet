import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

public class Mon_interface {

	
	JFrame frame;
	private JTextField Utilisateur;
	private JTextField Mdp;
	private Connection connection=null;
	private Statement stmt=null;
	private ResultSet rs=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mon_interface window = new Mon_interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Mon_interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel titre = new JLabel("Connexion");
		titre.setBackground(new Color(255, 255, 255));
		titre.setForeground(new Color(47, 143, 232));
		titre.setFont(new Font("Tahoma", Font.BOLD, 26));
		titre.setHorizontalAlignment(SwingConstants.CENTER);
		titre.setBounds(213, 11, 156, 29);
		frame.getContentPane().add(titre);
		
		JLabel NomUtilisateur = new JLabel("Nom d'utilisateur :");
		NomUtilisateur.setForeground(new Color(47, 143, 232));
		NomUtilisateur.setFont(new Font("Tahoma", Font.BOLD, 16));
		NomUtilisateur.setBounds(70, 111, 156, 36);
		frame.getContentPane().add(NomUtilisateur);
		
		JLabel Motdp = new JLabel("Mot de passe :");
		Motdp.setFont(new Font("Tahoma", Font.BOLD, 16));
		Motdp.setForeground(new Color(47, 143, 232));
		Motdp.setBounds(70, 188, 156, 36);
		frame.getContentPane().add(Motdp);
		
		Utilisateur = new JTextField();
		Utilisateur.setBounds(270, 113, 240, 36);
		frame.getContentPane().add(Utilisateur);
		Utilisateur.setColumns(10);
		
		Mdp = new JTextField();
		Mdp.setBounds(270, 190, 240, 36);
		frame.getContentPane().add(Mdp);
		Mdp.setColumns(10);
		
		JButton Connexion = new JButton("Connexion");
		Connexion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
				
				String utilisateur=Utilisateur.getText();
				String mdp=Mdp.getText();
				 
				if(utilisateur.toLowerCase().contentEquals("bddadmin")&& mdp.toLowerCase().contentEquals("tpadmin")) {
				
					//Class.forName("oracle.jdbc.driver.OracleDriver");
					//connection = DriverManager.getConnection("jdbc:oracle:thin:"+utilisateur+"/"+mdp+"@localhost");
					//stmt=connection.createStatement();
					BDDAdmin A1 =new BDDAdmin();
					A1.setVisible(true);
					frame.dispose();
				}else if(utilisateur.toLowerCase().contentEquals("etudiant")&& mdp.toLowerCase().contentEquals("tpetudiant")){

					Class.forName("oracle.jdbc.driver.OracleDriver");
					connection = DriverManager.getConnection("jdbc:oracle:thin:"+utilisateur+"/"+mdp+"@localhost");
					stmt=connection.createStatement();
					
					Etudiant etudiant=new Etudiant();
					etudiant.setVisible(true);
					frame.dispose();
				}else if(utilisateur.toLowerCase().contentEquals("enseignant")&& mdp.toLowerCase().contentEquals("tpenseignant")){

					Class.forName("oracle.jdbc.driver.OracleDriver");
					connection = DriverManager.getConnection("jdbc:oracle:thin:"+utilisateur+"/"+mdp+"@localhost");
					stmt=connection.createStatement();
					
					Enseignant enseignant=new Enseignant();
					enseignant.setVisible(true);
					frame.dispose();				}
				
			}catch(Exception e1) {
				e1.printStackTrace();
			}
			}
		});
		Connexion.setFont(new Font("Tahoma", Font.BOLD, 20));
		Connexion.setForeground(new Color(255, 255, 255));
		Connexion.setBackground(new Color(198, 49, 17));
		Connexion.setBounds(70, 300, 440, 50);
		frame.getContentPane().add(Connexion);
	}
}
