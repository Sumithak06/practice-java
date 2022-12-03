import pack1.pack1;
import pack2.pack2;
import pack3.pack3;
import java.util.*;

public class conv
{
    public static void main(String[] args)
    {
        pack1.moneys obj1=new pack1.moneys();
        pack2.time obj2=new pack2.time();
        pack3.distance obj3=new pack3.distance();
        System.out.println("enter the type of conversion\n1.currency\n2.Time\n3.distance");
        Scanner s=new Scanner(System.in);
        int op=s.nextInt();
        
        switch(op)
        {
            case 1:
            obj1.cur();
            break;
            case 2:
            obj2.tm();
            break;
            case 3:
            obj3.dis();
            break;
        }
    }
}