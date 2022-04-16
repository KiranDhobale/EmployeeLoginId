import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class EmployeeDetails {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeDetails window = new EmployeeDetails();
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
	public EmployeeDetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 1376, 649);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Details");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 21));
		lblNewLabel.setBounds(907, 46, 257, 48);
		getFrame().getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				createaccount window1 = new createaccount();
				window1.frame.setVisible(true);
//				EmployeeDetails window = new EmployeeDetails();
//				window.getFrame().setVisible(true);
				
				//window1.getFrame().setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Sitka Text", Font.BOLD, 17));
		btnNewButton.setBounds(833, 173, 125, 33);
		getFrame().getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("View");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//window.getFrame().setVisible(true);
				
				Emp_id window = new Emp_id();
				window.frame.setVisible(true);
			}
			
		});
		btnNewButton_1.setFont(new Font("Sitka Text", Font.BOLD, 17));
		btnNewButton_1.setBounds(1020, 173, 125, 33);
		getFrame().getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Remove");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnNewButton_2.setFont(new Font("Sitka Text", Font.BOLD, 17));
		btnNewButton_2.setBounds(833, 253, 125, 33);
		getFrame().getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Update");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createaccount window1 = new createaccount();
				window1.frame.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Sitka Text", Font.BOLD, 17));
		btnNewButton_3.setBounds(1020, 253, 125, 33);
		getFrame().getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\KIRAN\\Downloads\\nastuh-abootalebi-ZtC4_rPCRXA-unsplash.jpg"));
		lblNewLabel_1.setBounds(0, 0, 1362, 612);
		frame.getContentPane().add(lblNewLabel_1);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
