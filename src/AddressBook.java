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
	
	public static void	main(String[] args) {
		System.out.println("Address Book");
		
		BuddyInfo Homer = new BuddyInfo("Homer");
		AddressBook myBuddies = new AddressBook();
		
		myBuddies.addBuddy(Homer);	
		myBuddies.removeBuddy(Homer);
	}
	
	
}
