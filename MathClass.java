public class MathClass {
    public static void main(String[] args) {
        System.out.println(Math.max(2, 3));// Math.max returns maximum of two numbers
        System.out.println(Math.min(33, 4));
        System.out.println(Math.abs(-23)); // returns the absolute value of a number
        System.out.println(Math.sqrt(16)); // return square root of a number
        int randomNumber = (int) (1 + Math.random() * 100); // generate random integer between 1 and 100
        System.out.println(randomNumber);
        int age = 14;
        // if(age >=18) {
        // System.out.println("your eligible for vote");
        // }else {
        // System.out.println("you are not eligible for jobs");
        // }
        switch (age) {
            case 18:
                System.out.println("You are legal majority");
                break;
            case 14:
                System.out.println("you are not of legal age");
                break;
            default:
                System.out.println("your age is not defined");
        }
        // print 1 t0 20 even numbers
        int i = 1;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
        for (int j = 0; j < 5; j++) {
            System.out.print(j + " ");
        }
        String[] cars = { "volvo", "BMW", "Saab", "audi" };
        for (String k : cars) { // for each loop used for iterables
            System.out.println(k + " car is good");
        }
        //breaks is used to come out of loop
        //continue is used to skip only the present value
        for(int k =1;k<=10;k++) {
            if(k==5) continue;
            if(k==9) break;
            System.out.println(k);
        }
    }
}
