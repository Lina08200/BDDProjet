import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InsertionEtuUnite extends JFrame {

	private JPanel IntertionEtuU;
	private JTextField MatEtu;
	private JTextField CodeUn2;
	private JTextField cc;
	private JTextField tp;
	private JTextField examen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InsertionEtuUnite frame = new InsertionEtuUnite();
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
	public InsertionEtuUnite() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		IntertionEtuU = new JPanel();
		IntertionEtuU.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(IntertionEtuU);
		IntertionEtuU.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Insertion Etudiant Unite");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(47, 143, 232));
		lblNewLabel.setBounds(162, 11, 266, 25);
		IntertionEtuU.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Matricule Etudiant :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setForeground(new Color(47, 143, 232));
		lblNewLabel_1.setBounds(70, 90, 162, 14);
		IntertionEtuU.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Code Unite :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setForeground(new Color(47, 143, 232));
		lblNewLabel_2.setBounds(70, 140, 100, 20);
		IntertionEtuU.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Control Continu :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setForeground(new Color(47, 143, 232));
		lblNewLabel_3.setBounds(70, 190, 142, 20);
		IntertionEtuU.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("TP :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setForeground(new Color(47, 143, 232));
		lblNewLabel_4.setBounds(70, 240, 100, 14);
		IntertionEtuU.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Examen :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_5.setForeground(new Color(47, 143, 232));
		lblNewLabel_5.setBounds(70, 290, 100, 20);
		IntertionEtuU.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Ajouter");
		btnNewButton.setBackground(new Color(198, 49, 19));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(70, 338, 440, 50);
		IntertionEtuU.add(btnNewButton);
		
		MatEtu = new JTextField();
		MatEtu.setBounds(244, 84, 265, 30);
		IntertionEtuU.add(MatEtu);
		MatEtu.setColumns(10);
		
		CodeUn2 = new JTextField();
		CodeUn2.setBounds(194, 134, 316, 30);
		IntertionEtuU.add(CodeUn2);
		CodeUn2.setColumns(10);
		
		cc = new JTextField();
		cc.setBounds(222, 184, 288, 30);
		IntertionEtuU.add(cc);
		cc.setColumns(10);
		
		tp = new JTextField();
		tp.setBounds(151, 234, 359, 30);
		IntertionEtuU.add(tp);
		tp.setColumns(10);
		
		examen = new JTextField();
		examen.setBounds(162, 284, 348, 30);
		IntertionEtuU.add(examen);
		examen.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("X");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BDDAdmin mi=new BDDAdmin();
				mi.setVisible(true);
				IntertionEtuU.setVisible(false);
			}
		});
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_6.setBounds(555, 11, 21, 25);
		IntertionEtuU.add(lblNewLabel_6);
	}

}
