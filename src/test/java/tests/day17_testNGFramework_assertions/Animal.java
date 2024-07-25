package tests.day17_testNGFramework_assertions;

public class Animal {
    public void makeSound() {
        System.out.println("Some sound");
    }
}
    class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Bark");
        }
    }
