package ca.ciccc.ak.hiparcel.model;

public class Courier {

	private long id;

	private String name;

	private VehicleType vehicle;

	public Courier() {
		//default constructor
	}
	
	public Courier(long id, String name, VehicleType vehicle) {
		super();
		this.id = id;
		this.name = name;
		this.vehicle = vehicle;
	}
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the vehicle
	 */
	public VehicleType getVehicle() {
		return vehicle;
	}

	/**
	 * @param vehicle the vehicle to set
	 */
	public void setVehicle(VehicleType vehicle) {
		this.vehicle = vehicle;
	}

}
