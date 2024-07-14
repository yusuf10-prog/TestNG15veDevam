package tests.day16_testNG_Framework;

public class Hayvan {
    public String sesCikar() {
        return "Hayvan ses çıkarıyor.";
    }
    // Alt sınıf
    static class Kedi extends  Hayvan{
        @Override
        public String sesCikar() {
            return "Miyav!";
        }
    }

    // Alt sınıf
   static class Kopek extends Hayvan {
        @Override
        public String sesCikar() {
            return "Hav hav!";
        }
    }
    static class Ordek extends Hayvan{
        @Override
        public String sesCikar(){
            return "gulu gulu!";
        }
    }

    static class Kurbaga extends Hayvan{
        @Override
        public String sesCikar(){
            return "wak wak!";
        }
    }
    static class Esek extends Hayvan{
        @Override
        public String sesCikar(){
            return "ai ai!";
        }
    }
    static class Ari extends Hayvan{
        @Override
        public String sesCikar(){
            return "vız vız!";
        }
    }
    public static void main(String[] args) {

        Hayvan Kedi=new Kedi();
        Hayvan Kopek=new Kopek();
        Hayvan hayvan=new Hayvan();
        Hayvan ordek=new Ordek();
        Hayvan kurbaga=new Kurbaga();
        Hayvan esek=new Esek();
        Hayvan ari=new Ari();

        System.out.println(Kedi.sesCikar());    //Miyav!
        System.out.println(Kopek.sesCikar());   //Hav hav!
        System.out.println(hayvan.sesCikar());  // Hayvan ses çıkarıyor.
        System.out.println(ordek.sesCikar());   //gulu gulu!
        System.out.println(kurbaga.sesCikar()); // wak wak!
        System.out.println(esek.sesCikar());    // ai ai!
        System.out.println(ari.sesCikar());    // vız vız!
    }
}
