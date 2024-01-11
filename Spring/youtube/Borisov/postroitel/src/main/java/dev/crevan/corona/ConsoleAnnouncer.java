package dev.crevan.corona;

import javax.annotation.PostConstruct;

public class ConsoleAnnouncer implements Announcer {

    @InjectByType
    private Recommender recommendator;

    @PostConstruct
    public void init() {
        System.out.println(recommendator.getClass());
    }

    @Override
    public void announce(final String message) {
        System.out.println(message);
        recommendator.recommend();
    }
}
