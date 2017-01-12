package protocol.request;

import client.entities.Book;
import client.entities.User;
import messages.Message;
import messages.MessageType;

public class SearchRequest implements Message {

	private Book book;
	public SearchRequest(Book book) {
		this.book=book;
	}

	@Override
	public MessageType getMessageType() {
		
		return MessageType.SEARCH_REQUEST;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	

}
