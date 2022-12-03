//string sort
import java.util.*;

class strsort
{
    void str()
    {
        int i,j;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of Strings");
        int n=s.nextInt();
        String[] str =new String[n];
        System.out.println("enter the strings");
        for(i=0;i<n;i++)
        {
            str[i] = new String(s.next());
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(str[i].compareTo(str[j])>0)
                {
                    String temp= str[j];
                    str[j]=str[i];
                    str[i]=temp;
                }
            }
        }
        System.out.println("the sorted strings");
        for(i=0;i<n;i++)
        {
            System.out.println(str[i]);
        }

    }

    public static void main(String[]args)
    {
        strsort obj = new strsort();
        obj.str();
    }
}
/* 

import java.util.*;

class sort
{
    void str()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter number of strings");
        int n=s.nextInt();
        String[] s2=new String[n];
        System.out.println("enter names");
        for(int i=0;i<n;i++)
        {
            s2[i]= new String(s.next());
        }
        for (int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(s2[i].compareTo(s2[j])>0)
                {
                    String temp=s2[j];
                    s2[j]=s2[i];
                    s2[i]=temp;
                }
            }
        }
        System.out.println("sorted strings are");
        for(int i=0;i<n;i++)
        {
            System.out.println(s2[i]);
        }
    }
    public static void main(string[]args)
    {
        sort obj=new sort();
        obj.str();
    }
}
*/