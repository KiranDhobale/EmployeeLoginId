import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import com.mysql.jdbc.ResultSet;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class login {

	JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1398, 651);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Name:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(850, 155, 170, 39);
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 17));
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(1029, 159, 211, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Id:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(850, 220, 109, 27);
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD, 17));
		frame.getContentPane().add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(1029, 218, 211, 27);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			private JLabel pass;

			public void actionPerformed(ActionEvent e) 
			{
				
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newaccount","root","");
					System.out.print("database connected !!!");
					Statement st=con.createStatement();
					String x= textField.getText();
					String y= passwordField.getText();
					
					ResultSet rec= (ResultSet) st.executeQuery("SELECT * FROM login where username='"+x+"' and PASSWORD='"+y+"'");
					if(rec.next())
					{
						JOptionPane.showMessageDialog(null, "Login successfully !");
						
						EmployeeDetails window = new EmployeeDetails();
						window.getFrame().setVisible(true);
					
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Invalid Username and Password . Try Agin....!!!");
					}
					}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
					
				
			}
		});
		
		btnNewButton.setBounds(1011, 318, 125, 30);
		btnNewButton.setFont(new Font("Sitka Text", Font.BOLD, 16));
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Cancel");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_2.setBounds(834, 320, 125, 30);
		btnNewButton_2.setFont(new Font("Sitka Text", Font.BOLD, 16));
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("Login");
		lblNewLabel_3.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setBounds(931, 54, 250, 51);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Sitka Text", Font.BOLD, 17));
		btnNewButton_1.setBounds(1186, 318, 125, 31);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\KIRAN\\Downloads\\hd images\\36.jpg"));
		lblNewLabel_2.setBounds(0, 0, 1384, 614);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
