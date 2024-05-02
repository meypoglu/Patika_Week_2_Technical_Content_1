import java.util.Scanner;

public class Practice_5_Recursive_Prime_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num = input.nextInt();

        System.out.println(prime(num, 2) ? num + " asal bir sayıdır." : num + " asal bir sayı DEĞİLDİR !");
    }

    public static boolean prime(int num1, int num2) {
            if (num1 <= 2) {
                return (num1 == 2) ? true : false;}
            if (num1 % num2 == 0) {
                return false;}
            if (num2 * num2 > num1) {
                return true;}

            return prime(num1, num2 + 1);
        }
    }