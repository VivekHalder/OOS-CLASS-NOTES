//there may be more than one source file within a particular package.
//pack1.*; imports all the classes.
import pack1.A;

public class importA {
    public static void main(String[] args) {
        A ob = new A();
        ob.display();
    }
}
