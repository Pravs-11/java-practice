//method with parameters

import java.util.*;
class cal{
  public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
    cal c=new cal();
int a=sc.nextInt();
int b=sc.nextInt();
    c.addition(a,b);
    c.substraction(a,b);
 }
  public void addition(int a, int b)
    {
 System.out.println(a+b);
    }

  public void substraction(int a, int b)
    {
 System.out.println(a-b);
    }
}