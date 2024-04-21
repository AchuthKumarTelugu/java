public abstract class Abstract {
    //abstraction is fundamental concept of oops ,which refer to hiding implemtation details from user and showing only neccesary details
    //abstract class is class with abstract keyword,inside abstract we cannot create objects,it can have non abstract and abstract methods,only abstract classes can have abstract methods
    //abstract classes are declared without implentation,implementaion are done by sub classes using method over-riding,if we are inheriting abstract classes it must provide implementaion of its abstract methods or else it should be a abstract class of its own
    protected static String colorName;
    Abstract(String colorName) {
        this.colorName=colorName;
    }
    abstract public void abstractDisplay();  
}
