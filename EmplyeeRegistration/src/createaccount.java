import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Vector;
import java.sql.Statement;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.ResultSet;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;

public class createaccount {
	AbstractButton formattedTextField;
	Vector<?> columanName1;
	String[] columanName= {"Emp Name","Emp Id","Mobile No","Emp City","Emp Sal","Email","Father's Name","Date Of Birth","Aadhar No","Job Post","Age"};
	protected JLabel t;
	
	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createaccount window = new createaccount();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	@SuppressWarnings("unused")
	private void setLocationRelativeTo(Object object) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unused")
	private void setSize(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unused")
	private void setTitle(String string) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Create the application.
	 */
	public createaccount() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.ORANGE);
		frame.getContentPane().setFont(new Font("Sitka Text", Font.BOLD, 15));
		frame.setBounds(200, 100, 1310, 646);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Emp Name :");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(108, 124, 107, 46);
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Emp Id :");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(108, 180, 129, 30);
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(238, 132, 181, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Mobile No :");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setBounds(108, 229, 107, 30);
		lblNewLabel_2.setFont(new Font("Sitka Text", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) 
			{
				String m=textField_2.getText();
				int length = m.length();
				char c=e.getKeyChar();
				
				if(e.getKeyChar()>='0' && e.getKeyChar()<='9')
				{
					if(length<10) 
					{
						textField_2.setEditable(true);
					}
					else
					{
						textField_2.setEditable(false);
					}
				}
				else
				{
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode()==KeyEvent.VK_DELETE)
					{
						textField_2.setEditable(true);
					}
					else
					{
						textField_2.setEditable(false);
					}
			}
			}
		});
		textField_2.setBounds(238, 229, 181, 27);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Emp City :");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setBounds(108, 269, 107, 30);
		lblNewLabel_3.setFont(new Font("Sitka Text", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(238, 269, 181, 27);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Emp Sal :");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setBounds(108, 309, 107, 30);
		lblNewLabel_4.setFont(new Font("Sitka Text", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(238, 309, 181, 27);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("Insert");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			private AbstractButton t1;

			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db4","root","");
					System.out.print("database connected !!!");
					Statement st=con.createStatement();
					
					String p=textField.getText();	
					//long n=Long.parseLong(textField_1.getText());
					int n = Integer.parseInt(textField_1.getText());
					String m=textField_2.getText();
					
					String c=textField_3.getText();
					//long s=Long.parseLong(textField_4.getText());
					int s = Integer.parseInt(textField_4.getText());
					String l=textField_5.getText();
					String k=textField_6.getText();
					String j=textField_7.getText();
					//long h=Long.parseLong(textField_8.getText());
					String h = textField_8.getText();
					String g=textField_9.getText();
					//long f=Long.parseLong(textField_10.getText());
					int f = Integer.parseInt(textField_10.getText());
					
					String sql1= "INSERT INTO `emp2`"+"(`Emp_Name`,`Emp_Id`,`Mobile_No`,`Emp_City`,`Emp_Sal`,`Email`,`Father's_Name`,`Date_Of_Birth`,`Aadhar_No`,`Job_Post`,`Age`)"+"VALUES('"+p+"','"+n+"','"+m+"','"+c+"','"+s+"','"+l+"','"+k+"','"+j+"','"+h+"','"+g+"','"+f+"')";
					st.executeUpdate(sql1);
					JOptionPane.showMessageDialog(null,"Inserted succefully");
				
				
				}
				catch(Exception e1) 
				{
					e1.printStackTrace();				
				}
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("Sitka Text", Font.BOLD, 15));
		btnNewButton.setBounds(323, 445, 142, 38);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{

				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db4","root","");
					System.out.print("database connected !!!");
					Statement st=con.createStatement();
					
					String p=textField.getText();	
					//long n=Long.parseLong(textField_1.getText());
					int n = Integer.parseInt(textField_1.getText());
					String m=textField_2.getText();
					
					String c=textField_3.getText();
					//long s=Long.parseLong(textField_4.getText());
					int s = Integer.parseInt(textField_4.getText());
					String l=textField_5.getText();
					String k=textField_6.getText();
					String j=textField_7.getText();
					//long h=Long.parseLong(textField_8.getText());
					String h = textField_8.getText();
					String g=textField_9.getText();
					//long f=Long.parseLong(textField_10.getText());
					int f = Integer.parseInt(textField_10.getText());
					
					String sql1= "UPDATE `emp2`"+" SET `Emp_Name`='"+p+"',`Emp_Id`='"+n+"',`Mobile_No`='"+m+"',`Emp_City`='"+c+"',`Emp_Sal`='"+s+"',`Email`='"+l+"',`Father's_Name`='"+k+"',`Date_Of_Birth`='"+j+"',`Aadhar_No`='"+h+"',`Age`='"+f+"' WHERE `Job_Post`='"+g+"'";
					st.executeUpdate(sql1);
					JOptionPane.showMessageDialog(null,"Updated succefully");
				
				
				}
				catch(Exception e1) 
				{
					e1.printStackTrace();				
				}
			}
		});
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Sitka Text", Font.BOLD, 15));
		btnNewButton_1.setBounds(506, 445, 136, 38);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				EmployeeDetails window = new EmployeeDetails();
				window.frame.setVisible(true);
				
			}
		});
		btnNewButton_2.setFont(new Font("Sitka Text", Font.BOLD, 15));
		btnNewButton_2.setBounds(134, 445, 136, 38);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Show");
		btnNewButton_3.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e)
			{
//				frame.dispose();
//				new show();
			}

			
		});
		btnNewButton_3.setForeground(Color.MAGENTA);
		btnNewButton_3.setFont(new Font("Sitka Text", Font.BOLD, 15));
		btnNewButton_3.setBounds(698, 445, 142, 38);
		frame.getContentPane().add(btnNewButton_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(238, 181, 181, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Father's Name :");
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblNewLabel_5.setBounds(509, 134, 133, 27);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Date Of Birth :");
		lblNewLabel_6.setForeground(Color.BLACK);
		lblNewLabel_6.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblNewLabel_6.setBounds(504, 187, 121, 23);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Aadhar No :");
		lblNewLabel_7.setForeground(Color.BLACK);
		lblNewLabel_7.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblNewLabel_7.setBounds(506, 236, 119, 23);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Job Post :");
		lblNewLabel_8.setForeground(Color.BLACK);
		lblNewLabel_8.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblNewLabel_8.setBounds(506, 273, 107, 23);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Age :");
		lblNewLabel_9.setForeground(Color.BLACK);
		lblNewLabel_9.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblNewLabel_9.setBounds(518, 351, 95, 23);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Email :");
		lblNewLabel_10.setForeground(Color.BLACK);
		lblNewLabel_10.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblNewLabel_10.setBounds(108, 349, 95, 26);
		frame.getContentPane().add(lblNewLabel_10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(238, 351, 181, 24);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(674, 132, 166, 27);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(674, 181, 166, 26);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) 
			{
				String m=textField_8.getText();
				int length = m.length();
				char c=e.getKeyChar();
				
				if(e.getKeyChar()>='0' && e.getKeyChar()<='9')
				{
					if(length<12) 
					{
						textField_8.setEditable(true);
					}
					else
					{
						textField_8.setEditable(false);
					}
				}
				else
				{
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode()==KeyEvent.VK_DELETE)
					{
						textField_8.setEditable(true);
					}
					else
					{
						textField_8.setEditable(false);
					}
			}
			}});
		textField_8.setBounds(674, 230, 166, 26);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(674, 269, 168, 27);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(674, 348, 166, 26);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\KIRAN\\Downloads\\thestandingdesk-sGdVTZ0wt0s-unsplash.jpg"));
		lblNewLabel_11.setBounds(0, 0, 1374, 625);
		frame.getContentPane().add(lblNewLabel_11);
	}

	protected String numberToWord(long r) {
		// TODO Auto-generated method stub
		return null;
	}

	public Window getFrame() {
		// TODO Auto-generated method stub
		return null;
	}
}
