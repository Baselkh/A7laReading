package protocol.response;

import messages.Message;
import messages.MessageType;

public class ReportResponce implements Message {

	@Override
	public MessageType getMessageType() {
		// TODO Auto-generated method stub
		return MessageType.REPORTS_RESPONSE;
	}

}
