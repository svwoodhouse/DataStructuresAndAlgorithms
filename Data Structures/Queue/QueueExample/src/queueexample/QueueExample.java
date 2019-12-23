package queueexample;

public class QueueExample 
{
    public static void main(String[] args) 
    {
        Queue q = new Queue();
        q.enqueue(42);
        q.enqueue(-3);
        q.enqueue(17);
        
        System.out.println("Creating a new Queue.....");
        q.printQueue();
        System.out.println("Dequeue");
        q.dequeue();
        q.printQueue();
        System.out.println("Peek");
        System.out.println(q.peek());
        q.printQueue();
        System.out.println("Dequeue");
        q.dequeue();
        q.printQueue();
    }  
}
