package desafio.desafio33;

public class Pessoa {
    private String nome;
    private int idade;
    private String cidade;

    public Pessoa(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    public Pessoa(PessoaOmdb pessoaOmdb) {
        this.nome = pessoaOmdb.nome();
        this.idade = Integer.valueOf(pessoaOmdb.idade());
        this.cidade = pessoaOmdb.cidade();
    }

    @Override
    public String toString() {
        return nome + " " + idade + " " + cidade;
    }
}
