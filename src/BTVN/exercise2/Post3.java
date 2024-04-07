package BTVN.session2;

import java.util.Scanner;

public class Post3 {
    public static void main(String[] args) {
        System.out.println("Please enter th current USD value: ");
        double value = new Scanner(System.in).nextDouble();

        System.out.println("Please enter the amount: ");
        double money = new Scanner(System.in).nextDouble();

        double moneyVietNam = money * value;
        System.out.printf("The amount of USD transferred to Vietnam is : %.2f  ", moneyVietNam);
    }
}
