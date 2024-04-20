package desafio.desafio28;

public class Titulo implements Comparable<Titulo> {
    private String nome;
    public Titulo(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
    @Override
    public String toString(){
        return "Titulo: " + this.getNome();
    }
}