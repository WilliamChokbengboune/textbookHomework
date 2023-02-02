/**
 * Class: Circle
 * Author: William Chokbengboune
 * Written: January 27, 2023
 * Course: ITEC 2140 section 04
 * Version: 1.0
 * The course is meant to calculate the perimeter and area of a circle.
 */

import java.util.Scanner;

public class Circle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius: "); //this line prompts the user to enter the radius
        double radius = input.nextDouble();
        double area = radius * radius * Math.PI; // this line calculates the area of a circle
        System.out.printf("The area is %.2f.", area);
        double perimeter = 2 * radius * Math.PI; // This line calculates the perimeter of a circle
        System.out.printf("The perimeter is %.2f.", perimeter);
    }
}
