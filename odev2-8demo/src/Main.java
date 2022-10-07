public class Main
{
    public static void main(String[] args)
    {
        // Ders 41: Abstract Class Demo

        CustomerManager customerManager = new CustomerManager();

        customerManager.getCustomers("test"); // DB türü değiştirmek için CustomerManager Class'a git

        System.out.println("------------------------------------");

        customerManager.updateCustomers("TEST");
    }
}