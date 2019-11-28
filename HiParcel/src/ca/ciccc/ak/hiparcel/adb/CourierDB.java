package ca.ciccc.ak.hiparcel.adb;

import java.util.ArrayList;
import java.util.List;

import ca.ciccc.ak.hiparcel.model.Courier;
import ca.ciccc.ak.hiparcel.model.VehicleType;

public class CourierDB implements ModelDB<Courier> {

	// MOCK CODE. It will be changed to database access
	private static final String[] names = { "Richard Nasimiyu MacWilliam", "Orestes Naoum Tivoli",
			"Neelima Liliya Austin", "Andréia Salomè Agramunt", "Ekene Eleonóra Wolff" };

	@Override
	public List<Courier> listAll() {
		List<Courier> list = new ArrayList<Courier>();
		
		int i = 1;

		//Mock code
		for(String n : names) {
			list.add(new Courier(i, n, VehicleType.Bicycle));
			i++;
		}
		
		return list;
	}

	@Override
	public Courier selectById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Courier obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Courier obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub

	}

}
