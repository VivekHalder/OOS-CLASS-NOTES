/*
 * Package is a collection of classes.
 * Used to group related classes.
 * Class member variable are already hidden inside the class. But, the class names can clash.
 * Means, if we want to create two classes with the same names, we can put them in two different packages.
 * Packages are containers(collection of classes), used to create the class namespace compartmentalized.
 * It helps organize our classes into a folder structure and makes it easy to locate and use them.It helps to improve re-usability.
 */


 /*
  * How to use packages?
  * Only one package declaration is permitted, and it governs the entire source file.
  * Packages are stored in a heirarchical manner and are explicitly imported into the new class definition
  * The 'import' keyword is used to bring classes in other packages to the current namespace.
 */

 /*
   * Steps to create and use a package:
______________________________
   * 1. First declare the name of the package using the package keyword followed by a package name (pack1)
   * 2. Define the class within pack1. 

   The file should be saved as A.java and located in a directory named pack. After compilation of the source file (A.java), Jave will create a .class file and store it in the same directory.
  * 3. The directory having the same name as the package must contain the .class file and 
this directory should be a subdirectory where the classes that will import the package are located. 
_____________________________________________
*/