package protocol.response;

import messages.Message;
import messages.MessageType;

public class searchResponse implements Message {

	private String text;
	public searchResponse(String string) {
		this.text = text;
	}

	@Override
	public MessageType getMessageType() {
		// TODO Auto-generated method stub
		return MessageType.SEARCH_RESPONSE;
	}

	public static searchResponse OK() {
		
		return new searchResponse("ok");
	}

	public String getText() {
		// TODO Auto-generated method stub
		return this.text;
	}
	

}
