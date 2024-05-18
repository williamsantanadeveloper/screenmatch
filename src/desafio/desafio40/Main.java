package desafio.desafio40;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Titulo title = new Titulo("teste", "lorem ipsum");
        Gson gson = new Gson();
        String json = gson.toJson(title);
        System.out.println(json);
    }
}
