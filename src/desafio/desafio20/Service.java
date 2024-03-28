package desafio.desafio20;

public class Service implements Salable{
    private String description;

    @Override
    public double calculateTotalPrice(double price, int quantity) {
        if (quantity >= 4) {
            price -= price * 0.20;
            return price;
        }
        return price * quantity;
    }
}
