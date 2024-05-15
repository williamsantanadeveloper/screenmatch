package desafio.desafio37;

import java.util.Scanner;

public class Main {
    private static void validarSenha(String senha){
        if(senha.length() < 8) {
            throw new SenhaInvalidaException("A senha tem que ter pelo menos 8 caracteres");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe sua senha: ");
        String senha = sc.nextLine();
        try {
            validarSenha(senha);
            System.out.println(senha);
        } catch (SenhaInvalidaException e){
            System.out.println(e.getMessage());
        }
    }
}
