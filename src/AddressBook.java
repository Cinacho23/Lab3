import java.util.ArrayList;

public class AddressBook {
    ArrayList<BuddyInfo> buddies;
    public AddressBook(){
        buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        buddies.add(buddy);
    }

    public String removeBuddy(BuddyInfo buddy){
        for(BuddyInfo b : buddies){
            if(b.equals(buddy)){
                buddies.remove(buddy);
                return buddy.getName();
            }
        }
        return "Error: Buddy not found";
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        System.out.println(addressBook.removeBuddy(buddy));
    }
}
