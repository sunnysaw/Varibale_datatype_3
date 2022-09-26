/*
In this class we will use Scanner class and see the working of Dynamic initialization of variable, how it works and many more.
 */
import java.util.Scanner;
public class Dynamic_Initialization_Of_Variable2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number :");
        double a = sc.nextDouble();
        System.out.println("enter the second number :");
        double b = sc.nextDouble();
         // now we are going to initialize the value of a and b into c.
        double c = a + b ;
        System.out.println("now the current value of c will be the sum of a and b :" + c);
    }
}
