package desafio.desafio26;

public class Circle implements ShapeInterface{
    double ray;

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(ray, 2);
    }
}
