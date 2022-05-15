package multithread_by_john;
public class Multithreading {
    public static void main(String[] args) {

        System.out.println("******* From Class That Extends Thread Class ************");
        // for (int i = 0; i < 5; i++) {
        //     MultiThreadThing myThingOne = new MultiThreadThing(i);
        //     //! if we would do myThing.run() it would start a program but not in separated threads
        //     myThingOne.start();
        // }
        System.out.println("******************************************************");
        
        System.out.println("******* From Class That implements Runnable Class ************");
        for (int i = 0; i < 5; i++) {
            MultiThreadRunnable myThingTwo = new MultiThreadRunnable(i);
            // ! difference when implements Runnable interface
            Thread myThread = new Thread(myThingTwo);
            myThread.start();
        }
        System.out.println("******************************************************");
        
    }
}

// * important methods of Thread class 
// 1. .join();
// 2. .isAlive();