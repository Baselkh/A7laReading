package client.entities;

/**
 * @author Basel
 *
 */
public class User extends Person {
	
	private String userName;
	private String password;

	/**
	 * @param userName
	 * @param password
	 * @param ID
	 * @param firstName
	 * @param lastName
	 */

	
	public void fillDetails(String Fname,String Lname,int type,int userNum,String Email,String OrganizationalAffiliation){
//		super.setFirstName(Fname);
//		super.setLastName(Lname);
//		super.setType(type);
//		super.setUserNumber(userNum);
//		super.setEmail(Email);
//		super.setOrganizationalAffiliation(OrganizationalAffiliation);
	}//end fillDetails()

	public User(String iD, String firstName, String lastName, String userName, String password) {
		super(iD, firstName, lastName);
		this.userName = userName;
		this.password = password;
	}
	
	public User(String userName,String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
