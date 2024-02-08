package dev.crevan.creational.abstractFactory.webSite;

import dev.crevan.creational.abstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("ManualTester tests web site...");
    }
}
