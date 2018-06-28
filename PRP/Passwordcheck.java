import java.util.*;
public class sample {
public static void main(String[] args) {
    // TODO Auto-generated method stub
    int b=0,i;
   String s;
   Scanner in = new Scanner(System.in);
   s = in.next();
   int l=s.length();
   int arr[] = new int[4];
   for(i=0;i<4;i++)
       arr[i]=0;
   for(i=0;i<l;i++)
   {
       if(s.charAt(i)>=97&&s.charAt(i)<=122)
           arr[0]++;
       if(s.charAt(i)>=65&&s.charAt(i)<=90)
           arr[1]++;
       if(s.charAt(i)>=48&&s.charAt(i)<=57)
           arr[2]++;
       if((s.charAt(i)>=33&&s.charAt(i)<=47)||s.charAt(i)=='@')
           arr[3]++;
   }
   for(i=0;i<4;i++)
       if(arr[i]>0)
           b++;
 
   if(b==4&&l>=8)
       System.out.println("Strong");
   else if(b>=3&&l>=6)
       System.out.println("Moderate");
   else if((b<3)||(l<6))
       System.out.println("Weak");
}
}

