package br.com.alura.screenmath.som;

public class Musics extends Audio  {
    private String album;
    private String singer;
    private String gender;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int getClassification() {
        if (this.getTotalReproductions() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }
}
