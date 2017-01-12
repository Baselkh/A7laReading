package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberMainGUI extends JFrame{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberMainGUI window = new MemberMainGUI();
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
	public MemberMainGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JButton btnNewButton = new JButton("Purchasing books");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				frame=DownloadOptionGUI.getInstance();
				frame.setBounds(100, 100, 450, 300);
				frame.setVisible(true);
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 48, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 77, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(btnNewButton);
		
		JButton btnAddFeedback = new JButton("Add FeedBack");
		btnAddFeedback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				frame=AddFeedbackGUI.getInstance();
				frame.setBounds(100, 100, 450, 300);
				frame.setVisible(true);
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnAddFeedback, 52, SpringLayout.SOUTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.WEST, btnAddFeedback, 0, SpringLayout.WEST, btnNewButton);
		frame.getContentPane().add(btnAddFeedback);
	}

}
