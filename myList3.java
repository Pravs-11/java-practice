//example for sorted method
import java.util.*;
import java.util.stream.*;
class myList3{
public static void main(String args[]){
List<Integer>ln=Arrays.asList(15,2,3,4,5,6,9);
ln.stream().sorted().forEach(System.out::println);
}
}