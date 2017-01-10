package client.controller;

import client.ui.Client;

/**
 * 
 * @author wardm
 *
 */
public class ControllerFactory {

	public static AbstractController create(ControllerType controllerType,
			Client client) {
		switch (controllerType) {
		// TODO: Add for each new Request
		case LOGIN_CONTROLLER:
			return new LoginController(client);
		case LIBRARY_MANAGER_CONTROLLER:
			return new LibraryManagerController(client);
		case Report_CONTROLLER:
			return new ReportsController(client);

		default:
			System.out.println("ERROR: Invalid handler type");
			return null;
		}
	}

}
