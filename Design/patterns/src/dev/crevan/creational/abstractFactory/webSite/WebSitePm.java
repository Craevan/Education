package dev.crevan.creational.abstractFactory.webSite;

import dev.crevan.creational.abstractFactory.Manager;

public class WebSitePm implements Manager {
    @Override
    public void manageProject() {
        System.out.println("Web Site PM manages web site project...");
    }
}
