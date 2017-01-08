package GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class LibraryManagerGUI extends JFrame{

	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibraryManagerGUI window = new LibraryManagerGUI();
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
	public LibraryManagerGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Library Manager");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JButton btnReports = new JButton("REPORTS");
		springLayout.putConstraint(SpringLayout.WEST, btnReports, 33, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnReports, -188, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnReports, -284, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(btnReports);
		btnReports.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				frame=ReportGui.getInstance();
				frame.setBounds(100, 100, 450, 300);
				frame.setVisible(true);
			}
		});
		
		
		JButton btnCheckfeedback = new JButton("CHECK FEEDBACK");
		btnCheckfeedback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				frame= CheckFeedbackGui.getInstance();
				frame.setBounds(100, 100, 450, 300);
				frame.setVisible(true);
				
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnCheckfeedback, 21, SpringLayout.SOUTH, btnReports);
		springLayout.putConstraint(SpringLayout.WEST, btnCheckfeedback, 0, SpringLayout.WEST, btnReports);
		frame.getContentPane().add(btnCheckfeedback);
		
		JButton btnHideBook = new JButton("HIDE BOOK");
		btnHideBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				frame=RemoveBookGUI.getInstance();
				frame.setBounds(100, 100, 450, 300);
				frame.setVisible(true);
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnHideBook, 47, SpringLayout.SOUTH, btnCheckfeedback);
		springLayout.putConstraint(SpringLayout.WEST, btnHideBook, 55, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(btnHideBook);
	}
}
