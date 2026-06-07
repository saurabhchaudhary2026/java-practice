import java.util.*;
public class primenum {
    public static void main (String args[]){
       boolean isprime=true;
 Scanner sc = new Scanner(System.in);
 int n =sc.nextInt(); 
 for(int i = 2;i<=Math.sqrt(n);i++){
   if( n%i==0){
    isprime=false;
    break;
   }
 }
 if(isprime==false){
    System.out.println("number is not prime");
 }
 else{
    System.out.println("number is prime");
 }
 sc.close();
    }

}
