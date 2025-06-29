package org.example.interview;

public class Test {
    public static void main(String []args)
    {
        SynchroClass syncroClass = new SynchroClass();
        MyThread thread1 = new MyThread(syncroClass);
        MyThread thread2 = new MyThread(syncroClass);
        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Final count: " + syncroClass.getCount());
    }
}
