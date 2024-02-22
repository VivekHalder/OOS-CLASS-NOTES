class Outer{
    private String msg = "JU IT";
    private void fun(){
        System.out.println("Outer fun");
    }

    class Inner extends Outer{
        private void fun(){
            System.out.println("Inner fun");
        }
    }

    public static void main(String[] args) {
        Outer o = new Outer();

        /* check out the part => i.new Inner
         * as the inner class is nested in the 
         * outer class, we need to use the outer
         * class object to instantiate the inner
         * class.
        */
        Inner i = o.new Inner();
        i.fun();
        o=i;
        o.fun();
    }
}