public class callval {
     void change(int x){
        System.out.println(x+" -1");
         x = 20;
         System.out.println(x +" -2");

    }
    public static void main(String args[]){
        int a=4;
        callval ob =new callval();
        ob.change(a);
        System.out.println(a+" -3");
    }
}
