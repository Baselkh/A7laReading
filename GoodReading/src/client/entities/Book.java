package client.entities;
import java.util.ArrayList;
 
public class Book {
	private String bookID;
	private String Title;
	private String Language;
	private String Summary;
	private String tableOfContents;
	private String Author;
	private ArrayList<String> SearchResult;
	private String downloadsNum;
	private String Keywords;
	private String Authors;
	public int num=0;
	
	
	public Book(String bookID,String Title,String Language,String Summary,String tableOfContents,String downloadsNum,String Keywords,String author){
		this.bookID=bookID;
		this.Title=Title;
		this.Language=Language;
		this.Summary=Summary;
		this.tableOfContents=tableOfContents;
		this.downloadsNum=downloadsNum;
		this.Keywords=Keywords;
		this.Authors=Authors;
	}
	public Book(String bookID,String Name,String Language,String Author)
	{
		this.bookID=bookID;
		this.Title=Title;
		this.Language=Language;
		this.Author=Author;
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

	public String getAuthor() {
		return Author;
	}
	
	public void  createArrayList()
	{
		SearchResult= new ArrayList<String>();
		
	}
	public void fillArrayList(String bookID,String Title,String Language,String Summary,String tableOfContents,String downloadsNum,String Keywords,String author)
	{
		SearchResult.add(bookID);
		SearchResult.add(Title);
		SearchResult.add(Language);
		SearchResult.add(Summary);
		SearchResult.add(tableOfContents);
		SearchResult.add(downloadsNum);
		SearchResult.add(Keywords);
		SearchResult.add(author);
		num++;
	}
	
	
	
}
