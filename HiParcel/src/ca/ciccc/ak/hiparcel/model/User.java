package ca.ciccc.ak.hiparcel.model;

/**
 * This model class represents Sender and Recipient
 * @author alexkayser
 *
 */
public class User {
	
	private long ID;
	
	private String name;
	
	public User() {
		//default constructor
	}

	public User(long iD, String name) {
		super();
		ID = iD;
		this.name = name;
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/*
	 * String representation of User
	 */
	public String toString() {
		return ID + " - " + name;
	}

}
