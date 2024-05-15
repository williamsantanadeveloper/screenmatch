package desafio.desafio36;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Divisão entre dois números ");
        System.out.println("Informe o primeiro número: ");
        double firstNumber = sc.nextDouble();
        System.out.println("Informe o segundo número: ");
        double secondNumber = sc.nextDouble();

        try {
            double operation = firstNumber / secondNumber;
            System.out.println(operation);
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
