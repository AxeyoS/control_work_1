import java.util.Scanner;
public class K2 {
    public static int sum(int a, int b) {
        if (b == 0) {
            return a;
        }
        else {
            return sum(a ^ b, (a & b) << 1);
        }
    }
    public static void main(String args[]) {
        int a, b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите a: ");
        a=sc.nextInt();
        System.out.println("Введите b: ");
        b=sc.nextInt();
        System.out.println("Сумма: " + sum(a, b));
    }
}
