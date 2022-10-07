public class Main
{
    public static void main(String[] args)
    {
        // Ders 33 : Getter and Setter
        // Ders 34 : Constructor

        Product product1 = new Product(1,"Iphone 11","Telefon", 17000);
        // İki farklı yöntem. parametreli constructor ile parametresiz farkı
        Product product2 = new Product();
        product2.setName("Iphone 11");
        System.out.println("(Parametreli)" + product1.getName());
        System.out.println("(Parametresiz)" +product2.getName());
    }
}