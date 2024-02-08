package dev.crevan.structural.decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator {
    public SeniorJavaDeveloper(final Developer developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return "Make code review";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + " " + makeCodeReview();
    }
}
