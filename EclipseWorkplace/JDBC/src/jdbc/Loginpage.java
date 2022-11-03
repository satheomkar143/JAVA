package jdbc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class Loginpage {

	private JFrame frmLibraryManagementSystem;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loginpage window = new Loginpage();
					window.frmLibraryManagementSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Loginpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLibraryManagementSystem = new JFrame();
		frmLibraryManagementSystem.setTitle("library management system");
		frmLibraryManagementSystem.setResizable(false);
		frmLibraryManagementSystem.getContentPane().setBackground(new Color(0, 204, 0));
		frmLibraryManagementSystem.setBounds(100, 100, 408, 249);
		frmLibraryManagementSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLibraryManagementSystem.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setBounds(107, 77, 76, 19);
		frmLibraryManagementSystem.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("user name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(107, 41, 76, 19);
		frmLibraryManagementSystem.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(216, 40, 86, 20);
		frmLibraryManagementSystem.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(216, 76, 86, 20);
		frmLibraryManagementSystem.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.setBackground(new Color(0, 0, 153));
		btnNewButton.setBounds(168, 127, 89, 23);
		frmLibraryManagementSystem.getContentPane().add(btnNewButton);
	}
}
