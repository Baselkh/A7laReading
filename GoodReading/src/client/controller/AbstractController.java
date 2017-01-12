/**
 * 
 */
package client.controller;

import client.ui.Client;

public class AbstractController {

	protected Client client;

	public AbstractController(Client client) {
		this.client = client;
	}
}
