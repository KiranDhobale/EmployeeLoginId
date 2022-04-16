import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.Statement;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Emp_id {

	public JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Emp_id window = new Emp_id();
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
	public Emp_id() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1349, 576);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Employee id :");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 21));
		lblNewLabel_1.setBounds(863, 205, 154, 37);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(1050, 205, 236, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int t1 = Integer.parseInt(textField.getText());
				//int t1=1212;
				//System.out.println(t1);
				
				try{  
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db4","root","");  
					System.out.println("database connected...");
					Statement stmt=(Statement) con.createStatement();  
					
					ResultSet rs=stmt.executeQuery("select * from emp2 where Emp_Id='"+t1+"'");  
					
					while(rs.next())  
					{
						String str=rs.getString("Emp_Name");
						String str1=rs.getString("Emp_Id");
						String str2=rs.getString("Mobile_No");
						String str3=rs.getString("Emp_City");
						String str4=rs.getString("Emp_Sal");
						String str5=rs.getString("Email");
						String str6=rs.getString("Father's_Name");
						String str7=rs.getString("Date_Of_Birth");
						String str8=rs.getString("Aadhar_No");
						String str9=rs.getString("Job_Post");
						String str10=rs.getString("Age");
						
						//System.out.println(str+" "+str1);
						
						Object[] row= {str,str1,str2,str3,str4,str5,str6,str7,str8,str9,str10};
						}
					//con.close();  
					}catch(Exception e4){ e4.printStackTrace();}  
				
				

				show window = new show(t1);
				window.frame.setVisible(true);
				
			}
			
		});
		btnNewButton.setFont(new Font("Sitka Text", Font.BOLD, 16));
		btnNewButton.setBounds(1124, 312, 124, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeDetails window = new EmployeeDetails();
				window.frame.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Sitka Text", Font.BOLD, 17));
		btnNewButton_1.setBounds(913, 313, 124, 37);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\KIRAN\\Downloads\\linda-xu-Mxn_DRdp5s8-unsplash.jpg"));
		lblNewLabel.setBounds(0, 0, 1335, 539);
		frame.getContentPane().add(lblNewLabel);
	}

	public Window getFrame() {
		// TODO Auto-generated method stub
		return null;
	}
}
