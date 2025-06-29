package org.example.interview;

public class SynchroClass {
    private int count=0;
    public  synchronized void increment() {
        // Synchronized method to ensure that only one thread can increment the count at a time
//        synchronized (this) { //Synchronization block to ensure thread safety
            //this is used inside synchronized block to refer to the current instance of SynchroClass
            //This ensures that only one thread can execute this block at a time
            count++;
//        }
    }

    public int getCount() {
        return count;
    }
}
