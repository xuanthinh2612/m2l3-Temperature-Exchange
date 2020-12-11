package com.company;

import java.util.Scanner;

public class TemperatureExchange {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("please select option");
        System.out.println("menu"+"\n"+ "1. Fahrenheit to Celsius"+"\n"+"2. Celsius to Fahrenheit"+"\n"+"0. Exit" );
        int choice = scanner.nextInt();
        switch (choice) {
            case 0:
                System.exit(0);
                break;
            case 1:
                System.out.println("To Celsius: "+"\t"+new TemperatureExchange().FToC());
                break;
            case 2:
                System.out.println("To Fahrenheit: "+"\t"+new TemperatureExchange().CToF());
        }
    }
    public double FToC() {
        System.out.print("Insert Fahrenheit: \t ");
        double tempF = scanner.nextDouble();
        double celsius = (5.0 / 9) * (tempF - 32);
        return celsius;
    }
    public double CToF() {
        System.out.print("Insert Celsius: \t ");
        double tempC = scanner.nextDouble();
        double fahrenheit = tempC*1.8+32;
        return fahrenheit;
    }
}
