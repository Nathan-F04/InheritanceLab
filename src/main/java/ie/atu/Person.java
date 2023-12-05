package ie.atu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Person {


       private String name,address,telNumber;
    //Constructors
    public Person() {
        this.name = "";
        this.address = "";
        this.telNumber = "";
    }

    public Person(String name, String address, String telNumber) {
        this.name = name;
        this.address=address;
        this.telNumber=telNumber;
    }
    //Getters and Setters

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", telNumber='" + telNumber + '\'' +
                ',';
    }
}