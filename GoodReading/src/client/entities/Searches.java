package client.entities;

public class Searches extends Book{
	private long numOfSearchres;
	//Date sDate;

	public Searches(String bookID, String Title, String Language, String Summary, String tableOfContents,
			long downloadsNum) {
		super(bookID, Title, Language, Summary, tableOfContents, downloadsNum);
		
	}

	public long getNumOfSearchres() {
		return numOfSearchres;
	}

	public void setNumOfSearchres(long numOfSearchres) {
		this.numOfSearchres = numOfSearchres;
	}
	
	

}
