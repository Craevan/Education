package dev.crevan.corona;

@FunctionalInterface
public interface ObjectConfigurator {

    void configure(final Object t, final ApplicationContext context);
}
