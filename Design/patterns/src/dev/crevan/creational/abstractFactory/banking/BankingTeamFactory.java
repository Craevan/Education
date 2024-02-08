package dev.crevan.creational.abstractFactory.banking;

import dev.crevan.creational.abstractFactory.Developer;
import dev.crevan.creational.abstractFactory.Manager;
import dev.crevan.creational.abstractFactory.ProjectTeamFactory;
import dev.crevan.creational.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public Manager getManager() {
        return new BankPm();
    }
}
