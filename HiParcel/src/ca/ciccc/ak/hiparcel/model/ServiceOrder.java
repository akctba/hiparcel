package ca.ciccc.ak.hiparcel.model;

import java.util.Date;
import java.util.List;

public class ServiceOrder {
	
	private long id;
	
	private Date registration;
	
	private User sender;
	
	private User recipient;
	
	private Date toPickUp;
	
	private Courier courier;
	
	private State state;
	
	private List<Parcel> items;
	
	private Date ending;

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
	 * @return the registration
	 */
	public Date getRegistration() {
		return registration;
	}

	/**
	 * @param registration the registration to set
	 */
	public void setRegistration(Date registration) {
		this.registration = registration;
	}

	/**
	 * @return the sender
	 */
	public User getSender() {
		return sender;
	}

	/**
	 * @param sender the sender to set
	 */
	public void setSender(User sender) {
		this.sender = sender;
	}

	/**
	 * @return the recipient
	 */
	public User getRecipient() {
		return recipient;
	}

	/**
	 * @param recipient the recipient to set
	 */
	public void setRecipient(User recipient) {
		this.recipient = recipient;
	}

	/**
	 * @return the toPickUp
	 */
	public Date getToPickUp() {
		return toPickUp;
	}

	/**
	 * @param toPickUp the toPickUp to set
	 */
	public void setToPickUp(Date toPickUp) {
		this.toPickUp = toPickUp;
	}

	/**
	 * @return the courier
	 */
	public Courier getCourier() {
		return courier;
	}

	/**
	 * @param courier the courier to set
	 */
	public void setCourier(Courier courier) {
		this.courier = courier;
	}

	/**
	 * @return the state
	 */
	public State getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(State state) {
		this.state = state;
	}

	public List<Parcel> getItems() {
		return items;
	}

	public void setItems(List<Parcel> items) {
		this.items = items;
	}

	public Date getEnding() {
		return ending;
	}

	public void setEnding(Date ending) {
		this.ending = ending;
	}

}
