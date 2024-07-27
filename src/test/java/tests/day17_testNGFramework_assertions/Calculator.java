package tests.day17_testNGFramework_assertions;

public class Calculator {

    // İki tamsayıyı toplama metodu
    public int add(int a, int b) {
        return a + b;
    }

    // Üç tamsayıyı toplama metodu (aşırı yüklenmiş)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // 4 tamsayiyi toplama methodu

    // İki ondalıklı sayıyı toplama metodu (aşırı yüklenmiş)
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc=new Calculator();

        // İki tamsayıyı toplama
        System.out.println("Toplama (int): " + calc.add(5, 10));

        // Üç tamsayıyı toplama
        System.out.println("Toplama (int, int, int): " + calc.add(5, 10, 15));

        // İki ondalıklı sayıyı toplama
        System.out.println("Toplama (double): " + calc.add(5.5, 10.5));


    }
}

