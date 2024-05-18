package desafio.desafio39;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("file.txt");
        file.write("Conteúdo a ser gravado no arquivo.");
        file.close();
    }
}
