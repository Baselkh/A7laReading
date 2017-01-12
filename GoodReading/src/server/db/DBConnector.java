package server.db;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import client.entities.User;

public class DBConnector {
	public Connection connDB;
	
	/**
	 * 
	 * @param user
	 *            : to check if the user ID exist in the database
	 * @return true if ID exist, else false
	 * @throws SQLException
	 */
	public boolean isUser(User user) throws SQLException {
		try {
			Statement Stmt = connDB.createStatement();
			ResultSet rs = Stmt.executeQuery("SELECT * FROM users WHERE ID="
					+ "'" + user.getID() + "'");
			if (!(rs.next()))  return false;
			
			rs.close();
			return true;

		} catch (SQLException ex) {
			ex.printStackTrace();
			return false;
		}

	}

	/**
	 * 
	 * @param user
	 *            : has the ID and the password that the user insert in the GUI
	 * @return true if the password is Suitable to the ID, else return false
	 * @throws SQLException
	 */
	public boolean checkPassword(User user) throws SQLException {
		try {
			Statement Stmt = connDB.createStatement();
			ResultSet rs = Stmt.executeQuery("SELECT * FROM users WHERE ID="
					+ user.getID() + " AND Password=" + user.getPassword());
			if (!(rs.next()))  return false;
			
			rs.close();
			return true;
		} catch (SQLException ex) {
			ex.printStackTrace();
			return false;
		}
	}

	/**
	 * 
	 * @param user
	 *            : has the ID and the password that the user insert in the GUI
	 * @return true if the user is already logged In, els return false
	 * @throws SQLException
	 */
	public boolean isLoggedIn(User user) throws SQLException {
		try {
			Statement Stmt = connDB.createStatement();
			ResultSet rs = Stmt.executeQuery("SELECT * FROM users WHERE ID="
					+ user.getID() + " AND Status=1");
			if (!(rs.next())) return false;
			
			rs.close();
			return true;
		} catch (SQLException ex) {
			ex.printStackTrace();
			return false;
		}

	}

	/**
	 * markAsLoggedIn-- change the status to 1 that marks the user is logged in
	 * 
	 * @param user
	 *            : has the ID and the password that the user insert in the GUI
	 * @throws SQLException
	 */
	public void markAsLoggedIn(User user) throws SQLException {
		try {
			Statement Stmt = connDB.createStatement();
			Stmt.executeUpdate("UPDATE users SET Status=1 WHERE ID="
					+ user.getID());
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	/**
	 * markAsLoggedOut-- change the status to 0 that marks the user is logged
	 * out
	 * 
	 * @param user
	 *            : has the ID and the password that the user insert in the GUI
	 * @throws SQLException
	 */
	public void markAsLoggedOut(User user) throws SQLException {
		try {
			Statement Stmt = connDB.createStatement();
			Stmt.executeUpdate("UPDATE users SET Status=0 WHERE ID="
					+ user.getID());
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}// end markAsLoggedOut
	
	/**
	 * 
	 * @param user
	 *            : has the ID and the password that the user insert in the GUI
	 * @return all the needed information about the user from the DataBase.
	 * @throws SQLException
	 */
	public User fillUser(User user) throws SQLException {
		try {
			Statement stmt = connDB.createStatement();
			User currUser = new User(user.getID(), user.getPassword());
			ResultSet rs = stmt
					.executeQuery("SELECT Name,Type,UserNumber,Email,OA FROM users WHERE ID = "
							+ user.getID());
			rs.first();
			
			currUser.fillDetails(rs.getString(1), rs.getString(1), rs.getInt(2), rs.getInt(3),rs.getString(4), rs.getString(5));
			rs.close();
			return currUser;
		} catch (SQLException ex) {
			ex.printStackTrace();
			return null;
		}
	}
	
	public ArrayList<String> getSubjectsInCategory(String categoryName){
		try {
			Statement st = connDB.createStatement();
			ResultSet rs = st
					.executeQuery("SELEECT SubjectName FROM subjects WHERE Category="+categoryName+";");
			ArrayList<String> arr= new ArrayList<String>();
			while(rs.next())
				arr.add(rs.getString(1));
			rs.close();
			return arr;
		}
		catch (SQLException ex) {
			ex.printStackTrace();
			return null;
		}
	}
}
