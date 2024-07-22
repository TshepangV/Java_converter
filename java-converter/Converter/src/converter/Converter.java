/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package converter;
import java.util.Scanner;

/**
 *
 * @author CAPACITI-JHB
 */

public class Converter {
    
    public static void main(String[] args) {
        // Prompt the user for input
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt the user for input
            System.out.println("Welcome to Unit Converter!");
            System.out.println("Available conversions:");
            System.out.println("1. Feet to Meters");
            System.out.println("2. Pounds to Kilograms");
            System.out.println("3. Fahrenheit to Celsius");
            System.out.println("Enter your choice (1/2/3): ");
            int choice = scanner.nextInt();
            double quantity;
            String fromUnit, toUnit;
            switch (choice) {
                case 1 -> {
                    fromUnit = "Feet";
                    toUnit = "Meters";
                    System.out.println("Enter the quantity in Feet:");
                    quantity = scanner.nextDouble();
                    double meters = feetToMeters(quantity);
                    System.out.printf("%.2f %s = %.2f %s\n", quantity, fromUnit, meters, toUnit);
                }
                case 2 -> {
                    fromUnit = "Pounds";
                    toUnit = "Kilograms";
                    System.out.println("Enter the quantity in Pounds:");
                    quantity = scanner.nextDouble();
                    double kilograms = poundsToKilograms(quantity);
                    System.out.printf("%.2f %s = %.2f %s\n", quantity, fromUnit, kilograms, toUnit);
                }
                case 3 -> {
                    fromUnit = "Fahrenheit";
                    toUnit = "Celsius";
                    System.out.println("Enter the temperature in Fahrenheit:");
                    quantity = scanner.nextDouble();
                    double celsius = fahrenheitToCelsius(quantity);
                    System.out.printf("%.2f %s = %.2f %s\n", quantity, fromUnit, celsius, toUnit);
                }
                default -> System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }
    
    // Conversion methods
    public static double feetToMeters(double feet) {
        return feet * 0.3048;
    }
    
    public static double poundsToKilograms(double pounds) {
        return pounds * 0.45359237;
    }
    
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}


