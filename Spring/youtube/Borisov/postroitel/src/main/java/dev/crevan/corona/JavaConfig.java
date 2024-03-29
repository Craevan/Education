package dev.crevan.corona;

import lombok.Getter;
import org.reflections.Reflections;

import java.util.Map;
import java.util.Set;

public class JavaConfig implements Config {

    private final Map<Class, Class> ifc2ImplClass;

    @Getter
    private final Reflections scanner;

    public JavaConfig(final String packageToScan, final Map<Class, Class> ifc2ImplClass) {
        this.scanner = new Reflections(packageToScan);
        this.ifc2ImplClass = ifc2ImplClass;
    }

    @Override
    public <T> Class<? extends T> getImplClass(final Class<T> ifc) {
        return ifc2ImplClass.computeIfAbsent(ifc, aClass -> {
            Set<Class<? extends T>> classes = scanner.getSubTypesOf(ifc);
            if (classes.size() != 1) {
                throw new RuntimeException(ifc + " has 0 or more than 1 implementations. Please update your config");
            }
            return classes.iterator().next();
        });
    }
}
