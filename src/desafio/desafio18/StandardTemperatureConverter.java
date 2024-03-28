package desafio.desafio18;

public class StandardTemperatureConverter implements TemperatureConverter{
    @Override
    public void convertTempFa(double tempCel) {
        double tempFa = Math.round((tempCel * 9 / 5) + 32);
        System.out.println("Temperatura em Fahrenheit: " + tempFa + "°F");
    }

    @Override
    public void convertTempCel(double tempFa) {
        double tempCel = Math.round((tempFa - 32) / 1.8);
        System.out.println("Temperatura em Celsius: " + tempCel + "°C");
    }
}
