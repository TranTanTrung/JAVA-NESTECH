package session1_2_3;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number: ");
        int number = scanner.nextInt();

        if (number < 2) {
            System.out.println(number + " is not a prime");
        } else {
            if (number == 2 || number == 3) {
                System.out.println(number + " is a prime");
            } else {
                for (int i = 2; i <= Math.sqrt(number) ; i++) {
                    if (number % i == 0) {
                        System.out.println(number + " is not a prime");
                        break;
                    }
                    else {
                        System.out.println(number + " is a prime");
                    }
                }
            }
        }
    }
}
