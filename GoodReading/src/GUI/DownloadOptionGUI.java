package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DownloadOptionGUI {

	private JFrame frame;
	private JFrame frame1;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DownloadOptionGUI window = new DownloadOptionGUI();
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
	public DownloadOptionGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("DOWNLOAD OPTION");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JRadioButton rdbtnPdf = new JRadioButton("PDF");
		buttonGroup.add(rdbtnPdf);
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnPdf, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, rdbtnPdf, 10, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(rdbtnPdf);
		
		JRadioButton rdbtnDoc = new JRadioButton("DOC");
		buttonGroup.add(rdbtnDoc);
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnDoc, 6, SpringLayout.SOUTH, rdbtnPdf);
		springLayout.putConstraint(SpringLayout.WEST, rdbtnDoc, 10, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(rdbtnDoc);
		
		JRadioButton rdbtnFb = new JRadioButton("FB2");
		buttonGroup.add(rdbtnFb);
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnFb, 6, SpringLayout.SOUTH, rdbtnDoc);
		springLayout.putConstraint(SpringLayout.EAST, rdbtnFb, 0, SpringLayout.EAST, rdbtnPdf);
		frame.getContentPane().add(rdbtnFb);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==btnNewButton){
					frame.dispose();
					PaymentOptionGUI payOp = new PaymentOptionGUI();
					payOp.setVisible(true);
				
					
				}
				
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 117, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 147, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(btnNewButton);
		

	    
	}


	}
