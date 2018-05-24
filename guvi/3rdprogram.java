import java.util.*;
import java.lang.*;
import java.io.*;
public class NNumber{

     public static void main(String []args){
         int d,i;
         
         Scanner in=new Scanner(System.in);
         d=in.nextInt();
         int a[]=new int[d];
         for(i=0;i<d;i++)
         a[i]=in.nextInt();
       int count=0;
	for(i=0;i<d;i++)
	{
		
		if(a[i]==i)
		{
		    count++;
		System.out.print(i+" ");
		}
		
	}
	
    if(count==0)
     System.out.print("-1");
	
     }
}
