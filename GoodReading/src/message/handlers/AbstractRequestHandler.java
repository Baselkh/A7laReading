/**
 * 
 */
package message.handlers;

import messages.Message;
import server.db.DBConnector;

public abstract class AbstractRequestHandler {
	
	protected DBConnector dbCon;

	public AbstractRequestHandler(DBConnector dbCon) {
		this.dbCon = dbCon;
	}

	public DBConnector getDbCon() {
		return dbCon;
	}

	public void setDbCon(DBConnector dbCon) {
		this.dbCon = dbCon;
	}

	abstract public Message handle(Message msg);
}
