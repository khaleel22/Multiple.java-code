import java.io.*;
import java.util.*;
class MatrixAddition
{
  public static void main(string args[])
  {
    int i,j,r1,c1,r2,c2;
    int a[][]=new int[10][10];
    int b[][]=new int[10][10];
    int c[][]=new int[10][10];
    scanner s=new scanner(system.in);
    system.out.println("enter no. of rows and columns of 1st matrix:");
    r1=s.nextInt();
    c1=s.nextInt();
    system.out.println("enter the no. of rows and columns of 2nd matrix:");
    r2=s.nextInt();
    c2=s.nextInt();
    if(r1==r1 && c1==c2)
    {
      system.out.println("enter the elements of 1st matrix:");
      for(i=0;i<r1;i++)
      {
        for(j=0;j<c1;j++)
        {
          a[i][j]=s.nextInt();
        }
      }
     system.out.println("enter elements of 2nd matrix:");
     for(i=0;i<r2;i++)
     {
       for(j=0;j<c2;j++)
       {
         b[i][j]=s.nextInt();
       }
     }
     system.out.println("addition is:");
     for(i=0;i<r1;i++)
     {
      for(j=0;j<c1;j++)
      {
        c[i][j]=a[i][j]+b[i][j];
        system.out.print(c[i][j]+"\t");
      }
       system.out.println(" ");
     }
    }
    else
    {
      system.out.println("matrix addition not possible:");
    }
   }
  }