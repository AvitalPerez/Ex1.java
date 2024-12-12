package assignments.ex1;

import java.util.Scanner;

import static assignments.ex1.Ex1.*;

public class Ex1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String quit = "quit";
        String num1 = "", num2 = "";

        while (true) {
            System.out.println("\nEx1 class solution:");
            System.out.println("Enter a string as number#1 (or \"quit\" to end the program): ");
            num1 = sc.next();

            if (num1.equals(quit)) {
                break;
            }

            if (!isNumber(num1)) {
                System.out.println("ERR: num1 is in the wrong format! (" + num1 + ")");
                continue;
            }

            System.out.println("Enter a string as number#2 (or \"quit\" to end the program): ");
            num2 = sc.next();

            if (num2.equals(quit)) {
                break;
            }

            if (!isNumber(num2)) {
                System.out.println("ERR: num2 is in the wrong format! (" + num2 + ")");
                continue;
            }

            System.out.println("Enter a base for output (a number [2,16]): ");
            int base = sc.nextInt();

            int num1Decimal = number2Int(num1);
            int num2Decimal = number2Int(num2);

            int addition = num1Decimal + num2Decimal;
            int multiplication = num1Decimal * num2Decimal;

            System.out.println(num1 + " + " + num2 + " = " + addition);
            System.out.println(num1 + " * " + num2 + " = " + multiplication);


        }

        sc.close();
        System.out.println("Quitting");
    }
}