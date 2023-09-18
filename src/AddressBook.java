import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> Book;

    public AddressBook(){
        Book = new ArrayList<BuddyInfo>();
    }

    //This method adds a buddy into the AddressBook
    public void addBuddy(BuddyInfo buddyInfo){
        Book.add(buddyInfo);
    }

    //This method removes a buddy from the AddressBook
    public void removeBuddy(BuddyInfo buddyInfo){
        Book.remove(buddyInfo);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }

}
