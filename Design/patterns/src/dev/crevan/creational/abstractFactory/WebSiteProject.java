package dev.crevan.creational.abstractFactory;

import dev.crevan.creational.abstractFactory.webSite.WebSiteTeamFactory;

public class WebSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory webSiteTeamFactory = new WebSiteTeamFactory();
        Developer developer = webSiteTeamFactory.getDeveloper();
        Tester tester = webSiteTeamFactory.getTester();
        Manager manager = webSiteTeamFactory.getManager();

        System.out.println("Creating project...");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
