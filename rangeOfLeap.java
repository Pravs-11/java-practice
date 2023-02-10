class rangeOfLeap{
 public static void main(String args[]){
                for(int i=1900; i<=2023;i++){
              if((i%400==0) || (i%4==0 && i%100!=0)){
            System.out.println(i + " is a leap year");
           }
         }
     }
}
