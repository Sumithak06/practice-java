//abstract class

import java.util.*;

abstract class shapes
{
    public int x,y;
    public abstract void area();
}

class rectangle extends shapes
{
    public void area()
    {
        System.out.println("area of rectangle is"+ x*y);
    }
}

class triangle extends shapes
{
    public void area()
    {
        System.out.println("area of triangle is"+ (x*y)/2);
    }
}

class circle extends shapes
{
    public void area()
    {
        System.out.println("area of circle is"+ 3.14*x*x);
    }
}

class shape
{
    public static void main(String[] args)
    {
        System.out.println("enter 2 values");
        Scanner s=new Scanner(System.in);
        int x1=s.nextInt();
        int x2=s.nextInt();
        rectangle r= new rectangle();
        r.x=x1;
        r.y=x2;
        r.area();
        triangle t= new triangle();
        t.x=x1;
        t.y=x2;
        t.area();
        circle c= new circle();
        c.x=x1;
        c.area();
    }
}
