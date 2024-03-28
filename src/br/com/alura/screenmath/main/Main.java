package br.com.alura.screenmath.main;

import br.com.alura.screenmath.som.Musics;
import br.com.alura.screenmath.som.MyPreferences;
import br.com.alura.screenmath.som.Podcasts;

public class Main {
    public static void main(String[] args) {
        Musics myMusic = new Musics();
        myMusic.setTitle("Forever");
        myMusic.setSinger("Kiss");


        for (int i = 0; i < 1000; i++) {
            myMusic.reproduce();
        }
        for (int i = 0; i < 50; i++) {
            myMusic.like();
        }

        Podcasts myPodcast = new Podcasts();
        myPodcast.setTitle("BolhaDev");
        myPodcast.setHost("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            myPodcast.reproduce();
        }
        for (int i = 0; i < 1000; i++) {
            myPodcast.like();
        }

        MyPreferences preferences = new MyPreferences();
        preferences.include(myPodcast);
        preferences.include(myMusic);
    }
}
