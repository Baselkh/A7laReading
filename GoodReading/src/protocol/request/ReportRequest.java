package protocol.request;

import client.entities.Book;
import client.entities.User;
import messages.Message;
import messages.MessageType;

public class ReportRequest implements Message   {
	private User text;
	
	
	public MessageType getMessageType() {
 		return MessageType.REPORTS_REQUEST;

	}

public ReportRequest() {
	// TODO Auto-generated constructor stub
}


}
