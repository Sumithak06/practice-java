//electricity report

import java.util.*;

class electricitybill
{
    public static void main(String[] args)
    {
        double amt=0;
        int cno,pr,cr,type;
        String name;
        Scanner s= new Scanner(System.in);
        System.out.println("enter customer number");
        cno=s.nextInt();
        System.out.println("enter your name");
        name=s.next();
        System.out.println("enter your previous reading");
        pr=s.nextInt();
        System.out.println("enter your current reading");
        cr=s.nextInt();
        System.out.println("enter the type of cnnectiont1.Domestic\t2.Industrial");
        type=s.nextInt();
        double unit=cr-pr;
        double dunit;
        dunit=unit-100;

        switch(type)
        {
            case 1:
            if(unit<=0)
            {
                amt=unit*1;
            }
            
            else if(dunit<=200 && dunit>=101)
            {
                amt=100+dunit*2.50;
            }
            
            else if(dunit<=500 && dunit>=201)
            {
                amt=100+dunit*4;
            }
            
            else
            {
                amt=100+dunit*6;
            }
            

            case 2:
            if(unit<=0)
            {
                amt=unit*2;
            }
            
            else if(dunit<=200 && dunit>=101)
            {
                amt=100+dunit*4.50;
            }
            
            else if(dunit<=500 && dunit>=201)
            {
                amt=100+dunit*6;
            }
            
            else
            {
                amt=100+dunit*7;
            }
            
        }
        System.out.format("customer number:%d\nname:%s\nprevious reading:%d\ncurrent reading%d\nunit:%.2f\namount:%.2f",cno,name,pr,cr,unit,amt);



    }
}