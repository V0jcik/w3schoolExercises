package basic_part_I;

import java.util.Scanner;

/*
11. Write a Java program to print the area and perimeter of a circle. Go to the editor
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
 */
public class e11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double radius = Double.parseDouble(scan.nextLine());
        System.out.print("Perimeter is = "+(2*Math.PI*radius) +"\nArea is = "+(Math.PI*Math.pow(radius,2)) );
    }
}
