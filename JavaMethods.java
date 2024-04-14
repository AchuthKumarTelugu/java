public class JavaMethods {
    //type return-type name (argument) {}
    //static methods are belongs to class,they dont need to objects to call
    static void myMethod () {
         System.out.println("called myMethod");
    }
    //non-static are belongs to object,they objects of class to call them
    void printName(String str) {  //accepts argument
        System.out.println("hello meow! you are "+str);
    }
    int add(int x ,int y) {  //return type is int
        return (x+y);
    }
    void checkAge(int age) {
        if(age >= 18) {
            System.out.println(age + " is a adult.");
        }else if (age <=10) {
            System.out.println(age + " is a child.");
        }else{
            System.out.println(age + " is a teenager.");
        }
    }
    //method overloading:
    //multiple methods have same name with different arguments
    int multiply ( int x ,int y) {
        return x*y;
    }
    int multiply (int x ,int y,int z) {
        return x*y*z;
    }
    //recursion:it is a technique where a function will call itself again and again,a halting condition to break the infinite calling
    int factorial (int x ) {
        if(x==0 || x==1 ) return 1; //halt condition
        return x*factorial(x-1);
    }
    //scope :variable declared inside a region are availabe only inside that region
    // block scope:variable declared inside blocks are availble anywhere inside the block;
    // method scope :variable declared inside method are available anywhere inside method
    public static void main(String[] args) {
        //methods or functions are blocks of code which can be executed when called ,we can also pass arguments
        myMethod();
        // className object_name = new class_name(arguments )
        JavaMethods obj=new JavaMethods();
        obj.printName("achuth kumar");
        System.out.println(obj.add(5,6));
        obj.checkAge(15);
        System.out.println(obj.multiply(2,3));
        System.out.println(obj.multiply(2,3,6));
        System.out.println("factorial :"+obj.factorial(5));
    }
}
