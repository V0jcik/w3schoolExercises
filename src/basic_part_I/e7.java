package basic_part_I;
/*
7. Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
 */
import java.util.Scanner;

public class e7 {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        int num = skan.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(num +" x "+ i +" = "+ (num*i));
        }
    }
}
