import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Ders 38 : Polymorphism

        /*BaseLogger[] loggers = new BaseLogger[]{new DBLogger(),new EMailLogger(), new FileLogger()};

        for(BaseLogger logger:loggers)
        {
            logger.log("TEST");
        }*/
        Scanner key = new Scanner(System.in);

        System.out.print("Log mesajı girin: ");
        String

        CustomerManager customerManager = new CustomerManager(new DBLogger());
        customerManager.add("Mesaj");
    }
}