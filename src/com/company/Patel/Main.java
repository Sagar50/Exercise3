//Sagar Patel, CSCI1660, 1/28/2020
package com.company.Patel;
import java.util.Scanner;
public class Main {
    public static Scanner input = new Scanner(System.in);
    //Collects Input
    public static double collectInput() {
        double fahrenDeg = 0;
        System.out.println("What is the temperature in fahrenheit?");
        fahrenDeg = input.nextDouble();
        return fahrenDeg;
    }
    //Turns Fahrenheit to Celsius
    public static double fahrenToCel(double fahrenDeg) {
        return (( fahrenDeg - 32)*5)/9;
    }
    //Outputs Fahrenheit and Celsius
    public static void display(double fahrenDeg, double celDeg) {
        System.out.printf("Degrees in Fahrenheit: %.2f%n", fahrenDeg);
        System.out.printf("Degrees in Celsius: %.2f%n", celDeg);
    }
    //Puts everything together
    public static void main(String[] args) {
        double fahrenDeg = 0;
        while (fahrenDeg > -460) {
             fahrenDeg = collectInput(); //input function
            double celDeg = fahrenToCel(fahrenDeg); //calc function
            if (fahrenDeg < -460) {
                break;
            }
            display(fahrenDeg, celDeg); //display function
        }
    }
}



