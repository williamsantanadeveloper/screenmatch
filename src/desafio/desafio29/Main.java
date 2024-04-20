package desafio.desafio29;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        LinkedList<String> lista2 = new LinkedList<>();
        lista.add("Mengo");
        lista.add("Vasco");
        lista2.add("Flu");
        lista2.add("Botafogo");
        System.out.println(lista);
        System.out.println(lista2);

        List<String> listaPorlimorfica;
        listaPorlimorfica = new LinkedList<>();
        listaPorlimorfica.add("City");
        listaPorlimorfica.add("Chelsea");
        System.out.println(listaPorlimorfica);
        listaPorlimorfica = new ArrayList<>();
        listaPorlimorfica.add("Real");
        listaPorlimorfica.add("Barcelona");
        System.out.println(listaPorlimorfica);
    }
}
