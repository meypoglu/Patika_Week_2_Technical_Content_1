import java.util.Scanner;

public class Practice_4_Exponential_Calculator {
    public static void main(String[] args) {
        // Kullanıcıdan girdilerin alınması
        Scanner input = new Scanner(System.in);
        System.out.print("Taban sayıyı giriniz: ");
        int num1 = input.nextInt();
        System.out.print("Üs sayıyı giriniz: ");
        int num2 = input.nextInt();
        // expo, değer döndüren metod olduğu için System.out ile printlenmesi gerekiyor
        System.out.println(expo(num1, num2));
    }
    // Üs almayı sağlayan metod
    public static int expo(int base, int exp) {
        // Tekrar tekrar çarpıma uğrayan sayıları tutan sonuç değişkeni
        int result = 1;
        // Üs sayısı 1 olana kadar result'taki sayının çarpılmasını sağlayan koşul
        if (exp > 0) {
            // Taban sayısı, üs sayısı 1 olana kadar kendisiyle çarpılmaya devam eder
            result = base * expo(base, exp-1);
        }
        return result;
    }
}
