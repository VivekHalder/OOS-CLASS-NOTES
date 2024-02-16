/*
 * sort of multilevel inheritance
 */
interface IN{
    void f1();
    void f2();
    void f3();
}

//abstract class implementing interface
abstract class AB implements IN{
    public void f3(){
        System.out.println("Within f3 in AB");
    }

    /*
     * so, f1 and f2 still don't have a body.
     */
}

class ABC extends AB{
    public void f1(){
        System.out.println("Within f1 in ABC");
    }

    public void f2(){
        System.out.println("Within f2 in ABC");
    }
}

class InterAbstract{
    public static void main(String[] args) {
        IN i = new ABC();

        i.f1();
        i.f2();
        i.f3();

        /*
         * output:-
         * 
         * Within f1 in ABC
         * Within f2 in ABC
         * Within f3 in AB 
        */
    }
}