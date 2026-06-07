public class hollowrect {
    public static void main(String[] args) {
        int rows = 5;
        int column = 8;
    
    for(int i =1; i<=rows;i++){
         for(int j = 1; j<=column;j++){
            if(j == 1 || j==column || i==1 || i==rows) {
                System.out.print("*");

            }
            else{
                System.out.print(" ");
            }

         }
         System.out.println();

    }
}
}
