package dev.crevan.creational.builder;

public class EnterpriseSiteBuilder extends WebSiteBuilder {
    @Override
    void buildName() {
        webSite.setName("Enterprise web site");
    }

    @Override
    void buildCms() {
        webSite.setCms(Cms.BITRIX);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(11500);
    }
}
