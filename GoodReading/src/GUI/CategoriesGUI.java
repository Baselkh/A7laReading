package GUI;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * @author Basel
 *
 */
public class CategoriesGUI extends JFrame {

	private JButton createCategoryButton;
	private JButton deleteCategoryButton;
	private JButton renameCategoryButton;
	private BufferedImage folderIcon;
	
	public CategoriesGUI(){
		super("Categories");
		Container pane= getContentPane();
		pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
		
		// Initializing buttons
		createCategoryButton= new JButton("Create Category");
		deleteCategoryButton= new JButton("Delete Category");
		renameCategoryButton= new JButton("Rename Category");
		
		// Adding buttons
		JPanel buttonsPanel= new JPanel(new FlowLayout());
//		buttonsPanel.setBounds(0, 0, getWidth(), 30);
//		buttonsPanel.setBackground(Color.blue);
		buttonsPanel.add(createCategoryButton);
		buttonsPanel.add(deleteCategoryButton);
		buttonsPanel.add(renameCategoryButton);
		pane.add(buttonsPanel);
		
		
		// Categories icons layout
		JPanel iconsPanel= new JPanel(new FlowLayout());
		try{
			folderIcon= ImageIO.read(new File("images\\folder_icon.png"));
		}
		catch(IOException e){}	////////////////
		iconsPanel.add(makeFolderIcon("Test"));
		pane.add(iconsPanel);
		
		// Displaying
		pack();
		setVisible(true);
	}
	
	private JPanel makeFolderIcon(String categoryName){
		JPanel panel= new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		// Folder icon
		JLabel iconLabel= new JLabel(new ImageIcon(folderIcon));
		panel.add(iconLabel);
		
		// Category name
		JLabel nameLabel= new JLabel(categoryName, SwingConstants.RIGHT);
		nameLabel.setBackground(Color.black);
		panel.add(nameLabel);
		
		return panel;
	}
	
	public static void main(String args[]){
		new CategoriesGUI();
	}
}
