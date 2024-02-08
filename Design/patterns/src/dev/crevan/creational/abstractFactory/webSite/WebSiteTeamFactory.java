package dev.crevan.creational.abstractFactory.webSite;

import dev.crevan.creational.abstractFactory.Developer;
import dev.crevan.creational.abstractFactory.Manager;
import dev.crevan.creational.abstractFactory.ProjectTeamFactory;
import dev.crevan.creational.abstractFactory.Tester;

public class WebSiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public Manager getManager() {
        return new WebSitePm();
    }
}
