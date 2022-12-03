//palindrome

import java.util.*;

class palindrome
{
    public static void main(String[]args)
    {
        String str,rev="";
        int i;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the string ");
        str=s.nextLine();
        for(i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        if(rev.compareTo(str)==0)
        {
            System.out.println("its a palindrome");
        }
        else{
            System.out.println("its not a palindrome");
        }

    }
}