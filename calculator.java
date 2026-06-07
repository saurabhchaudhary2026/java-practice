import java.util.*;
public class calculator{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        // nextLine return string not char so we not use if use then use nextLine.charAt(0)

        int a = in.nextInt();
        int b = in.nextInt();
        /*Short Note: nextInt() + nextLine() Problem in Java
Problem

After using nextInt(), if we use nextLine(), it may read an empty string. 

That leftover newline is immediately read by nextLine() as an empty line.
""

Then:

charAt(0)

tries to access first character of empty string → exception occurs.




*/
        char var = in.next().charAt(0);
        switch (var){
            case '+': System.err.println(a+b);
            break;
            case '-': System.err.println(a-b);
            break;
            case '*': System.err.println(a*b);
            break;
            case '/': System.err.println(a/b);
            break;
            default: System.out.println("wrong operator");
        }
        in.close();

    }
}