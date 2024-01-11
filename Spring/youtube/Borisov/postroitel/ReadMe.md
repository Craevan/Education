## [Видео доклад](https://www.youtube.com/watch?v=rd6wxPzXQvo)

1. ver 0.1:
    1. Проблемы:
        1. Класс CoronaDisinfector не отвечает принципу single responsibility:
            * отвечает за дезинфекцию комнаты
            * отвечает за выбор имплементации интерфейса Announcer
            * отвечает за выбор имплементации интерфейса PoliceMan
            * должен уметь создавать соответствующие объекты
            * должен уметь настраивать соответствующие объекты
2. ver 0.2:
    1. Централизованное место для создания всех объектов
        * Если надо менять имплементацию, не надо лезть в код
        * Перед тем как фабрика отдаст объект, она его может настроить согласно нашим конвенциями
        * В будущем можно будет кэшировать синглтоны
    2. Проблемы:
        * Нарушили single responsibility и open-close principle (класс ObjectFactory никогда не будет close, в него
          постоянно будет дописываться новая функциональность)
3. ver 0.3:
    1. Устранили нарушение open-close principle.
    2. Проблемы:
        * ```
       ObjectFactory.getInstance().createObject(Announcer.class)
       context.getObject(Announcer.class)
        ```
          ***Это не IoC, это lookup!***
        * Невозможно нормально написать JUnit тесты
        *
        Сильный [coupling](https://ru.wikipedia.org/wiki/%D0%97%D0%B0%D1%86%D0%B5%D0%BF%D0%BB%D0%B5%D0%BD%D0%B8%D0%B5_(%D0%BF%D1%80%D0%BE%D0%B3%D1%80%D0%B0%D0%BC%D0%BC%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5)#:~:text=%D0%97%D0%B0%D1%86%D0%B5%D0%BF%D0%BB%D0%B5%D0%BD%D0%B8%D0%B5%2C%20%D1%81%D1%86%D0%B5%D0%BF%D0%BB%D0%B5%D0%BD%D0%B8%D0%B5%2C%20%D1%81%D0%B2%D1%8F%D0%B7%D0%B0%D0%BD%D0%BD%D0%BE%D1%81%D1%82%D1%8C%2C%20%D1%81%D0%BE%D0%BF%D1%80%D1%8F%D0%B6%D0%B5%D0%BD%D0%B8%D0%B5,%D0%B2%D0%B7%D0%B0%D0%B8%D0%BC%D0%BE%D0%B7%D0%B0%D0%B2%D0%B8%D1%81%D0%B8%D0%BC%D1%8B%20%D1%80%D0%B0%D0%B7%D0%BD%D1%8B%D0%B5%20%D0%BF%D0%BE%D0%B4%D0%BF%D1%80%D0%BE%D0%B3%D1%80%D0%B0%D0%BC%D0%BC%D1%8B%20%D0%B8%D0%BB%D0%B8%20%D0%BC%D0%BE%D0%B4%D1%83%D0%BB%D0%B8.)
            * Еще про [coupling](https://habr.com/ru/articles/568216/)
4. ver 0.4:
    1. Реализовали инверсию контроля:
        * Создали ApplicationContext.
        * ObjectFactory скрыта за ApplicationContext.
    2. Проблемы:
        * NPE в случае, например:
       ```
       public ConsoleAnnouncer() {
         System.out.println(recommendator.getClass());
       }
       ```
5. ver 0.5:
    1. Устранили NPE через реализацию концепции second face constructor (@PostConstruct)
    2. Проблемы:
        * Нет возможности изменять поведение методов. Например, нет возможности логировать и уведомлять пользователя о
          вызове методов, помеченных аннотацией @Deprecated
6. ver 0.6:
    1. Реализовали возможность логирования использования Deprecated методов путем создания нового типа конфигуратора -
       DeprecatedHandlerProxyConfigurator и использования Proxy Design Pattern
    2. Проблемы:
        * Ошибка, если Deprecated у класса без интерфейсов.
