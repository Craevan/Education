package dev.crevan.corona;

public interface ProxyConfigurator {

    Object replaceWithProxyIfNeeded(Object t, Class implClass);
}
