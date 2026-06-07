public class methodoverlod {
   public static void sum(int a, int b){
        System.out.println(a+b);
        System.out.println("1st method");
        
    }
    public static void sum(int a, int b, int c){
        System.out.println(a+b+c);
        System.out.println("2nd method");
        
    }
    public static void sum(double a, double b, int c){
        System.out.println(a+b+c);
        System.out.println("3rd method");
        
    }
    public static void sum(double a, double b, double c){
        System.out.println(a+b+c);
        System.out.println("4th method");
        
    }
    public static void show(String a, int b){
        
        System.out.println(a +""+b);
        System.out.println("5th method");
    }
    public static void show(int b, String a){
        System.out.println(b +""+a);
        System.out.println("6th method");

    }
    public static void main(String args[]){
        sum(5,2);
        sum(5,2,6);
        sum(5.2,6.3,5);
        sum(3.4,5.6,6.9);
        show("ram", 3);
        show(5, "hlo");

    }
    
}
