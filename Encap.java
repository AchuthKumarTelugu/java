
public class Encap {
    Encap() {
        System.out.println("Encap constructor is called");
    }
    private String name="achuth kumar";
    public void SetName(String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public static void main (String[] args) {
        //encapsulation :its a oops concept,it protects sensitive data from users and outside classes my making variables private and providing public methods get and set to access and modify them,it provides security and better control of code
      Encap e= new Encap();
      System.out.println(e.name);
    }
}
