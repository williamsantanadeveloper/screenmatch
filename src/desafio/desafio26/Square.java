package desafio.desafio26;

public class Square implements ShapeInterface{
    double side;
    @Override
    public double calculateArea() {
        return side * side;
    }
}
