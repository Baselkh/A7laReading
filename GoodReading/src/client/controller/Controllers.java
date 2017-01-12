/**
 * 
 */
package client.controller;

import java.util.HashMap;
import java.util.Map;

import client.ui.Client;

public class Controllers {	// In newInstance(Client client), I removed one if statement

	private static Controllers instance;

	private Client client;
	private Map<ControllerType, AbstractController> controllers;

	private Controllers(Client client) {
		super();
		this.client = client;
		controllers = new HashMap<ControllerType, AbstractController>();
	}

	public synchronized static Controllers newInstance(Client client) {
		if (instance == null) {
			instance = new Controllers(client);
		}
		return instance;
	}

	public static Controllers getInstance() {
		if (instance == null) {
			System.out.println("ERROR: Controller instance not found");
		}
		return instance;
	}

	public AbstractController getController(ControllerType controllerType) {
		AbstractController controller = controllers.get(controllerType);
		if (controller == null) {
			controller = ControllerFactory.create(controllerType, client);
			controllers.put(controllerType, controller);
		}
		return controller;
	}
}
