package desafio.desafio13;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(1000);
        conta.consultarSaldo();

        ContaCorrente corrente = new ContaCorrente();
        corrente.depositar(200);
        corrente.cobrarTarifaMensal();
        corrente.sacar(150);
        corrente.consultarSaldo();
    }
}
