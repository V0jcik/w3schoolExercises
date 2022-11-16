package basic_part_I;

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
