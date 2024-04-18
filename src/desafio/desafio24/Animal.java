package desafio.desafio24;

public class Animal {
    private String name;
    private char sex;

    public Animal(String name, char sex) {
        this.name = name;
        this.sex = sex;
    }

    public void description() {
        System.out.printf("Nome: (%s) - Sexo: (%c)", name, sex);
    }
}
