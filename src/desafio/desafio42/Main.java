package desafio.desafio42;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("qpk3224", "cinza");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(veiculo);
        try {
            FileWriter file = new FileWriter("carro.txt");
            file.write(json);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(json);
    }
}
