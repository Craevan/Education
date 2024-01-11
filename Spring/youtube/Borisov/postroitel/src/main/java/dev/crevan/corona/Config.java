package dev.crevan.corona;

public interface Config {

    <T> Class<? extends T> getImplClass(Class<T> ifc);
}
