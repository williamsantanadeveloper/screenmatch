package desafio.desafio6;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "William";
        conta1.setSaldo(1000);
        conta1.setNumeroConta(123);
        System.out.println(conta1.getNumeroConta());
    }
}
