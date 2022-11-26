package basic_part_I;

import java.util.Scanner;

/*
13. Write a Java program to print the area and perimeter of a rectangle. Go to the editor
Test Data:
Width = 5.6 Height = 8.5

Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class e13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double width = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());
        System.out.print("Area is "+width+" * "+height+" = "+(Math.round(width*height*100.00)/100.00)+"" +
                        "\nPerimeter is 2 * ("+width+" + "+height+") = "+(Math.round(2*(width+height)*100.00)/100.00));
    }
}
