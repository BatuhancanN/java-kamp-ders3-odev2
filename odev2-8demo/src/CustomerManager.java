public class CustomerManager
{
    public void getCustomers(String input)
    {
        BaseDatabaseManager databaseManager = new OracleDatabaseManager(); //DB değiştirmek için new sonrasını değiştir.
        databaseManager.getData();
        System.out.println("Eklendi: " + input);
    }

    public void updateCustomers(String input)
    {
        BaseDatabaseManager databaseManager = new SqlServerDatabaseManager();
        databaseManager.getData();
        System.out.println("Güncellendi: " + input);
    }
}
