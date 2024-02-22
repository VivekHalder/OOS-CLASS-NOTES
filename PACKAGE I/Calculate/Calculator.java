package Calculate;

public class Calculator{
    public int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Calculator ob = new Calculator();
        System.out.println(ob.add(2, 4));
    }
}