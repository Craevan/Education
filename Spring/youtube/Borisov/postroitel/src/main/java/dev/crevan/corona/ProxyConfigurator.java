package dev.crevan.corona;

@FunctionalInterface
public interface ProxyConfigurator {

    Object replaceWithProxyIfNeeded(final Object t, final Class implClass);
}
