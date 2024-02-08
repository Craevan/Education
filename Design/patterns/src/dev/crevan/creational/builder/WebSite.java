package dev.crevan.creational.builder;

public class WebSite {

    private String name;
    private Cms cms;
    private int price;

    public void setName(final String name) {
        this.name = name;
    }

    public void setCms(final Cms cms) {
        this.cms = cms;
    }

    public void setPrice(final int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "WebSite{" +
                "name='" + name + '\'' +
                ", cms='" + cms + '\'' +
                ", price=" + price +
                '}';
    }
}
