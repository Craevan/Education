package dev.crevan.structural.decorator;

public class JavaTeamLead extends DeveloperDecorator {
    public JavaTeamLead(final Developer developer) {
        super(developer);
    }

    public String sendWeekReport() {
        return "Send week report to customer";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + " " + sendWeekReport();
    }
}
