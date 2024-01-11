package dev.crevan.corona;

public class ConsoleAnnouncer implements Announcer {

    @InjectByType
    private Recommender recommendator;

    @Override
    public void announce(final String message) {
        System.out.println(message);
        recommendator.recommend();
    }
}
