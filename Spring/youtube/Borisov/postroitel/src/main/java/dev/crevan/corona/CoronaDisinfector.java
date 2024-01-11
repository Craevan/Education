package dev.crevan.corona;

public class CoronaDisinfector {

    private Announcer announcer = ObjectFactory.getInstance().createObject(Announcer.class);
    private Policeman policeman = ObjectFactory.getInstance().createObject(Policeman.class);

    public void start(Room room) {
        // сообщить всем о начале дезинфекции
        announcer.announce("Начинаем дезинфекцию, все вон!");
        // разогнать всех в комнате
        policeman.makePeopleLeaveRoom();
        // дезинфицируем комнату
        disinfect(room);
        // сообщить всем, что можно вернуться в комнату
        announcer.announce("Можно вернуться в комнату");
    }

    private void disinfect(Room room) {
        System.out.println("зачитывается молитва 'корона изыди!' - молитва прочитана, вирус низвергнут в ад");
    }
}
