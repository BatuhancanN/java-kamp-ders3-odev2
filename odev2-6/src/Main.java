public class Main
{
    public static void main(String[] args)
    {
        // Ders 39: Overriding

        BaseKrediManager[] krediManagers = new BaseKrediManager[] {new TarimKrediManager(), new OgretmenKrediManager(), new OgrenciKrediManager()};

        for(BaseKrediManager krediManager : krediManagers)
        {
            System.out.println(krediManager.hesapla(50000));
        }
    }
}