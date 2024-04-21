public class InnerClass {
    int y=122;
    static String pet_breed="labrador";
    public class subclass{
        int x=10;
    }
    //if class is declared private,any classes outside enclosing class cannot access it
    private class privateSubclass {
      String dog_name="charlie";
    }
    //static class:if class has static keyword then it becomes static class,it can be accessed without creating object of outer class,it belongs to outer class itself,static inner class doesnt have access to non-static members of outer class unless a instance of it provided
    static class staticClass {
        int z=189;
        public void display() {
            // System.out.println("y"+y);//cannot access non static members
            System.out.println("(outer class) pet_breed "+pet_breed);
            System.out.println("z "+z);
        }
    }
    public static void main(String[] args) {
        //innerClasses:having classes inside other class,which makes all similar classes together enhancing readability and maintainability
       //to access innerclass varaible/methods ,first make object of outer class and use it to create object of inner class,using it we can access variables/methods in innerclasses
       //inner class can acess members of outer class
       InnerClass outer=new InnerClass();
       InnerClass.subclass inner= outer.new subclass();
       InnerClass.privateSubclass pvt=  outer.new privateSubclass();
       System.out.println(inner.x);
       System.out.println(pvt.dog_name);
       InnerClass.staticClass stc =new InnerClass.staticClass();
       stc.display();
    }
}
