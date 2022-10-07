public class CustomerManager
{
    public void add(String data)
    {
        ICustomerDal customerDal = new MySqlCustomerDal(); //polymorphism
        customerDal.add();
        System.out.println(data+ " verisi eklendi...");
    }
}
