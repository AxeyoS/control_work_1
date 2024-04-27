import java.util.Scanner;
public class K3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        while (n != 0) {
            sum += n;
            n = sc.nextInt();
        }
        System.out.println(sum);
        sc.close();
    }
}