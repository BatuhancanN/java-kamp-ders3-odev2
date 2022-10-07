public class Main
{
    public static void main(String[] args)
    {
        // Ders 37: Inheritance Demo

        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new OgretmenKrediManager());

        System.out.println("\n\n");

        krediUI.KrediHesapla(new TarimKrediManager());

        System.out.println("\n\n");

        krediUI.KrediHesapla(new AskerKrediManager());
    }
}