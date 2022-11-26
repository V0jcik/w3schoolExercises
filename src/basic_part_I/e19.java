package basic_part_I;

import java.util.Scanner;

/*
19. Write a Java program to convert a decimal number to binary number. Go to the editor
Input Data:
Input a Decimal Number : 5
Expected Output

Binary number is: 101
 */
public class e19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        int x = scan.nextInt();
        while (x != 0) {
            if (x % 2 == 0) {
                result.append("0");
                x = x / 2;
            }
            if (x % 2 == 1) {
                result.append("1");
                x = x / 2;
            }
        }
        System.out.print(result.reverse());
    }
}
