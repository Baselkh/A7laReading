package GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class LibraryManagerGUI extends JFrame{

	private static LibraryManagerGUI INSTANCE=null;

	private JFrame frame;

	

	
	public LibraryManagerGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		setTitle("Library Manager");
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		JButton btnReports = new JButton("REPORTS");
		springLayout.putConstraint(SpringLayout.WEST, btnReports, 33, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnReports, -188, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnReports, -284, SpringLayout.EAST, getContentPane());
		getContentPane().add(btnReports);
		btnReports.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				frame=ReportGui.getInstance();
				frame.setBounds(100, 100, 450, 300);
				frame.setVisible(true);
			}
		});
		
		JButton btnCheckfeedback = new JButton("CHECK FEEDBACK");
		springLayout.putConstraint(SpringLayout.NORTH, btnCheckfeedback, 21, SpringLayout.SOUTH, btnReports);
		springLayout.putConstraint(SpringLayout.WEST, btnCheckfeedback, 0, SpringLayout.WEST, btnReports);
		getContentPane().add(btnCheckfeedback);
		btnCheckfeedback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				frame= CheckFeedbackGui.getInstance();
				frame.setBounds(100, 100, 450, 300);
				frame.setVisible(true);
				
			}
		});
		
		JButton btnHideBook = new JButton("HIDE BOOK");
		springLayout.putConstraint(SpringLayout.NORTH, btnHideBook, 47, SpringLayout.SOUTH, btnCheckfeedback);
		springLayout.putConstraint(SpringLayout.WEST, btnHideBook, 55, SpringLayout.WEST, getContentPane());
		btnHideBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				frame=RemoveBookGUI.getInstance();
				frame.setBounds(100, 100, 450, 300);
				frame.setVisible(true);
			}
		});
		
		getContentPane().add(btnHideBook);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static LibraryManagerGUI getInstance() 
	{
		
			if(INSTANCE==null)
				INSTANCE=new LibraryManagerGUI();
		
				return INSTANCE;
     }
}
