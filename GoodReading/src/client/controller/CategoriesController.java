package client.controller;
import client.entities.Category;

/**
 * @author Basel
 *
 */
public class CategoriesController {

	Category category;
	

	public CategoriesController(String categoryName){
		category= new Category(categoryName);
	}
	
	public void createCategory(String categoryName){
		
	}
	
	public void deleteCategory(String categoryName){

	}
	
	public void renameCategory(String categoryName){

	}
	
	private void printMessage(boolean result){
		
	}
	
	public Category getCategory() {
		return category;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}
}
