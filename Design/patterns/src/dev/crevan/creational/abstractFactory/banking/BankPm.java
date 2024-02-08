package dev.crevan.creational.abstractFactory.banking;

import dev.crevan.creational.abstractFactory.Manager;

public class BankPm implements Manager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking projects");
    }
}
