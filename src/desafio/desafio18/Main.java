package desafio.desafio18;

public class Main {
    public static void main(String[] args) {
        StandardTemperatureConverter celsius = new StandardTemperatureConverter();
        StandardTemperatureConverter fahrenheit = new StandardTemperatureConverter();
        celsius.convertTempCel(80);
        fahrenheit.convertTempFa(80);
    }
}
