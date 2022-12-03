import java.util.*;
//non recursive fxn

class fibo
{
    static void fibon(int n)
    {
        int c=0;
        int a=0;
        int b=1;
        System.out.print("0\t1\t");
        for(int i=0;i<n-2;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+"\t");

        }
    }
    public static void main(String[]args)
    {
        System.out.println("Enter the number of terms for the series");
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        fibon(n);
    }
}

/* 
//recursive

class fibo
{
    static int fibon(int n)
    {
    if(n<=1)
    {
        return n;
    }
    return fibon(n-2)+fibon(n-1);
    }

    public static void main(String[]args)
    {
        System.out.println("Enter the number of terms for the series");
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print(fibon(i)+" ");
        }
    }
}
*/