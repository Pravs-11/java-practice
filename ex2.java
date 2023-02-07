
//DIFFERENCE BETWEEN STATIC AND NON-STATICMETHODS//

class ex2{
public static void main(String args[]){
display();
ex2 bs=new ex2();
bs.demo();
}
public  static void display(){
System.out.println("Hello");
}
public void demo(){
System.out.println("world");
}
}
