package basic_part_I;

import java.util.Scanner;

/*
20. Write a Java program to convert a decimal number to hexadecimal number. Go to the editor
Input Data:
Input a decimal number: 15
Expected Output

Hexadecimal number is : F
 */

public class e20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj liczbę dziesiętną: ");
        int dec_input = scan.nextInt();

        // dec to bin

        StringBuilder bin_result = new StringBuilder();
        while (dec_input != 0) {
            if (dec_input % 2 == 1) {
                bin_result.append("1");
            }
            else {
                bin_result.append("0");
            }
            dec_input = dec_input / 2;
        }

        // bin to hex

        StringBuilder hex_result = new StringBuilder();

        if(bin_result.length()%4 == 1){bin_result.append("000");}
        if(bin_result.length()%4 == 2){bin_result.append("00");}    // dopełnienie zerami
        if(bin_result.length()%4 == 3){bin_result.append("0");}

        int offset = 0, result = 0;
        char search = '1';

        for(int i = 0; i < bin_result.length(); i++) {
            if(bin_result.charAt(i) == search) {
                result += Math.pow(2, offset);
            }
            offset++;
            if(offset > 3){
                if(result > 9){
                    switch (result) {
                        case 10 -> hex_result.append("A");
                        case 11 -> hex_result.append("B");
                        case 12 -> hex_result.append("C");
                        case 13 -> hex_result.append("D");
                        case 14 -> hex_result.append("E");
                        case 15 -> hex_result.append("F");
                    }
                }
                else{
                    hex_result.append(result);
                }
                offset = 0;
                result = 0;
                }
            }
        System.out.println("\nWynik w HEX: " + hex_result.reverse());
    }
}