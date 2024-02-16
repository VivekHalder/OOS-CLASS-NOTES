/*
 * Absract classes can nver be instantiated
 * may contain one or more abstact methods
 * bu, i is not at all mandatory that an abstract class must have one or more abstract methods.
 * If a particular class has one or more than one abstract method, then the class must have to be declared as abstract.
 * it can be inherited and must have its abstract methods re-defined or overriden.
 */

abstract class Shape{

    /*
     * if the abstract keyword here, is not used, we get an error, as abstract declaration is a must if the function has no body, not even an empty one. 
     * if the abstract keyword is not used and we have a body of the funtion, which can be empty, we don't get to see any error. Normal RTP is observed in this case. 
     */
    abstract void show();
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
        s.show(); //Within Square
    }
}