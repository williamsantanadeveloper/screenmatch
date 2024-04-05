package desafio.desafio21;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("William", 19);
        Person person2 = new Person("Ciclano", 22);
        Person person3 = new Person("CRF", 129);
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        System.out.println();
        System.out.println("Tamanho da lista: " + personList.size());
        System.out.println();
        System.out.println("Primeira pessoa: " + personList.get(0).getName());
        System.out.println();
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
