package input_from_user;
import java.util.Scanner;

public class in_user {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        System.out.println(a);
        sc.close();
    }

}
