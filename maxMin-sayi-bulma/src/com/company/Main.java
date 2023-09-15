import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Geçerli bir sayı girmelisiniz.");
            return;
        }

        int max = Integer.MIN_VALUE; // En büyük sayıyı tutmak için başlangıç değeri
        int min = Integer.MAX_VALUE; // En küçük sayıyı tutmak için başlangıç değeri

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            int num = input.nextInt();

            if (num > max) {
                max = num; // Daha büyük bir sayı bulunduğunda güncelle
            }

            if (num < min) {
                min = num; // Daha küçük bir sayı bulunduğunda güncelle
            }
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}

