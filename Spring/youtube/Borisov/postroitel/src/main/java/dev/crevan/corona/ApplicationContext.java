package dev.crevan.corona;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ApplicationContext {

    private final Map<Class, Object> cache = new ConcurrentHashMap<>();

    @Getter
    private final Config config;

    @Setter
    private ObjectFactory factory;

    public ApplicationContext(final Config config) {
        this.config = config;
    }

    public <T> T getObject(final Class<T> type) {
        if (cache.containsKey(type)) {
            return (T) cache.get(type);
        }

        Class<? extends T> implClass = type;
        if (type.isInterface()) {
            implClass = config.getImplClass(type);
        }

        T t = factory.createObject(implClass);
        if (implClass.isAnnotationPresent(Singleton.class)) {
            cache.put(type, t);
        }
        return t;
    }
}
