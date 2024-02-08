package dev.crevan.structural.bridge;

public class BankSystem extends Program {
    protected BankSystem(final Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank system development in progress...");
        developer.writeCode();
    }
}
