package desafio.desafio20;

public class Product implements Salable{
    private String name;
    @Override
    public double calculateTotalPrice(double price, int quantity){
        if (quantity >= 4) {
            return (price * 0.20) * quantity;
        } else {
            return price * quantity;
        }
    }
}
