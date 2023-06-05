import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class InsertionEtu extends JFrame {

	private JPanel contentPane;
	private JTextField matricule;
	private JTextField prenom;
	private JTextField nom;
	private JTextField date;
	private JTextField adr;
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
					InsertionEtu frame = new InsertionEtu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	private boolean checkPKvide(){
	return(matricule.getText().isEmpty());
	}
	
	public InsertionEtu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Titre = new JLabel("Insertion d'un nouvel etudiant");
		Titre.setForeground(new Color(47, 143, 232));
		Titre.setFont(new Font("Tahoma", Font.BOLD, 20));
		Titre.setBounds(131, 11, 340, 30);
		contentPane.add(Titre);
		
		JLabel nomEtu = new JLabel("Nom :");
		nomEtu.setForeground(new Color(47, 143, 232));
		nomEtu.setHorizontalAlignment(SwingConstants.LEFT);
		nomEtu.setFont(new Font("Tahoma", Font.BOLD, 16));
		nomEtu.setBounds(70, 125, 100, 20);
		contentPane.add(nomEtu);
		
		JLabel matEtu = new JLabel("Matricule :");
		matEtu.setForeground(new Color(47, 143, 232));
		matEtu.setHorizontalAlignment(SwingConstants.LEFT);
		matEtu.setFont(new Font("Tahoma", Font.BOLD, 16));
		matEtu.setBounds(70, 75, 100, 20);
		contentPane.add(matEtu);
		
		JLabel preEtu = new JLabel("Prenom :");
		preEtu.setForeground(new Color(47, 143, 232));
		preEtu.setFont(new Font("Tahoma", Font.BOLD, 16));
		preEtu.setHorizontalAlignment(SwingConstants.LEFT);
		preEtu.setBounds(70, 175, 100, 20);
		contentPane.add(preEtu);
		
		JLabel datETU = new JLabel("Date de naiss :");
		datETU.setForeground(new Color(47, 143, 232));
		datETU.setHorizontalAlignment(SwingConstants.LEFT);
		datETU.setFont(new Font("Tahoma", Font.BOLD, 16));
		datETU.setBounds(70, 225, 120, 20);
		contentPane.add(datETU);
		
		JLabel adrEtu = new JLabel("Adresse :");
		adrEtu.setForeground(new Color(47, 143, 232));
		adrEtu.setFont(new Font("Tahoma", Font.BOLD, 16));
		adrEtu.setBounds(70, 275, 100, 20);
		contentPane.add(adrEtu);
		
		JButton btnNewButton = new JButton("Ajouter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checkPKvide()){JOptionPane.showMessageDialog(null, "veillez donner le matricule","Erreur", JOptionPane.ERROR_MESSAGE);
				}else {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				connection = DriverManager.getConnection("jdbc:oracle:thin:BDDAdmin/TPAdmin@localhost");
				stmt=connection.createStatement();
				/*int mat=Integer.parseInt(matricule.getText());
	rs=stmt.executeQuery("INSERT INTO ETUDIANT VALUES("+mat+",'"+nom.getText()
	+"','"+prenom.getText()+"','"+date.getText()+"','"+adr.getText()+"');");
				rs=stmt.executeQuery("COMMIT");*/
				
			       int mat = Integer.parseInt(matricule.getText());
		           // String nomValue = nom.getText();
		            //String prenomValue = prenom.getText();
		            //String dateValue = date.getText();
		            //String adrValue = adr.getText();

		            String requete = "INSERT INTO ETUDIANT VALUES (" + mat + ", '" + nom.getText() + "', '" + prenom.getText() + "', '" + date.getText() + "', '" + adr.getText() + "')";
		            stmt.executeUpdate(requete);

		            stmt.execute("COMMIT");

		            stmt.close();
		            connection.close();
				
			}catch(Exception e1){
				e1.printStackTrace();
				JOptionPane.showMessageDialog(null, "Contrainte d'integritee violee","Erreur", JOptionPane.ERROR_MESSAGE);
			}
				}
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(198, 49, 17));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(70, 325, 440, 50);
		contentPane.add(btnNewButton);
		
		matricule = new JTextField();
		matricule.setBounds(170, 71, 340, 30);
		contentPane.add(matricule);
		matricule.setColumns(10);
		
		prenom = new JTextField();
		prenom.setBounds(170, 171, 340, 30);
		contentPane.add(prenom);
		prenom.setColumns(10);
		
		nom = new JTextField();
		nom.setBounds(170, 121, 340, 30);
		contentPane.add(nom);
		nom.setColumns(10);
		
		date = new JTextField();
		date.setBounds(217, 221, 293, 30);
		contentPane.add(date);
		date.setColumns(10);
		
		adr = new JTextField();
		adr.setBounds(170, 271, 340, 30);
		contentPane.add(adr);
		adr.setColumns(10);
	}

}
