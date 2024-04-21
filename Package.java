import java.util.Scanner;//used to import specific class of package
import java.util.*;//used to import all classes of that package
public class Package {
    //to forcefully create package ,javac className.java -> inside which we mentioned package pacakage_name; then compile package by javac -d(it destination of package) .(current directory)  classname.java
    public static void main (String[] args) {
        //packages are  used to organize classes and interfaces in a project,its like folder conatining files,there are 2 types:1)built-in packages:which are already defined in java api,2)user defined packages:which are defined by user
        Scanner sc=new Scanner(System.in);//creating object of scanner
        System.out.println("enter your name");
        String name=sc.nextLine();//taking input from user in form of line
        System.out.println("entered name is "+name);
    }
}
