package protocol.request;

<<<<<<< HEAD
=======
import client.entities.Book;
>>>>>>> 8438a25cbf298804150d8ebae608376aee029834
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
<<<<<<< HEAD
} 
=======
}


>>>>>>> 8438a25cbf298804150d8ebae608376aee029834
}
