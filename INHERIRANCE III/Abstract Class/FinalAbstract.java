abstract class Shape{
    private int width;
    private int height;
    Shape(int w, int h){
        this.width = w;
        this.height = h;
    }

    // a particular function if declared final, it cannot be overridden

    /*
     * In inheritance, if we want some functions
     *  to have the same implementation 
     * throughout, in all the child classes, we
     * must declare it as final.
     * 
     * it is not mandatory to declare a function 
     * as final in the base class only.
     * we can declare final functions in any 
     * sub-class or in any subsequence child class 
     * extending base class. the same 
     * implementation of the function will be 
     * followed thereafer.
     */
    final int getWidth(){
        return width;
    }

    final int getHeight(){
        return height;
    }

    abstract int getArea();
}

class Rectangle extends Shape{
    Rectangle(int width, int height){
        super(width, height);
    }

    /*
     * super.getWidth() and super.getHeight() would also have worked. Same thing.
     */
    int getArea(){
        return this.getWidth()*this.getHeight();
    }
}

class Square extends Shape{
    Square(int side){
        super(side, side);
    }

    int getArea(){
        return this.getWidth()*this.getHeight();
    }
}

class FinalAbstract{
    public static void main(String[] args) {
        Shape rec = new Rectangle(2, 4);
        System.out.println("Area of rectangle:- "+rec.getArea());
        Shape sq = new Square(4);
        System.out.println("Area of square:- "+sq.getArea());
    }
}