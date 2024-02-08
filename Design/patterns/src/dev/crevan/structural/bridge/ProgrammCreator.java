package dev.crevan.structural.bridge;

public class ProgrammCreator {
    public static void main(String[] args) {
        Program[] programs = {
                new BankSystem(new CppDeveloper()),
                new StockExchange(new JavaDeveloper())
        };

        for (Program program: programs) {
            program.developProgram();
        }
    }
}
