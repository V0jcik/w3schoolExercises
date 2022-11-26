package basic_part_I;

import java.util.Scanner;

/*
17. Write a Java program to add two binary numbers. Go to the editor
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output

Sum of two binary numbers: 101
 */

public class e17 {
    public static void main(String[] args) {
        int a = toDec();
        int b = toDec();
        System.out.print(backToBinSum(a, b));
    }
    private static StringBuilder backToBinSum(int a, int b) {
        StringBuilder result = new StringBuilder();
        int x = a+b;
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
        StringBuilder binary = new StringBuilder(scan.nextLine());
        binary.reverse();
        int result = 0;
        char search = '1';

        for(int i = 0; i < binary.length();i++){
            if(binary.charAt(i) == search){
                result += Math.pow(2, i);
            }
        }
        return result;
    }
}


//        Scanner scan = new Scanner(System.in);
//
//        StringBuilder a = new StringBuilder(scan.nextLine());
//            a.reverse();
//        StringBuilder b = new StringBuilder(scan.nextLine());
//            b.reverse();
//
//        char search1 = '1', search0 = '0';
//
//        StringBuilder result = new StringBuilder();
//
//        int maxi = Math.max(a.length(),b.length());
//
//        System.out.println(maxi);
//
//        for (int i = 0; i < maxi; i++){
//            if(a.charAt(i) == search1 && b.charAt(i) == search1){
//                result.append("0");
//                result.append("1");
//            }
//            if(a.charAt(i) == search1 && b.charAt(i) == search0) {
//                result.append("1");
//            }
//            if(a.charAt(i) == search0 && b.charAt(i) == search1){
//                result.append("1");
//            }
//            if(a.charAt(i) == search0 && b.charAt(i) == search0) {
//                result.append("0");
//            }
//            System.out.println(i);
//        }
//        System.out.print(result);
//    }