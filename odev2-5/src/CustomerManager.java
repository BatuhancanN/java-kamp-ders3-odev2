import javax.xml.crypto.Data;

public class CustomerManager
{
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger)
    {
        this.logger = logger;
    }
    public void add(String message)
    {
        System.out.println("Müşteri eklendi...");
        this.logger.log(message);
    }
}
