import java.util.*;
import java.lang.*;
import java.io.*;
public class BigNumber{

     public static void main(String []args){
         int d,j,temp,i;
         
         Scanner in=new Scanner(System.in);
         N=in.nextInt();
         int a[]=new int[d];
         for(i=0;i<d;i++)
         a[i]=in.nextInt();
         for(i=0;i<d;i++)
         {
         for(j=0;j<d-i-1;j++)
         {
             if(a[j]<a[j+1])
             {
                 temp=a[j];
                 a[j]=a[j+1];
                 a[j+1]=temp;
             }
         }
             
         }
         for(i=0;i<d;i++)
         {
             int count=0;
             for(j=i+1;j<d;j++)
             {
                 if(a[i]==a[j])
                {
                    count++;
                }
             }
             if(count==0)
             {
                System.out.print(a[i]);
             }
             
         }
             
     }
}
