package ca.ciccc.ak.hiparcel.adb;

import java.util.ArrayList;
import java.util.List;

import ca.ciccc.ak.hiparcel.model.User;

/**
 * Class to access database
 * @author alexkayser
 *
 */
public class UsersDB {

	// MOCK CODE. It will be changed to database access
	private static final String[] names = { "Edgar Gray", "Randal Nichols", "Howard Waters", "Perry Cain",
			"Felipe Rose", "Gilberto Obrien", "Cindy Sparks", "Lorena Weber", "Jerremy Anderson", "Antonio Rios" };

	public List<User> allCurrentUsers() {
		List<User> list = new ArrayList<User>();
		int i = 1;

		//Mock code
		for(String n : names) {
			list.add(new User(i, n));
			i++;
		}
		
		return list;
	}
	
	/*
	 * Loads a User by id
	 */
	public User loadUser(long id) {
		
		User user = new User();
		
		user.setID(id);
		user.setName(names[(int)id-1]);
		
		return user;
		
	}
	

}
