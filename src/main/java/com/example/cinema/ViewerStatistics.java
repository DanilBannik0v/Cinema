package com.example.cinema;

import java.util.ArrayList;
import java.util.List;

public class ViewerStatistics {
    public static double averageAge(List<Viewer> viewers) {
        ArrayList<Integer> ageList = new ArrayList<>();
        viewers.forEach(viewer -> ageList.add(viewer.getAge()));

        return ageList.stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);
    }
}
