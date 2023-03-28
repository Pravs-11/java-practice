//example for reduce method
import java.util.*;
import java.util.stream.*;
class myList4{
public static void main(String args[]){
List<Integer>ln=Arrays.asList(15,2,3,4,5,6,9);
int sum=ln.stream().filter(a->a%2==0).reduce(0,(a,b)->a+b);
System.out.println(sum);


}
}