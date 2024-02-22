/*
 * If a package contains multiple classes, we need to use multiple source files.
 * We cannot keep more than one public class within a source file.
 * 
*/


//using fully qualified class name, we can use a class within a package in this way, instead of importing the package.
public class fullyQualClassName {
    public static void main(String[] args) {
        pack1.A oba = new pack1.A();
        oba.display();

        pack1.B obb = new pack1.B();
        obb.show();
    }    
}
