//file
import java.util.*;
import java.io.*;

class file
{
    public static void main(String[] args)
    {
        System.out.println("enter a file name");
        Scanner i =new Scanner(System.in);
        String s=i.nextLine();
        File f1=new File(s);

        System.out.println("file name; "+f1.getName());
        System.out.println("file path; "+f1.getPath());
        System.out.println("absolute path: "+f1.getAbsolutePath());
        System.out.println("parent file: "+f1.getParent());
        System.out.println(f1.exists()?"exists":"doesnt exist");
        System.out.println("is file: "+f1.isFile());
        System.out.println("is directory: "+f1.isDirectory());
        System.out.println("is readable: "+f1.canRead());
        System.out.println("is writable: "+f1.canWrite());
        System.out.println("is absolute: "+f1.isAbsolute());
        System.out.println("last modified: "+f1.lastModified());
        System.out.println("length: "+f1.length());
        System.out.println("hidden: "+f1.isHidden());

    }
}