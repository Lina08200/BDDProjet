import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InsertionUnite extends JFrame {

	private JPanel InsertionUnite;
	private JTextField codeUnite;
	private JTextField libelle;
	private JTextField nbrH;
	private JTextField matEns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InsertionUnite frame = new InsertionUnite();
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
	public InsertionUnite() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		InsertionUnite = new JPanel();
		InsertionUnite.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(InsertionUnite);
		InsertionUnite.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Insertion Unite");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(47, 143, 232));
		lblNewLabel.setBounds(159, 11, 250, 50);
		InsertionUnite.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Code Unite :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setForeground(new Color(47, 143, 232));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(70, 120, 100, 20);
		InsertionUnite.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Libelle :");
		lblNewLabel_2.setForeground(new Color(47, 143, 232));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(70, 170, 100, 20);
		InsertionUnite.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre d'heures :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setForeground(new Color(47, 143, 232));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(70, 220, 150, 20);
		InsertionUnite.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Matricule enseignant :");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setForeground(new Color(47, 143, 232));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(70, 270, 200, 20);
		InsertionUnite.add(lblNewLabel_4);
		
		codeUnite = new JTextField();
		codeUnite.setBounds(186, 116, 324, 30);
		InsertionUnite.add(codeUnite);
		codeUnite.setColumns(10);
		
		libelle = new JTextField();
		libelle.setBounds(159, 166, 351, 30);
		InsertionUnite.add(libelle);
		libelle.setColumns(10);
		
		nbrH = new JTextField();
		nbrH.setBounds(250, 216, 260, 30);
		InsertionUnite.add(nbrH);
		nbrH.setColumns(10);
		
		matEns = new JTextField();
		matEns.setBounds(280, 266, 230, 30);
		InsertionUnite.add(matEns);
		matEns.setColumns(10);
		
		JButton ajouterUn = new JButton("Ajouter");
		ajouterUn.setForeground(new Color(255, 255, 255));
		ajouterUn.setBackground(new Color(198, 49, 19));
		ajouterUn.setFont(new Font("Tahoma", Font.BOLD, 20));
		ajouterUn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ajouterUn.setBounds(70, 330, 440, 50);
		InsertionUnite.add(ajouterUn);
		
		JLabel back = new JLabel("X");
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BDDAdmin mi=new BDDAdmin();
				mi.setVisible(true); 
				InsertionUnite.setVisible(false);
			}
		});
		back.setFont(new Font("Tahoma", Font.BOLD, 20));
		back.setBounds(562, 11, 14, 38);
		InsertionUnite.add(back);
	}
}
