package dev.crevan.creational.builder;

public class BuildWebSiteRunner {

    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new EnterpriseSiteBuilder());

        WebSite site = director.buildSite();
        System.out.println(site);
    }

}
