/**
 * Class: Circle
 * Author: William Chokbengboune
 * Written: January 27, 2023
 * Course: ITEC 2140 section 04
 * Version: 1.0
 * The course is meant to calculate the perimeter and area of a circle.
 */

public class Circle {
    public static void main(String[] args){
        double radius = 9.5;
        double area = radius * radius * Math.PI; // this line calculates the area of the code
        double perimeter = 2 * radius * Math.PI; // This line calculates the perimeter
        System.out.println("The area is " + area);
        System.out.println("The perimeter is " + perimeter);
    }
}
