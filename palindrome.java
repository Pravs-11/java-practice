import java.util.*;
class palindrome{
      public static void main(String args[])
    {
   Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
     int num=sc.nextInt();
    int x=num;
          int rev=0;
          while(num!=0)
           {
               int rem=num%10;
                rev=rev*10+rem;
                num=num/10;
              }
         if(x==rev)
          System.out.println("given num is palindrome");
        else
          System.out.println("given num is not a palindrome");
      }
}