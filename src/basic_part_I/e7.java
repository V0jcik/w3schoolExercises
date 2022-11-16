package basic_part_I;

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
