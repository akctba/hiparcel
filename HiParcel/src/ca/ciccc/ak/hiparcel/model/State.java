package ca.ciccc.ak.hiparcel.model;

public enum State {
	Draft, //not ready to pick up
	Ready, //Ready to pick up
	Transit, //parcel with courier
	Delivered, //parcel with recipient
	Returned; //percel returned to sender
}
