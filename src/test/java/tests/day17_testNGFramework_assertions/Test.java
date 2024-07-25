package tests.day17_testNGFramework_assertions;

public class Test {
    public static void main(String[] args) {
        Animal myDog=new Dog();
        myDog.makeSound(); //Bark

        Animal dog=new Animal();
        dog.makeSound(); // Some sound

        Dog dogi=new Dog();
        dogi.makeSound(); // Bark


    }
}
