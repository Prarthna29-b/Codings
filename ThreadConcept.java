package org.example.interview;

public class ThreadConcept extends Thread {
    ThreadConcept(String name) {
        super(name);
    }
    @Override
    public void run() {

//            try {
//                Thread.sleep(10000);// sleep for 100 milliseconds
//            } catch (InterruptedException e) {
//                System.out.println("heello");
//                throw new RuntimeException(e);
//            }
        for (int i = 0; ; i++) {
            System.out.println( currentThread().getName()+ "Thread is running");
//            Thread.yield();// yield the current thread, allowing other threads to run
//            System.out.println(Thread.currentThread().getName() + " is running");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadConcept thread = new ThreadConcept("MyThread");
        ThreadConcept thread2 = new ThreadConcept("MyThread2");
//        thread.setPriority(2);// setting priority of the thread
        //MIN_PRIORITY = 1, NORM_PRIORITY = 5, MAX_PRIORITY = 10
//        thread.setPriority(MAX_PRIORITY);
         System.out.println("Thread priority: " + thread.getPriority());
         //By default, the priority of a thread is NORM_PRIORITY (5)
        System.out.println(thread.getName());
//        thread2.start();
        thread.setDaemon(true);// setting the thread as daemon thread
        //Daemon threads are low priority threads that run in the background to perform tasks such as garbage collection
        //When all user threads finish, the JVM exits, even if daemon threads are still running.
        //Daemon threads are terminated when the JVM exits, regardless of whether they have completed their tasks or not.
        //User threads are high priority threads that perform the main tasks of the application.
        //JVM will not exit until all user threads have completed their execution, even if daemon threads are still running.
        //thread2 is a user thread, while thread is a daemon thread
        thread.start();//if i use start() then it will create a new thread and run the run() method in that thread
//        thread.interrupt(); //interrupting the thread, which will throw InterruptedException if the thread is sleeping
//        thread.run(); //if i use run() then it will not create a new thread, it will run in the main thread
        //**.join() throws InterruptedException, which is why we need to handle it
//        thread.join();//if i don't use join() then main thread will finish before the child thread
        System.out.println("Thread has been started");
        System.out.println(Thread.currentThread().getName());
    }

}
