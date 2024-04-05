package desafio.desafio21;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Nome: " + name + " (Idade: " + age + ")";
    }
}
