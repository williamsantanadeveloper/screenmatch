package desafio.desafio3;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.title = "X1";
        musica.artist = "MC Cabelinho";
        musica.releaseYear = 2023;

        musica.showTechnicalSheet();
        musica.getRateTheMusic(10);
        musica.getRateTheMusic(7);
        musica.getRateTheMusic(8);
        System.out.println(musica.assessmentSum);
        System.out.println(musica.totalRatings);
        System.out.println(musica.getGradeAvarage());

    }
}
