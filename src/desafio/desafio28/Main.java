package desafio.desafio28;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Titulo f1 = new Titulo("dsa");
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(new Titulo("a"));
        lista.add(f1);
        Collections.sort(lista);
        System.out.println(lista);
    }
}
