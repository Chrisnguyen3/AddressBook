import java.util.ArrayList;

public class AddressBook {
	private ArrayList<BuddyInfo> buddies;

	public ArrayList<BuddyInfo> getBuddies() {
		return buddies;
	}

	public void setBuddies(ArrayList<BuddyInfo> buddies) {
		this.buddies = buddies;
	}
	
	public void addBuddy(BuddyInfo Buddy) {
		if (Buddy != null) {
			this.buddies.add(Buddy);
		}
		
	}
	
	public void removeBuddy(BuddyInfo Buddy) {
		this.buddies.remove(Buddy);
	}
	
	public static void	main(String[] args) {
		System.out.println("Address Book");
		
		BuddyInfo Homer = new BuddyInfo("Homer", "12 Westboro", "613");
		AddressBook myBuddies = new AddressBook();
		
		myBuddies.addBuddy(Homer);	
		myBuddies.removeBuddy(Homer);
	}
	
	
}
