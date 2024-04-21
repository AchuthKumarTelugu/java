public class Polymorphism extends Poly2 {
    //method overloading
    public static void vehicle(int milage,String source) {
        System.out.println("vehicle has milage of "+milage+" works on "+source);
    }
    public static void vehicle(int milage) {
        System.out.println("vehicle runs "+milage+" miles per hour");
    }
    //method overriding:the overriding method should not stricter than overridden method private->protected->default->public

    public void message(String s) {
        System.out.println("welcome meow! "+s+" ,your at heaven");
    }
    public static void main(String[] args) {
        //polymorphism:one object has many forms,with same identity we are using many times
        //there are two types:1)compile time polymorphism(method overloading):where two methods have same name but different parameters,2)run time polymorphism(method overriding):where subclass provide specific implementation on already defined method in super class,the method in subclass with same signature(same name,parameters,return type),decision on which method to be called is decided on run time based on which object is used to call it
       vehicle(22);
       vehicle(28,"petrol");
       Poly2 p2=new Poly2();
       Polymorphism p1=new Polymorphism();
       p2.message("madara uchiha");
       p1.message("itachi uchiha");
    }
}
