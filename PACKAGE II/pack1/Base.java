package pack1;

public class Base{
    public void pub(){
        System.out.println("Public: Base");
    }
    private void pri(){
        System.out.println("Private: Base");
    }
    void def(){
        System.out.println("Default: Base");
    }
    protected void pro(){
        System.out.println("Protected: Base");
    }
    public final void fin(){
        System.err.println("Final: Base");
        pub();
        pri();
        def();
        pro();
    }
}