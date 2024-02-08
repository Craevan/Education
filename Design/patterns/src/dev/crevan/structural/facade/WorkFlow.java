package dev.crevan.structural.facade;

public class WorkFlow {
    Developer developer = new Developer();
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();

    public void solveProblem() {
        job.doJob();
        bugTracker.startSprint();
        developer.doingJobBeforeDeadLine(bugTracker);
    }
}
