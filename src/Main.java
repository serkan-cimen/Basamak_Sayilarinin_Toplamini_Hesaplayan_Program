import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = inp.nextInt();

        int total = 0;
        int temp = number;

        while (temp != 0) {
            int basamak = temp % 10;
            total += basamak;
            temp /= 10;
        }

        System.out.println("Basamakların toplamı : " + total);
    }
}