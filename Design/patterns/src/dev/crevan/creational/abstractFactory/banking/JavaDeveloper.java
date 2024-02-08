package dev.crevan.creational.abstractFactory.banking;

import dev.crevan.creational.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java dev write java code...");
    }
}
