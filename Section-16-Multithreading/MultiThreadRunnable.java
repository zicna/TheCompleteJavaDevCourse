public class MultiThreadRunnable implements Runnable{
    private int threadNumber;

    public MultiThreadRunnable(int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " from Thread " + threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        
    }
}