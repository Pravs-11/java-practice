//using map,forEach methods

import java.util.*;
import java.util.stream.*;
class myList1{
public static void main(String args[]){
List<Integer>ln=Arrays.asList(15,2,3,4,5,6,9);
//i is a dummy variable, println method is used to print the actions done by previous methods
ln.stream().map(i->i*2).forEach(System.out::println);
}
}