package desafio.desafio11;

public class Principal {
    public static void main(String[] args) {
        ModeloCarro carro1 = new ModeloCarro();
        carro1.setModelo("Sedan");
        carro1.definindoPrecos(1000, 2000, 3000);
        carro1.informacoesCarro();
    }
}
