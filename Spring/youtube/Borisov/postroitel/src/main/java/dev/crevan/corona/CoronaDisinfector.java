package dev.crevan.corona;

public class CoronaDisinfector {

    public void start(Room room) {
        // todo сообщить всем о начале дезинфекции
        // todo разогнать всех в комнате
        disinfect(room);
        // todo сообщить всем, что можно вернуться в комнату
    }

    private void disinfect(Room room) {
        System.out.println("зачитывается молитва 'корона изыди!' - молитва прочитана, вирус низвергнут в ад");
    }
}
