package tests.day16_testNG_Framework;

public class Hayvan1 {
    public String sesCikar() {
        return "Hayvan ses çıkarıyor.";
    }
    // Alt sınıf
    static class Kedi extends Hayvan1 {
        @Override
        public String sesCikar() {
            return "Miyav!";
        }
    }

    // Alt sınıf
   static class Kopek extends Hayvan1 {
        @Override
        public String sesCikar() {
            return "Hav hav!";
        }
    }
    static class Ordek extends Hayvan1 {
        @Override
        public String sesCikar(){
            return "gulu gulu!";
        }
    }

    static class Kurbaga extends Hayvan1 {
        @Override
        public String sesCikar(){
            return "wak wak!";
        }
    }
    static class Esek extends Hayvan1 {
        @Override
        public String sesCikar(){
            return "ai ai!";
        }
    }
    static class Ari extends Hayvan1 {
        @Override
        public String sesCikar(){
            return "vız vız!";
        }
    }
    public static void main(String[] args) {

        Hayvan1 Kedi=new Kedi();
        Hayvan1 Kopek=new Kopek();
        Hayvan1 hayvan=new Hayvan1();
        Hayvan1 ordek=new Ordek();
        Hayvan1 kurbaga=new Kurbaga();
        Hayvan1 esek=new Esek();
        Hayvan1 ari=new Ari();

        System.out.println(Kedi.sesCikar());    //Miyav!
        System.out.println(Kopek.sesCikar());   //Hav hav!
        System.out.println(hayvan.sesCikar());  // Hayvan ses çıkarıyor.
        System.out.println(ordek.sesCikar());   //gulu gulu!
        System.out.println(kurbaga.sesCikar()); // wak wak!
        System.out.println(esek.sesCikar());    // ai ai!
        System.out.println(ari.sesCikar());    // vız vız!
    }
}
