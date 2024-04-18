package desafio.desafio24;

public class Main {
    public static void main(String[] args) {
//        Dog dog = new Dog("Talon", 'm');
        Animal animal = new Dog("Talon", 'm');
//        Animal animal2 = new Dog("Talon", 'm');

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
        } else {
            System.out.println("O objeto não é um cachorro");
        }

    }
}
