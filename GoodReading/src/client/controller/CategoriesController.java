package client.controller;
import client.entities.Category;
import client.ui.Client;
import protocol.request.SubjectsInCategoryRequest;
import protocol.response.SubjectsInCategoryResponse;

/**
 * @author Basel
 *
 */
public class CategoriesController extends AbstractController {

	public CategoriesController(Client client){
		super(client);
	}
	
	public SubjectsInCategoryResponse getCategorySubjects(String categoryName){
		SubjectsInCategoryRequest message= new SubjectsInCategoryRequest(categoryName);
		return (SubjectsInCategoryResponse) client.sendMessage(message);
	}
	
	public void createCategory(String categoryName){
		
	}
	
	public void deleteCategory(String categoryName){

	}
	
	public void renameCategory(String categoryName){

	}
	
	private void printMessage(boolean result){
		
	}
}
