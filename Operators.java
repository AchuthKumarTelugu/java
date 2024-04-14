public class Operators {
    public static void main(String[] args) {
        // operators are used to perform operations on variable & values;
        // + is used to add values and also add values with variables like string and value
        int x=10;
        int y=5;
        // arithmetic operators are used to perform mathematical operations
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);
        System.out.println(x++);
        System.out.println(--y);
        // x++ first take x value and increment it,++x first increment value and print it or take it
        // assignment operator are used to assign values
        x+=5;
        System.out.println(x);
        x*=5;
        System.out.println(x);
        // =,+=,-+,*=,/=,%=,<<=,>>=,&=,^=,|=,&&,|| are all assignment operators
        // comparision operators are used to compare values,they result values in boolean values
        System.out.println(x>y);
        // >,>=,<,<= ,==,!=
    }
}
