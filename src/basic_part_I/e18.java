package basic_part_I;

import java.util.Scanner;

/*
18. Write a Java program to multiply two binary numbers. Go to the editor
Input Data:
Input the first binary number: 10
Input the second binary number: 11
Expected Output

Product of two binary numbers: 110
 */
public class e18 {
    public static void main(String[] args) {
        int a = toDec();
        int b = toDec();
        System.out.print(backToBinSum(a, b));
    }
    private static StringBuilder backToBinSum(int a, int b) {
        StringBuilder result = new StringBuilder();
        int x = a * b; // operator liczbowy
        while (x != 0){
            if(x%2 == 0){
                result.append("0");
                x = x/2;
            }
            if(x%2 == 1){
                result.append("1");
                x = x/2;
            }
        }
        return result.reverse();
    }

    private static int toDec() {
        Scanner scan = new Scanner(System.in);
        String binary = scan.nextLine();
        int power = (binary.length()-1); // ends at 0
        int result = 0;
        char search = '1';

        for(int i = 0; i < binary.length();i++){
            if(binary.charAt(i) == search){
                result += Math.pow(2, power);
            }
            power--;
        }
        return result;
    }
}
