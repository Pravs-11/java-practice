import java.util.*;
class leapYear{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a year");
int n=sc.nextInt();
if((n%400==0) || (n%4==0 && n%100!=0)){
System.out.println(n + " is a LeapYear");
}
else{
System.out.println(n + " is not a LeapYear");
}
}
}