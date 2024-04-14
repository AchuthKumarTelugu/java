public class Strings {
    public static void main(String[] args) {
        String str="stringOne";
         //string pool and immutable
        // java has special memory  called "string pool",whenever we create a string it checks in string pool,if its there it returns only reference rather than creating object 
        //which improves memory and performance
        //immutable:once created string cannot be changed,if try to change it will create new string object
        String str1="achuth";
        String str2="achuth";
        String str3="achuth kumar";
        System.out.println(str);
        System.out.println(str1==str2);//== checks reference of two strings,.equals() checks content of two strings
        System.out.println(str1.equals(str3));//checks whether two strings are equal or not
        String string1="achuth";
        String string2=new String("achuth");//it creates string in string control pool and heap area(where objects are stored),so duplicates are allowed
        System.out.println("string1 == string2 "+(string1==string2));
         //stringBuilder and stringBuffer are immutable strings,are used when therea are mutable changes
         StringBuilder sb = new StringBuilder("Java");
         // String builder is not synchronised and not threadsafe,faster compared to StringBuffer                                                                                                                                                                                                                                                        
         // String buffer  is  synchronised and  threadsafe,slower compared to StringBuffer 
         StringBuffer sbuffer = new StringBuffer("Python");
         // in stringBuilder and StringBuilder == is used to check content ,not content
         System.out.println(sbuffer+" "+sb);     
        //string methods
        System.out.println("string length :"+str.length());//length of string
        System.out.println(str.toUpperCase()+" "+str.toLowerCase());//convert to lower case and upper case
        System.out.println(str.indexOf("One")); //returns the substring index
        System.out.println("firstName"+" "+"LastName");//+ is used to concat string
        System.out.println("achuth ".concat("kumar"));//concat() is used to concat string;
        //to use single or double quotes inside string
        System.out.println("so we are so called \"Vikings\" and \'warriors\' \n this is new line\tthis is new space");// \n-new line,\t-new space
        //charAt(index i): gives char at index of string
        //string is array of (character) ch
        System.out.println("achuth".charAt(3));
        //startsWith(substring): checks whether a given string starts with the specified prefix
        System.out.println("achuth kumar".startsWith("achuth")); 
        //endsWIth(substring):checks whether a given sting ends with specified string given
        System.out.println("achuth kumar".endsWith("kumar"));
        //substring returns substring with start to end-1 index,if end is not given it goes to end;
        System.out.println("achuth kumar".substring(0,6));  
        // replace(a,b):it replaces char a with char b
        System.out.println("bahubali".replace('b','B'));
        //getBytes():converts string to byte data 
        System.out.println("alochana".getBytes());                                                                                                                                                                                                                                              
    }
}
