package org.example;

import java.util.Scanner;

public class ComparingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        String firstString = input.nextLine();
        double firstNumber = Double.parseDouble(firstString);

        System.out.print("Enter the second number: ");
        String secondString = input.nextLine();
        double secondNumber = Double.parseDouble(secondString);

        System.out.print("Enter the third number: ");
        String thirdString = input.nextLine();
        double thirdNumber = Double.parseDouble(thirdString);

        double largestNumber = 0;

        if(firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            largestNumber = firstNumber;
        }
        if(secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            largestNumber = secondNumber;
        }
        if(thirdNumber >= secondNumber && thirdNumber >= firstNumber) {
            largestNumber = thirdNumber;
        }

        System.out.println("The largest number is " + largestNumber +".");
    }
}
