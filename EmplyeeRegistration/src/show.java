import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.Statement;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class show {

	JFrame frame;
	DefaultTableModel model;
	private JTable table;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//show window = new show(t);
				//	window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public show(int t) {
		
		int p =t;
		initialize(p);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int t) {
		frame = new JFrame();
		frame.setBounds(200, 100, 1256, 644);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		model=new DefaultTableModel();
		Object[] colomn= {"Emp_Name","Emp_Id","Mobile_No","Emp_City","Emp_Sal","Email","Father's_Name","Date_Of_Birth","Aadhar_No","Job_Post","Age"};
		model.setColumnIdentifiers(colomn);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 645, 383);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(model);
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		
		lblNewLabel = new JLabel("New label");
		scrollPane.setColumnHeaderView(lblNewLabel);
		
		btnNewButton = new JButton("Back");
		btnNewButton.setBounds(10, 461, 96, 29);
		btnNewButton.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) 
			{
				EmployeeDetails window = new EmployeeDetails();
				window.frame.setVisible(true);
				
				
			}
		});
		btnNewButton.setFont(new Font("Sitka Text", Font.BOLD, 15));
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 0, 1379, 607);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\KIRAN\\Downloads\\hd images\\33.jpg"));
		frame.getContentPane().add(lblNewLabel_1);
		frame.setVisible(true);
		
		
		try{  
//			Class.forName("com.mysql.jdbc.Driver");  
//			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db4","root","");  
//			System.out.println("database connected...");
//			Statement stmt=(Statement) con.createStatement();  
//			ResultSet rs=stmt.executeQuery("select * from emp2");  
//			while(rs.next())  
//			{
//				String str=rs.getString("Emp_Name");
//				String str1=rs.getString("Emp_Id");
//				String str2=rs.getString("Mobile_No");
//				String str3=rs.getString("Emp_City");
//				String str4=rs.getString("Emp_Sal");
//				String str5=rs.getString("Email");
//				String str6=rs.getString("Father's_Name");
//				String str7=rs.getString("Date_Of_Birth");
//				String str8=rs.getString("Aadhar_No");
//				String str9=rs.getString("Job_Post");
//				String str10=rs.getString("Age");
//				
//				Object[] row= {str,str1,str2,str3,str4,str5,str6,str7,str8,str9,str10};
//				model.addRow(row);
//				System.out.println(t);
//			}
			
			
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db4","root","");  
			System.out.println("database connected...");
			Statement stmt=(Statement) con.createStatement();  
			
			ResultSet rs=stmt.executeQuery("select * from emp2 where Emp_Id='"+t+"'");  
			
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
				model.addRow(row);
				}
			//con.close();  
			}catch(Exception e){ System.out.println(e);}  
}

	public Window getFrame() {
		// TODO Auto-generated method stub
		return null;
	}
}
