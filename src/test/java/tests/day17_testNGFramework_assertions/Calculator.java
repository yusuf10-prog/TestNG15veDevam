package tests.day17_testNGFramework_assertions;

public class Calculator {

    // İki tamsayıyı toplama metodu
    public int add(int a, int b) {
        return a + b;
    }

    // Üç tamsayiyi toplama metodu
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // 4 tamsayiyi toplama methodu
    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    // 5 tamsayiyi toplama methodu
    public int add(int a, int b, int c, int d, int e){
            return a+b+c+d+e;
    }

    public int add (int a, int b, int c, int d, int e, int f){
        return a + b + c + d + e + f;
    }
    // İki ondalikli sayiyi toplama methodu
    public double add(double a, double b) {
        return a + b;
    }
    public int add(int a, int b, int c, int d, int e, int f, int g){
        return a+b+c+d+e+f+g;
    }
    public int add (int a, int b, int c, int d, int e, int f, int g, int k){
        return a+b+c+d+e+f+d+g+k;
    }
    public static void main(String[] args) {
        Calculator calc=new Calculator();

        // İki tamsayiyi toplama
        System.out.println("Toplama (int): " + calc.add(5, 10));

        System.out.println("Toplam (int): " + calc.add(2,3));

        // iki tamsayiyi toplama
        System.out.println("toplama (int): " + calc.add(2,3));

        // üç tamsasiyi toplama
        System.out.println("toplama (int,int): "+ calc.add(2,3,4));

        System.out.println("Toplam (int): " + calc.add(3,4,5,6));

        // Üç tamsayiyi toplama
        System.out.println("Toplama (int, int, int): " + calc.add(5, 10, 15));

        // dort tamsayiyi toplama
        System.out.println("Toplama (int, int, int, int)" + calc.add(3,4,5,6));

        // bes tamsayiyi toplama
        System.out.println("Toplama(int, int, int, int)" + calc.add(1,2,3,4,5));

        // alti tamsayiyi toplama
        System.out.println("Toplama(int, int, int, int)" + calc.add(1,2,3,4,5, 6));

        // alti tamsayiyi toplama
        System.out.println("Toplama (int, int, int, int)" + calc.add(1,2,3,4,5));

        // İki ondalıklı sayiyi toplama
        System.out.println("Toplama (double): " + calc.add(5.5, 10.5));

        // iki tam sayinin toplami
        System.out.println(calc.add(3,2));

        // 7 tam sayinin toplami
        System.out.println(calc.add(1,2,3,4,5,6,7));


        System.out.println(calc.add(1,2,3,4,5,6,7, 8));

    }
}

