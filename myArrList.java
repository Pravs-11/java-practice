//using arraylist by stream api printing the even array list values

import java.util.*;
import java.util.stream.*;
class myArrList{
public static void main(String args[]){
ArrayList<Integer>al=new ArrayList<>();
for(int i=1;i<=100;i++)
al.add(i);
List<Integer>evenal=al.stream().filter(i->i%2==0).collect(Collectors.toList());

//collect will collect the data
//but we want to create list interface of results this collectors.toList will convert those results  cmg from the collect method into a list bcoz we need to return list here.

System.out.println(evenal);
}
}