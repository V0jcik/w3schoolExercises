package basic_part_I;

import java.util.*;

public class e5 {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        int a = skan.nextInt();
        int result = a * skan.nextInt();
        System.out.print(a + " x " + (result/a) + " = " + result);
    }
}
