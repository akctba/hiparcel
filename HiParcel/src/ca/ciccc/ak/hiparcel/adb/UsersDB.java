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

	// temporary constants. It will be changed to database access
	private static final String[] names = { "Edgar Gray", "Randal Nichols", "Howard Waters", "Perry Cain",
			"Felipe Rose", "Gilberto Obrien", "Cindy Sparks", "Lorena Weber", "Pam Anderson", "Jan Rios" };

	public List<User> allCurrentUsers() {
		List<User> list = new ArrayList<User>();
		int i = 1;

		//temporary code. Change to database access
		for(String n : names) {
			list.add(new User(i, n));
			i++;
		}
		
		return list;

	}

}
