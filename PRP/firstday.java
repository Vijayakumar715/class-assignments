import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
     public static void main(String []args){
     String str1="John";
          String str2="Johny";
               String str3="Janardhan";


     int a=str1.length();
          int l=str2.length();
               int m=str3.length();



//janardhan
                String b=str3.substring(0,3);
                String c=str3.substring(3,6);
                 String d=str3.substring(6,9); 
//john            
                String e=str1.substring(0,1);
                String f=str1.substring(1,3);
                 String g=str1.substring(3,4);
  //johny
                String h=str2.substring(0,2);
                String i=str2.substring(2,3);
                 String j=str2.substring(3,5);
 
       String k=e.concat(h).concat(b);
                         System.out.println(k);
       String n=f.concat(i).concat(c);
                         System.out.println(n);
        String o=g.concat(j).concat(d);
 String r=o.toUpperCase();
                          System.out.println(r);


	}
}
