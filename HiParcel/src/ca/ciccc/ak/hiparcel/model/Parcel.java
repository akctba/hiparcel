package ca.ciccc.ak.hiparcel.model;

public class Parcel {

	private long Id;
	
	private ParcelType type;
	
	private String tag;

	/**
	 * @return the id
	 */
	public long getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		Id = id;
	}

	/**
	 * @return the type
	 */
	public ParcelType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(ParcelType type) {
		this.type = type;
	}

	/**
	 * @return the tag
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * @param tag the tag to set
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}
	
	
}
