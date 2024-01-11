package dev.crevan.corona;

import lombok.SneakyThrows;

import java.util.HashMap;
import java.util.Map;

public class ObjectFactory {

    private static ObjectFactory instance;

    private Config config;

    private ObjectFactory() {
        this.config = new JavaConfig("dev.crevan.corona", new HashMap<>(Map.of(Policeman.class, PolicemanImpl.class)));
    }

    public static ObjectFactory getInstance() {
        if (instance == null) {
            instance = new ObjectFactory();
        }
        return instance;
    }

    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        Class<? extends T> implClass = type;
        if (type.isInterface()) {
            implClass = config.getImplClass(type);
        }
        T t = implClass.getDeclaredConstructor().newInstance();
        //todo
        return t;
    }
}
