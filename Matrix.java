//Matrix multiplication

import java.util.*;

class Matrix
{
    static void printmat(int c[][],int row,int col)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.format("%d\t",c[i][j]);
            }
            System.out.println(" ");
        }
    }
    static void matmul(int a[][],int arow,int acol,int b[][],int brow,int bcol)
    {
        System.out.println("given matrix 1");
        printmat(a,arow,acol);
        System.out.println("given matrix 2");
        printmat(b,brow,bcol);
        int c[][]=new int[arow][bcol];
        if(arow!=bcol)
        {
            System.out.println("matrix multiplication not possible");
            return;
        }
        for(int i=0;i<arow;i++)
        {
            for(int j=0;j<bcol;j++)
            {
                for(int k=0;k<arow;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }  
            }
        }
        System.out.println("multiplied matrix");
        printmat(c,arow,bcol);
    
    }
    public static void main(String[] args)
    {
        int arow=3,acol=3,brow=3,bcol=3;
        int a[][]={{1,2,3},{1,2,3},{1,2,3}};
        int b[][]={{1,2,3},{1,2,3},{1,2,3}};
        matmul(a,arow,acol,b,brow,bcol);
    }
}