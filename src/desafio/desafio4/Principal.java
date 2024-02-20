package desafio.desafio4;

public class Principal {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.model = "Creta";
        carro.year = 2024;
        carro.color = "Cinza";

        carro.showTechnicalSheet();

        System.out.println("O carro tem " + carro.ageOfTheCar(2024) + "anos");

    }
}
