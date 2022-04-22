import java.util.PriorityQueue;

public class QueueDemo{
    public static void main(String[] args) {

        PriorityQueue <Integer> q = new PriorityQueue<>();

        for (int i = 10; i > 0; i--) {
            q.add(i);
        }
        //* q (front)10, 9, 8, 7,...2,1 (Rear)
        //! PriorityQueue sorts data for us
        //* q => (front) 1,2,3,4,5,6,7,8,9,10 (rear)

        // *methods
        //* 1. Peeking -> obtaining the head of the Queue
        int head = q.peek();
        System.out.println("Head of the queue is: " + head);

        //* 2. Polling -> remove the head of the Queue
        int removedHead = q.poll();
        System.out.println("removed head is: " + removedHead);
        System.out.println("New head of the Queue is: " + q.peek());
        
        //* 3. Queue size
        int queueSize = q.size();

        System.out.println("Queue size is: " + queueSize);
        //*
        //*
        //*
    }
}