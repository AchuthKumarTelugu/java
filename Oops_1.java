public class Oops_1 {
    String name="achuth kumar";//instance variable
    static String nickName="bachi";//static variable,they are called inside non-static methods
    final int age=18;//final variable can't be changed after initialization
    static void staticMethod () {
        System.out.println("this is static method,which is called without creating object");
    }
    public void publicMethod () {
        System.out.println("this is non static method,to call them we need to use objects");
    }
    public static void main(String[] args) {
        //oops:object oriented programming language:
        //while procedural programming is used to write methods that perform operations on data
        // but oops is about writing code using classes,objects that contain data and methods
        // it is easy and flexible,it provides clean programm structure,reusable code
        //class is template for objects,objects are instances or copies of class
        //when creating objects ,they inherit all methods and variable
        Oops_1 obj=new Oops_1();//new keyword is used to create object
        Oops_1 obj2=new Oops_1();//new keyword is used to create object

        System.out.println(obj.name);// to access instance variable or fields ,use objects
    //    obj.nickName="monarch";
       obj2.nickName="hero";
       System.out.println(obj.nickName);
       System.out.println(obj2.nickName);
       staticMethod();
       obj.publicMethod();
       //attribute or fields are called using object of class ,so each object has different copies of this instance variable,changes made to one copy ,will not change the value of another copy
       //ex:let obj1.x=3 obj2.x=4 that means x for obj1 is 3 whereas for obj2 is 4,that is each object has their own copy

    }
}
