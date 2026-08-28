package model;

import java.io.Serializable;

public class Movie implements Serializable {

    private String movieName;
    private String movieGenre;
    private int duration;

    Movie(String movieName, String movieGenre, int duration){
        this.movieName = movieName;
        this.movieGenre = movieGenre;
        this.duration = duration;
    }

    public String getMovieName(){
        return this.movieName;
    }

    public String getMovieGenre(){
        return this.movieGenre;
    }

    public int getDuration(){
        return this.duration;
    }

    @Override
    public String toString(){
        return this.movieName + " : " + " " + this.movieGenre + " " + this.duration + "\n";
    }

}
