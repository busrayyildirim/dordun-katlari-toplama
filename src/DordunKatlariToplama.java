import java.util.Scanner;

public class DordunKatlariToplama {
    /*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
    girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
     */
    public static void main(String[] args) {
        int i, toplam = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Bir Sayı Giriniz:");
            i = input.nextInt();
            if (i % 4 == 0) {
                toplam += i;
            }
        }
        while (i % 2 == 0);
        System.out.println("4'ün Katı Olan Sayıların Toplamı:" + toplam);

    }
}
