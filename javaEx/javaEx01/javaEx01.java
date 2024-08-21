//package javaEx01;

import java.util.Scanner;

public class javaEx01 {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
        System.out.print("Enter your name: ");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Welcome, " + name + "!");

        int age = 24;
        long population = 8900000000000L;

        double height = 169.4;
        float weight = 70.5f;

        char ch = '3';

        boolean isStudent = true;

        System.out.println("Age: " + age);

        double pi = 3.14;
        int truncatedPi = (int) pi;

        System.out.println("pi = " + pi);
        System.out.println("truncatedPi = " + truncatedPi);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
    }
}
