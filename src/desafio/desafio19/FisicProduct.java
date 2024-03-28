package desafio.desafio19;

public class FisicProduct implements Calculable{
    @Override
    public double calculateFinalPrice(double price) {
        return price * 1.05;
    }
}
