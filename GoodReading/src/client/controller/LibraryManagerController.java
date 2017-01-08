package client.controller;

import client.entities.User;
import client.ui.Client;
import protocol.request.ReportRequest;

public class LibraryManagerController extends AbstractController{

	public LibraryManagerController(Client client) {
		super(client);
		// TODO Auto-generated constructor stub
	}

	public ReportRequest getReports() {
		ReportRequest message = new ReportRequest();
		return (ReportRequest) client.sendMessage(message);
	}// END
	
	
}
