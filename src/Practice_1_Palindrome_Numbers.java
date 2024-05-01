import java.util.Scanner;

public class Practice_1_Palindrome_Numbers {
    public static void main(String[] args) {
        // Kullanıcıdan girdilerin alınması
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num = input.nextInt();
        // Metodun çağrılması
        System.out.println(isPalindrom(num));

    }
    static String isPalindrom(int num) {
        // Her basamaktaki sayıları sırayla tutan değişken
        int digit = 0;
        // Terse çevrilmiş haldeki sayıyı tutacak değişken
        int reverseNum = 0;
        // Toplam basamak sayısını bulmak için kullanılan formül
        int length = (int) Math.log10(num) + 1;
        // Son basamağın ilk basamak haline gelmesi için 10'un kaç katıyla çarpılması gerektiğini hesaplayan formül
        double pow10 = Math.pow(10, length - 1);
        // Orjinal numara değişkeninin sabit kalması için başka bir değişkene değerinin atanması
        int num2 = num;
        while (num2 > 0) {
            // Her döngüde bir sonraki basamaktaki rakam alınır
            digit = num2 % 10;
            num2 = num2 / 10;
            // Her alınan rakam ters haldeki sayıdaki basamağına göre 10'un kuvvetleri ile çarpılır
            reverseNum += digit * pow10;
            pow10 = pow10 / 10;
        }
        // Eğer verilen sayıyla reverseNum eşit ise palindrom sayı olarak çıktı verilir
        return (reverseNum == num ? num + " bir palindrom sayı." : num + " bir palindrom sayı değil.");
    }
}
