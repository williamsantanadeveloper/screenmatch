package desafio.desafio11;

public class Carro {
    private String modelo;
    private double preco1;
    private double preco2;
    private double preco3;
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definindoPrecos(double preco1,double preco2, double preco3) {
        this.preco1 = preco1;
        this.preco2 = preco2;
        this.preco3 = preco3;
    }

    public void informacoesCarro() {
        System.out.println("Modelo: " + getModelo());
        System.out.println("Preco 1: " + preco1);
        System.out.println("Preco 2: " + preco2);
        System.out.println("Preco 3: " + preco3);
        System.out.println("Menor preco: " + calcularMenorPreco());
        System.out.println("Maior preco: " + calcularMaiorPreco());
    }

    private double calcularMenorPreco() {
        double menorPreco = preco1;
        if (preco2 < menorPreco) {
            menorPreco = preco2;
        }
        if (preco3 < menorPreco) {
            menorPreco = preco3;
        }
        return menorPreco;
    }
    private double calcularMaiorPreco() {
        double maiorPreco = preco1;

        if (preco2 > maiorPreco) {
            maiorPreco = preco2;
        }

        if (preco3 > maiorPreco) {
            maiorPreco = preco3;
        }

        return maiorPreco;
    }
}
