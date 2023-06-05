import java.util.Scanner;

public class Bai5_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap 1 chuoi: ");
        String str = sc.next();
        sc.nextLine();
        System.out.println("Chuoi lowercase: " + str.toLowerCase());
        System.out.println("Chuoi uppercase: " + str.toUpperCase());
    }
}
