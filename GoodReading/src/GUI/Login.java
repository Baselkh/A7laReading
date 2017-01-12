package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.SpringLayout;

import client.controller.ControllerType;
import client.controller.Controllers;
import client.controller.LoginController;
import client.entities.User;
import client.ui.ClientUI;
import protocol.response.LoginResponse;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField textFieldID;///
	private JLabel lblPassword;////
	private JPasswordField passwordField;////
	private JLabel lblPleaseLogin;
	private JLabel lblId;
	private JButton btnOk;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		/**
		 * Creating and designing the Login Frame
		 */
		
		frame = new JFrame("LOGIN");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setTitle("Welcome to the Library");
		frame.setBounds(0, -21, 668, 400);
		frame.setLocation(330, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		/**
		 * Creating and designing the "Please Login" Label
		 */
		
		lblPleaseLogin = new JLabel("Please Login : ");
		lblPleaseLogin.setForeground(new Color(30, 144, 255));
		lblPleaseLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPleaseLogin.setBounds(364, 128, 126, 24);
		frame.getContentPane().add(lblPleaseLogin);
		
		/**
		 * Creating and designing the ID TextField
		 */
		
		textFieldID = new JTextField();
		textFieldID.setBounds(432, 161, 189, 24);
		frame.getContentPane().add(textFieldID);
		textFieldID.setColumns(9);
		
		/**
		 * Creating and designing the "Password" Label
		 */
		lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Segoe Print", Font.BOLD, 12));
		lblPassword.setBounds(361, 196, 69, 24);
		frame.getContentPane().add(lblPassword);
		
		/**
		 * Creating and designing the Password TextField
		 */
		
		passwordField = new JPasswordField();
		passwordField.setBounds(432, 198, 189, 24);
		frame.getContentPane().add(passwordField);
		
		
		/**
		 * Creating and designing the "ID" Label
		 */
		
		lblId = new JLabel("ID:");
		lblId.setFont(new Font("Segoe Print", Font.BOLD, 12));
		lblId.setBounds(361, 161, 61, 24);
		frame.getContentPane().add(lblId);
		
		btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			
			//	if(((textFieldID.getText())!="") &&((passwordField.getText())!="") ){
				
				User user = new User(textFieldID.getText(), passwordField.getText());
				LoginController login = (LoginController) Controllers
						.getInstance().getController(ControllerType.LOGIN_CONTROLLER);
				LoginResponse resp = login.checkLoginDetailsFromGUI(user);
				
				if(resp.getText().equals("OK"))
				{
				ClientUI.currUser=resp.getUser();
				int type=ClientUI.currUser.getUserType();
				
				switch(type){
				
				case 1://user
				{

					
					}
				case 2://member
				{

					
					}
				case 3://Certified editor
				{

					
					}
				case 4://liberian
				{

					
					}
				
				case 5://library manager
				{

					frame=LibraryManagerGUI.getInstance();
					frame.setBounds(100, 100, 450, 300);
					frame.setVisible(true);
					}
				}
				
					
				}
				else{
					
					JLabel lblStatus = new JLabel(resp.getText());
					lblStatus.setForeground(Color.RED);
					lblStatus.setBounds(432, 299, 46, 14);
					frame.getContentPane().add(lblStatus);
					
				}
				
			}
		});
		
		btnOk.setBounds(520, 259, 89, 23);
		frame.getContentPane().add(btnOk);
		
	
		
		

		//Image imgok = new ImageIcon(this.getClass().getResource("/ok.png")).getImage();
		//btnLogin.setIcon(new ImageIcon(imgok));
		
	}}

	
