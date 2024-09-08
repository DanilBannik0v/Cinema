package com.example.cinema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

import static com.example.cinema.ViewerStatistics.averageAge;

@SpringBootApplication
public class CinemaApplicationRun {

    public static void main(String[] args) {
        SpringApplication.run(CinemaApplicationRun.class, args);

        Viewer viewer1 = new Viewer("Cloud", 25, 2);
        Viewer viewer2 = new Viewer("Jane", 19, 78);
        Viewer viewer3 = new Viewer("Jacob", 53, 509);
        Viewer viewer4 = new Viewer("Emily", 31, 16);
        Viewer viewer5 = new Viewer("Max", 78, 0);

        ArrayList<Viewer> viewers = new ArrayList<>();
        viewers.add(viewer1);
        viewers.add(viewer2);
        viewers.add(viewer3);
        viewers.add(viewer4);
        viewers.add(viewer5);

        System.out.println(averageAge(viewers));
    }
}
