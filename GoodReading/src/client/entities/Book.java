package client.entities;
import java.util.ArrayList;

public class Book {
	private String bookID;
	private String Title;
	private String Language;
	private String Summary;
	private String tableOfContents;
	private long downloadsNum;
	private ArrayList<String> Keywords;
	private ArrayList<String> Authors;
	
	public Book(String bookID,String Title,String Language,String Summary,String tableOfContents,long downloadsNum){
		this.bookID=bookID;
		this.Title=Title;
		this.Language=Language;
		this.Summary=Summary;
		this.tableOfContents=tableOfContents;
		this.downloadsNum=downloadsNum;
		this.Keywords=null;
		this.Authors=null;
	}
	
	public enum Format {
	    pdf,doc,fb2
	}
	
	public String getBookID() {
		return bookID;
	}
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	public String getSummary() {
		return Summary;
	}
	public void setSummary(String summary) {
		Summary = summary;
	}
	public String getTableOfContents() {
		return tableOfContents;
	}
	public void setTableOfContents(String tableOfContents) {
		this.tableOfContents = tableOfContents;
	}

}
