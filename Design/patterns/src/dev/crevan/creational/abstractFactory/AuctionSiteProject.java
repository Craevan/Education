package dev.crevan.creational.abstractFactory;

import dev.crevan.creational.abstractFactory.banking.BankingTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory bankingTeamFactory = new BankingTeamFactory();
        Developer developer = bankingTeamFactory.getDeveloper();
        Tester tester = bankingTeamFactory.getTester();
        Manager pm = bankingTeamFactory.getManager();

        System.out.println("Creating bank system...");
        developer.writeCode();
        tester.testCode();
        pm.manageProject();
    }
}
