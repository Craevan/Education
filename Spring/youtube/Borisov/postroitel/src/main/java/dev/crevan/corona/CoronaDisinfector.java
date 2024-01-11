package dev.crevan.corona;

@Deprecated
public class CoronaDisinfector {

    @InjectByType
    private Announcer announcer;

    @InjectByType
    private Policeman policeman;

    public void start(final Room room) {
        // сообщить всем о начале дезинфекции
        announcer.announce("Начинаем дезинфекцию, все вон!");
        // разогнать всех в комнате
        policeman.makePeopleLeaveRoom();
        // дезинфицируем комнату
        disinfect(room);
        // сообщить всем, что можно вернуться в комнату
        announcer.announce("Можно вернуться в комнату");
    }

    private void disinfect(final Room room) {
        System.out.println("зачитывается молитва 'корона изыди!' - молитва прочитана, вирус низвергнут в ад");
    }
}
