public class User extends Item {
    private String namee;
    private int contactNumber;

    public User(String name, double unitPrice, double quantity, String namee, int contactNumber) {
        super(name, unitPrice, quantity);
        this.namee = namee;
        this.contactNumber = contactNumber;
    }



    public String getName() {
        return namee;
    }

    public void setName(String name) {
        this.namee = name;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }
}
