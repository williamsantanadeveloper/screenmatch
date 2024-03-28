package desafio.desafio19;

public class Maiin {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(book.calculateFinalPrice(100));
        FisicProduct fisicProduct = new FisicProduct();
        System.out.println(fisicProduct.calculateFinalPrice(100));
    }
}
