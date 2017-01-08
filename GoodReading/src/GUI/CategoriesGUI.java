package GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Basel
 *
 */
public class CategoriesGUI extends JFrame implements ActionListener {

	private JButton editCategoriesButton;
	
	public CategoriesGUI(){
		JFrame frame = new JFrame("Edit Categories");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		editCategoriesButton= new JButton("Edit Categories");
		editCategoriesButton.addActionListener(this);
		
		JPanel panel= new JPanel();
		panel.add(editCategoriesButton);

		frame.add(panel);

//		Display the window
		frame.pack();
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(editCategoriesButton)){
			new EditCategoriesGUI();
		}
	}
	
	public static void main(String args[]){
		new CategoriesGUI();
	}
}
