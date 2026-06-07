import java.util.*;
public class fact {
     public static int ftnum(int n){
        int f = 1;
        for (int i = n;i>1; i--){
            f =f*i;
        }

     return f;}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ftnum(n));;

        sc.close();
    }
}
