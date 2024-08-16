package de.claudioaltamura.java.streams;

import java.util.ArrayList;
import java.util.List;

public class Refrigerator {

    private final List<Softdrink> softdrinks = new ArrayList<>();

    public List<Softdrink> getSoftdrinks() {
        return softdrinks;
    }

    public void addSoftdrink(Softdrink softdrinks) {
        this.softdrinks.add(softdrinks);
    }

}
