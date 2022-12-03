import java.util.*;

public class quad1
{
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        System.out.println("enter values of a,b and c");
        int a =s.nextInt();
        int b =s.nextInt();
        int c =s.nextInt();
        System.out.println("the quadratic equation");
        System.out.format("(%d*x^2)+(%d*x)+(%d)\n",a,b,c);
        int d=(b*b)-(4*a*c);
        if(d<1)
        {
            System.out.println("")

        }
        else if(d>1)
        {
            int root1=(-b+(int)Math.sqrt(d))/2*a;
            int root2=(-b-(int)Math.sqrt(d))/2*a;
            System.out.println("Roots are real and different = "+ root1 + ", "+ root2);

        }
        else
        {
            int root1=(-b+(int)Math.sqrt(d))/2*a;
            int root2 = root1;
            System.out.println("Roots are real and equal = "+ root1+ ", "+ root2);
        }
    }
}