package desafio.desafio13;

public class ContaBancaria {
    protected double saldo;
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito de " + valor + " realizado. Saldo atual: " + saldo);
    }
    public void sacar(double valor) {
        if (saldo > valor){
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado!");
        } else {
            System.out.println("Não é possível fazer essa transação");
        }
        System.out.println("Saldo atual: " + saldo);
    }
    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
}
