public class number {
    public static void main (String args[]){
        int n= 15;
        int count = 1;
        int sum = 0;
        while(count <= n){
         sum = sum + count;
            System.out.println(count);
            count++;
        }
        System.out.println(sum);
    }
}
