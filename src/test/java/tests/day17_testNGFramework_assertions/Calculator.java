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
        return  a + b + c + d;

    }


    // İki ondalikli sayiyi toplama methodu
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc=new Calculator();

        // İki tamsayiyi toplama
        System.out.println("Toplama (int): " + calc.add(5, 10));

        // Üç tamsayiyi toplama
        System.out.println("Toplama (int, int, int): " + calc.add(5, 10, 15));

        // dort tamsayiyi toplama
        System.out.println("Toplama (int, int, int, int)" + calc.add(3,4,5,6));

        // İki ondalıklı sayiyi toplama
        System.out.println("Toplama (double): " + calc.add(5.5, 10.5));

    }
}

