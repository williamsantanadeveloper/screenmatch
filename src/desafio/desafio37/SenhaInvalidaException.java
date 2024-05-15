package desafio.desafio37;

public class SenhaInvalidaException extends RuntimeException{
    private String mensagem;

    public SenhaInvalidaException(String mensagem) {
        super(mensagem);
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
