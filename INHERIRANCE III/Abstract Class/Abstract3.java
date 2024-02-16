class Shape{
    int data1;
    Shape(){
        data1 = 10;
    }
    void show(){
        System.out.println("Within Shape"+data1);
    }
    void sayHello(){
        System.out.println("Hello");
    }
    void print(){
        System.out.println("print of Shape");
    }
}

class Square extends Shape{
    int data2 = 20;
    void show(){
        System.out.println("Within Sqaure"+data2);
    }
    void print(){
        System.out.println("print of Square");
    }
}

class Abstract{
    public static void main(String[] args) {
        Shape s = new Square();

        /*
         * The flow is =>
         * (i) when a variable or a method is called using s, since it is a refrence of the Shape class, it first goes to the Shape class,
         * (ii) if the variable or the method is not found, error is thrown then and there.
         * (iii) if found, the varible is used. For the function, overriden versions are searched in the instantiated class. If found, used. Else the original Shape's funcion is called.
         * 
         * The parent class is basically not aware of the contents of the child class. Ir only has the idea of the overrriden functions in the child class.
         */

        System.out.println(s.data1);
        // System.out.println(s.data2); error because there is no data2 in Square 
        s.sayHello();
        s.print(); //normal RTP

        /*
         * output:-
         * 
         * 10
         * Hello
         * print of Square
         * 
         */
    }
}