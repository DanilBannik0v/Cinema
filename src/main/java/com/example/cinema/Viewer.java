package com.example.cinema;

import java.util.ArrayList;

public class Viewer {
    private String nickname;
    private int age;
    private int numberOfViewedCinemas;
    private ArrayList<Cinema> viewedCinemas;

    public Viewer(String nickname, int age, int numberOfViewedCinemas) {
        this.nickname = nickname;
        this.age = age;
        this.numberOfViewedCinemas = numberOfViewedCinemas;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfViewedCinemas() {
        return numberOfViewedCinemas;
    }

    public void setNumberOfViewedCinemas(int numberOfViewedCinemas) {
        this.numberOfViewedCinemas = numberOfViewedCinemas;
    }

    public ArrayList<Cinema> getViewedCinemas() {
        return viewedCinemas;
    }

    public void setViewedCinemas(ArrayList<Cinema> viewedCinemas) {
        this.viewedCinemas = viewedCinemas;
        this.numberOfViewedCinemas = viewedCinemas.size();
    }

    public void addCinema(Cinema cinema) {
        this.viewedCinemas.add(cinema);
        this.numberOfViewedCinemas = viewedCinemas.size();
    }
}
