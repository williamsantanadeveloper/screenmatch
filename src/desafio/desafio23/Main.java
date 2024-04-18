package desafio.desafio23;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> games = new ArrayList<String>();
        String gta = "gta";
        String fifa = "fifa";
        games.add(gta);
        games.add(fifa);
        System.out.println(games);

        for (String item : games) {
            System.out.println(item);
        }
    }
}
