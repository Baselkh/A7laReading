/**
 * 
 */
package server.ui;

import java.util.HashMap;
import java.util.Map;

import messages.MessageType;
import message.handlers.AbstractRequestHandler;
import message.handlers.HandlerFactory;
import server.db.DBConnector;

public class Handlers {

	private DBConnector dbCon;
	private Map<MessageType, AbstractRequestHandler> handlers;

	public Handlers(DBConnector dbCon) {
		super();
		this.dbCon = dbCon;
		handlers = new HashMap<MessageType, AbstractRequestHandler>();
	}

	public AbstractRequestHandler getHandler(MessageType msgType) {
		AbstractRequestHandler handler = handlers.get(msgType);
		if (handler == null) {
		//	handler = HandlerFactory.create(msgType, dbCon);
			handlers.put(msgType, handler);
		}
		return handler;
	}
}
