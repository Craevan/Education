package dev.crevan.corona;

@Deprecated
@Singleton
public class RecommenderImpl implements Recommender {

    @InjectProperty
    private String alcohol;

    @Override
    public void recommend() {
        System.out.println("To protect from covid-19 drink " + alcohol);
    }
}
