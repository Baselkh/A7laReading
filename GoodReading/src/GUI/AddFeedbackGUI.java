package GUI;

import java.awt.EventQueue;
import java.awt.Component; 
import java.awt.TextArea ;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.SpringLayout;

import client.controller.AddFeedbackController;
import client.controller.ControllerType;
import client.controller.Controllers;
import client.controller.LoginController;
import client.entities.User;
import client.ui.ClientUI;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class AddFeedbackGUI extends JFrame {

	private JFrame frame;
	private JLabel lblSignature;
	private JTextField textField;
	private String feedback= "";
	private String signature= "";
	private TextArea textArea;
	private static AddFeedbackGUI INSTANCE2=null;


	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public AddFeedbackGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Add Feedback");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		 	
	
		JLabel lblFeedback = new JLabel("FeedBack:");
		springLayout.putConstraint(SpringLayout.WEST, lblFeedback, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, lblFeedback, 10, SpringLayout.NORTH, frame.getContentPane());
		getContentPane().add(lblFeedback);
		
		TextArea textArea = new TextArea();
		springLayout.putConstraint(SpringLayout.NORTH, textArea, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, textArea, 5, SpringLayout.EAST, lblFeedback);
		getContentPane().add(textArea);
		
		lblSignature = new JLabel("signature:");
		springLayout.putConstraint(SpringLayout.WEST, lblSignature, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblSignature, -70, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblSignature, 0, SpringLayout.EAST, lblFeedback);
		getContentPane().add(lblSignature);
		
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField, 171, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, textField, 28, SpringLayout.EAST, lblSignature);
		springLayout.putConstraint(SpringLayout.EAST, textField, 133, SpringLayout.EAST, lblSignature);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		
		JButton sendf = new JButton("Send Feedback");
		sendf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				feedback=  textArea.getText();
				signature= textField.getText();

				if (feedback.equals("")&&!(signature.equals("")))
					JOptionPane.showMessageDialog(null," please add your feedback");

				else{
					if(signature.equals("")&&!(feedback.equals("")))
						JOptionPane.showMessageDialog(null," please add your signature");
					else{
						if(signature.equals("")&&feedback.equals("")){
							JOptionPane.showMessageDialog(null," please add your signature and your feedback");
						}
						else{
							
							AddFeedbackController sendfeedback = (AddFeedbackController) Controllers
									.getInstance().getController(ControllerType.ADD_FEEDBACK_CONTROLLER);
						
		                    sendfeedback.AddFeedback(ClientUI.currUser.getUserName(),ClientUI.currUser.getID(),feedback,signature);
							
						}
					}
				}
				
				
	
			}
			
		});
		springLayout.putConstraint(SpringLayout.SOUTH, sendf, -35, SpringLayout.SOUTH,getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, sendf, -127, SpringLayout.EAST, getContentPane());
		getContentPane().add(sendf);
		
		JButton btnBack = new JButton("back->");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);	
				MemberMainGUI.main(null);
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, btnBack, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnBack, -10, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnBack, 87, SpringLayout.WEST, getContentPane());
		getContentPane().add(btnBack);
	
	}
	
	public static AddFeedbackGUI getInstance() 
	{
		
			if(INSTANCE2==null)
				INSTANCE2=new AddFeedbackGUI();
		
				return INSTANCE2;
     }
	
}
