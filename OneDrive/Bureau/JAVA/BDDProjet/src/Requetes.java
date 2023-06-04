import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Requetes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Requetes frame = new Requetes();
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
	public Requetes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Requetes");
		lblNewLabel.setBounds(246, 10, 94, 25);
		lblNewLabel.setForeground(new Color(47, 143, 232));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Afficher les noms et prénoms des étudiants ayant obtenus des notes d'examens ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 80, 627, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(" égales à 20 :");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(8, 102, 102, 25);
		contentPane.add(lblNewLabel_2);
		
		JTextPane txtpnSelectNometuPrenometu = new JTextPane();
		txtpnSelectNometuPrenometu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnSelectNometuPrenometu.setText("SELECT nom_etu, prenom_etu FROM Etudiant INNER JOIN EtudiantUnité ON Etudiant.matricule_etu = EtudiantUnité.matricule_etu WHERE note_examen = 20;");
		txtpnSelectNometuPrenometu.setBounds(20, 138, 544, 76);
		contentPane.add(txtpnSelectNometuPrenometu);
		
		JLabel lblNewLabel_3 = new JLabel("Afficher les noms et prénoms des étudiants qui ne sont pas inscrits dans ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 235, 554, 25);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel(" l'unité « POO ».");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(8, 260, 138, 25);
		contentPane.add(lblNewLabel_4);
		
		JTextPane txtpnSelectNometuPrenometuselect = new JTextPane();
		txtpnSelectNometuPrenometuselect.setText("SELECT nom_etu, prenom_etu FROM Etudiant WHERE matricule_etu NOT IN ( SELECT matricule_etu   FROM EtudiantUnite  WHERE code_Unite = 'POO' );");
		txtpnSelectNometuPrenometuselect.setBounds(10, 296, 554, 84);
		contentPane.add(txtpnSelectNometuPrenometuselect);
		
		JLabel Back = new JLabel("X");
		Back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			BDDAdmin B=new BDDAdmin();
			B.setVisible(true);
			
			}
		});
		Back.setHorizontalAlignment(SwingConstants.CENTER);
		Back.setFont(new Font("Tahoma", Font.BOLD, 20));
		Back.setBounds(552, 10, 34, 22);
		contentPane.add(Back);
	}
}
