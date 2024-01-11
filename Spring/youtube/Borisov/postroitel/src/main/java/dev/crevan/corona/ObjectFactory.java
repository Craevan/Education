package dev.crevan.corona;

import lombok.SneakyThrows;

public class ObjectFactory {

    private static ObjectFactory instance;

    private Config config = new JavaConfig("dev.crevan.corona");

    private ObjectFactory() {
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
