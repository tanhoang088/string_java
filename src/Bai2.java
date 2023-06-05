import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Input String 1: ");
        String str1 = sc.next();
        sc.nextLine();
        System.out.printf("Input String 2: ");
        String str2 = sc.next();
        sc.nextLine();
        if (str1.equalsIgnoreCase(str2) == true) System.out.printf("2 strings are equal");
        else System.out.printf("2 string are not equal");
    }
}
