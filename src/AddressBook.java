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

    //This method does nothing
    public void doNothing(){
    }

    public static void main(String[] args) {
        BuddyInfo buddyInfo = new BuddyInfo("Joe", "Paris", 123);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddyInfo);
        addressBook.removeBuddy(buddyInfo);
        System.out.println("Address Book, I AM NOT YSL!");
    }

}
