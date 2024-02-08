package dev.crevan.structural.decorator;

public class DeveloperDecorator implements Developer {
    Developer developer;

    public DeveloperDecorator(final Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
