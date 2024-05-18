package desafio.desafio41;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import desafio.desafio40.Titulo;

public class Main {
    public static void main(String[] args) {
        Titulo title = new Titulo("teste", "lorem ipsum");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(title);
        System.out.println(json);
    }
}
