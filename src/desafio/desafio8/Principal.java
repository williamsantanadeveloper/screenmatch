package desafio.desafio8;

public class Principal {
    public static void main(String[] args) {
        Produto computador = new Produto();
        computador.setNome("Computador");
        computador.setPreco(7000);
        System.out.println(computador.getNome() + " custa " + computador.getPreco());
        computador.aplicarDesconto(0.05);
    }
}
