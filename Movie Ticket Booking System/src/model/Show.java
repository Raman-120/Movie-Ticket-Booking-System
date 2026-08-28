package model;

public class Show {

    private String showName;
    private String showGenre;
    private int duration;

    Show(String movieName, String movieGenre, int duration){
        this.showName = movieName;
        this.showGenre = movieGenre;
        this.duration = duration;
    }

    public String getShowName(){
        return this.showName;
    }

    public String getShowGenre(){
        return this.showGenre;
    }

    public int getDuration(){
        return this.duration;
    }

}
