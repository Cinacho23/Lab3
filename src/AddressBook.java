import java.util.ArrayList;

public class AddressBook {
    ArrayList<BuddyInfo> buddies;
    public AddressBook(){
        buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        for(BuddyInfo b : buddies){
            if(b.equals(buddy)){
                buddies.remove(buddy);
            }
        }
    }
}
