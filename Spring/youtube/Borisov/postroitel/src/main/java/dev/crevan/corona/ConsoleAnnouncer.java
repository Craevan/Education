package dev.crevan.corona;

public class ConsoleAnnouncer implements Announcer {

    private Recommender recommendator = ObjectFactory.getInstance().createObject(Recommender.class);

    @Override
    public void announce(final String message) {
        System.out.println(message);
        recommendator.recommend();
    }
}
