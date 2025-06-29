package org.example.interview;

public class MyThread extends Thread {
    private final SynchroClass synchroClass;

    public MyThread(SynchroClass synchroClass) {
        this.synchroClass = synchroClass;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchroClass.increment();
        }
    }
}
