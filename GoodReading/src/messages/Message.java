package messages;

import java.io.Serializable;

/**
 * @author ψεπο
 *
 */
public interface Message extends Serializable{

	/**
	 * Return Message Type
	 * 
	 * @return
	 */
	public MessageType getMessageType();
}
