package basic_part_I;
/*
6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */
import java.util.Scanner;

public class e6 {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        int a = skan.nextInt();
        int b = skan.nextInt();
        System.out.println(a +" + "+b+" = "+(a+b));
        System.out.println(a +" - "+b+" = "+(a-b));
        System.out.println(a +" x "+b+" = "+(a*b));
        System.out.println(a +" / "+b+" = "+(a/b));
        System.out.println(a +" mod "+b+" = "+(a%b));
    }
}
