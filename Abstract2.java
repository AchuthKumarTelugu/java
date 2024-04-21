public class Abstract2 extends Abstract {
    Abstract2(String colorName) {
        super(colorName);
    }
    public void abstractDisplay () {
        System.out.println("this is abstracDisplay");
    }
    public static void main(String[] args) {
       Abstract2 abs2= new Abstract2("red");
       System.out.println("accessed from super abstract class "+Abstract.colorName);
       abs2.abstractDisplay();
    }
}
