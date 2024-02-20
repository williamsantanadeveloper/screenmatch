package desafio.desafio3;

public class Musica {
    String title;
    String artist;
    int releaseYear;
    double assessmentSum;
    int totalRatings;

    void showTechnicalSheet() {
        System.out.println("Título da música: " + title);
        System.out.println("Artista: " + artist);
        System.out.println("Ano de lançamento: " + releaseYear);
    }

    void getRateTheMusic(double note) {
        assessmentSum += note;
        totalRatings++;
    }

    double getGradeAvarage() {
        return assessmentSum / totalRatings;
    }
}
