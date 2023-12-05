package ie.atu;

public class Main {
    public static void main(String[] args)
    {
        /*Person myPerson=new Person("Test","Test2","Test3");
       System.out.println(myPerson.toString());*/
       Customer Part1 = new Customer("Test4","Test5","Test6","custNoTest",true);
        System.out.println(Part1.toString());

        Customer Part2 = new Customer();
        Part2.setAddress("myHouse");
        Part2.setName("myName");
        Part2.setTelNumber("myNumber");
        Part2.setMail(true);
        Part2.setCustomerNo("myCustomerNumber");
        System.out.println(Part2.toString());

    }
}
