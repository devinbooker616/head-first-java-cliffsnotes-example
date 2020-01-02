package app;

import java.util.Scanner;

public class MyFirstApp {

    static int Addition() {
        Scanner inputA = new Scanner(System.in);
        Scanner inputB = new Scanner(System.in);
        int a = inputA.nextInt();
        int b = inputB.nextInt();
        inputA.close();
        inputB.close();
        return a + b;

    }

    static int Subtraction() {
        Scanner inputA = new Scanner(System.in);
        Scanner inputB = new Scanner(System.in);
        int a = inputA.nextInt();
        int b = inputB.nextInt();
        inputA.close();
        inputB.close();
        return a - b;
    }

    static int Multiplication() {
        Scanner inputA = new Scanner(System.in);
        Scanner inputB = new Scanner(System.in);
        int a = inputA.nextInt();
        int b = inputB.nextInt();
        inputA.close();
        inputB.close();
        return a * b;
    }

    static double Division() {
        Scanner inputA = new Scanner(System.in);
        Scanner inputB = new Scanner(System.in);
        int a = inputA.nextInt();
        int b = inputB.nextInt();
        inputA.close();
        inputB.close();
        return a / b;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("This is a calculator");
        Scanner input = new Scanner(System.in);
        System.out.println("Press + to add, - to subtract, x to multiply, and % to divide");
        while (true) {
            String choice = input.nextLine();
            if (choice.equals("+")) {
                System.out.println("Enter two numbers to add");
                System.out.println(Addition());
                input.close();
                break;
            } else if (choice.equals("-")) {
                System.out.println("Enter two numbers to subtract");
                System.out.println(Subtraction());
                input.close();
                break;
            } else if (choice.equals("x")) {
                System.out.println("Enter two numbers to multiply");
                System.out.println(Multiplication());
                input.close();
                break;
            } else if (choice.equals("%")) {
                System.out.println("Enter two numbers to divide");
                System.out.println(Division());
                input.close();
                break;
            } else {
                System.out.println("Please re-run the program and pick a valid option");
                input.close();
                break;
            }

        }
    }
}