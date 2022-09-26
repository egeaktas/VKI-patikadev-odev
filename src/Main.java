import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilo, boy, vki;
        System.out.print("kilonuzu giriniz: ");
        kilo = input.nextDouble();
        System.out.print("boyunuzu metre cinsinden giriniz: ");
        boy = input.nextDouble();
        vki = kilo/(boy*boy);
        System.out.print("vücut kitle indeksi: " + vki);
    }
}