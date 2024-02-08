package dev.crevan.creational.abstractFactory;

public interface ProjectTeamFactory {

    Developer getDeveloper();

    Tester getTester();

    Manager getManager();

}
