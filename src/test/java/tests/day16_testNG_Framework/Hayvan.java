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
    public static void main(String[] args) {

        Hayvan Kedi=new Kedi();
        Hayvan Kopek=new Kopek();
        Hayvan hayvan=new Hayvan();
        Hayvan ordek=new Ordek();

        System.out.println(Kedi.sesCikar());
        System.out.println(Kopek.sesCikar());
        System.out.println(hayvan.sesCikar());
        System.out.println(ordek.sesCikar());


    }
}
