//employee paybill

import java.util.*;
class employe
{
    String name,address,mail;
    int id,mobile;
    float bp,da,hra,pf,clbfnd,gs,ns;
    void getdata()
    {
        Scanner s =new Scanner(System.in);
        System.out.println("enter name");
        name=s.next();
        System.out.println("enter id");
        id=s.nextInt();
        System.out.println("enter address");
        address=s.next();
        System.out.println("enter mail");
        mail=s.next();  
        System.out.println("enter mobile");
        mobile=s.nextInt();   

    }

    void calcdata(float bp)
    {
        da=(float)(bp*90/100);
        hra=(float)(bp*10/100);
        pf=(float)(bp*12/100);
        clbfnd=(float)(bp*0.1/100);
        gs=(float)(da+hra+pf+clbfnd);
        ns=(float)(gs-pf);
    }

    void display()
    {
        System.out.println("***************Employee details***************");
        System.out.println("Employee Name = "+name);
        System.out.println("Employee ID = "+id);
        System.out.println("Employee address = "+address);
        System.out.println("Employee mobile number = "+mobile);
        System.out.println("Employee Mail ID = "+mail);
        System.out.println("Basic pay = "+bp);
        System.out.println("DA = "+da);
        System.out.println("HRA = "+hra);
        System.out.println("PF = "+pf);
        System.out.println("Staff Club Fund  =  "+clbfnd);
        System.out.println("Gross Salary =  "+gs);
        System.out.println("Net Salary  =  "+ns);
    }
}
    class prog extends employe
    {
        float bp;
        prog()
        {
            bp=100000;
        }

    }
    class assoprof extends employe
    {
        float bp;
        assoprof()
        {
            bp=200000;
        }

    }
    class associprof extends employe
    {
        float bp;
        associprof()
        {
            bp=300000;
        }

    }
    class prof extends employe
    {
        float bp;
        prof()
        {
            bp=400000;
        }

    }
    class employee
    {
        public static void main(String[]args)
        {
            Scanner s=new Scanner(System.in);
            System.out.println("enter the profession 1.Programmer\t2.Assiatant Professoe\t3.Associate Prefessor\t4.Professor");
            int n=s.nextInt();
            switch(n)
            {
                case 1:
                prog obj=new prog();
                obj.getdata();
                obj.calcdata(obj.bp);
                obj.display();
                break;
                case 2:
                assoprof obj1=new assoprof();
                obj1.getdata();
                obj1.calcdata(obj1.bp);
                obj1.display();
                break;
                case 3:
                associprof obj2=new associprof();
                obj2.getdata();
                obj2.calcdata(obj2.bp);
                obj2.display();
                break;
                case 4:
                prof obj3=new prof();
                obj3.getdata();
                obj3.calcdata(obj3.bp);
                obj3.display();
                break;

                
            }
        }
    }