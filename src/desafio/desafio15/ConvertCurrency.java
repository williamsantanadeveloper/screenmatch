package desafio.desafio15;

public class ConvertCurrency implements ConvertFinancial{
    @Override
    public void convertDolarToReal(double dolarValue) {
        double dollarExchangeRate = 4.98;
        double valueReal = Math.round(dollarExchangeRate * dolarValue);
        System.out.println("O valor em reais é: R$" + valueReal);
    }
}
