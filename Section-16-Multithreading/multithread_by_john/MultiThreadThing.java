package multithread_by_john;
public class MultiThreadThing extends Thread {

    private int threadNumber;

    public MultiThreadThing(int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 1; i <= 5; i++) {
            System.out.println("From thread number " + threadNumber + ": " + i);
            if(threadNumber == 3){
                throw new RuntimeException();
            }
            try {
                Thread.sleep(1000);
                
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}