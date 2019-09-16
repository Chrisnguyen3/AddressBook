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
		this.buddies.add(Buddy);
	}
	
	public void removeBuddy(BuddyInfo Buddy) {
		this.buddies.remove(Buddy);
	}
	
	
	
}
