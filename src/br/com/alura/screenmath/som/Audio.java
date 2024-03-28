package br.com.alura.screenmath.som;

public class Audio {
    private String title;
    private int duration;
    private int totalReproductions;
    private int likes;
    private int classification;

    public void like(){
        this.likes++;
    }
    public void reproduce() {
        this.totalReproductions++;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public int getTotalReproductions() {
        return totalReproductions;
    }

    public int getLikes() {
        return likes;
    }

    public int getClassification() {
        return classification;
    }
}
