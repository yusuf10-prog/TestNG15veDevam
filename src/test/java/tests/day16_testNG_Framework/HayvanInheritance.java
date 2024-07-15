package tests.day16_testNG_Framework;

// Temel Hayvan sınıfı
class HayvanInheritance {
    private String isim;
    private int yas;

    public HayvanInheritance(String isim, int yas) {
        this.isim = isim;
        this.yas = yas;
    }

    public String sesCikar() {
        return "Bir ses çıkarıyor.";
    }

    public String bilgileriGoster() {
        return "İsim: " + isim + ", Yaş: " + yas;
    }

    protected String getIsim() {
        return isim;
    }
}

// Kedi sınıfı, Hayvan sınıfından türetiliyor
class Kedi extends HayvanInheritance {
    public Kedi(String isim, int yas) {
        super(isim, yas);
    }

    @Override
    public String sesCikar() {
        return "Miyav!";
    }

    public String avlan() {
        return getIsim() + " bir fare avladı.";
    }
}

// Köpek sınıfı, Hayvan sınıfından türetiliyor
class Kopek extends HayvanInheritance {
    public Kopek(String isim, int yas) {
        super(isim, yas);
    }

    @Override
    public String sesCikar() {
        return "Hav hav!";
    }

    public String topOyna() {
        return getIsim() + " top ile oynuyor.";
    }

// Ana program
    public static void main(String[] args) {
        // Kedi nesnesi oluştur
        Kedi kedi = new Kedi("Minnoş", 3);
        System.out.println(kedi.bilgileriGoster());
        System.out.println(kedi.sesCikar());
        System.out.println(kedi.avlan());

        // Köpek nesnesi oluştur
        Kopek kopek = new Kopek("Karabaş", 5);
        System.out.println(kopek.bilgileriGoster());
        System.out.println(kopek.sesCikar());
        System.out.println(kopek.topOyna());
    }
}
