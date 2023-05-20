/*2 way  */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class P14_Task04_ProducerAndConsumer 
{
    public static void main(String[] args) {
        Queue<Integer> buffer = new LinkedList<>();
        int maxSize = 10;
        Thread producer = new Thread(new Producer(buffer, maxSize, "PRODUCER"));//can also be written as this
        Thread consumer = new Consumer(buffer, maxSize, "CONSUMER");
        producer.start();
        consumer.start();
    }
}

class Producer extends Thread 
{
    private Queue<Integer> queue;
    private int maxSize;
    public Producer(Queue<Integer> queue, int maxSize, String name) 
    {
        super(name);
        this.queue = queue;
        this.maxSize = maxSize;
    }
    @Override
    public void run() //if synchronized void run the whole program of that block will be synchronized
    {
        while (true) 
        {
            synchronized (queue) //if (this) then for object
            {
                while (queue.size() == maxSize) 
                {
                    try 
                    {
                        System.out.println("Queue is full, " + "Producer thread waiting for "
                                + "consumer to take something from queue");
                        queue.wait();
                    } 
                    catch (Exception ex) 
                    {
                        ex.printStackTrace();
                    }
                }
                Random random = new Random();
                int i = random.nextInt();
                System.out.println("Producing value : " + i);
                queue.add(i);
                queue.notifyAll();
            }
        }
    }
}

class Consumer extends Thread {
    private Queue<Integer> queue;
    private int maxSize;
    public Consumer(Queue<Integer> queue, int maxSize, String name) 
    {
        super(name);
        this.queue = queue;
        this.maxSize = maxSize;
    }
    @Override
    public void run() 
    {
        while (true) 
        {
            synchronized (queue) 
            {
                while (queue.isEmpty()) 
                {
                    System.out.println("Queue is empty," + "Consumer thread is waiting"
                            + " for producer thread to put something in queue");
                    try 
                    {
                        queue.wait();
                    } 
                    catch (Exception ex) 
                    {
                        ex.printStackTrace();
                    }
                }
                System.out.println("Consuming value : " + queue.remove());
                queue.notifyAll();
            }
        }
    }
}