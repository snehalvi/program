package addition;
import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of x & y:");
        x = sc.nextInt();
        y = sc.nextInt();
        int sum = x + y;
        System.out.println(sum);
        sc.close();
    }
}
