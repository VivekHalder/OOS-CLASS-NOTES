abstract class Shape{
    void show(){
        System.out.println("Within Shape");
    }
}

class Square extends Shape{
    void show(){
        System.out.println("Within Sqaure");
    }
}

class Abstract{
    public static void main(String[] args) {
        // Shape s = new Shape(); abstract classes cannot be instantiated
        Shape s = new Square(); //abstract class' reference variable is allowed to bbe created.
        s.show(); //Within Square => because the instantiated object is Square type
        // s.super.show(); cannot fund symbol error
    }
}