package dev.crevan.corona;

import java.util.Map;

public class Application {

    public static ApplicationContext run(final String packageToScan, final Map<Class, Class> ifc2ImplClass) {
        JavaConfig config = new JavaConfig(packageToScan, ifc2ImplClass);
        ApplicationContext context = new ApplicationContext(config);
        ObjectFactory factory = new ObjectFactory(context);
        //todo init all Singletons which are not lazy
        context.setFactory(factory);
        return context;
    }
}
