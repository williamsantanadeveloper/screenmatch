package desafio.desafio22;

public class PerecibleProduct extends Product {
    private String validateDate;
    public PerecibleProduct(String name, double price, int quantity, String validateDate) {
        super(name, price, quantity);
        this.validateDate = validateDate;
    }
}
