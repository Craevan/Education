package dev.crevan.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Developer> developers = new ArrayList<>();

    public void addDeveloper(final Developer developer) {
        developers.add(developer);
    }

    public void removeDeveloper(final Developer developer) {
        developers.remove(developer);
    }

    public void createProject() {
        System.out.println("Team creates project");
        developers.forEach(Developer::writeCode);
    }
}
