package dev.crevan.creational.builder;

public class Director {
    WebSiteBuilder builder;

    public void setBuilder(final WebSiteBuilder builder) {
        this.builder = builder;
    }

    WebSite buildSite() {
        builder.createWebSite();
        builder.buildName();
        builder.buildCms();
        builder.buildPrice();
        return builder.getWebSite();
    }
}
