package ca.ciccc.ak.hiparcel.model;

public enum State {
	Draft, //not ready to pick up
	Ready, //Ready to pick up
	Transit, //parcel with courier
	Delivered, //parcel with recipient
	Returned; //percel returned to sender
	
	/**
	 * Return the default initial state
	 * @return
	 */
	public static State initial() {
		return State.Draft;
	}
	
	/**
	 * Verify if the service order is in a finished state
	 * @return
	 */
	public boolean finished() {
		boolean f = false;
		if(this == State.Delivered || this == State.Returned) {
			f = true;
		} 
		return f;
	}
	
	/**
	 * Return the next state to service order
	 * @return
	 */
	public State next() {
		State next = null;
		switch (this) {
		case Draft:
			next = State.Ready;
			break;
		case Ready:
			next = State.Transit;
			break;
		case Transit:
			next = State.Delivered;
			break;
		default:
			next = this;
		}
		return next;
	}
}
