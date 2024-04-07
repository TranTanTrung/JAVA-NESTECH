package BTVN.session1_2_3;

import java.util.Scanner;

public class Rectangle {
    public static void main (String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in); // Khai báo 1 dữ liệu scanner để người dùng nhập dữ liệu
        System.out.println("Input width: "); // println có nghĩa là dòng này + Enter
        width = scanner.nextFloat();
        System.out.println("Intput height: ");
        height = scanner.nextFloat();
        float area = width + height;
        System.out.println("Area í: " + area);
    }
}
