//this statement imports all the classes within the Calculate package.
//but the sub-package and its classes are not imported
import Calculate.*;

public class useCalculator {
    public static void main(String[] args) {
        Calculator obc = new Calculator();
        System.out.println("The sum is: "+obc.add(4, 5)+".");

        Calculate.Multiply.Multiplication obm = new Calculate.Multiply.Multiplication();
        System.out.println("The product is: "+obm.product(1,4)+".");
    }   
}