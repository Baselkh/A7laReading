package client.entities;
import java.time.LocalDate;
import java.util.ArrayList;


/**
 * @author Basel
 *
 */
public class Purchases {

	private String bookID;
	private String userName;
	private String feedbackTitle;
	private String feedbackText;
	private LocalDate feedbackDate;
	private ArrayList<String> keywords;
	private String signature;
	
	public Purchases(String bookID, String userName, String feedbackTitle,
			String feedbackText, LocalDate feedbackDate,
			ArrayList<String> keywords, String signature) {
		super();
		this.bookID = bookID;
		this.userName = userName;
		this.feedbackTitle = feedbackTitle;
		this.feedbackText = feedbackText;
		this.feedbackDate = feedbackDate;
		this.keywords = keywords;
		this.signature = signature;
	}

}