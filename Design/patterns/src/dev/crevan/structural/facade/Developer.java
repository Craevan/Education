package dev.crevan.structural.facade;

public class Developer {
    public void doingJobBeforeDeadLine(final BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()) {
            System.out.println("Developer is solving problem...");
        } else {
            System.out.println("Developer is reading habr...");
        }
    }
}
