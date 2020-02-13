package averagecalculator;


import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);
        double num1;
        double num2;
        double num3;
        double numAverage;
        
        System.out.print("Please enter first number: ");
        num1 = scnr.nextDouble();
        
        System.out.print("Please enter second number: ");
        num2 = scnr.nextDouble();
        
        System.out.print("Please enter third number: ");
        num3 = scnr.nextDouble();
        numAverage = (num1 + num2 + num3) / 3;
        
        System.out.print("The average of the numbers: " + String.format("%.2f", num1));
        System.out.print(", " + String.format("%.2f", num2));
        System.out.print(", and " + String.format("%.2f", num3));
        System.out.println(" is: " + String.format("%.2f", numAverage));
        
        
    }
    
}
