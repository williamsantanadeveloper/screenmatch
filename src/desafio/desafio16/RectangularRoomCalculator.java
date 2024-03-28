package desafio.desafio16;

public class RectangularRoomCalculator implements  GeometricCalculation{
    @Override
    public void calculateArea(double height, double width) {
        double area = height * width;
        System.out.println("Area: " + area);
    }

    @Override
    public void calculatePerimeter(double height, double width) {
        double perimeter = (height + width) * 2;
        System.out.println("Perimetro: " + perimeter);
    }
}
