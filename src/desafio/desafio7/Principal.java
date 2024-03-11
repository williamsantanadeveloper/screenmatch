package desafio.desafio7;

public class Principal {
    public static void main(String[] args) {
        IdadePessoa person = new IdadePessoa();
        person.setNome("William");
        person.setIdade(19);
        person.verificarIdade();
        System.out.println(person.getNome() + " tem " + person.getIdade() + " anos.");
    }
}
