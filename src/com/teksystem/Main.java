package com.teksystem;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Initial stuff
        System.out.println("AYO");
        final double Pi = 3.14;
        int myAge = 10;
        System.out.println("YO I'm " + myAge);
        int a = 10;
        double b = 10.5;
        String s = "Hello World";

        //Radius example
        double radius = 0;
        double area = 0;
        radius = 20;
        area = radius * radius * 3.14159;
        System.out.println("This is the area for a circle " + area +
                " for radius of " + area);

        //READING FROM USER
        Scanner input = new Scanner(System.in); //Scanner is a class
        System.out.println("Enter a new radius: ");
        radius = input.nextDouble();
        area = radius * radius * 3.14159;
        System.out.println("This is the area for a circle " + area +
                " for radius of " + radius);

        //Char stuff
        char someLetter = 98; // outputs the letter 'a'
        System.out.println(someLetter);

        //Long stuff
        //long someNum = 434343434343.434343434343434L;
        double someDouble = 323232.4545455D;

        //String stuff
        String x = "Jafer".toUpperCase();

        //
        double z = 5D/2D;
        float f = 5F/2;
        System.out.println(z);

        //Auto cast 4543545345
        byte a5 =40, b5=50, c=100;
        int d = a5 * b5 / c; //solution is 200 which is beyond the scope of an byte so auto convert to int
        //Error stuff
        byte x5 = 50;
            x5 = (byte)(x5*2); // need a byte cast in order for it to work

        // Formating Floating Point Numbers
            int x1 = 25; // For normal numbers
            int y1 = 2022;
            String s1 = String.format("This class has %d, class of %d.", x1, y1);
            System.out.println(s1);

            double x2 = 25.12345; // For double numbers also 2 decimal places
            String s2 = String.format("This class has %.2f, class of %d.", x2, y1);
            System.out.println(s2);

            String s3 = String.format("This class has %-10.2f, class of %d.", x2, y1); //Spacing on backside
                   s3 = String.format("This class has %10.2f, class of %d.", x2, y1);  //Spacing on frontside
            System.out.println(s3);
        //
            DecimalFormat df = new DecimalFormat("#.##");
            String formatted = df.format((2.3456));
            System.out.println(formatted);
            System.out.printf("2: This class has %-10.2f, class of %d.", x1, y1);
            System.out.println("Hello");
            System.out.println(String.format("This class has %d, class of %d.", x1, y1)); // To not to waste variables
    }// main method


}// this is the class
