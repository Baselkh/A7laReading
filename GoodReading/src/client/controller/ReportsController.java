package client.controller;

public class ReportsController {

	public ReportsController(){}
	
	public enum report{BOOK_SEARCHES_REPORT, BOOK_DOWNLOADS_REPORT}
	
	public void viewUserReport(String userID){}
	
	// חסר פרמטר שמגדיר באיזה אופן להוריד את הספר
	public void viewBookReport(String bookID,int  Year){}
	
	
}
