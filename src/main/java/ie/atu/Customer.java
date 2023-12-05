package ie.atu;

public class Customer extends Person {
    private String customerNo;
    private boolean mail;

    public Customer(String name, String address, String telNumber, String customerNo, boolean mail) {
        super(name, address, telNumber);
        this.customerNo = customerNo;
        this.mail = mail;
    }

    public Customer() {
    }

    public Customer(String name, String address, String telNumber) {
        super(name, address, telNumber);
    }

    //Getters and setters for new fields
    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public boolean isMail() {
        return mail;
    }

    public void setMail(boolean mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {

        return "Customer{" + super.toString()+
                "customerNo='" + customerNo + '\'' +
                ", mail=" + mail +
                '}';
    }
}
