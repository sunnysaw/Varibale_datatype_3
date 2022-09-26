/*
In this class we will see basic about variable how the variable are dynamic allocated and by this how it works.
 */
public class Dynamic_Initialization_Of_Variable {
    public static void main(String[] args) {

        double a = 1000.0 , b = 12365.23;
        // here we are singing a + b value in c by help of dynamic allocation.
        double c = a + b;
        System.out.println("now the value of a and b are dynamically allocated in variable c :" + c);
    }
}
