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
<<<<<<< HEAD
=======
<<<<<<< HEAD

//		case LABREFFERAL_CONTROLLER:
//			return new LabRefferalController(client);
//		case REPORTS_CONTROLLER:
//			return new ReportsController(client);
=======
<<<<<<< HEAD
>>>>>>> origin/master
		case SEARCH_BOOK_CONTROLLER:
			return new SearchController(client);
			
//		case LABREFFERAL_CONTROLLER:
//			return new LabRefferalController(client);
//		case REPORTS_CONTROLLER:
//			return new ReportsController(client);
		case Report_CONTROLLER:
			return new ReportsController(client);
<<<<<<< HEAD
=======

>>>>>>> origin/master
>>>>>>> 8438a25cbf298804150d8ebae608376aee029834
>>>>>>> origin/master
		default:
			System.out.println("ERROR: Invalid handler type");
			return null;
		}
	}

}
