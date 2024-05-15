package desafio.desafio38;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu usuário no Github para consultar informações: ");
        String user = sc.nextLine();
        String address = "https://api.github.com/users/" + user;
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest
                    .newBuilder()
                    .uri(URI.create(address))
                    .header("Accept", "application/vnd.github.v3+json")
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("O usuário não existe no Github!");
            }
            String json = response.body();
            System.out.println(json);

        } catch(IOException | InterruptedException e) {
            System.out.println("Opss... Houve um erro durante a consulta da api do Github.");
        } catch(ErroConsultaGitHubException e) {
            System.out.println(e.getMessage());
        }
    }
}
