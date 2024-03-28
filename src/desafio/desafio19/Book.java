package desafio.desafio19;

public class Book implements Calculable{
    private String author;


    @Override
    public double calculateFinalPrice(double price) {
        return price * 0.9;
    }
}
