// This file contains material supporting section 3.7 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 

import java.io.*;

import ocsf.server.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * This class overrides some of the methods in the abstract 
 * superclass in order to give more functionality to the server.
 *
 * @author Dr Timothy C. Lethbridge
 * @author Dr Robert Lagani&egrave;re
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Paul Holden
 * @version July 2000
 */
public class EchoServer extends AbstractServer 
{
  //Class variables *************************************************
	private static Connection conn;
  
  /**
   * The default port to listen on.
   */
  final public static int DEFAULT_PORT = 5555;
  
  //Constructors ****************************************************
  
  /**
   * Constructs an instance of the echo server.
   *
   * @param port The port number to connect on.
   */
  public EchoServer(int port) 
  {
    super(port);
  }

  
  //Instance methods ************************************************
  
  /**
   * This method handles any messages received from the client.
   *
   * @param msg The message received from the client.
   * @param client The connection from which the message originated.
   */
//  public void handleMessageFromClient
//    (Object msg, ConnectionToClient client)
//  {
//	    System.out.println("Message received: " + msg + " from " + client);
//	    this.sendToAllClients(msg);
//	  }
  
  public void handleMessageFromClient(Object msg, ConnectionToClient client){
	  if(msg instanceof String){
		  if(msg.equals("print table"))
			  this.sendToAllClients(printTable());
		  else{
			  String[] str = ((String) msg).split(" ");
			  if(str.length != 3)
				  this.sendToAllClients("Command does not exist");
			  else if(str[0].equals("insert")){
				  if(insertIntoTable(str[1], str[2]))
					  this.sendToAllClients("Success");
				  else
					  this.sendToAllClients("Failure");
			  }
			  else if(str[0].equals("update")){
				  if(updateTable(str[1], str[2]))
					  this.sendToAllClients("Success");
				  else
					  this.sendToAllClients("Failure");
			  }
			  else
				  this.sendToAllClients("Command does not exist");  
		  }
	  }
	  else
		  this.sendToAllClients("Command does not exist");
  }

    
  /**
   * This method overrides the one in the superclass.  Called
   * when the server starts listening for connections.
   */
  protected void serverStarted()
  {
    System.out.println
      ("Server listening for connections on port " + getPort());
  }
  
  /**
   * This method overrides the one in the superclass.  Called
   * when the server stops listening for connections.
   */
  protected void serverStopped()
  {
    System.out.println
      ("Server has stopped listening for connections.");
  }
  
  //Class methods ***************************************************
  
  /**
   * This method is responsible for the creation of 
   * the server instance (there is no UI in this phase).
   *
   * @param args[0] The port number to listen on.  Defaults to 5555 
   *          if no argument is entered.
   */
  public static void main(String[] args) 
  {
    int port = 0; //Port to listen on

    try
    {
      port = Integer.parseInt(args[0]); //Get port from command line
    }
    catch(Throwable t)
    {
      port = DEFAULT_PORT; //Set port to 5555
    }
	
    EchoServer sv = new EchoServer(port);
    
    try 
    {
      sv.listen(); //Start listening for connections
    } 
    catch (Exception ex) 
    {
      System.out.println("ERROR - Could not listen for clients!");
    }
    
    try 
	{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
    } catch (Exception ex) {/* handle the error*/}
    
    try 
    {
        conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root","Braude");
        //Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.3.68/test","root","Root");
        System.out.println("SQL connection succeed");
        //createTableCourses(conn);
//        printTable(conn);
 	} catch (SQLException ex) 
 	    {/* handle any errors*/
        System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
        }
  }
  
  public static String printTable()
	{
		Statement stmt;
 		String str = "";
		try 
		{
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM worker;");
			while(rs.next())
	 		{
//				 // Print out the values
//				 System.out.println(rs.getString(1)+"  " +rs.getString(2));
				 
				 str += rs.getString(1) + "  " + rs.getString(2) + "\n";
			} 
			rs.close();
			//stmt.executeUpdate("UPDATE course SET semestr=\"W08\" WHERE num=61309");
		} 
		catch (SQLException e){
			e.printStackTrace();
			return null;
		}
		
		return str;
	}

  public static boolean insertIntoTable(String workerName, String Department)
	{
		Statement stmt;
		String str = "";
		try 
		{
			stmt = conn.createStatement();
			stmt.executeUpdate("INSERT INTO worker VALUES('" + workerName + "', '" + Department + "')");
			return true;
			//stmt.executeUpdate("UPDATE course SET semestr=\"W08\" WHERE num=61309");
		}
		catch (SQLException e){
			e.printStackTrace();
			return false;
		}
	}
	
  public static boolean updateTable(String workerName, String Department)
	{
	  Statement stmt;
		try 
		{
			stmt = conn.createStatement();
			int res = stmt.executeUpdate("UPDATE worker SET Department='" + Department + "' WHERE workerName='" + workerName + "'");
			if(res == 0)
				return false;			
			return true;
			//stmt.executeUpdate("UPDATE course SET semestr=\"W08\" WHERE num=61309");
		} catch (SQLException e) {e.printStackTrace();}
		return false;
	}
  
//	public static void createTableCourses(Connection con1){
//		Statement stmt;
//		try {
//			stmt = con1.createStatement();
//			stmt.executeUpdate("create table courses(num int, name VARCHAR(40), semestr VARCHAR(10));");
//			stmt.executeUpdate("load data local infile \"courses.txt\" into table courses");
//	 		
//		} catch (SQLException e) {	e.printStackTrace();}
//		 		
//	}
}
//End of EchoServer class
