import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {

        Queue demo = new Queue();
       Queue queue= demo.cerateQueue();
       demo.printQueue();
    }

    private Queue cerateQueue(){
        PriorityQueue<int> queueOfInteger = new PriorityQueue<int>();
        queueOfInteger.add(100);
        queueOfInteger.add(200);
        queueOfInteger.add(300);
        queueOfInteger.add(400);
        queueOfInteger.add(500);

        return queueOfInteger;
    }

    private void printQueue(Queue queue){
        System.out.println("retereaving the head :"+queue.peek());
        System.out.println("reteave and remove"+queue.poll());

    }
}

