package basic_part_I;
//15. Write a Java program to swap two variables. Go to the editor
public class e15 {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("a = "+a+", b = "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+a+", b = "+b);
    }
}
