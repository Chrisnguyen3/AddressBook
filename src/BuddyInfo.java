
public class BuddyInfo {
	
	private String name;
	private String address;
	private String phoneNumber;
	
	
	
	public BuddyInfo(String name) {
		this.setName(name);
	}
	
	/**
	 * Gets the name of the buddy
	 * @return the name of the buddy
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the buddy
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets buddy's address
	 * @return buddy's address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets buddy's address
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Gets buddy's phone number
	 * @return buddy's phone number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Sets buddy's phone number
	 * @param phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public boolean equals(Object other) {
		if (this.getClass().equals(other.getClass())) {
			BuddyInfo buddy = (BuddyInfo) other;	
			if (this.getName().equals(buddy.getName()) && 
				this.getAddress().equals(buddy.getAddress()) && 
				this.getPhoneNumber().equals(buddy.getPhoneNumber())) {
					return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}


	public static void main(String[] args) {
		
		BuddyInfo b1 = new BuddyInfo("Homer");
		
		System.out.print("Hello " + b1.getName());
		
	}

}
