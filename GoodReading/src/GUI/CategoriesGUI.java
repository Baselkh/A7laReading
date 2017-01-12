package GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
<<<<<<< HEAD
import javax.swing.SwingConstants;

//import GUI.FolderElement;
=======
>>>>>>> origin/master

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
		
<<<<<<< HEAD
		// Categories icons layout
		JPanel iconsPanel= new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));
		try{	// Initializing the pointer to the icon
			folderIcon= ImageIO.read(new File("images\\folder_icon.png"));
		}
		catch(IOException e){}	///////Messing Code/////////
		readCategoriesNames();	// Getting categories names
		createFolderClickListener();
		for(String s: categoriesName){
		//	iconsPanel.add(makeFolderIcon(s));
		}
		pane.add(iconsPanel);
		
		// Displaying
		pack();
		setVisible(true);
	}
	
	/*private FolderElement makeFolderIcon(String categoryName){
		FolderElement folder= new FolderElement(categoryName, folderIcon);
		
		folder.addMouseListener(mouseClickListener);
		return folder;
	}*/
	
	private void readCategoriesNames(){
		categoriesName= new ArrayList<String>();
		categoriesName.add("aaaaaaaaaaaaa");
		categoriesName.add("bbbbbbbbbbbbb");
		categoriesName.add("ccccccccccccc");
		categoriesName.add("ddddddddddddd");
		categoriesName.add("eeeeeeeeeeeee");
		categoriesName.add("fffffffffffff");
		categoriesName.add("ggggggggggggg");
		categoriesName.add("hhhhhhhhhhhhh");
		categoriesName.add("iiiiiiiiiiiii");
		categoriesName.add("jjjjjjjjjjjjj");
		categoriesName.add("kkkkkkkkkkkkk");
		
//		categoriesName.add("aaaaaaaaaaaaa");
//		categoriesName.add("bbbbbbbbbbbbb");
//		categoriesName.add("ccccccccccccc");
//		categoriesName.add("ddddddddddddd");
//		categoriesName.add("eeeeeeeeeeeee");
//		categoriesName.add("fffffffffffff");
//		categoriesName.add("ggggggggggggg");
//		categoriesName.add("hhhhhhhhhhhhh");
//		categoriesName.add("iiiiiiiiiiiii");
//		categoriesName.add("jjjjjjjjjjjjj");
//		categoriesName.add("kkkkkkkkkkkkk");
	}
	
	private void createFolderClickListener(){
		mouseClickListener= new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				//String categoryName= ((FolderElement)e.getSource()).getName();
			//	JOptionPane.showMessageDialog(null, categoryName+" is pressed");
			}
		};
=======
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
>>>>>>> origin/master
	}
	
	public static void main(String args[]){
		new CategoriesGUI();
	}
}
