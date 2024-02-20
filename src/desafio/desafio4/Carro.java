package desafio.desafio4;

public class Carro {
    String model;
    int year;
    String color;

    void showTechnicalSheet() {
        System.out.println("Modelo: " + model);
        System.out.println("Ano: " + year);
        System.out.println("Cor: " + color);
    }

    int ageOfTheCar(int currentYear) {
        return year - currentYear;
    }
}
