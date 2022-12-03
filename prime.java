//prime numbers

import java.util.*;

class prime
{
    public static void main(String[] args)
    {
        System.out.println("enter the number");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=2;i<=n;i++)
        {
            int flag;
            flag=0;
            for(int j=2;j<n;j++)
            {
                if(i%j==0 && i!=j)
                {
                    flag=1;
                }
            }
            if(flag==0)
            {
                System.out.println(i);
            }
        }

    }

}
