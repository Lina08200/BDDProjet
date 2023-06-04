import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class Enseignant extends JFrame {

	private JPanel contentPane;
	private JRadioButton Insertion;
	private JRadioButton Consultation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Enseignant frame = new Enseignant();
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
	public Enseignant() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Utilisateur = new JLabel("Enseignant");
		Utilisateur.setForeground(new Color(47, 143, 232));
		Utilisateur.setFont(new Font("Tahoma", Font.BOLD, 24));
		Utilisateur.setBounds(431, 11, 145, 60);
		contentPane.add(Utilisateur);
		
		JButton BValider = new JButton("Valider");
		BValider.setForeground(new Color(255, 255, 255));
		BValider.setBackground(new Color(198, 49, 17));
		BValider.setFont(new Font("Tahoma", Font.BOLD, 20));
		BValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Insertion.isSelected()) {
					InsertionEns nvEns = new InsertionEns();
					nvEns.setVisible(true);
				}
			}
		});
		BValider.setBounds(69, 298, 440, 50);
		contentPane.add(BValider);
		
	    Insertion = new JRadioButton("Insertion");
	    Insertion.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if(Insertion.isSelected()) {
	    			Consultation.setSelected(false);
	    		}
	    	}
	    });
		Insertion.setFont(new Font("Tahoma", Font.BOLD, 18));
		Insertion.setBounds(70, 130, 126, 31);
		contentPane.add(Insertion);
		
		Consultation = new JRadioButton("Consultation");
		Consultation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(Consultation.isSelected()) {
	    			Insertion.setSelected(false);
	    		}
			}
		});
		Consultation.setFont(new Font("Tahoma", Font.BOLD, 18));
		Consultation.setBounds(70, 189, 182, 50);
		contentPane.add(Consultation);
		

		JLabel Texte = new JLabel("Choisir l'action a effectuer :");
		Texte.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Texte.setBounds(69, 89, 199, 34);
		contentPane.add(Texte);
	}
}
