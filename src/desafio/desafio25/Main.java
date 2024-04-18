package desafio.desafio25;

import java.util.ArrayList;

public class Main {
    public static double calculateMedia(ArrayList<Double> prices) {
        int soma = 0;
        for (double price : prices) {
            soma += price;
        }
        return soma / prices.size();
    }

    public static void main(String[] args) {
        ArrayList<Double> productsPrice = new ArrayList<>();
        productsPrice.add(19.2);
        productsPrice.add(15.4);
        productsPrice.add(10.3);
        productsPrice.add(5.5);
        double media = calculateMedia(productsPrice);
        System.out.printf("Média: %.2f da loja", media);
    }
}
