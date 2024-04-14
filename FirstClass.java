public class FirstClass  {
    public static void main(String[] args) {
      // System -> java prebuilt class,out -> output ,println -> print data
      System.out.println("hello world,this is me");//insert new line at end
      System.out.println("yep thats me");
      System.out.print("how are you?");//dont insert new line at end
      System.out.println("iam fine");
      System.out.println(23*100);
      //single line comment
      /*multi
        line
        comment
       */
      //variable are containers to stare data
      int num=5;
      double cgpa=7.2;
      float salary=2300.12f;//float number end with f
      String name="achuth kumar";
      char gender='M';//characters wraps in single quotes
      boolean martial_status=false;
      System.out.println("integer :"+num+", double:"+cgpa+" float:"+salary+", String:"+name+", char:"+gender+", boolean:"+martial_status);
      int x=2,y=3,z=4;
      System.out.print(x+",");//System.out.printn() accepts only one argument or empty
      System.out.print(y+",");
      System.out.println(z);
      //data types and values
    //   1 byte =8bits ,ranging from -2^n-1 to (2^n-1) -  1, n -bits
    //  byte - 1 byte 
    //  short - 2 bytes
    //  int - 4 bytes
    //  long - 8 bytes
    //  float - 4 bytes
    //  double - 8 bytes
    //  boolean - 1 bytes
    //  char - 2 bytes
    char myChar=65;//65 ascii value is 'A'
    System.out.println(myChar);
    //primitive data types:they are predifined by java ,they can have null,ex:int,float,double,char,String,boolean,lowercase
    //non-primitive data types:they are defined by user,they usually refer to objects like String,array,class,interfaces
    //type casting:converting one primitive data type to another data type
    // widening data type:smaller data type to bigger data type,byte->short->int->long,type casting done automatically
    int a=22;
    long b=a;
    System.out.println(b);
    // narrowing data type(done by user):bigger data type to smaller data type,long->int->short->byte
    double pi=3.14;
    float value=(float)pi;
    System.out.println(value);
    
    }
}