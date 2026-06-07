import java.util.*;

public class bintodec {
    public static void bintodecnum(int n) {
        
        int decnum = 0;
        int pow = 0;
        while (n > 0) {

            int lastdigit = n % 10;
             if (lastdigit != 0 && lastdigit != 1) {
        System.out.println("Invalid binary number");
        return;}
        
            decnum = decnum + lastdigit * (int) Math.pow(2, pow);
            n = n / 10;
            pow++;
        }
        System.out.println(decnum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("range is  0 & 1 only for binary value ");
        bintodecnum(n);

        sc.close();
    }
}
