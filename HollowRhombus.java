public class HollowRhombus {
    public static void main(String[] args) {
         int n = 5;
        for (int i = 1; i <=n ; i++) {
           for (int j = n-i; j >0 ; j--) {
            System.out.print(" ");
           }  

           
            for(int j = 1; j<=5 ;j++){
            if(j == 1 || j==5 || i==1 || i==5) {
                System.out.print("*");

            }
            else{
                System.out.print(" ");
            }

         
         

           }             
           for (int l = 1 ; l <=i-1 ; l++) {
            System.out.print(" ");
           }        
           System.out.println();     
        }
    }
}
