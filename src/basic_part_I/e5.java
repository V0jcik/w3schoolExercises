package basic_part_I;
/*
5. Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
 */
import java.util.*;

public class e5 {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        int a = skan.nextInt();
        int result = a * skan.nextInt();
        System.out.print(a + " x " + (result/a) + " = " + result);
    }
}
