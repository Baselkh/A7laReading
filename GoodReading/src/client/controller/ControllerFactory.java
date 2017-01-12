package client.controller;

import client.ui.Client;

public class ControllerFactory {

	public static AbstractController create(ControllerType controllerType,
			Client client) {
		switch (controllerType) {
		case LOGIN_CONTROLLER:
			return new LoginController(client);
		case LIBRARY_MANAGER_CONTROLLER:
			return new LibraryManagerController(client);
		case Report_CONTROLLER:
			return new ReportsController(client);
		case CATEGORY_CONTROLLER:
			return new CategoriesController(client);

		default:
			System.out.println("ERROR: Invalid handler type");
			return null;
		}
	}

}
