public class Main
{
    public static void main(String[] args)
    {
        // Ders 36: Inheritance

        Customer customer = new Customer();
        Employee employee = new Employee();

        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();

        customerManager.Add();
        customerManager.List();
        employeeManager.AyinElemani();
    }
}