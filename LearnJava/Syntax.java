package LearnJava;

import java.util.Scanner;

public class Syntax {

    public int a = 5; //[-2147483638, -2147483637]
    public float b = 4; //[ ±3.4× 1038, 1.4×10-45]
    public double c = 2.3; //[±1.8*10308, ±4.9*10-324]
    public byte d = 127; //[-128, 127]
    public boolean e = true; // true or false
    public short f = 32767; //[-32768, 32767]
    public char g = 1; //[0, 65535]
    public String s = "Java OOP";


    public static int parseInt(String arg) {
        int x = -1;
        try {
            x = Integer.parseInt(arg);
        } catch (NumberFormatException e) {
            //ignore!
            x = -1;
        }
        return x;
    }


    public static void main(String[] args) {
        System.out.println("Hello World!");

        /**
         * outputs "Hello, <name>!"
         */

//        String name;
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        name = sc.nextLine();
//        System.out.println("Hello, " + name + "!");

        /**
         * evaluate if the first number is greater than the second
         */

//        if (args.length < 2) {
//            return;
//        }
//        int n1 = parseInt(args[0]);
//        int n2 = parseInt(args[1]);
//
//        System.out.print("Is " + n1 + " > " + n2 + "? ");
//        if (n1 > n2) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }

        /**
         * Golden Ratio
         */

        System.out.print("Enter two numbers: ");
        try {
            double A = sc.nextDouble();
            double B = sc.nextDouble();
            double C = ((A + B)/A);
            double D = A/B;
            C = Math.round(C*1000);
            D = Math.round(D*1000);
            if(C == D && C == 1618){
                System.out.println("Golden ratio!");
            }else{
                System.out.println("Maybe next time.");
            }
        }catch(Exception e){
            System.out.println("Invalid input.");
        }

    }
}
