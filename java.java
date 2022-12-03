//thread

import java.util.*;


class even implements Runnable
{
    public int x;
    public even(int x)
    {
        this.x=x;
    }
    public void run()
    {
        System.out.println("square is"+ x*x);
    }
}

class odd implements Runnable
{
    public int x;
    public odd(int x)
    {
        this.x=x;
    }
    public void run()
    {
        System.out.println("cube is "+ x*x*x);
    }
}

class A extends Thread
{
    public void run()
    {
        try
            {
                int num=0;
                Random r = new Random();
                 for(int i=0;i<5;i++)
                 {
                    num=r.nextInt(100);
                    System.out.println("number is "+num);
                    if(num%2==0)
                    {
                        Thread t1 =new Thread(new even(num));
                        t1.start();
                    }
                    else
                    {
                        Thread t2 =new Thread(new odd(num));
                        t2.start();
                    }
                    Thread.sleep(1000);
                    System.out.println("================================================================");

                }
        }catch(Exception e)
        {
            System.outprintln(e);
        }

    }
}

public class java
{
    public static void main(String[] args)
    {
        A a=new A();
        a.start();
    }
}
