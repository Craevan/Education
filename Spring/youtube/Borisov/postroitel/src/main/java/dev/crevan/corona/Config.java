package dev.crevan.corona;

import org.reflections.Reflections;

public interface Config {

    <T> Class<? extends T> getImplClass(final Class<T> ifc);

    Reflections getScanner();
}
