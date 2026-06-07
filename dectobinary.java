import java.util.*;
public class dectobinary {
    public static void dectobinarynum(int n) {
         if (n == 0) {
        System.out.println(0);
        return;
    }

        int binnum =0; 
        int pow =1;

    while(n>0){
        int rem = n%2;
         binnum = binnum+rem*pow;
        n = n/2;
        pow = pow*10;
    }
    System.out.println(binnum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dectobinarynum(n);
        sc.close();
    }
}
