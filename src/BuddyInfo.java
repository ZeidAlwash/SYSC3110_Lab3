public class BuddyInfo {
    public BuddyInfo(String name, String address, int number) {
        this.Name = name;
        this.Address = address;
        this.Number = number;
    }

    public String getName() {
        return Name;
    }

    private String Name;

    private String Address;

    private int Number;

    public static void main(String[] args) {
        BuddyInfo Zeid = new BuddyInfo("Zeid", "Paris", 613);
        System.out.println("Hello World! My name is " + Zeid.getName());

    }
}
