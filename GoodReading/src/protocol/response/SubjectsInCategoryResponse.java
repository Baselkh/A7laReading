package protocol.response;

import java.util.ArrayList;

import messages.Message;
import messages.MessageType;

/**
 * @author Basel
 *
 */
public class SubjectsInCategoryResponse implements Message {

	private ArrayList<String> subjects;
	
	public SubjectsInCategoryResponse(ArrayList<String> subjects){
		this.subjects= subjects;
	}
	
	public ArrayList<String> getSubjects() {
		return subjects;
	}

	public MessageType getMessageType() {
		return MessageType.SUBJECTS_IN_CATEGORY_RESPONSE;
	}
}
