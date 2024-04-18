package desafio.desafio26;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ShapeInterface> shapes = new ArrayList<>();
        Circle circle = new Circle();
        circle.ray = 5;
        System.out.println(circle.calculateArea());
        Square square = new Square();
        square.side = 5;
        System.out.println(square.calculateArea());

        shapes.add(square);
        shapes.add(circle);

        for (ShapeInterface shape : shapes) {
            System.out.printf("Area: %.2f \n", shape.calculateArea());
        }
    }
}
