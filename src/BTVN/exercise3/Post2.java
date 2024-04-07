package BTVN.session3;

import java.util.Scanner;

public class Post2 {
    public static void main(String[] args) {
        System.out.println("Input integer a: ");
        int a = new Scanner(System.in).nextInt();

        System.out.println("Input integer b: ");
        int b = new Scanner(System.in).nextInt();

        while (a*b!=0) {
            if(a>b) {
                a%=b;
            } else {
                b%=a;
            }
        }

        System.out.println("Greatest common divisor: " + (a+b));
    }
}
