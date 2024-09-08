package com.example.cinema;

public class Viewer {
    private String nickname;
    private int age;
    private int numberOfViewedMovies;

    public Viewer(String nickname, int age, int numberOfViewedMovies) {
        this.nickname = nickname;
        this.age = age;
        this.numberOfViewedMovies = numberOfViewedMovies;
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

    public int getNumberOfViewedMovies() {
        return numberOfViewedMovies;
    }

    public void setNumberOfViewedMovies(int numberOfViewedMovies) {
        this.numberOfViewedMovies = numberOfViewedMovies;
    }
}
