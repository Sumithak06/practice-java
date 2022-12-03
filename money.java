package pack1;
import java.util.*;

public class moneys
{
    public void cur()
    {
        System.out.println("enter the type of conversion\n1.INR-others\n2.others-INR");
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        switch(a)
        {
            case 1:
            System.out.println("enter the method\n1.INR-USD\n2.INR-EURO\n3.INR-YEN");
            int op1=s.nextInt();
            switch(op1)
            {
                case 1:
                double usd=inr/60;
                System.out.format("%.2f inr is equal to %.2f us dollars",inr,usd);
                break;
                case 2:
                double euro=inr/80;
                System.out.format("%.2f inr is equal to %.2f euros",inr,euro);
                break;
                case 3:
                double yen=inr*1.631;
                System.out.format("%.2f inr is equal to %.2f us yen",inr,yen);
                break;
            }
            break;

            case 2:
            System.out.println("enter the method\n1.USD-INR\n2.EURO-INR\n3.YEN-INR");
            int op2=s.nextInt();
            switch(op2)
            {
                case 1:
                double inr=usd*60;
                System.out.format("%.2f usd is equal to %.2f us inr",usd,inr);
                break;
                case 2:
                inr=euro*80;
                System.out.format("%.2f euro is equal to %.2f inr",euro);
                break;
                case 3:
                inr=yen/1.631;
                System.out.format("%.2f yen is equal to %.2f us inr",yen,inr);
                break;
            }
            break;

        }
        
        
    
    }
    
}