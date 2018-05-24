import java.util.*;
import java.lang.*;
import java.io.*;
public class NNumber{

     public static void main(String []args){
         int d,j,temp,i;
         
         Scanner in=new Scanner(System.in);
         d=in.nextInt();
         int a[]=new int[d];
         for(i=0;i<d;i++)
         a[i]=in.nextInt();
        
         for(i=0;i<d;i++)
         {
             int count=0;
             for(j=0;j<d;j++)
             {
                 if(a[i]==a[j])
                {
                    count++;
                }
             }
             if(count==1)
             {
                System.out.print(a[i]+" ");
             }
                       
         }
             
     }
}
