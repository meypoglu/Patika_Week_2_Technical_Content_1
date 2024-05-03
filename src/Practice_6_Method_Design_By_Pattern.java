import java.util.Scanner;

public class Practice_6_Method_Design_By_Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int num = input.nextInt();

        System.out.println(pattern(num,true, num));
    }

    public static int pattern(int originalNum, boolean isDecrementing, int currentNum) {
        // Şu anki sayıyı ekrana gösterir
        System.out.print(currentNum + " ");

        if (isDecrementing) {
            // Negatif sayı ya da 0'a ulaşıldığında düşüşü engellemek için isDecrementing false'a ayarlanır
            if (currentNum - 5 <= 0) {
                isDecrementing = false;
                // Negatif sayıyı göstermek için son bir kez çıkarma yapılır
                currentNum = currentNum - 5;
            } else {
                // Düşüşü sağlamak için tekrarlı biçimde sayı 5 azaltılır
                currentNum -= 5;
            }
        } else {
            // Başlangıç sayısına ulaşılıp ulaşılmadığının kontrolü eğer ulaşıldıysa metodun çalışması durur
            if (currentNum + 5 >= originalNum) {
                return originalNum;
            } else {
                // isDecrementing false olduysa sayıya 5 eklenmeye başlanır
                currentNum += 5;
            }
        }
        // If bloklarından çıkan sonuçlar tekrar metoda verilerek recursive döngü sağlanır
        return pattern(originalNum, isDecrementing, currentNum);
    }
}