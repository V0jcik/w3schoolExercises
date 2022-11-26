package basic_part_I;

import java.util.Scanner;

// 12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
public class e12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a = scan.nextInt();
        float b = scan.nextInt();
        float c = scan.nextInt();
        System.out.print((a + b + c) /3);
    }
}
