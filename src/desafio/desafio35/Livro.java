package desafio.desafio35;

public class Livro {
    private String titulo;
    private String autor;
    private Editora editora;

    public Livro(LivroRecord livroRecord) {
        this.titulo = livroRecord.titulo();
        this.autor = livroRecord.autor();
        this.editora = livroRecord.editora();
    }
    public Livro(String titulo, String autor, Editora editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
    }

    @Override
    public String toString() {
        return titulo + "-" + autor + "-" + editora;
    }
}
