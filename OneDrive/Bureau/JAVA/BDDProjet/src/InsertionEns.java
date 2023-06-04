import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InsertionEns extends JFrame {

	private JPanel contentPane;
	private JTextField matEns;
	private JTextField nomEns;
	private JTextField prenomEns;
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
					InsertionEns frame = new InsertionEns();
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
	public InsertionEns() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nom :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setForeground(new Color(47, 143, 232));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(70, 180, 90, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Prenom :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setForeground(new Color(47, 143, 232));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(70, 238, 90, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Matricule :");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setForeground(new Color(47, 143, 232));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(70, 122, 90, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Insertion d'un nouvel enseignant");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(new Color(47, 143, 232));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(101, 23, 400, 30);
		contentPane.add(lblNewLabel_3);
		
		matEns = new JTextField();
		matEns.setBounds(170, 118, 340, 30);
		contentPane.add(matEns);
		matEns.setColumns(10);
		
		JButton btnNewButton = new JButton("Ajouter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				connection = DriverManager.getConnection("jdbc:oracle:thin:BDDAdmin/TPAdmin@localhost");
				stmt=connection.createStatement();
				int mat=Integer.parseInt(matEns.getText());
				rs=stmt.executeQuery("INSERT INTO ENSEIGNANT VALUES('"+
				mat+"','"+nomEns.getText()+"','"+prenomEns.getText()+"'");
				}catch(Exception e2) {
					e2.printStackTrace();
				}*/
			}
		});
		btnNewButton.setBackground(new Color(198, 49, 17));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(70, 313, 440, 50 );
		contentPane.add(btnNewButton);
		
		nomEns = new JTextField();
		nomEns.setBounds(170, 176, 340, 30);
		contentPane.add(nomEns);
		nomEns.setColumns(10);
		
		prenomEns = new JTextField();
		prenomEns.setBounds(170, 234, 340, 30);
		contentPane.add(prenomEns);
		prenomEns.setColumns(10);
	}

}
