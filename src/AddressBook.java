import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class AddressBook {
	private ArrayList<BuddyInfo> buddies = new ArrayList<BuddyInfo>();
	
	
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
	
	public void save(String filename) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
		for(BuddyInfo b : this.buddies) {
			writer.write(b.toString() + "\n");
		}
		
		writer.close();
		System.out.println("Completed");
	}
	
	public static void	main(String[] args) {
		
		BuddyInfo Homer = new BuddyInfo("Homer", "12 Westboro", "613");
		BuddyInfo Chris = new BuddyInfo("Chris", "390 Grand", "613");
		AddressBook myBuddies = new AddressBook();
		myBuddies.addBuddy(Homer);	
		myBuddies.addBuddy(Chris);
		
		try {
			myBuddies.save("Test.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}
	
	
}
