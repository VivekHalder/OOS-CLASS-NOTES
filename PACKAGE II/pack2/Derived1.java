package pack2;
 
public class Derived1 extends pack1.Base{

    //NOTE: THE NON PUBLIC METHODS ARE NOT OVERRIDDEN. 
    public void pub(){
        System.out.println("Public: Derived1");
    }
    private void pri(){
        System.out.println("Private: Derived1");
    }
    void def(){
        System.out.println("Default: Derived1");
    }
    protected void pro(){
        System.out.println("Protected: Derived1");
    }
    public void show(){
        System.err.println("Show: Derived1");
        pub();
        pri();
        def();
        pro();
    }
    // final method cannot be overridden
    // public final void fin(){
    //     System.err.println("Final: Base");
    //     pub();
    //     pri();
    //     def();
    //     pro();
    // }
}