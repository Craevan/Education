package dev.crevan.creational.abstractFactory.webSite;

import dev.crevan.creational.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php dev writes PHP code...");
    }
}
