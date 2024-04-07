package session1_2_3;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a + x + b = c', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a : ");
        double a = scanner.nextDouble();

        System.out.print("b : ");
        double b = scanner.nextDouble();

        System.out.print("c : ");
        double c = scanner.nextDouble();

        if (a!=0) {
            double x = (c-b)/a;
            System.out.println("Equation pass with x = " + x); // \n là xuống dòng => đáp án của mình sẽ xuống dòng
            //printf nó sẽ thay thế cho ký hiệu %d,
        } else {
            if (b==c) {
                System.out.println("The solution is all x!"); //Phương trình có vô số nghiệm
            } else {
                System.out.println("the equation has no solution"); // Phương trình vô nghiệm
            }
        }
    }
}
