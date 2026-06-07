import java.util.*;
public class mulof10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n;
        do {
           int n =sc.nextInt();
            if(n%10==0){
            break;}

        System.out.println(n);


        }while(true);
    
        // int n;
        // do {
        //     n =sc.nextInt();
        //     System.out.println(n);

        // }while(n%10==0);
        // System.out.println("loop is end");
        sc.close();
    }
}
