import java.util.*;
public class Example
{
    public static void main(String[] args)throws InterruptedException
    {
        final PC pc=new PC();
        Thread t1=new Thread(new Runnable(){
        public void run()
        {
            try
            {
            pc.produce();
            }
            catch(InterruptedException e)
            {
            e.printStackTrace();
            }
        }
        });
        Thread t2=new Thread(new Runnable(){
        public void run()
        {
            try
            {
            pc.consume();
            }
            catch(InterruptedException e)
            {
            e.printStackTrace();
            }
        }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }

public static class PC 
{
    LinkedList<Integer> list=new LinkedList<>();
    int capacity=2;
    public  void produce()throws InterruptedException
    {
    int val=0;
        while(true)
        {
            synchronized (this)
            {
            while(list.size()==capacity)
            wait();
            System.out.println("producer produced"+val);
            list.add(val++);
            notify();
            Thread.sleep(1000);
            }
        }
    }
    public  void consume()throws InterruptedException
    {
        while(true)
        {
            synchronized(this)
            {
            while(list.size()==0)
            wait();
            int val=list.removeFirst();
            System.out.println("consumer consumed"+val);
            notify();
            Thread.sleep(1000);
            }
        }
    }
}
}