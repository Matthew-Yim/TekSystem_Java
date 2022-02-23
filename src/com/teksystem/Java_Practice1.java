package com.teksystem;


import java.util.Scanner;

public class Java_Practice1 {
    public static double FahrenheitToCelsiusConverter(double fahrenheit){
        double celsius = 0;
        celsius = (fahrenheit-32.0) * (5.0/9);
        return celsius;
    } // converter method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Scanner is a class
        System.out.println("Please Enter the Fahrenheit for conversion");
        double fahrenheit = input.nextDouble();
        System.out.println(String.format("This is the Celsius %.2f", FahrenheitToCelsiusConverter(fahrenheit)));
    } // main method
} // Class statement
