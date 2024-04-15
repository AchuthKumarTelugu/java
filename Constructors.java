public class Constructors {
    int age;
    Constructors(int age) {
        this.age=age;//this points out to object
        System.out.println("consturctor is called and its age is "+this.age);
    }

    public static void main(String[] args) {
        // constructors are called when objects are created,they are used to intialise objects,set intial value for attributes,constructors must have className and  doesn't return anything
        // java by default creates constructor if you doesnt have any,but if you have  constructor by yourself ,you cannot use default constructor
        Constructors obj= new Constructors(23);

    }
}
