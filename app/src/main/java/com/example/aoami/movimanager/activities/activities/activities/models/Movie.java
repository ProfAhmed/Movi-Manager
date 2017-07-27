package com.example.aoami.movimanager.activities.activities.activities.models;

import java.io.Serializable;

import static android.R.attr.id;

/**
 * Created by aoami on 3/20/2017.
 */

public class Movie implements Serializable{
    String id;
    String title;
    String overview;
    String posterpath;
    String backdropPath;
    float voteAvarage;
    float voteCount;

    public Movie(String id, String title, String overview, float voteAvarage, float voteCount, String posterpath
            , String backdropPath) {
        this.id = id;
        this.title = title;
        this.overview = overview;
        this.posterpath = posterpath;
        this.backdropPath = backdropPath;
        this.voteAvarage = voteAvarage;
        this.voteCount = voteCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getPosterpath() {
        return String.format("https://image.tmdb.org/t/p/w780%s", posterpath);
    }

    public void setPosterpath(String posterpath) {
        this.posterpath = posterpath;
    }

    public String getBackdropPath() {
        return String.format("https://image.tmdb.org/t/p/w780%s", backdropPath);
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public float getVoteAvarage() {
        return voteAvarage;
    }

    public void setVoteAvarage(float voteAvarage) {
        this.voteAvarage = voteAvarage;
    }

    public float getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(float voteCount) {
        this.voteCount = voteCount;
    }
}
