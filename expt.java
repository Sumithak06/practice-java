//user defined exception
import java.util.*;

/* 
class expt extends Exception
{
    public static void main(String[] args)
    {
        try {
            throw new Exception("hi hello wlcm");
        } catch (Exception e) {
            System.out.println("caught user exception!!");
        }
    }
}
*/

//pre defined exception

class expt extends Exception
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter a number a and b");
        int a=s.nextInt();
        int b=s.nextInt();
        try
        {
            int c=a/b;
            System.out.println(c);

        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}