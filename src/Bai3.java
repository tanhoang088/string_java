import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "Tan ";
        System.out.printf("Nhap chuoi 2: ");
        String str2 = sc.next();
        sc.nextLine();
        str1 += str2;
        System.out.printf(str1);
    }
}
