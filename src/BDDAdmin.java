import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BDDAdmin extends JFrame {

	private JPanel BddAdmin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BDDAdmin frame = new BDDAdmin();
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
	public BDDAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		BddAdmin = new JPanel();
		BddAdmin.setForeground(new Color(192, 192, 192));
		BddAdmin.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(BddAdmin);
		BddAdmin.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BDDAdmin");
		lblNewLabel.setForeground(new Color(47, 143, 232));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(410, 11, 145, 60);
		BddAdmin.add(lblNewLabel);
		
		final JComboBox Privilege = new JComboBox();
		Privilege.setEditable(true);
		Privilege.setBounds(190, 125, 320, 40);
		BddAdmin.add(Privilege);
		Privilege.addItem("Insertion");
		Privilege.addItem("Lecture");
		Privilege.addItem("Suppression");
		Privilege.addItem("Modification");
		Privilege.setSelectedItem("selectionnez un privilege");
		
		
		JLabel lblNewLabel_1 = new JLabel("Privilege");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(70, 121, 110, 40);
		BddAdmin.add(lblNewLabel_1);
		
		final JComboBox Table = new JComboBox();
		Table.setEditable(true);
		Table.setBounds(190, 205, 320, 40);
		BddAdmin.add(Table);
		
		Table.addItem("Etudiant");
		Table.addItem("Enseignant");
		Table.addItem("EtudiantUnite");
		Table.addItem("unite");
		Table.setSelectedItem("selectionnez une table");
		
		JLabel lblNewLabel_2 = new JLabel("Table");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(70, 201, 110, 40);
		BddAdmin.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Confirmer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Privilege.getSelectedItem().toString().contentEquals("Insertion")) {
					if(Table.getSelectedItem().toString().contentEquals("Etudiant")) {
						InsertionEtu ietu=new InsertionEtu();
						ietu.setVisible(true);
						BddAdmin.setVisible(false);
					}else if (Table.getSelectedItem().toString().contentEquals("Enseignant")){
						InsertionEns iens =new InsertionEns();
						iens.setVisible(true);
						iens.setLocationRelativeTo(null);
				
					}
				}
			}
		});
		btnNewButton.setBackground(new Color(198, 49, 19));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(70, 302, 440, 50);
		BddAdmin.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("X");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Mon_interface mi=new Mon_interface();
				mi.frame.setVisible(true);
				BddAdmin.setVisible(false);
				
			}
		});
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(565, 11, 19, 20);
		BddAdmin.add(lblNewLabel_3);
		
		
	}
}
